function getPoke(){

    let id = document.getElementById("pokeId").value;

    console.log("id: " + id);

    //AJAX - Asynchronous JavaScript and XML

    //Step 1. Create XHR
    let xhr = new XMLHttpRequest();

    //Step 2. Define event handler of on ready state change
    xhr.onreadystatechange = function(){

        if (xhr.readyState === 4 && xhr.status === 200){

            let pokemans = JSON.parse(xhr.responseText);

            console.log(pokemans);
            document.getElementById("pokeName").innerHTML = pokemans.name;

        }

    }

    xhr.open("GET", "https://pokeapi.co/api/v2/pokemon/"+id, true);
    xhr.send();

}

window.onload = function(){
    document.getElementById("submitId").addEventListener("click", getPoke, false);
}