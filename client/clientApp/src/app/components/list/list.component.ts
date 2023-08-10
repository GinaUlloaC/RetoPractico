import { Component, Input} from '@angular/core';


import { MatTableDataSource } from '@angular/material/table';
import { Movements } from 'src/app/models/movements';
import { ListMovementsService } from 'src/app/services/list-movements.service';

@Component({
  selector: 'app-list',
  templateUrl: './list.component.html',
  styleUrls: ['./list.component.css']
})
export class ListComponent {
  title = 'Drivers.App';
  lst: string[]= ['id','typeMovement','value','detail'];
  movements : Movements[] = [];
  listDataSource:any;
  @Input() idClient: string='';

  constructor(private movementsService: ListMovementsService){
    /* console.log("En este instante el constructor ha cargado");
    this.movementsService.getMovements(this.idClient)
      .subscribe(result=> {
        console.log(result),
        this.movements = result,
        this.listDataSource = new MatTableDataSource<Movements>(this.movements)
      }); */
  }
  
}
