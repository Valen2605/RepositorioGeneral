import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { GestionarComicComponent } from './semillero/componentes/gestionarComic/gestionar-comic';
import { ConsultarComicComponent } from './semillero/componentes/ConsultarComic/consultar-comic';
import { GestionarProveedorComponent} from './semillero/componentes/gestionarProveedor/gestionar-proveedor-component';
import { BienvenidaComponent } from './semillero/componentes/home/bienvenida-component';



const routes: Routes = [
  { path: 'consultar-comic', component: ConsultarComicComponent,data : null },
  { path: 'gestionar-comic', component: GestionarComicComponent },
  { path: 'gestionar-proveedor-component', component: GestionarProveedorComponent },
  { path: 'bienvenida', component: BienvenidaComponent, data : null }
 
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
