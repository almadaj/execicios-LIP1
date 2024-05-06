function changeText() {
  let itens = document.querySelectorAll("li");
  itens.forEach((item) => {
    item.innerText = "Item Modificado";
    item.style.color = "#FF0000";
  });
}

let nums = [2, 5, 6, 12, 45, 709];
let temps = [12, 35, 26, 12, 45, 3];

function filtering(num) {
  return num % 2 === 0;
}
console.log(nums.filter(filtering));

function mapping(temp) {
  let fahren = (temp * 9) / 5 + 32;
  return fahren;
}

let converted = nums.map(mapping);
console.log(converted);
