package com.hbt.semillero.ejb;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

import javax.ejb.Stateless;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import com.hbt.semillero.dto.ComicDTO;
import com.hbt.semillero.dto.ProveedorDTO;
import com.hbt.semillero.entidades.Comic;
import com.hbt.semillero.entidades.EstadoProveedorEnum;
import com.hbt.semillero.entidades.Proveedor;

/**
 * < Clase que gestiona un comic en la base de datos 
 * <b>Caso de Uso:<b> 
 * @author Valentina
 * @version 
 */
//TODO comentar para que sirve el STateless
@Stateless
public class GestionarProveedorBean implements IGestionarProveedorLocal {
	
	@PersistenceContext
    private EntityManager em;
	
	
	/**
	 * Método que permite consultar todos los proveedores de la base de datos
	 * @return
	 */
	@TransactionAttribute(TransactionAttributeType.NOT_SUPPORTED)
    public List<ProveedorDTO> consultarProveedor() {
		em.createNativeQuery("SELECT C FROM PROVEEDOR").getResultList(); // C es la entidad
		List<Proveedor> resultados = (List<Proveedor>) em.createQuery("select c from PROVEEDOR").getResultList();
		return null;		
	}
	
	/**
	 * 
	 * Metodo encargado de convertir un proveedorDTO a proveedor
	 * @author Valentina	 
	 * @param comic
	 * @return
	 */
	
	private Proveedor convertirProveedorDTOToProveedor(ProveedorDTO proveedorDTO) {
		Proveedor proveedor = new Proveedor();
        if(proveedorDTO.getId()!=null) {
            proveedor.setId(Long.parseLong(proveedorDTO.getId()));
        }
        proveedor.setDireccion(proveedorDTO.getDireccion());
        proveedor.setFechaCreacion(proveedorDTO.getFechaCreacion());
        proveedor.setEstadoProveedorEnum(proveedorDTO.getEstadoProveedorEnum());
        proveedor.setIdPersona(proveedorDTO.getIdPersona());
        proveedor.setMontoCradito(proveedorDTO.getMontoCredito());
        
        return proveedor;
        
	}
	
	/**
	 * Metodo que permite modificar el montoCredito
	 * @param id
	 * @param montoCredito
	 * @param montoNuevo
	 */
	@TransactionAttribute(TransactionAttributeType.NOT_SUPPORTED)
	public void modificarProveedor(Long id, BigDecimal montoCredito, ProveedorDTO montoNuevo) {
		Proveedor montoModificar;		
		
		if (montoNuevo==null) {
			montoModificar = em.find(Proveedor.class, id);  
			}
		else {
		montoModificar = convertirProveedorDTOToProveedor(montoNuevo);
		}
	}

	@Override
	public void modificarProveedor(Long id, String nombre, ProveedorDTO montoNuevo) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public ProveedorDTO consultarProveedor(String id) {
		// TODO Auto-generated method stub
		return null;
	}
	
}


