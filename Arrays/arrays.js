// const nombres = ["Jorge", "Cesar", 23, true, ["Lee", "Irving"]];
// const nums = [];

// console.log(nombres[0]);
// console.log(nombres[1]);
// console.log(nombres[2]);
// console.log(nombres[3]);
// console.log(nombres[4]);
// console.log(nombres);
//
// console.log(nombres[4][0]);
// console.log(nombres[4][1]);
//
// console.log(nombres.length);
// console.log(nums.lengeth);
//
// nombres[0] = "Neri";
// console.log(nombres[0]);
// nombres[2] = 25;
// console.log(nombres[2]);
// nombres[4][0] = "Muriel";
// console.log(nombres[4][0]);
// console.log(nombres[4][1]);
//
// // Agregar valores al final del array
// nombres.push("Karla");
// nombres.push("Tania");
// console.log(nombres);
// console.log(nombres.slice(2, 5));
// const arrayNoms = nombres.slice(4);
// console.log(arrayNoms);
// nombres[4].push("Cesar");
// console.log(nombres[4]);
//
// // Agregar valores al inicio del array
// console.log(nombres.unshift("Jesus", "Oscar"));
// console.log(nombres);
//
// // Eliminar valores
//
// // Eliminar todos los valores
// nombres.length = 0;
// console.log(nombres);
// console.log(nombres.length);
//
// // Elimina el ultimo elemento y regresarlo
// console.log(nombres.pop());
// console.log(nombres);
// console.log(nombres.pop());
// console.log(nombres);
// console.log(nombres.pop());
// console.log(nombres);
//
// // Elimina primer elemento
// console.log(nombres.shift());
// console.log(nombres);
// console.log(nombres.shift());
// console.log(nombres);

// let nombre = "Jorge";
// let copiaNombre = nombre;
// console.log(copiaNombre);
// copiaNombre = "Irving";
// console.log(copiaNombre);
// console.log(nombre);
//
// const copiaNombres = nombres;
// console.log(copiaNombres);
// copiaNombres[0] = "Josue";
// console.log(copiaNombres);
// console.log(nombres);
//
// // Rest operator
//
// function suma(...numeros) {
//   return numeros.reduce((acc, num) => acc + num, 0);
//   // console.log(numeros);
// }
//
// console.log(suma(1, 2, 3, 4, 5, 6, 7, 8, 9));
//
// // Spread operator
// const nombresCopia = [...nombres];
// nombresCopia[0] = "Carlos";
// console.log(nombresCopia);
// console.log(nombres);
//
const numeros = [2, 3, 7, 10, 23, 24, 28, 18, 26, 25];
const nombres = ["Jorge", "Cesar", "Neri", "Roberto"];
// const nombresMayus = nombres.map((nombre) => nombre.toUpperCase());
// const numerosPorDos = numeros.map((numero, index) => {
//   console.log(index);
//   let numeroMultiplicado = numero * 2;
//   let numeroSumado = numeroMultiplicado + 1;
//   return numeroSumado;
// });
// console.log(numeros);
// console.log(numerosPorDos);
// console.log(nombresMayus);
//
// // Filter
// const pares = numeros.filter((numero) => numero % 2 == 0);
// console.log(pares);
// const nombre = nombres.filter((nombre) => nombre == "Neri");
// console.log(nombre);
// const nombresFiltrados = nombres.filter((nombre) => nombre.includes("o"));
// console.log(nombresFiltrados);
// const nombresFiltradosLenght = nombres.filter((nombre) => {
//   return nombre.length > 4 && nombre != "Roberto";
// });
// console.log(nombresFiltradosLenght);
//
// const everOrOdd = numeros.filter((numero) => numero % 2 != 0);
// console.log(everOrOdd);
//
// const filtered = numeros.filter((num) => {
//   if (num % 2 == 0 && num > 10) {
//     return true;
//   }
//   return false;
// });
//
// const result2 = numeros.filter((num) =>
//   num % 2 == 0 && num > 10 ? true : false,
// );
//
// const filtered2 = numeros.filter((num) => num % 2 == 0 && num > 10);
//
// console.log(filtered);
// console.log(result2);
// console.log(filtered2);

//Revertir arreglos
// const numeroR = numeros.reverse();
// console.log("numerosR", numeroR);
// console.log("numeros", numeros);
// const nombresR = nombres.reverse();
// console.log("nombreR", nombresR);
// console.log("nombres", nombres);
//
// const numerosToR = numeros.toReversed();
// console.log("NumerosToR", numerosToR);
// console.log("numeros", numeros);
// const nombresToR = nombres.toReversed();
// console.log("nombresToR", nombresToR);
// console.log("nombres", nombres);

// Obtener elementos del array con .at()

// console.log(numeros.at(-1));
// console.log(numeros.at(-2));
// console.log(numeros.at(-3));
// console.log(numeros.at(-4));
// console.log(nombres.at(2));
// console.log(nombres.at(2));
// console.log(nombres.at(1));
// console.log(nombres.at(0));

//
const arrayUnido = nombres.join();
console.log(arrayUnido);
console.log(typeof arrayUnido);

// concat() se usa para unir 2 arrays
const nomNums = numeros.concat(nombres);
console.log(nomNums);
console.log(nomNums.join());
