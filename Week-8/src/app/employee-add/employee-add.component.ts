import { Component } from '@angular/core';
import { Employee } from '../employee-model/Employee';
import { FormBuilder, FormControl, FormGroup, Validators } from '@angular/forms';
import { EmployeeService } from '../employee-service/employee.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-employee-add',
  templateUrl: './employee-add.component.html',
  styleUrls: ['./employee-add.component.css']
})
export class EmployeeAddComponent {
  employee:Employee = new Employee();
  empForm: FormGroup = new FormGroup({
    name : new FormControl(''),
    email : new FormControl(''),
    salary : new FormControl('')
  });

  submitted: boolean =false;
  constructor(private _formBuilder:FormBuilder, private _empService:EmployeeService, private _router:Router)
  {

  }

  ngOnInit(): void {
    //Called after the constructor, initializing input properties, and the first call to ngOnChanges.
    //Add 'implements OnInit' to the class.
    this.empForm = this._formBuilder.group({
      name:['', Validators.required],
      email: ['', [Validators.required, Validators.email]],
      salary : ['', Validators.min(0)]
    })
  }


  addEmployee():void{
    this.submitted = true;
    console.log(this.employee);
    console.log(typeof this.employee.salary);
    if(this.empForm.valid){
      console.log("Successfully Submitted...");
      this._empService.addNewEmployee(this.employee).subscribe(result =>{
        console.log(result);
      });
      this._router.navigate(['employee']);
    }
    return;
  }

  reset():void{
    this.submitted = false;
    this.empForm.reset();
}
}
