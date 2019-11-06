import { Component, OnInit } from '@angular/core';

/**
 * @description La clase EjercicioComicComponent permite mostrar informacion de los comics
 * @author Valentina Santa Muñoz
 */
@Component({
    selector: 'ejercicio-comic',
    templateUrl: './ejercicio-comic-component.html'
})

export class EjercicioComicComponent implements OnInit{

    public listaComic = Array<EjercicioComicComponent>();

    public idComicGlobalPublic : number;
    public nombreComicGlobalPublic : string;
	public editorialGlobalPublic : string; 
    public tematicaGlobalPublic : string;
    public numeroPaginasGlobalPublic : number;
    public precioGlobalPublic : number;
    public autoresGlobalPublic : string;
    public aColorGlobalPublic : boolean;
    public fechaVentaGlobalPublic : Date;
    public estadoVentaGlobalPublic : string;

    ngOnInit() : void {
        this.idComicGlobalPublic=1;
        this.nombreComicGlobalPublic="batman";
	    this.editorialGlobalPublic="marvel"; 
        this.tematicaGlobalPublic="accion";
        this.numeroPaginasGlobalPublic=50;
        this.precioGlobalPublic=60.500,99;
        this.autoresGlobalPublic="pedrito barrera";
        this.aColorGlobalPublic=true;
        this.fechaVentaGlobalPublic=new Date(10-10-2019);
        this.estadoVentaGlobalPublic="activo";  
        
              
        
}