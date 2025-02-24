const prompt = require("prompt-sync")();
let name = prompt("Enter your Name : ");
let age = prompt("Enter your Age : ");
let person = function (name, age) {
    console.log('My Name is ' + name + ' and my age is ' + age);
};
person(name, age);
