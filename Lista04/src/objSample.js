let prompt = require('prompt-sync')()
var userObj = {}

userObj.name = prompt("Insert your name: ")
userObj.age = prompt("Insert your age: ")
userObj.profession = prompt("Insert your job: ")
// for (att in userObj){
//     console.log(`${att} = ${userObj[att]}`)
// }

console.log(`Hi, I'm ${userObj.name}, I'm ${userObj.age}yo and work as ${userObj.profession}`)