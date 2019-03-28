import {Wrestler, stoneCold} from './classes';

//Intefaces are contracts for other classes and objects
//Can be used to define custom types without creating classes

interface User{
    username: string;
    password: string;
    confirmPassword?: string; //optional field

}

let user:User;

user = {username: `bob`, password: `bobert`}; //valid instantiation of a user

//also a valid users
user = {username: `bobby`, password: `bobbie`, confirmPassword: `bobbie`};
user = {masterUsername: `Ian`, masterPassword: `life finds a way`};
//invalid instaniation of user

let arrayUsers: Array<User>;

arrayUsers.push(null);

user = null;

export interface finisher{
    finishingMove: string;
    celebrate(): string;
}

//arrayUsers.push(stoneCold);

