package com.hbt.semillero.pojo;

import java.util.List;

import com.hbt.semillero.dto.ComicDTO;

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
public class GestionarComicPojo {
	
	private List<ComicDTO> listaComics = null;
	
	
	 /**
	  * Método para crear nuevo comic y adicionarlo a listaComics
	  */
	public void crearComicDTO() {
		
		ComicDTO comicDTO= new ComicDTO();
		
		//TODO continuar llenando ComicDTO
	
		
	}
	
	/**
	 * 
	 * Método encargado de retornar el valor del atributo listaComic
	 * @return el listaComics asociado a la clase
	 */
	public List<ComicDTO> getListaComics() {
		return listaComics;
	}
	/**
	 * 
	 * Método encargado de modificar el valor del atributo listaComics
	 * 
	 * @param listaComics el nuevo listaComics a Modificar
	 */

	public void setListaComics(List<ComicDTO> listaComics) {
		this.listaComics = listaComics;
	}
	
	
	
    
}
