const nombres = ["Jorge", "Cesar", "Neri", "Roberto"];
const numeros = [2, 3, 7, 10, 23, 24, 28, 18, 26, 25];

let count = -1;

//while
// while (count < nombres.length) {
//   console.log(nombres[count]);
//   count++;
// }

// while (true) {
//   if (nombres[count].length >= 7) {
//     break;
//   } else if (nombres[count].length < 5) {
//     count++;
//     continue;
//   } else {
//     console.log(nombres[count]);
//   }
//   count++;
// }

// do while
//  do {
//    console.log(nombres[count]);
//    count++;
//    console.log(count);
//  } while (count < nombres.length);
//
//  do {
//    count++;
//    if (nombres[count].length >= 7) {
//      break;
//    } else if (nombres[count].length < 5) {
//      continue;
//    } else {
//      console.log(nombres[count]);
//    }
//  } while (true);

//for
// for (let i = 0; i < nombres.length; i++) {
//   console.log("valor del contador i: " + i);
//   for (let j = 0; j < nombres.length - 1; j++) {
//     console.log("valor del contador j: " + j);
//   }
//   console.log(nombres[i]);
// }

//for each
// nombres.forEach((nombre, index, array) => {
//   console.log({ nombre });
//   console.log({ index });
//   console.log({ array });
// });
//
// numeros.forEach((num, i) => {
//   console.log(num + numeros[i + 1]);
// });

//ejericio
const iNumeros = [];
let num;

function evenOrOdd(array) {
  for (let i = 0; i < array.length; i++) {
    if (array[i] % 2 == 0) {
      console.log(array[i] + " Este numero es par");
    } else {
      console.log(array[i] + " Este numero es impar");
    }
  }
}

while (num != 0) {
  num = +prompt(
    "Ingrese los numeros para el array: (Ingresar 0 para finalizar)",
  );
  iNumeros.push(num);
}

evenOrOdd(iNumeros);

// const inumeros = [
//   1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22,
//   23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41,
//   42, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60,
//   61, 62, 63, 64, 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79,
//   80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 91, 92, 93, 94, 95, 96, 97, 98,
//   99, 100,
// ];
//
// function evenOrOdd(array) {
//   for (let i = 0; i < array.length; i++) {
//     if (array[i] % 2 == 0) {
//       console.log(array[i] + " Este numero es par");
//     } else {
//       console.log(array[i] + " Este numero es impar");
//     }
//   }
// }
//
// evenOrOdd(inumeros);
