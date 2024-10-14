let sumaR = [];
let num;

function sumResist(sumaR) {
  let suma = 0;
  for (let i = 0; i < sumaR.length; i++) {
    if (sumaR[i] < 0) {
      console.log("| " + sumaR[i] + " | " + " + ");
    } else {
      console.log(sumaR[i] + " + ");
    }
    suma += Math.abs(sumaR[i]);
  }
  return suma;
}

while (num != 0) {
  num = +prompt(
    "Ingrese los valores de las resistencias (Ingrese 0 para finalizar)",
  );
  if (num != 0) {
    sumaR.push(num);
  } else {
    break;
  }
}

console.log("= " + sumResist(sumaR));
