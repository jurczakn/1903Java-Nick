"use strict";
exports.__esModule = true;
var user;
user = { username: "bob", password: "bobert" }; //valid instantiation of a user
//also a valid users
user = { username: "bobby", password: "bobbie", confirmPassword: "bobbie" };
user = { masterUsername: "Ian", masterPassword: "life finds a way" };
//invalid instaniation of user
var arrayUsers;
arrayUsers.push(null);
user = null;
//arrayUsers.push(stoneCold);
