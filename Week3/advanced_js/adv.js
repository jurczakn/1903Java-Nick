//Pre-ES6
//Immediatly Evoked Function Expression
//allowed JS developers to create a local scope
var length = 1.78;

(function iefe() {

    var feetString = " ft ";
    var inchesString = "in";

    var inchesConversion = 39.37;

    var inches = length*inchesConversion;

    var feet = Math.floor(inches/12);

    inches = inches%12;

    length = feet + feetString + inches + inchesString;

})();

console.log(length);

//ES6 introduced let and const keywords
//let - allows you to declare a variable in block scope
//const - allows you to declare a constant variabel in block scope

length = 13.56;

{

    const feetString = " ft ";
    const inchesString = "in";

    const inchesConversion = 39.37;

    let inches = length*inchesConversion;

    let feet = Math.floor(inches/12);

    inches = inches%12;

    length = feet + feetString + inches + inchesString;

    //inchesConversion = 7;

}

console.log(length);

//Closure: a way to achieve Encapsulation in JS
//by returning a funciton from within a function that
//holds the value being encapsulated
let x = function(){
    let value = 12;

    /* return function(){
        return value;
    } */
    return {
        getValue: function(){
            return value;
        },
        setValue: function(val){
            value = val;
        }
    }

}();
x.setValue(13);
console.log("encapsulated value: " + x.getValue());

//as of ES6, JavaScript introduced class syntax
//all of this is simply syntax sugar
class Person{

    constructor(name, age, height, tendencies){
        this.name = name;
        this.age = age;
        this.height = height;
        this.tendencies = tendencies || [];
    }

    run() {
        console.log("it has been a long day, why am I running");
    }

    work() {
        console.log("it has been a long day, why am I still working");
    }

}

class Coder extends Person {

    constructor(name, age, height, favoriteLanguage){
        super(name, age, height, ['code', 'ask questions']);
        this.favoriteLanguage = favoriteLanguage;
    }

    code(){
        console.log("I am writing code");
    }
}