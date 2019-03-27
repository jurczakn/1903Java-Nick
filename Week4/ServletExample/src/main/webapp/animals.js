function getAnimal() {

	let
	xhr = new XMLHttpRequest();

	xhr.onreadystatechange = function() {

		if (xhr.readyState === 4 && xhr.status === 200) {
			let
			animal = JSON.parse(xhr.responseText);
			console.log(animal);
			document.getElementById("result").innerHTML = animal.breed;
		}

	}

	xhr.open("GET", "/ServletExample/animals/"+document.getElementById("name").value, true);

	xhr.send();

}

let
Animal = function(name, breed, color, age) {
	this.name = name;
	this.breed = breed;
	this.color = color;
	this.age = age;
}

function postAnimal() {

	let name = document.getElementById("name").value;
	let breed = document.getElementById("breed").value;
	let color = document.getElementById("color").value;
	let age = document.getElementById("age").value;

	let animal = new Animal(name, breed, color, age);

	let xhr = new XMLHttpRequest();

	xhr.onreadystatechange = function() {

		if (xhr.readyState === 4 && xhr.status === 200) {
			document.getElementById("result").innerHTML = xhr.responseText;
		}

	}

	xhr.open("POST", "/ServletExample/animals/", true);

	xhr.send(JSON.stringify(animal));

}

window.onload = function() {

	document.getElementById("getAnimal").addEventListener("click", getAnimal);
	document.getElementById("postAnimal").addEventListener("click", postAnimal);

}