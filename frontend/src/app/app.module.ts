import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';


import { AppComponent } from './app.component';
import {PersonService} from "./person.service";
import {FormsModule} from "@angular/forms";
import {HttpModule} from "@angular/http";
import {RouterModule, Routes} from "@angular/router";
import {PersonComponent} from "./person.component";

const appRoutes: Routes = [
// map '/persons' to the people list component
  { path: 'persons', component: PersonComponent },

  // map '/persons/:id' to person details component
 // { path: 'person/:id', component: PersondetailComponent },
];

@NgModule({
  declarations: [
    AppComponent,
    PersonComponent
  ],
  imports: [
    BrowserModule,
    FormsModule,
    HttpModule,
    RouterModule.forRoot(appRoutes)
  ],
  providers: [PersonService],
  bootstrap: [AppComponent]
})
export class AppModule { }
