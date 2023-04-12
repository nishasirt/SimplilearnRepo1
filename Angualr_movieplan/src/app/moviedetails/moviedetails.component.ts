import { Component, OnInit } from '@angular/core';
import { MovieserviceService } from '../movieservice.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-moviedetails',
  templateUrl: './moviedetails.component.html',
  styleUrls: ['./moviedetails.component.css']
})
export class MoviedetailsComponent implements OnInit{

   
  movieTicket: any;

  constructor(private service:MovieserviceService,public router:Router) { }
  ngOnInit(): void {
    this.movieTicket=this.service.moviedetail;
  }

  payment(movie:any){

    this.router.navigate(['\payment']);

  }




}
