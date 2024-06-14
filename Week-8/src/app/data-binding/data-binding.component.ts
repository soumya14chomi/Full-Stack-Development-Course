import { Component } from '@angular/core';
import { Customer } from '../model/Customer';

@Component({
  selector: 'app-data-binding',
  templateUrl: './data-binding.component.html',
  styleUrls: ['./data-binding.component.css']
})
export class DataBindingComponent {
  x :number =100;

  customerObj: any = {
    code : 100, 
    name : "Soumya",
    amount : 8278
  }

  customer:Customer = new Customer();

  delete : boolean = false;
  test1 : string = "Starting Value from Test";
  boundValue : number =2000;

  callMe():void{
    alert("Method called");
  }
}
