import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';


import { AppComponent } from './app.component';
import {PersonService} from "./person/person.service";
import {FormsModule} from "@angular/forms";
import {HttpModule} from "@angular/http";
import {RouterModule, Routes} from "@angular/router";
import {PersonComponent} from "./person/person.component";

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
    RouterModule.forRoot(appRoutes),
    BrowserModule,
    FormsModule,
    HttpModule
  ],
  providers: [PersonService],
  bootstrap: [AppComponent]
})
export class AppModule { }
