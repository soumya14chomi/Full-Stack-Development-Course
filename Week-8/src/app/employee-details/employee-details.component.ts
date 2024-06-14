import { Component } from '@angular/core';
import { Employee } from '../employee-model/Employee';
import { ActivatedRoute } from '@angular/router';
import { EmployeeService } from '../employee-service/employee.service';

@Component({
  selector: 'app-employee-details',
  templateUrl: './employee-details.component.html',
  styleUrls: ['./employee-details.component.css']
})
export class EmployeeDetailsComponent {

  employeedetails : Employee = new Employee();
  id : any;
  constructor(private router : ActivatedRoute, private employeeService: EmployeeService){
    this.id = this.router.snapshot.paramMap.get("id");
    console.log(this.id);
    this.employeeService.getEmpDetails(this.id).subscribe(result =>{
      this.employeedetails = result;
      console.log(this.employeedetails)
    })
  }
}
