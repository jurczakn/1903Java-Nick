import { Component } from '@angular/core';

@Component({
    selector: 'app-pipes',
    templateUrl: './pipes.component.html'

})
export class PipesComponent {

    movieList: Array<string> = [];

    movieTitle: string;

    searchTerm = '';

    addMovie() {
        this.movieList.push(this.movieTitle);
    }

}
