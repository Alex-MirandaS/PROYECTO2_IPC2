import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { FormBuilder, FormsModule, ReactiveFormsModule } from '@angular/forms';
import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { LoginComponent } from './Componentes/login/login.component';
import { CrearMiembroComponent } from './Componentes/crear-miembro/crear-miembro.component';
import { BarraSuperiorComponent } from './Componentes/barra-superior/barra-superior.component';
import { BarraInferiorComponent } from './Componentes/barra-inferior/barra-inferior.component';
import { ContenidoMiembroComponent } from './Componentes/contenido-miembro/contenido-miembro.component';

@NgModule({
  declarations: [
    AppComponent,
    LoginComponent,
    CrearMiembroComponent,
    BarraSuperiorComponent,
    BarraInferiorComponent,
    ContenidoMiembroComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule,
    ReactiveFormsModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
