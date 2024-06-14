import { Component } from '@angular/core';
import { User } from '../model/User';
import { FormBuilder, FormControl, FormGroup, Validators } from '@angular/forms';
import UserService from '../service/userService';
import { Route, Router } from '@angular/router';

@Component({
  selector: 'app-user-add',
  templateUrl: './user-add.component.html',
  styleUrls: ['./user-add.component.css']
})
export class UserAddComponent {

  user:User = new User();
  userForm: FormGroup = new FormGroup({
    name : new FormControl(''),
    email : new FormControl(''),
    username: new FormControl(''),
    phone: new FormControl(''),
    website: new FormControl('')
  });

  submitted: boolean =false;
  constructor(private _formBuilder:FormBuilder, private _userService:UserService, private _router:Router)
  {

  }

  ngOnInit(): void {
    //Called after the constructor, initializing input properties, and the first call to ngOnChanges.
    //Add 'implements OnInit' to the class.
    this.userForm = this._formBuilder.group({
      name:['', Validators.required],
      email: ['', [Validators.required, Validators.email]],
      username:['', [Validators.required, Validators.minLength(5)]],
      phone : ['', Validators.required],
      website: ['', Validators.required]
    })
  }


  addUser():void{
    this.submitted = true;
    console.log(this.user);
    if(this.userForm.valid){
      console.log("Successfully Submitted...");
      this._userService.addNewUser(this.user).subscribe(result =>{
        console.log(result);
      });
      this._router.navigate(['user']);
    }
    return;
  }

  reset():void{
    this.submitted = false;
    this.userForm.reset();
  }

}
