//let favoriteAnimal = prompt("Ingresa tu animal favorito");
//
//console.log(favoriteAnimal);
//
//let age = prompt("Ingresa tu edad");
//console.log("Tu edad dentro de 5 anos es: " + (Number(age) + 5));

let nombreApellido = prompt("Ingresa tu nombre y apellido");
let comidaFavorita = prompt("Ingresa tu comida favorita");
let edad = prompt("Ingresa tu edad");
let sumaEdad = Number(edad)+5;

console.log(
  "Hola, " +
  nombreApellido +
  " tu comida favorita es: " +
  comidaFavorita +
  ". Tienes " +
  edad +
  " años y dentro de 5 años tendras " +
  sumaEdad,
);
