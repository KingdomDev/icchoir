import {Component, OnInit} from '@angular/core';
import {PersonService} from "./person.service";
import {Person} from "./person";

@Component({
  templateUrl: './person.component.html',
  styleUrls: ['./person.component.css']
})
export class PersonComponent implements OnInit{
  title = 'personnes';
  persons: Person[];
  sub: any;

  constructor(private personService: PersonService){}

  ngOnInit() {
    this.personService.getAll()
      .subscribe(persons => {this.persons = persons;});
  }
}
