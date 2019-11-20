package com.hbt.semillero.entidades;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

/**
 * <b>Descripción:<b> Clase que determina la entidad que permite representar
 * tabla "DB_SEMILLERO"."TC_PROVEEDOR"
 * <b>Caso de Uso:<b> 
 * @author Valentina Santa
 * @version 
 */

@Entity
@Table(name = "TC_PROVEEDOR")
public class Proveedor implements Serializable {
	
	private static final long serialVersionUID = 1L;
	private Long id;
	private String direccion;	
	private LocalDate fechaCreacion;
	private EstadoProveedorEnum estadoProveedorEnum;
	private String idPersona;
	private BigDecimal montoCredito;



/**
 * Constructor de la clase
 */

public Proveedor(){	
	
	
}

/**
 * Metodo encargado de retornar el valor del atributo id
 * 
 * @return El id asociado a la clase
 */
@Id
@SequenceGenerator(allocationSize = 1, name = "TC_PROVEEDOR_SPID_GENERATOR", sequenceName = "SEQ_TC_PROVEEDOR")
@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "TC_PROVEEDOR_SPID_GENERATOR")
@Column(name = "SPID")
public Long getId() {
	return id;
}

/**
 * Metodo encargado de retornar el valor del atributo id
 * 
 * @param id El nuevo id a modificar.
 */
public void setId(Long id) {
	this.id = id;
}
/**
 * Metodo encargado de modificar el valor del atributo direccion
 * 
 * @return La direccion asociada a la clase
 */
@Column(name = "SPDIRECCION")
public String getDireccion() {
	return direccion;
}

/**
 * Metodo encargado de modificar el valor del direccion
 * 
 * @param direccion a modificar.
 */
public void setDireccion(String direccion) {
	this.direccion = direccion;
}

/**
 * Metodo encargado de retornar el valor del atributo FechaCreacion
 * 
 * @return El fechaCreacion asociada a la clase
 */
@Column(name = "SPFECHA_CREACION")
public LocalDate getFechaCreacion() {
	return fechaCreacion;
}
/**
 * Metodo encargado de modificar la fecha creacion
 * 
 * @param fecha a modificar
 */
public void setFechaCreacion(LocalDate fechaCreacion) {
	this.fechaCreacion = fechaCreacion;
}

/**
 * Metodo encargado de retornar el valor de estado proveedor
 * 
 * @return El fechaCreacion asociada a la clase
 */
@Column(name = "SPESTADO")
public EstadoProveedorEnum getEstadoProveedorEnum() {
	return estadoProveedorEnum;
}
/**
 * Metodo encargado de modificar el valor del atributo estado
 * 
 * @param estado El nuevo estado a modificar.
 */
public void setEstadoProveedorEnum(EstadoProveedorEnum estadoProveedorEnum) {
	this.estadoProveedorEnum = estadoProveedorEnum;
}
/**
 * Metodo encargado de retornar el valor de id persona
 * 
 * @return id persona
 */
@Column(name = "SPIDPERSONA")
public String getIdPersona() {
	return idPersona;
}

public void setIdPersona(String idPersona) {
	this.idPersona = idPersona;
}

/**
 * Metodo encargado de retornar el valor de monto credito
 * 
 * @return id monto credito
 */
@Column(name = "SPMONTOCREDITO")
public BigDecimal getMontoCreadito() {
	return montoCredito;
}
/**
 * Metodo encargado de modificar monto credito. 
 * 
 * @param monto credito.
 */
public void setMontoCradito(BigDecimal montoCredito) {
	this.montoCredito = montoCredito;
}



}


