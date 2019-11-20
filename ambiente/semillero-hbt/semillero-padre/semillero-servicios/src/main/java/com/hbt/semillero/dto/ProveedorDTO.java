package com.hbt.semillero.dto;

import java.math.BigDecimal;
import java.time.LocalDate;

import com.hbt.semillero.entidades.EstadoEnum;
import com.hbt.semillero.entidades.EstadoProveedorEnum;
import com.hbt.semillero.entidades.TematicaEnum;

/**
 * <b>Descripción:<b> Clase que determina la entidad que permite la comunicacion de la capa de negocio con la capa web
 * <b>Caso de Uso:<b> 
 * @author Valentina Santa
 * @version 
 */

public class ProveedorDTO {
	
	/**
	 * Numero unico que representa la clase
	 */
	private static final long serialVersionUID = 1L;
	
	private String id; // id proveedor

	private String direccion; // direccion proveedor

	private LocalDate fechaCreacion; // fecha creacion proveedor
	
	// TODO
	private EstadoProveedorEnum estadoProveedorEnum; // Estado proveedor
	
	private String idPersona; // id persona
    
	private BigDecimal montoCredito; // Monto credito
	
	/**
	 * Constructor de la clase.
	 */
	public ProveedorDTO() {
		super();
		
	}	

	/**
	 * Constructor de la clase.
	 * @param id
	 * @param direccion
	 * @param fechaCreacion
	 * @param estadoProveedorEnum
	 * @param idPersona
	 * @param montoCredito
	 */
	
	public ProveedorDTO(String id, String direccion, LocalDate fechaCreacion, EstadoProveedorEnum estado, String idPersona,
			BigDecimal montoCredito) {
		super();
		this.id = id;
		this.direccion = direccion;
		this.fechaCreacion = fechaCreacion;
		this.estadoProveedorEnum=estado;
		this.idPersona= idPersona;
		this.montoCredito=montoCredito;
	}
	
	

	/**
	 * Constructor de la clase.
	 * @param id
	 * @param direccion
	 */
	public ProveedorDTO(String id, String direccion) {
		super();
		this.id = id;
		this.direccion = direccion;
	}

	
	public String getId() {
		return id;
	}
	/**
	 * Metodo encargado de retornar el valor del atributo id
	 * 
	 * @param id 
	 */
	public void setId(String id) {
		this.id = id;
	}
	/**
	/**
	 * Metodo encargado de retornar la direccion
	 * 
	 * @param direccion
	 */	
	public String getDireccion() {
		return direccion;
	}
	/**
	 * Metodo encargado de modificar el valor del atributo direccion
	 * 
	 * @param  nueva direccion a modificar.
	 */
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	/**
	 * Metodo encargado de modificar el valor del atributo fechaCreacion
	 * 
	 * @param nueva fechaCreacion
	 */
	public LocalDate getFechaCreacion() {
		return fechaCreacion;
	}
	/**
	 * Metodo encargado de retornar el valor de la fechaCreacion
	 * 
	 * @param id El nueva fecha a modificar.
	 */
	public void setFechaCreacion(LocalDate fechaCreacion) {
		this.fechaCreacion = fechaCreacion;
	}
	/**
	 * Metodo encargado de retornar el valor del atributo EstadoProveedorEnum
	 * 
	 * @param EstadoProveedorEnum.
	 */
	public EstadoProveedorEnum getEstadoProveedorEnum() {
		return estadoProveedorEnum;
	}
	/**
	 * Metodo encargado de modificar el valor de EstadoProveedorEnum
	 * 
	 * @param nuevo EstadoProveedorEnum a modificar.
	 */
	public void setEstadoProveedorEnum(EstadoProveedorEnum estadoProveedorEnum) {
		this.estadoProveedorEnum = estadoProveedorEnum;
	}
	/**
	 * Metodo encargado de retornar idPersona
	 * 
	 * @param idPersona
	 */
	public String getIdPersona() {
		return idPersona;
	}

	public void setIdPersona(String idPersona) {
		this.idPersona = idPersona;
	}
	/**
	 * Metodo encargado de retornar el valor montoCredito
	 * 
	 * @param MontoCredito.
	 */
	public BigDecimal getMontoCredito() {
		return montoCredito;
	}
	/**
	 * Metodo encargado de modificar monto credito
	 * 
	 * @param nuevo MontoCredito a modificar.
	 */
	public void setMontoCredito(BigDecimal montoCredito) {
		this.montoCredito = montoCredito;
	}

}
