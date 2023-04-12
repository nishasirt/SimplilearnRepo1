import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { Admin } from '../Admin';
import { MovieserviceService } from '../movieservice.service';

@Component({
  selector: 'app-adminlogin',
  templateUrl: './adminlogin.component.html',
  styleUrls: ['./adminlogin.component.css']
})
export class AdminloginComponent implements OnInit{

  constructor(private service:MovieserviceService,public router:Router) { }

  ngOnInit(): void {
   
  }

 admin:Admin= new Admin();

  username:any;

  password:any;

  message:any="";

 loginNow(){

  console.info(this.username);
  let response=this.service.adminLogin(this.username);
  response.subscribe((data:any)=>this.admin=data);

  console.info(this.admin.uname);
  console.info(this.admin.password);


  if(this.admin.password==this.password){

    this.router.navigate(['\admindash']);

  }else{

    this.message="Wrong username or password";
  }


}

}
