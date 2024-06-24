const array = [3, 7, 9, 12, 5, 33];

//forEach
array.forEach((i) => {
  console.log(i * 2);
});

//Filter
function isEven(value) {
  return value % 2 === 0;
}
console.log(array.filter(isEven));

//Map
var newArray = array.map((n) => {
  return n * 2;
});
console.log(newArray);

//Reduce
let result = array.reduce((sum, current) => sum + current, 0);
console.log(result);
