const prompt = require("prompt-sync")();

let nome = prompt("Qual seu nome: ");
let idade = parseInt(prompt("Qual sua idade: "));

console.log(`Olá ${nome}, você tem ${idade}`);
