import { Component } from '@angular/core';
import { LoggingService } from '../services/logging.service';

@Component({
    selector: 'app-myfirst',
    templateUrl: './myfirst.component.html',
    styleUrls: ['./myfirst.component.css']
})
export class MyFirstComponent {

    constructor(private logger: LoggingService) {

    }

    printLog() {
        this.logger.log('Warn', 'New message at ' + Date.now());
    }

}
