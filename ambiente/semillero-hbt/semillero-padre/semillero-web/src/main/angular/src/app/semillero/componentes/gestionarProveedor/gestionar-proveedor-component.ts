import { ProveedorDTO } from '../../dto/proveedor.dto';
import { Component, OnInit } from '@angular/core';
import { FormGroup, FormBuilder, Validators } from '@angular/forms';
import { Router } from '@angular/router';

/**
 * @description Componente gestionar comic, el cual contiene la logica CRUD
 * 
 * @author Valentina Santa <valentinas792@gmail.com>
 */
@Component({
    selector: 'gestionar-proveedor-component',
    templateUrl: './gestionar-proveedor-component.html',
    styleUrls: ['./gestionar-proveedor-component.css']
})
export class GestionarProveedorComponent implements OnInit {

    /**
     * Atributo que contiene los controles del formulario
     */
    public gestionarProveedorForm : FormGroup;

    /**
     * Atributo que contendra la informacion del proveedor
     */
    public proveedor: ProveedorDTO;

    /**
     * Atributo que contendra la lista de proveedores creados
     */
    public listaProveedores : Array<ProveedorDTO>;

    public idProveedor : number = 0;

    public idPersona : number = 0;

   /**
    *Atributo para validar si se esta editando un proveedor 
    */
    public editar :boolean;

    /**
     *  Atributo que indica la posicion de la lista del proveedor que sera editado
     */
    public i : number;

    /**
     * Atributo que indica si se envio a validar el formulario
     */
    public submitted : boolean;

    /**
     * @description Este es el constructor del componente GestionarProveedorComponent
     * @author Valentina Santa
     */
    constructor(private fb : FormBuilder,
        private router : Router) {
        this.gestionarProveedorForm = this.fb.group({
            direccion : [null, Validators.required],
            montoCredito : [null]
        });
    }

    /**
     * @description Evento angular que se ejecuta al invocar el componente
     * @author Valentina
     */
    ngOnInit(): void {
        console.log("Ingreso al al evento oninit");
        this.proveedor = new ProveedorDTO();
        this.listaProveedores = new Array<ProveedorDTO>();
    }

    /**
     * @description Metodo que permite validar el formulario y crear o actualizar proveedor
     */
    public crearActualizarProveedor() : void {
        this.submitted = true;
        if(this.gestionarProveedorForm.invalid) {
            return;
        }
        if(!this.editar){
            this.idProveedor++;
            this.proveedor = new ProveedorDTO();
            this.proveedor.id = this.idProveedor + "";
            this.proveedor.direccion = this.gestionarProveedorForm.controls.direccion.value;
            this.proveedor.montoCredito = this.gestionarProveedorForm.controls.montoCredito.value;
            this.idPersona++;
            this.proveedor.id = this.idPersona + "";
            this.listaProveedores.push(this.proveedor);
            this.limpiarFormulario();
            return;
        }
        if(this.editar){
            this.proveedor = this.listaProveedores[this.i];
            this.proveedor.direccion = this.gestionarProveedorForm.controls.direccion.value;
            this.proveedor.montoCredito = this.gestionarProveedorForm.controls.montoCredito.value;
            

            this.listaProveedores.splice(this.i,1,this.proveedor);
            this.limpiarFormulario();
            this.editar = false;
            return;
        }
        
    }

    /**
     * Metodo que permite consultar un proveedor de la tabla y sus detalles e inhabilitar el formulario
     * @param posicion en la lista del comic seleccionado
     */
    public consultarProveedor(posicion : number) : void {
        let proveedor = this.listaProveedores[posicion];
        this.gestionarProveedorForm.controls.direccion.setValue(proveedor.direccion);
        this.gestionarProveedorForm.controls.montoCredito.setValue(proveedor.montoCredito);        
        this.gestionarProveedorForm.controls.direccion.disable();
        this.gestionarProveedorForm.controls.montoCredito.disable();

    }
    
    public editarProveedor(posicion: number) : void {
        let proveedor = this.listaProveedores[posicion];
        this.gestionarProveedorForm.controls.direccion.setValue(proveedor.direccion);;
        this.gestionarProveedorForm.controls.montoCredito.setValue(proveedor.montoCredito);
        this.editar = true;
        this.i = posicion;
    }

    private limpiarFormulario() : void {
        this.submitted = false;
        this.gestionarProveedorForm.controls.direccion.setValue(null);
        this.gestionarProveedorForm.controls.montoCredito.setValue(null);
    }
    
    /**
     * @description Metodo que obtiene los controles y sus propiedades
     * @author Valentina Santa
     */
    get f() { 
        return this.gestionarProveedorForm.controls;
    }
    
}