import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import {HttpClientModule } from '@angular/common/http';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { AdminloginComponent } from './adminlogin/adminlogin.component';
import { FormsModule } from '@angular/forms';
import { RouterModule, Routes } from '@angular/router';
import { AdmindashComponent } from './admindash/admindash.component';
import { MovieserviceService } from './movieservice.service';
import { AddmovieComponent } from './addmovie/addmovie.component';
import { UserloginComponent } from './userlogin/userlogin.component';
import { HomeComponent } from './home/home.component';
import { UpdatemovieComponent } from './updatemovie/updatemovie.component';
import { MoviedetailsComponent } from './moviedetails/moviedetails.component';
import { PaymentComponent } from './payment/payment.component';


const routes:Routes=[{path:"",redirectTo:"home",pathMatch:"full"},
{path:"adminlogin",component:AdminloginComponent},
{path:"admindash",component:AdmindashComponent},
{path:"addmovie",component:AddmovieComponent},
{path:"updatemovie",component:UpdatemovieComponent},
{path:"home",component:HomeComponent},
{path:"moviedetails",component:MoviedetailsComponent},
{path:"payment",component:PaymentComponent}
];

@NgModule({
  declarations: [
    AppComponent,
    AdminloginComponent,
    AdmindashComponent,
    AddmovieComponent,
    UserloginComponent,
    HomeComponent,
    UpdatemovieComponent,
    MoviedetailsComponent,
    PaymentComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule,
     HttpClientModule,
      [RouterModule.forRoot(routes)]
  ],
  providers: [MovieserviceService],
  bootstrap: [AppComponent]
})
export class AppModule { }
