package com.hbt.semillero.ejb;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.Stateless;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import com.hbt.semillero.dto.ComicDTO;
import com.hbt.semillero.entidades.Comic;

/**
 * < Clase que gestiona un comic en la base de datos 
 * <b>Caso de Uso:<b> 
 * @author Valentina
 * @version 
 */
@Stateless
public class GestionarComicBean  implements IGestionarComicLocal{
	@PersistenceContext
    private EntityManager em;
		
	
	/**
	 * Metodo que se encarga de agregar un comic a la base de datos
	 * 
	 */
	@TransactionAttribute(TransactionAttributeType.REQUIRES_NEW)
	public void crearComic(ComicDTO comicDTO) {
		 Comic comic = convertirComicDTOToComic(comicDTO);
	     em.persist(comic);
	}
	
	/** Método que permite modificar comic de la base de datos
	 * 
	 * @param comicModificar
	 */
	@TransactionAttribute(TransactionAttributeType.REQUIRED)	
    public void modificarComic(ComicDTO comicModificar) {
		Comic comic = new Comic();
	    //comic.setId(comicModificar.getId());
	     
	     /**
	      * TODO 
	      * Seguir llenando los datos
	      */
		em.merge(comicModificar);
	}
	
	/**
	 * Método que permite consultar un Comic en la base de datos
	 */
	@TransactionAttribute(TransactionAttributeType.NOT_SUPPORTED)
    public ComicDTO consultarComic(String id) {
		Comic comic = em.find(Comic.class, Long.parseLong(id));
		ComicDTO comicDTO = convertirComicToComicDTO(comic);
		return comicDTO;
		
	}
	
	/**
	 * Método que permite consultar todos los comics de la base de datos
	 * @return
	 */
	@TransactionAttribute(TransactionAttributeType.NOT_SUPPORTED)
    public List<ComicDTO> consultarComic() {
		em.createNativeQuery("SELECT C FROM COMIC").getResultList(); // C es la entidad
		List<Comic> resultados = (List<Comic>) em.createQuery("select c from Comic").getResultList();
		return null;		
	}

	/** 
	 * metodo encargado de modificar los datos de un comic en la base de datos
	 * 
	 */
	@Override
	//@TransactionAttribute(TransactionAttributeType.REQUIRED)
	//TODO cual es el resultado de llamar a modificarComic	
	public void modificarComic(Long id, String nombre, ComicDTO comicNuevo) { // id se pone como Long para poder realizar la persistencia
		Comic comicModificar;
		if (comicNuevo==null) {
			comicModificar = em.find(Comic.class, id); // Manejar la entidad. Si esta menjada el entity manager la puyede manejar.
		}else {
			comicModificar = convertirComicDTOToComic(comicNuevo);
		}
		//TODO validar si comicmodificar llego con datos 
		comicModificar.setNombre(nombre);
		em.merge(comicModificar); /* cuando se utiliza el merge sino encuentra el id, lo que hace es un persist y si
		                             lo encuentra hace el update */
	}

	/** 
	 * Metodo que elimina comic de la base de datos
	 *
	 */
	@Override
	@TransactionAttribute(TransactionAttributeType.REQUIRED)
	public void eliminarComic(Long id) {
		Comic comicEliminar;
		comicEliminar = em.find(Comic.class, id);
		
		if (comicEliminar!=null) {
			em.remove(comicEliminar);
		}
		
	}

	/** 
	 * metodo encargado de consultar la lista de comics guardados
	 *
	 */
	@Override
	@TransactionAttribute(TransactionAttributeType.NOT_SUPPORTED)
//  TODO hacer que lista de resultados sea nula
	public List<ComicDTO> consultarComics() {
		List<ComicDTO> resultadosComicDTO = new ArrayList<ComicDTO>();
		List<Comic> resultados = em.createQuery("select c from Comic c").getResultList();
		
		for (Comic comic : resultados) {
			resultadosComicDTO.add(convertirComicToComicDTO(comic));
		}
		return resultadosComicDTO;
	}
	
	/**
	 * 
	 * Metodo encargado de convertir un comicDTO a comic
	 * @author Valentina	 
	 * @param comic
	 * @return
	 */
	
	private Comic convertirComicDTOToComic(ComicDTO comicDTO) {
		Comic comic = new Comic();
        if(comicDTO.getId()!=null) {
            comic.setId(Long.parseLong(comicDTO.getId()));
        }
        comic.setNombre(comicDTO.getNombre());
        comic.setEditorial(comicDTO.getEditorial());
        comic.setTematicaEnum(comicDTO.getTematica());
        comic.setColeccion(comicDTO.getColeccion());
        comic.setNumeroPaginas(comicDTO.getNumeroPaginas());
        comic.setPrecio(comicDTO.getPrecio());
        comic.setAutores(comicDTO.getAutores());
        comic.setColor(comicDTO.getColor());
        comic.setFechaVenta(comicDTO.getFechaVenta());
        comic.setEstadoEnum(comicDTO.getEstado());
        comic.setCantidad(comicDTO.getCantidad());
        return comic;
	}
		
	/**
	 * Metodo encargado de convertir un comic a comicDTO
	 * @author Valentina
	 * 
	 * @param comic
	 * @return
	 */
	private ComicDTO convertirComicToComicDTO(Comic comic) {
        ComicDTO comicDTO = new ComicDTO();
        if(comic.getId()!=null) {
         comicDTO.setId(comic.getId().toString());
        }
        comicDTO.setNombre(comic.getNombre());
        comicDTO.setEditorial(comic.getEditorial());
        comicDTO.setTematica(comic.getTematicaEnum());
        comicDTO.setColeccion(comic.getColeccion());
        comicDTO.setNumeroPaginas(comic.getNumeroPaginas());
        comicDTO.setPrecio(comic.getPrecio());
        comicDTO.setAutores(comic.getAutores());
        comicDTO.setColor(comic.getColor());
        comicDTO.setFechaVenta(comic.getFechaVenta());
        comicDTO.setEstado(comic.getEstadoEnum());
        comicDTO.setCantidad(comic.getCantidad());
        return comicDTO;
    }
	
	
}
	

