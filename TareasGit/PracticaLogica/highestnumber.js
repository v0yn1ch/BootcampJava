let arrayNumbers = [];
let number = 0;
let n = 0;

function highestNumber(arrayNumbers) {
  let highest = 0;
  for (let i = 0; i < arrayNumbers.length; i++) {
    if (arrayNumbers[i] > highest) {
      highest = arrayNumbers[i];
    } else {
      continue;
    }
  }
  return highest;
}

while (n < 10) {
  number = +prompt("Ingresa 10 numeros");
  arrayNumbers.push(number);
  n++;
}

console.log("Este es el numero mas alto: " + highestNumber(arrayNumbers));
