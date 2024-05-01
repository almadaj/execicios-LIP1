let prompt = require("prompt-sync")();
let products = [];

for (let i = 0; i < 3; i++) {
  var product = {};
  product.name = prompt("Insert product's name: ");
  product.price = prompt("Insert price: ");
  product.qtd = prompt("Insert quantity: ");

  products.push(product);
}

function verifyStock(name) {
  let found = false;
  for (let i = 0; i < products.length; i++) {
    if (name === products[i].name) {
      console.log(`${products[i].name} has ${products[i].qtd} units`);
      found = true;
      break;
    }
  }
  if (!found) {
    console.log(`${name} not found!`);
  }
}

verifyStock("Pasta");

products.map((product) => {
  console.log(product);
});
