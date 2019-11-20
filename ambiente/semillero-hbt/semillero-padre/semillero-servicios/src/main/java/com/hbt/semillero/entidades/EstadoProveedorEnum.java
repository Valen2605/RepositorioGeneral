package com.hbt.semillero.entidades;

public enum EstadoProveedorEnum {
	
	/**
	 * 
	 * <b>Descripción:<b> Creacion de Enum para EstadoProveedor
	 * <b>Caso de Uso:<b> 
	 * @author Valentina
	 * @version
	 */
		
	ACTIVO("enum.estado.activo"),
	INACTIVO("enum.estado.inactivo");
	
	private String codigoMensaje;
	
	/**
	 * Constructor.
	 */
	private EstadoProveedorEnum(String codigoMensaje) {
		this.codigoMensaje=codigoMensaje;
	}
    
	/**
	 * Metodo encargado de retornar el valor del atributo codigoMensaje
	 * @return El codigoMensaje asociado a la clase
	 */
	public String getCodigoMensaje() {
		return codigoMensaje;
	}
    
	/**
	 * Metodo encargado de modificar el valor del atributo codigoMensaje
	 * @param codigoMensaje El nuevo codigoMensaje a modificar.
	 */
	public void setCodigoMensaje(String codigoMensaje) {
		this.codigoMensaje = codigoMensaje;
	}

}
