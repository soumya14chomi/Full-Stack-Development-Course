import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { HomeComponent } from './home/home.component';
import { AboutComponent } from './about/about.component';
import { AddPersonComponent } from './add-person/add-person.component';
import { ContactComponent } from './contact/contact.component';
import { CustomersupportComponent } from './customersupport/customersupport.component';
import { EmployeesupportComponent } from './employeesupport/employeesupport.component';
import { MainComponent } from './main/main.component';
import { SupportComponent } from './support/support.component';
import { UserAddComponent } from './user-add/user-add.component';
import { UserDetailsComponent } from './user-details/user-details.component';
import { UsersComponent } from './users/users.component';
import { EmployeeComponent } from './employee/employee.component';
import { EmployeeAddComponent } from './employee-add/employee-add.component';
import { EmployeeDetailsComponent } from './employee-details/employee-details.component';
import { EmployeeDeleteComponent } from './employee-delete/employee-delete.component';

const routes: Routes = [
  {path : 'abc', redirectTo : "home", pathMatch : "full"},
  {path : "home", component: HomeComponent},
  {path : "addPerson", component : AddPersonComponent},
  {path : "about", component : AboutComponent},
  {path : "contact", component : ContactComponent},
  {path : "customerSupport", component: CustomersupportComponent},
  {path : "employeeSupport", component :EmployeesupportComponent},
  {path : "main", component:MainComponent},
  {path : "support", component:SupportComponent, children : [    
    {path : "", component: EmployeesupportComponent},
    {path : "customerSupport", component: CustomersupportComponent},
    {path : "employeeSupport", component :EmployeesupportComponent},
  ]},
  {path : "userAdd", component :UserAddComponent},
  {path : "userdetails/:id", component : UserDetailsComponent},
  {path: "user", component : UsersComponent},
  {path : "employee", component: EmployeeComponent},
  {path : "employeeAdd", component : EmployeeAddComponent},
  {path : "employeeDetails/:id", component : EmployeeDetailsComponent},
  {path : "delete/:id", component : EmployeeDeleteComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
