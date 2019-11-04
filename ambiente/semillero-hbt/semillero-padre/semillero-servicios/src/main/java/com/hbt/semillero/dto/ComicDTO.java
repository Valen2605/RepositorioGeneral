package com.hbt.semillero.dto;


import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDate;

import com.hbt.semillero.entidades.TematicaEnum;


/**
 * 
 * <b>Descripción:<b> Clase que determina
 * <b>Caso de Uso:<b> 
 * @author SEBASTIAN
 * @version
 */
public class ComicDTO implements Serializable{
	
		
	/**
	 * Numero unico que representa la clase
	 */
	private static final long serialVersionUID = -5915785298704599966L;
	
	/* Nombre o titulo del comic */

	private String id; // Identificador unico del comic
	
	private String nombre; // Nombre del comic
	
	private String editorial; // Indica nombre del editorial del comic
	
	private TematicaEnum tematicaEnum; // Indica que tipo de tematica trata el comic
	
	private String coleccion; // Nombre de la coleccion del comic
	
	private Integer numeroPaginas; // Indica el numero de paginas del comic
	
	private BigDecimal precio; // Precio del comic
	
	private Boolean color; // Es para indica si el comic es a color o no
	
	private LocalDate fechaVenta; // Fecha de venta del comic
    
	private String estado; // muestra el estado en el que esta el comic
	
	//TODO 
	
	private Long cantidad; // muestra la cantidad
	 
	
	/*Constructor de la clase */
	
	public ComicDTO(){
		
		
		
	}


	/**
	 * Constructor de la clase.
	 * @param id
	 * @param nombre
	 * @param editorial
	 * @param tematica
	 * @param coleccion
	 * @param numeroPaginas
	 * @param precio
	 * @param color
	 * @param fechaVenta
	 * @param estado
	 * @param cantidad
	 */
	public ComicDTO(String id, String nombre, String editorial, TematicaEnum tematica, String coleccion,
			Integer numeroPaginas, BigDecimal precio, Boolean color, LocalDate fechaVenta, String estado,
			Long cantidad) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.editorial = editorial;
		this.tematicaEnum = tematica;
		this.coleccion = coleccion;
		this.numeroPaginas = numeroPaginas;
		this.precio = precio;
		this.color = color;
		this.fechaVenta = fechaVenta;
		this.estado = estado;
		this.cantidad = cantidad;
	}

    
	/**
	 * Constructor de la clase.
	 * @param id
	 * @param nombre
	 */
	public ComicDTO(String id, String nombre) {
		super();
		this.id = id;
		this.nombre = nombre;
	}


	/**
	 * Metodo encargado de retornar el valor del atributo id
	 * @return El id asociado a la clase
	 */
	public String getId() {
		return id;
	}


	/**
	 * Metodo encargado de modificar el valor del atributo id
	 * @param id El nuevo id a modificar.
	 */
	public void setId(String id) {
		this.id = id;
	}


	/**
	 * Metodo encargado de retornar el valor del atributo nombre
	 * @return El nombre asociado a la clase
	 */
	public String getNombre() {
		return nombre;
	}


	/**
	 * Metodo encargado de modificar el valor del atributo nombre
	 * @param nombre El nuevo nombre a modificar.
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	/**
	 * Metodo encargado de retornar el valor del atributo editorial
	 * @return El editorial asociado a la clase
	 */
	public String getEditorial() {
		return editorial;
	}


	/**
	 * Metodo encargado de modificar el valor del atributo editorial
	 * @param editorial El nuevo editorial a modificar.
	 */
	public void setEditorial(String editorial) {
		this.editorial = editorial;
	}


	/**
	 * Metodo encargado de retornar el valor del atributo tematica
	 * @return El tematica asociado a la clase
	 */
	
	
	public TematicaEnum getTematicaEnum() {
		return tematicaEnum;
	}


	/**
	 * Metodo encargado de modificar el valor del atributo tematica
	 * @param tematica El nuevo tematica a modificar.
	 */
	public void setTematicaEnum(TematicaEnum tematicaEnum) {
		this.tematicaEnum = tematicaEnum;
	}


	/**
	 * Metodo encargado de retornar el valor del atributo coleccion
	 * @return El coleccion asociado a la clase
	 */
	public String getColeccion() {
		return coleccion;
	}


	/**
	 * Metodo encargado de modificar el valor del atributo coleccion
	 * @param coleccion El nuevo coleccion a modificar.
	 */
	public void setColeccion(String coleccion) {
		this.coleccion = coleccion;
	}


	/**
	 * Metodo encargado de retornar el valor del atributo numeroPaginas
	 * @return El numeroPaginas asociado a la clase
	 */
	public Integer getNumeroPaginas() {
		return numeroPaginas;
	}


	/**
	 * Metodo encargado de modificar el valor del atributo numeroPaginas
	 * @param numeroPaginas El nuevo numeroPaginas a modificar.
	 */
	public void setNumeroPaginas(Integer numeroPaginas) {
		this.numeroPaginas = numeroPaginas;
	}


	/**
	 * Metodo encargado de retornar el valor del atributo precio
	 * @return El precio asociado a la clase
	 */
	public BigDecimal getPrecio() {
		return precio;
	}


	/**
	 * Metodo encargado de modificar el valor del atributo precio
	 * @param precio El nuevo precio a modificar.
	 */
	public void setPrecio(BigDecimal precio) {
		this.precio = precio;
	}


	/**
	 * Metodo encargado de retornar el valor del atributo color
	 * @return El color asociado a la clase
	 */
	public Boolean getColor() {
		return color;
	}


	/**
	 * Metodo encargado de modificar el valor del atributo color
	 * @param color El nuevo color a modificar.
	 */
	public void setColor(Boolean color) {
		this.color = color;
	}


	/**
	 * Metodo encargado de retornar el valor del atributo fechaVenta
	 * @return El fechaVenta asociado a la clase
	 */
	public LocalDate getFechaVenta() {
		return fechaVenta;
	}


	/**
	 * Metodo encargado de modificar el valor del atributo fechaVenta
	 * @param fechaVenta El nuevo fechaVenta a modificar.
	 */
	public void setFechaVenta(LocalDate fechaVenta) {
		this.fechaVenta = fechaVenta;
	}


	/**
	 * Metodo encargado de retornar el valor del atributo estado
	 * @return El estado asociado a la clase
	 */
	public String getEstado() {
		return estado;
	}


	/**
	 * Metodo encargado de modificar el valor del atributo estado
	 * @param estado El nuevo estado a modificar.
	 */
	public void setEstado(String estado) {
		this.estado = estado;
	}


	/**
	 * Metodo encargado de retornar el valor del atributo cantidad
	 * @return El cantidad asociado a la clase
	 */
	public Long getCantidad() {
		return cantidad;
	}


	/**
	 * Metodo encargado de modificar el valor del atributo cantidad
	 * @param cantidad El nuevo cantidad a modificar.
	 */
	public void setCantidad(Long cantidad) {
		this.cantidad = cantidad;
	}

}
