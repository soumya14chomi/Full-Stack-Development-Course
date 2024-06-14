import { Component } from '@angular/core';
import UserService from '../service/userService';
import { ActivatedRoute } from '@angular/router';
import { User } from '../model/User';

@Component({
  selector: 'app-user-details',
  templateUrl: './user-details.component.html',
  styleUrls: ['./user-details.component.css']
})
export class UserDetailsComponent {

  userdetails : User = new User();
  id : any;
  constructor(private router : ActivatedRoute, private userSerivce: UserService){
    this.id = this.router.snapshot.paramMap.get("id");
    console.log(this.id);
    this.userSerivce.getUserDetails(this.id).subscribe(result =>{
      this.userdetails = result;
      console.log(this.userdetails)
    })
  }

}
