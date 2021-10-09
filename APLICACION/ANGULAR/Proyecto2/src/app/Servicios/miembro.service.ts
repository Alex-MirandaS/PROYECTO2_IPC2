import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http'
import { Observable } from 'rxjs';
import { Miembro } from '../Modelos/Miembro';

@Injectable({
  providedIn: 'root'
})
export class MiembroService {

  readonly API_URL = "http://localhost:8080/backendRevistas/";

  constructor(private httpClient: HttpClient) { }

  public crearMiembro(miembro: Miembro): Observable<Miembro> {
    return this.httpClient.post<Miembro>(this.API_URL + "MiembroServlet", miembro) ;
  }
}
