import { Component, OnInit } from '@angular/core';
import { MovieserviceService } from '../movieservice.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-home',
  templateUrl: './home.component.html',
  styleUrls: ['./home.component.css']
})
export class HomeComponent  implements OnInit {

  movieTickets : any;

  constructor(private service:MovieserviceService,public router:Router) { }
  ngOnInit(): void {
    let response=this.service.getMovies();
    response.subscribe((data:any)=>this.movieTickets=data);
  }

  bookTicket(movie:any){
    this.service.moviedetail=movie;

    this.router.navigate(['\moviedetails']);
  }

}
