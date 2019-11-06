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
	 * Metodo encargado de crear un comic DTO con parametros 
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
	 * Metodo encargado de agregar a la lista de comicsDTO un comicDTO
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
	 * Metodo encargado de crear un comicDTO con atibutos por defecto
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
	 * Metodo encargado de modificar un comicDTO en la lista
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
	 * Metodo encargado de eliminar un comicDTO en la lista de ComicDTO
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
	 * Metodo encargado de retornar el valor del atributo listaComics
	 * 
	 * @return El listaComics asociado a la clase
	 */
	public List<ComicDTO> getListaComics() {
		return listaComics;
	}

	/**
	 * Metodo encargado de modificar el valor del atributo listaComics
	 * 
	 * @param listaComics El nuevo listaComics a modificar.
	 */
	public void setListaComics(List<ComicDTO> listaComics) {
		this.listaComics = listaComics;
	}
    
}
