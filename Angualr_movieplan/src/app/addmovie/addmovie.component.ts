import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { Movie } from '../Movie';
import { MovieserviceService } from '../movieservice.service';

@Component({
  selector: 'app-addmovie',
  templateUrl: './addmovie.component.html',
  styleUrls: ['./addmovie.component.css']
})
export class AddmovieComponent   implements OnInit {

    movie:Movie=new Movie();
    msg:any;
  constructor(private service:MovieserviceService,public router:Router) { }

  ngOnInit(): void {
   
  }

  AddNow(){

   let response=this.service.addMovie(this.movie);
   response.subscribe((data:any)=>this.msg=data)
  console.info("data"+this.msg);

   if(this.msg!=null){

     

   }
   {


    this.msg="Not added";
   }
        

  }

}
