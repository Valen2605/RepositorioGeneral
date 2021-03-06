package com.hbt.semillero.rest;

import javax.ejb.EJB;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import com.hbt.semillero.dto.ComicDTO;
import com.hbt.semillero.dto.ResultadoDTO;
import com.hbt.semillero.ejb.IGestionarComicLocal;

/**
 * <b>Descripción:<b> Clase que determina
 * <b>Caso de Uso:<b> 
 * @author Valentina
 * @version 
 *
 * Metodo de prueba que muestra un saludo
 * http://localhost:8085/semillero-servicios/rest/GestionarComic/saludo
 * 
 * @param idComic
 * @return
 */
  @Path("/GestionarComic")
  public class GestionarComicRest {
	@EJB
	private IGestionarComicLocal gestionarComicEJB;
	
	@GET //Tipo de envío
    @Path("/saludo") // ruta de acceso pública
    @Produces // Define el tipo de recurso que se va a producir
	public String primerRest() {
		return "Hola Mundo";
	}
	
	/**
	 * 
	 * Metodo encargado de traer la informacion de un comic determinado
	 * http://localhost:8085/semillero-servicios/rest/GestionarComic/consultarComic?idComic=1
	 * 
	 * @param idComic
	 * @autor Valentina Santa
     */	
	@GET
    @Path("/consultarComic")
    @Produces(MediaType.APPLICATION_JSON)// El retorno de la información es de tipo json
	public ComicDTO consultarComic(@QueryParam("idComic") Long idComic) {
		if(idComic!=null) {
			return gestionarComicEJB.consultarComic(idComic.toString());
		}
		
		return null;
	}
	
	/**
	 * Método encargado de la creación de comics.
	 * http://localhost:8085/semillero-servicios/rest/GestionarComic/crear
	 * @param persona
	 * @return
	 */
	@POST
	@Path("/crear")
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public ResultadoDTO crearComic(ComicDTO comicDTO) {
		gestionarComicEJB.crearComic(comicDTO);
		ResultadoDTO resultadoDTO = new ResultadoDTO(Boolean.TRUE, "Comic creado exitosamente");
		return resultadoDTO;
		
	}

	/**
	 * 
	 * Metodo encargado de modificar el nombre de un comic
	 * http://localhost:8085/semillero-servicios/rest/GestionarComic/modificar?idComic=1&nombre=nuevonombre
	 * @param idComic identificador del comic a buscar
	 * @param nombre nombre nuevo del comic
	 */
	@POST
	@Path("/modificar")
	@Produces(MediaType.APPLICATION_JSON)
	public void modificarComic(@QueryParam("idComic") Long idComic, @QueryParam("nombre") String nombre) {
		gestionarComicEJB.modificarComic(idComic, nombre, null);
	}

	/**
	 * 
	 * Metodo encargado de eliminar un comic dado el id
	 * 
	 * @param idComic identificador del comic
	 */
	@POST
	@Path("/eliminar")
	@Produces(MediaType.APPLICATION_JSON)
	public void eliminarComic(@QueryParam("idComic") Long idComic) {
		if (idComic != null) {
			ComicDTO comicDTO = gestionarComicEJB.consultarComic(idComic.toString());

		}
	}

}
