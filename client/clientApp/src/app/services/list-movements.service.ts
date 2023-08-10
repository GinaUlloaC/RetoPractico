import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Movements } from '../models/movements';
import { environment } from 'src/environments/environment.development';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class ListMovementsService {
  url= 'movements/find';
  constructor(private http : HttpClient) { }

  public getMovements(accountClient: number) : Observable <Movements[]>{
    return this.http.get<Movements[]>(environment.apiUrl+'/'+this.url+'/'+accountClient);
  }
}
