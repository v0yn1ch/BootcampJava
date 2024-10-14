let arrayM = [];
let number = +prompt("Ingresar el numero a multiplicar: ");
let length = +prompt("Ingresar cuantos multiplos desesa: ");

function arrayMult(number, length) {
  for (let i = 1; i <= length; i++) {
    arrayM.push(number * i);
  }
  return arrayM;
}

console.log(arrayMult(number, length));
