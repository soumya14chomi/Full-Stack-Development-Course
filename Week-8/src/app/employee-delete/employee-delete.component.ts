import { Component } from '@angular/core';
import { EmployeeService } from '../employee-service/employee.service';
import { ActivatedRoute, Router } from '@angular/router';

@Component({
  selector: 'app-employee-delete',
  templateUrl: './employee-delete.component.html',
  styleUrls: ['./employee-delete.component.css']
})
export class EmployeeDeleteComponent {

  id: any;
  message : string ="";
  constructor(private router : ActivatedRoute, private _empService : EmployeeService, private _router:Router){
    this.id = this.router.snapshot.paramMap.get("id");
    console.log(this.id);
    this._empService.deleteEmployee(this.id).subscribe(result =>{
      this.message = result;
      console.log(result);
      this._router.navigate(['employee']);   
     })
  }

}
