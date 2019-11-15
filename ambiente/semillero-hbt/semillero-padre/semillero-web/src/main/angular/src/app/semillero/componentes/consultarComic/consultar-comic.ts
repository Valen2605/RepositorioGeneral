import { ComicDTO } from '../../dto/comic.dto';
import { Component, OnInit } from '@angular/core';
import { FormGroup, FormBuilder, Validators } from '@angular/forms';
import { Router,ActivatedRoute} from '@angular/router';


/**
 * @description Componente Consultar comic, permite el comic creado
 * 
 * @author Valentina Santa Muñoz
 */
@Component({
    selector: 'consultar-comic',
    templateUrl: './consultar-comic.html',
    styleUrls: ['./consultar-comic.css']
})
export class ConsultarComicComponent implements OnInit {

    /**
     * Atributo que contiene los controles del formulario
     */
    public consultarComicForm : FormGroup;

     /**
     * Atributo que contendra la informacion del comic
     */
    public comic: ComicDTO;

    /**
     * Atributo que contendra la lista de comics creados
     */    
   public data: any;

    public idComic : number = 0;

    /**
     * Atributo que indica si se envio a validar el formulario
     */
    public submitted : boolean;
    activatedRoute: any;

    /**
     * @description Este es el constructor del componente consultarComicComponent
     * @author Valentina Santa
     */
    constructor(private fb : FormBuilder,
        private router : Router) {
        this.consultarComicForm = this.fb.group({
            nombre : [null, Validators.required],
            editorial : [null],
            tematica : [null],
            coleccion : [null],
            numeroPaginas : [null],
            precio : [null],
            autores : [null],
            color : [null]
        });
    }

    /**
     * @description Evento angular que se ejecuta al invocar el componente
     * @author Valentina Santa
     */
        ngOnInit(): void {
        
        let comic = this.activatedRoute.snapshot.params;    
        this.adicionarCampos();

    }
    /**
     * Metodo que permite adicionar valores a la lista
     * @param comic
     * @author Valentina Santa
     */

    public adicionarCampos():void{

        this.consultarComicForm.controls.nombre.setValue(this.data.nombre);
        this.consultarComicForm.controls.editorial.setValue(this.data.editorial);
        this.consultarComicForm.controls.tematica.setValue(this.data.tematica);
        this.consultarComicForm.controls.coleccion.setValue(this.data.coleccion);
        this.consultarComicForm.controls.numeroPaginas.setValue(this.data.numeroPaginas);
        this.consultarComicForm.controls.precio.setValue(this.data.precio);
        this.consultarComicForm.controls.autores.setValue(this.data.autores);
        this.consultarComicForm.controls.color.setValue(this.data.color);
         
        
    }

    

    /**
     * @description Metodo que obtiene los controles y sus propiedades
     * @author Valentina Santa
     */
    get f() { 
        return this.consultarComicForm.controls;
    }
    /** 
     * Metodo encargado de redireccionar a la pagina gestionar comic
     * @author Valentina
     */
    public regresar(): void {
        this.router.navigate(['gestionar-comic']);
    }
}