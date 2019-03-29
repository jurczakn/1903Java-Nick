import { Component, OnInit } from '@angular/core';
import { FormsModule } from '@angular/forms';

@Component({
  selector: 'app-databinding',
  templateUrl: './databinding.component.html',
  styleUrls: ['./databinding.component.css']
})
export class DatabindingComponent implements OnInit {

  twoWayValue = 'initial value';

  interpolation = 'Welcome to the Interpolation';

  title = 'Interpolation';

  interpolationNotation = '{{}}';

  propertyBindingNotation = '[]';

  eventBindingNotation = '()';

  counter = 1;

  objectStyle = {
    color: 'red',
    border: '1px solid black',
    cursor: 'pointer',
    margin: '2px'
  };

  twoWayBinding = '[()]';

  constructor() { }

  ngOnInit() {
  }

  changeStyles() {
    if (this.objectStyle.color === 'red') {
      this.objectStyle.color = 'green';
      this.objectStyle.border = '3px dashed yellow';
    } else if (this.objectStyle.color === 'green') {
      this.objectStyle.color = 'blue';
      this.objectStyle.border = '24px dotted pink';
    } else {
      this.objectStyle.color = 'red';
      this.objectStyle.border = '1px solid black';
    }
  }

  addToCounter() {
    this.counter++;
  }

}
