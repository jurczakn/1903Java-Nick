import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-structural',
  templateUrl: './structural.component.html',
  styleUrls: ['./structural.component.css']
})
export class StructuralComponent implements OnInit {

  show = true;

  hide() {
    this.show = !this.show;
  }

  constructor() { }

  ngOnInit() {
  }

}
