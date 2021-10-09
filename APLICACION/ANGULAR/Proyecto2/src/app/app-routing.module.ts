import { ContenidoMiembroComponent } from './Componentes/contenido-miembro/contenido-miembro.component';
import { CrearMiembroComponent } from './Componentes/crear-miembro/crear-miembro.component';
import { LoginComponent } from './Componentes/login/login.component';
import { NgModule, Component } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';

const routes: Routes = [
{
  path: '',
  component: CrearMiembroComponent
},
{
  path: 'xd',
  component: ContenidoMiembroComponent
},
{
  path: 'xxd',
  component: LoginComponent
},
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
