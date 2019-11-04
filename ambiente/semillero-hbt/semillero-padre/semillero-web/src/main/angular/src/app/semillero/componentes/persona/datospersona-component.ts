import { Component, OnInit } from '@angular/core';

/**
 * @description Componente datospersona, contiene datos de la persona como nombre, ciudad y un enlace
 * 
 * @author Valentina Santa Muñoz
 */

 @Component({
     
    selector: 'datospersona',
    templateUrl: './datospersona-component.html',
    
 })

 export class DatosPersonaComponent{

     nombre: string;

     ciudad: string;

     repositorio: string;

     constructor(){

        this.nombre="Valentina Santa Muñoz";
        this.ciudad="Manizales";
        this.repositorio="https://github.com/Valen2605/RepositorioGeneral";
     }
 }