import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Employee } from '../employee-model/Employee';

@Injectable({
  providedIn: 'root'
})
export class EmployeeService {

  constructor(private http :HttpClient) { 

  }

  getAllEmpolyees(): Observable<Employee[]>{
    return this.http.get<Employee[]>("http://localhost:8081/employee/FetchAll");
  }
  getEmpDetails(id:number): Observable<Employee>{
    return this.http.get<Employee>("http://localhost:8081/employee/GetEmployeeById/"+id);
  }

  addNewEmployee(employee:Employee) :Observable<Employee>{
    // console.log(employee);
    return this.http.post<Employee>("http://localhost:8081/employee/save", employee);
  }

  deleteEmployee(id: number) : Observable<string> {
    return this.http.delete<string>("http://localhost:8081/employee/DeleteById/"+id )
  }
}
