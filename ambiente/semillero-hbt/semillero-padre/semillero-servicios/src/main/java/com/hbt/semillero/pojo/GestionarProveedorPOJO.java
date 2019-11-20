package com.hbt.semillero.pojo;

import java.math.BigDecimal;
import java.util.List;

import com.hbt.semillero.dto.ComicDTO;
import com.hbt.semillero.dto.ProveedorDTO;


/**
 * <b>Descripción:<b> Clase que permite Manipular la informacion que viene de proveedor DTO
 * <b>Caso de Uso:<b> 
 * @author Valentina Santa
 * @version 
 */
public class GestionarProveedorPOJO {
	
	
	private List<ProveedorDTO> listaProveedores = null; // Lista de proveedores	
	
	
	/**
	 * 
	 * Metodo que modificar montoCredito
	 * 
	 * @author Valentina
	 * 
	 * @param id
	 * @param montoCredito
	 */
	public void modificarProveedorDTO(String id, BigDecimal montoCredito) {
		ProveedorDTO proveedorModificar = null;
		for (int i = 0; i < listaProveedores.size(); i++) {
			proveedorModificar = listaProveedores.get(i);
			if (listaProveedores.get(i).getId().equals(id)) {
				proveedorModificar.setMontoCredito(montoCredito);
				return;
			}
		}
	}
	
	
	/**
	 * Metodo que retorna el valor del atributo listaproveedores
	 * 
	 * @return listaproveedores asociado a la clase
	 */
	public List<ProveedorDTO> getListaProveedores() {
		return listaProveedores;
	}
    
	/**
	 * Metodo que modifica el valor de la lista de proveedores
	 * 
	 * @param Proveedores nueva listaProveedores a modificar.
	 */
	public void setListaProveedores(List<ProveedorDTO> listaProveedores) {
		this.listaProveedores = listaProveedores;
	}

}
