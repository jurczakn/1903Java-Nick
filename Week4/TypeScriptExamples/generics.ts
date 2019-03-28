let numArray: Array<number>;
numArray = [1,2,3,4,5,6,8,9,10];
numArray = ['1', '2'];

function identity<T>(arg: T):T {
    return arg;
}

console.log(identity("Hi"));

interface GenericInterface<T> {
    stuff: T;
    (arg: T): T;
}

class GenericClass<T, T2> {
    stuff: T;
    stuff2: T2;
    add: (x: T, y: T2) => T;
}

let myGeneric: GenericClass<string, number>;