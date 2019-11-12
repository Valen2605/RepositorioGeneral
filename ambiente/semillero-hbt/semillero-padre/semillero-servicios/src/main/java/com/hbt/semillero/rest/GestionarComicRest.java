package com.hbt.semillero.rest;

import javax.ejb.EJB;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import com.hbt.semillero.dto.ComicDTO;
import com.hbt.semillero.ejb.IGestionarComicLocal;

/**
 * <b>Descripción:<b> Clase que determina
 * <b>Caso de Uso:<b> 
 * @author Valentina
 * @version 
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
	
	@GET
    @Path("/consultarComic")
    @Produces(MediaType.APPLICATION_JSON)// El retorno de la información es de tipo json
	public ComicDTO consultarComic(@QueryParam("idComic") Long idComic) {
		if(idComic!=null) {
			return gestionarComicEJB.consultarComic(idComic.toString());
		}
		
		return null;
	}
}
