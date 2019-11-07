package com.hbt.semillero.pojo;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import com.hbt.semillero.dto.ComicDTO;
import com.hbt.semillero.entidades.TematicaEnum;

/**
 * 
 * <b>Descripción:<b> Clase que determina
 * <b>Caso de Uso:<b> 
 * @author Valentina
 * @version 1
 */

/*
 * Clase para manipular la información que viene en ComicDTO
 */
public class GestionarComicPOJO {
	
	private List<ComicDTO> listaComics = null;

	/**
	 * 
	 * Metodo que crea un comic DTO con parametros 
	 * @author Valentina
	 * 
	 * @param id
	 * @param nombre
	 * @param editorial
	 * @param tematica
	 * @param coleccion
	 * @param numeroPaginas
	 * @param precio
	 * @param autores
	 * @param color
	 * @param fechaVenta
	 * @param estado
	 * @param cantidad
	 * @return
	 */
	public ComicDTO crearComicDTO(String id, String nombre, String editorial, String tematica, String coleccion,
			Integer numeroPaginas, BigDecimal precio, String autores, Boolean color, LocalDate fechaVenta,
			String estado, Long cantidad) {
		
		ComicDTO comicDTO = new ComicDTO(id, nombre, editorial, tematica, coleccion, numeroPaginas, precio, autores, color, fechaVenta, estado, cantidad);
		return comicDTO;
		
	}
	
	/**
	 * 
	 * Metodo que agrega a la lista de comicsDTO un comicDTO
	 * @author Valentina
	 * 
	 * @param comicDTO
	 */
	public void agregarComicDTOLista(ComicDTO comicDTO) {
		if (listaComics == null) {
			listaComics = new ArrayList<ComicDTO>();
		}
		listaComics.add(comicDTO);
	}

	/**
	 * 
	 * Metodo que crea un comicDTO con atibutos por defecto
	 * @author Valentina
	 *
	 */
	public void crearComicDTO() {
		ComicDTO comicDTO = new ComicDTO();
		comicDTO.setId("100");
		comicDTO.setNombre("Dragon Ball Yamcha");
		comicDTO.setEditorial("Planeta Cómic");
		comicDTO.setTematica("AVENTURAS");
		comicDTO.setColeccion("Manga Shonen");
		comicDTO.setNumeroPaginas(100);
		comicDTO.setPrecio(new BigDecimal(2100));
		comicDTO.setAutores("Dragon Garow Lee");
		comicDTO.setColor(Boolean.FALSE);
		comicDTO.setFechaVenta(LocalDate.now());
		comicDTO.setEstado("ACTIVO");
		comicDTO.setCantidad(20L);
		if (listaComics == null) {
			listaComics = new ArrayList<ComicDTO>();
		}
		listaComics.add(comicDTO);
	}

	/**
	 * 
	 * Metodo que modifica un comicDTO en la lista
	 * @author Valentina
	 * 
	 * @param id
	 * @param nombre
	 */
	public void modificarComicDTO(String id, String nombre) {
		ComicDTO comicModificar= null;
		for (int i = 0; i < listaComics.size(); i++) {
			comicModificar = listaComics.get(i);
			if(listaComics.get(i).getId().equals(id)) {
				comicModificar.setNombre(nombre);
				return;
			}
		}
	}
	
	/**
	 * 
	 * Metodo que elimina un comicDTO en la lista de comicsDTO
	 * @author Valentina
	 * 
	 * @param id
	 */
	public void eliminarComicDTO(String id) {
		if (!this.listaComics.isEmpty()) {
			int i = 0;
			while (i < this.listaComics.size()) {
				if (this.listaComics.get(i).getId().equals(id)) {
					this.listaComics.remove(i);
					return;
				}
				i++;
			}
		}
	}
	/**
	 * Metodo que retorna el valor del atributo listaComics
	 * 
	 * @return El listaComics asociado a la clase
	 */
	public List<ComicDTO> getListaComics() {
		return listaComics;
	}

	/**
	 * Metodo que modifica el valor del atributo listaComics
	 * 
	 * @param listaComics nuevo listaComics a modificar.
	 */
	public void setListaComics(List<ComicDTO> listaComics) {
		this.listaComics = listaComics;
	}
    
}
