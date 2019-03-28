// TypeScript - well - strong typing 
//allows us to define types of our variales

let myString: string;

myString = `This is a string`;

//myString = 4;

//TS infering the type
let yetAnotherString = 'This is another string';

//yetAnotherString = 4;

//type any, don't do
let maybeAString;

maybeAString = `a string for now`;

maybeAString = 4;

let anArray: Array<string>;

let aNumber: number;

let aBoolean: boolean;

let anything: any;

let nothing: void;

let notAnything: never;

let notSure: undefined;

let object: object;

object = {};

//notAnything = {};


let variable: string;