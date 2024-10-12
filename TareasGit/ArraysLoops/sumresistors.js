const array = [];
let num;

function sumResist(array) {
  let suma;
  for (i = 0; i < array.lenght; i++) {
    if (array[i] < 0) {
      Math.abs(array[i]);
      console.log("|" + array[i] + "|" + " + ");
    } else {
      console.log(array[i] + " + ");
    }
    suma += array[i];
  }
  console.log("= " + suma);
}

while (num != 0) {
  num = +prompt(
    "Ingrese los valores de las resistencias (Ingrese 0 para salir)",
  );
  array.push(num);
}

sumResist(array);
