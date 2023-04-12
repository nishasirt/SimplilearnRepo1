import { Component, OnInit } from '@angular/core';
import { Movie } from '../Movie';
import { MovieserviceService } from '../movieservice.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-admindash',
  templateUrl: './admindash.component.html',
  styleUrls: ['./admindash.component.css']
})
export class AdmindashComponent implements OnInit{

  movieTickets : any;

  constructor(private service:MovieserviceService,public router:Router) { }
  
  ngOnInit(): void {
    

let response=this.service.getMovies();
response.subscribe((data:any)=>this.movieTickets=data);

  }

  updateMovieTicket(){

  }

  deleteMovieTicket(id:number){
    let response=this.service.deleteMovie(id);
    response.subscribe((data:any)=>this.movieTickets=data);



  }

}
 