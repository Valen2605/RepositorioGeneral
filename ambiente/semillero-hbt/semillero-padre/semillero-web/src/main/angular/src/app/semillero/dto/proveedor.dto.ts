/**
 * @description Clase ComicDTO que contiene la informacion de un comic
 * 
 * @author Valentina Santa Muñoz <valentinas792@gmail.com>
 */
export class ProveedorDTO {

   /**
    *  id proveedor
    */
    public id: String; 

    /**
     * direccion proveedor
     */
    public direccion:String;
     
    /**
     * fecha creacion proveedor
     */    
    public fechaCreacion: Date; 
    
	/**
     * Estado proveedor
     */
	public estado:String; 
    
    /**
     *Id Persona
     */
	public idPersona:String; 
    
    /**
     *Monto Credito
     */
	public montoCredito: number; 

  
}