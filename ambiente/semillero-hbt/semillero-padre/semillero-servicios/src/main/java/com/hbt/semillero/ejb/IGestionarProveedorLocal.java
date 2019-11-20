package com.hbt.semillero.ejb;

import java.util.List;

import javax.ejb.Local;

import com.hbt.semillero.dto.ComicDTO;
import com.hbt.semillero.dto.ProveedorDTO;

@Local
public interface IGestionarProveedorLocal {
	
	
	/**
	 * 
	 * Metodo encargado de consultar un provedor modificar monto y guardarlo
	 * 
	 * @author Valentina
	 * 
	 * @param proveedorModificar informacion nueva a modificar
	 */
	public void modificarProveedor(Long id, String nombre, ProveedorDTO montoNuevo);

	
	/**
	 * 
	 * @param idComic
	 * @return
	 */
	public ProveedorDTO consultarProveedor(String id);

	/**
	 * 
	 * Metodo encargado de retornar una lista de proveedores
	 * 
	 * @return
	 */
	public List<ProveedorDTO> consultarProveedor();

}
