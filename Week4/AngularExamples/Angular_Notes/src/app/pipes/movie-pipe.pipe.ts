import { Pipe, PipeTransform } from '@angular/core';

@Pipe({
  name: 'moviePipe'
})
export class MoviePipePipe implements PipeTransform {

  transform(item: string[], searchText: string): string[] {

    if (!item) {
      return [];
    }

    searchText = searchText.toLowerCase();

    return item.filter(power => {

      let search: boolean;
      search = power.toLowerCase().includes(searchText);
      return search;

    });

  }

}
