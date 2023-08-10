import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Client } from '../models/client';
import { Observable } from 'rxjs';
import { environment } from 'src/environments/environment.development';

@Injectable({
  providedIn: 'root'
})
export class ClientService {
  url= 'clients/find';

  constructor(private http : HttpClient) { }

  public getClient(numberClient : string) : Observable <Client[]>{
    return this.http.get<Client[]>(environment.apiUrl+'/'+this.url+'/'+numberClient);
  }
}
