import { Component, OnInit } from '@angular/core';
import { PokemonService } from 'src/app/services/pokemon.service';
import { Pokemon } from 'src/app/types/pokemon';
import { FormsModule } from '@angular/forms';

@Component({
  selector: 'app-pokemon',
  templateUrl: './pokemon.component.html',
  styleUrls: ['./pokemon.component.css']
})
export class PokemonComponent implements OnInit {

  id: string;
  myPokemon: Pokemon = new Pokemon();

  getPokemon() {
    console.log('pokeservice: ' + this.pokemonService.getPokemon);
    this.pokemonService.getPokemon(this.id).subscribe(
      data => this.myPokemon = data
    );
  }

  constructor(private pokemonService: PokemonService) { }

  ngOnInit() {
  }

}
