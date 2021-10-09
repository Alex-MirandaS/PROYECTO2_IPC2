import { MiembroService } from './../../Servicios/miembro.service';
import { Miembro } from './../../Modelos/Miembro';
import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormGroup} from '@angular/forms';

@Component({
  selector: 'app-crear-miembro',
  templateUrl: './crear-miembro.component.html',
  styleUrls: ['./crear-miembro.component.css']
})
export class CrearMiembroComponent implements OnInit {

_miembro: Miembro;
messageFlag: boolean = false;
formularioCrearMiembro!: FormGroup;
/*private formBuilder: FormBuilder, private servicioMiembro: MiembroService*/
  constructor() {
    this._miembro = new Miembro("","","","");
   }

  ngOnInit(): void {
   /* this.formularioCrearMiembro = this.formBuilder.group({
      
    });*/
  }

  public crearMiembro() {
    /*if (this.formularioCrearMiembro.valid) {
      console.log("algo");
      console.log(this.formularioCrearMiembro.value);
      console.log("Enviar los datos al servidor");
      this.servicioMiembro.crearMiembro(this.formularioCrearMiembro.value)
        .subscribe((created: Miembro) => {
          this.formularioCrearMiembro.reset({
            "img": null,
            "descripcion": null,
            "hobbies": null
          });
          console.log("created");
          console.log(created);
          if (created != null) {
            
          } 
        }, (error: any) => {
        });
    } else {
      console.log("ERROR DE INGRESO")
    }*/
  }

}
