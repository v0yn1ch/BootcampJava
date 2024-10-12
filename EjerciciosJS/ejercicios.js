// let uT = +prompt("Ingresa el tamaño del triangulo que deseas");
//
// function triangulo(let) {
//   let item = "#";
//   for (let i = 1; i <= let; i++) {
//     console.log(item.repeat(i));
//   }
// }
//
// triangulo(uT);

let uTa = +prompt("Ingresa el tamaño del tablero que deseas");

function tablero(uTa) {
  for (let i = 1; i <= uTa; i++) {
    for (let j = 1; j <= uTa; j++) {
      if ((j + i) % 2 == 0) {
        console.log("0");
      } else {
        console.log("x");
      }
    }
  }
}

tablero(uTa);
