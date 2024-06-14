import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';
import {HttpClientModule} from "@angular/common/http";
import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { MainComponent } from './main/main.component';
import { AboutComponent } from './about/about.component';
import { AddPersonComponent } from './add-person/add-person.component';
import { ContactComponent } from './contact/contact.component';
import { CustomersupportComponent } from './customersupport/customersupport.component';
import { EmployeesupportComponent } from './employeesupport/employeesupport.component';
import { HomeComponent } from './home/home.component';
import { SupportComponent } from './support/support.component';
import { UserAddComponent } from './user-add/user-add.component';
import { UserDetailsComponent } from './user-details/user-details.component';
import { UsersComponent } from './users/users.component';
import { DataBindingComponent } from './data-binding/data-binding.component';
import { LifecycleComponent } from './lifecycle/lifecycle.component';
import { EmployeeComponent } from './employee/employee.component';
import { EmployeeAddComponent } from './employee-add/employee-add.component';
import { EmployeeDetailsComponent } from './employee-details/employee-details.component';
import { EmployeeDeleteComponent } from './employee-delete/employee-delete.component';
@NgModule({
  declarations: [
    AppComponent,
    MainComponent,
    AboutComponent,
    AddPersonComponent,
    ContactComponent,
    CustomersupportComponent,
    EmployeesupportComponent,
    HomeComponent,
    SupportComponent,
    UserAddComponent,
    UserDetailsComponent,
    UsersComponent,
    DataBindingComponent,
    LifecycleComponent,
    EmployeeComponent,
    EmployeeAddComponent,
    EmployeeDetailsComponent,
    EmployeeDeleteComponent
  ],
  imports: [
    BrowserModule,
    FormsModule,
    HttpClientModule,
    ReactiveFormsModule,
    AppRoutingModule
    
  ],
  providers: [],
  bootstrap: [MainComponent]
})
export class AppModule { }
