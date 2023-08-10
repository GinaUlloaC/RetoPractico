import { Component } from '@angular/core';
import { NgForm } from '@angular/forms';

import { MatTableDataSource } from '@angular/material/table';
import { Client } from 'src/app/models/client';
import { Movements } from 'src/app/models/movements';
import { ClientService } from 'src/app/services/client.service';
import { ListMovementsService } from 'src/app/services/list-movements.service';


@Component({
  selector: 'app-client',
  templateUrl: './client.component.html',
  styleUrls: ['./client.component.css']
})
export class ClientComponent {

  element :boolean=false;
  lst: string[]= ['id','name','lastname','age','account','date','balanceAccount', 'appointment'];
  client :any={numberClient:""};
  clients : Client[] = [];
  dataSource:any;


  lstMovements: string[]= ['id','typeMovement','value','detail'];
  movements : Movements[] = [];
  listDataSource:any;
  constructor(private clientService: ClientService,private movementsService: ListMovementsService){
    
  }
  find(form: NgForm){
    this.clientService.getClient(this.client.numberClient)
      .subscribe(result=> {
        console.log('client'),
        console.log(result),
        this.clients = result,
        this.dataSource = new MatTableDataSource<Client>(this.clients)
      });

      this.movementsService.getMovements(this.client.numberClient)
      .subscribe(resultMovements=> {
        console.log(resultMovements),
        this.movements = resultMovements,
        this.listDataSource = new MatTableDataSource<Movements>(this.movements)
      });

      if(this.clients.length>0){
        this.element=true;
      }
  }
}
