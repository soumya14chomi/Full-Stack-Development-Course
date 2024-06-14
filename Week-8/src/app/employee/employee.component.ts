import { Component } from '@angular/core';
import { EmployeeService } from '../employee-service/employee.service';

@Component({
  selector: 'app-employee',
  templateUrl: './employee.component.html',
  styleUrls: ['./employee.component.css']
})
export class EmployeeComponent {

  empList : any =[];
  constructor(private _empService : EmployeeService){
    this._empService.getAllEmpolyees().subscribe(result =>{
      this.empList = result;
      console.log(result);
    })



  }

}
