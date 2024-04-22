var prompt = require('prompt-sync')()
let n = parseInt(prompt('Escreva um número: '))

if(n % 2 === 0){
    console.log(`${n} is odd`)
}else{
    console.log(`${n} is even`)
}