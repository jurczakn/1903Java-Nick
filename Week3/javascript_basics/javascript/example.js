/*
*Let's do some JavaScript
*/
alert('Hello');

var a, b, c, d, e, f, g, h, i;

b = '10';
c = true;
d = {};
e = null;
//f =
g = (0/0);
h = [];
function i () {};

var dogPerson = {
    name: `value`,
    age: 100,
    favoriteFoods: [
        `pizza`, `pasta`, `swarma`
    ],
    toy: {
        type: `ball`,
        size: 5
    },

    play: function(){
        console.log(`${this.name} plays with the ${this.toy.type}`)
    }

}

//Maker function
function makeDogPerson(name, age, favoriteFoods, toy){
    var myDogPerson = {};
    myDogPerson.name = name;
    myDogPerson.age = age;
    myDogPerson.favoriteFoods = favoriteFoods;
    myDogPerson.toy = toy;
    myDogPerson.play = function(){
        console.log(`${this.name} plays with the ${this.toy.type}`)
    };
    return myDogPerson;
}

var DogPerson = function(name, age, favoriteFoods, toy){
    this.name = name;
    this.age = age;
    this.favoriteFoods = favoriteFoods;
    this.toy = toy;
};
DogPerson.prototype.play = function(){
    console.log(`${this.name} plays with the ${this.toy.type}`)
};

var PugPerson = function(){};
PugPerson.prototype = new DogPerson();
PugPerson.prototype.snort = function(){console.log(`the pugperson snorted`)};

function add(x, y){
    //                         v----------semi colon injection
    //console.log(`no semi colon`)
    /* return --will not work because of semicolon injection
    x + y; */
    return x + y;
}

/* var add = function (x, y){
    return x + y;
} */

function add(x, y, z){
    return x + y + z;
}

function add(){
    var ret = 0;
    for(i in arguments){
        ret += i;
    }
    return ret;
}