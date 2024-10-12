const info = {
  nombre: "Arturo",
  apellido: "Peralta",
  edad: 26,
  estaVivo: true,
  animalesFavoritos: ["tigre", "leon", "pantera"],
  suma: (a, b) => a + b, //metodo
  direccion: {
    calle: "alegria siempre viva",
    numero: "123",
    cp: 55764,
  },
};
const cosas = {};

// Notacion de punto para obtener los valores de nuestro objeto
console.log(info.apellido);
console.log(info.edad);
console.log(info.animalesFavoritos[1]);
info.apellido = "Silva";
console.log(info.apellido);
console.log(info);
info.cancionFavorita = "VeridisQuo";
console.log(info);

//Eliminar llave de un objeto
delete info.edad;
console.log(info);

//Usar un metodo de un objeto
console.log(info.suma(2, 4));

//elimiar un metodo de un objeto
delete info.suma;
console.log(info);
console.log(info.direccion.numero);
// console.log(info["nombre p"]);

//Obtener un array de array donde cada array es un par llave valor
console.log(Object.entries(info));

//Obtener solo un array de puras llaves
console.log(Object.keys(info));

//Obtener un array con los valores del objeto
console.log(Object.values(info));

//Destructuring en objetos
const { apellido, estaVivo } = info;
console.log(estaVivo);
console.log(apellido);

//Destructuring en arrays
const nombres = ["Jorge", "Cesar", "Neri", "Roberto"];
const [nombre2, nombre1, ...nombresNuevo] = nombres;
const [, , nombre3, nombre4] = nombres;
console.log(nombre1);
console.log(nombre2);
console.log(nombresNuevo);
console.log(nombre3);
console.log(nombre4);
