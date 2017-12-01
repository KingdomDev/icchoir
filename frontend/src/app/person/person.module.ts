import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';


import { PersonComponent } from './person.component';


@NgModule({
  declarations: [
    PersonComponent
  ],
  imports: [
    BrowserModule
  ],
  providers: [],
  bootstrap: [PersonComponent]
})
export class PersonModule { }
