import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Movie } from './Movie';

@Injectable({
  providedIn: 'root'
})
export class MovieserviceService   {

  moviedetail : Movie;

  constructor(private http:HttpClient) { }

  public adminLogin(username:any){

    return this.http.get("http://localhost:8087/adminlogin/"+username);

  }

  public addMovie(movie:any){

    return this.http.get("http://localhost:8087/addmovie"+movie,{responseType:'text' as 'json'});

  }
    public getMovies(){

      return this.http.get("http://localhost:8087/getmovies");

    }

    public deleteMovie(id:any){

      return this.http.delete("http://localhost:8087/deletemovie/"+id);

    }

   public updateMovieTicket(movieTicket: any) {
      return this.http.put("http://localhost:8087/deletemovie/", movieTicket);
    }
  
}
