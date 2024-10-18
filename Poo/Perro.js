import { Animales, suma } from "./Animales.js";
import multiplicar from "./Animales.js";

class Perro extends Animales {
  dueño;
  raza;
  dientesFiloso;
  correa;
  color;
  espolones;
  pelo;
  constructor(
    tamaño,
    patas,
    especie,
    edad,
    nombre,
    cola,
    sonidos,
    dueño,
    raza,
    dientesFiloso,
    correa,
    color,
    espolones,
    pelo,
  ) {
    super(tamaño, patas, especie, edad, nombre, cola, sonidos);
    this.dueño = dueño;
    this.raza = raza;
    this.dientesFiloso = dientesFiloso;
    this.correa = correa;
    this.color = color;
    this.espolones = espolones;
    this.pelo = pelo;
  }
  get dueño() {
    return this.dueño;
  }
  set dueño(value) {
    this.dueño = value;
  }
  get raza() {
    return this.raza;
  }
  set raza(value) {
    this.raza = value;
  }
  get dientesFiloso() {
    return this.dientesFiloso;
  }
  set dientesFiloso(value) {
    this.dientesFiloso = value;
  }
  get correa() {
    return this.correa;
  }
  set correa(value) {
    this.correa = value;
  }
  get color() {
    return this.color;
  }
  set color(value) {
    this.color = value;
  }
  get espolones() {
    return this.espolones;
  }
  set espolones(value) {
    this.espolones = value;
  }
  get pelo() {
    return this.pelo;
  }
  set pelo(value) {
    this.pelo = value;
  }

  //Sobreescbrir un metodo
  getAllProperties() {
    return `Hola soy ${this.dueño} y mi perro se llama ${this.nombre}, tiene el pelo ${this.pelo} y de color ${this.color}. Es una ${this.raza}. ${this.espolones ? "Si" : "No"} tiene espolones y ${this.dientesFiloso ? "tiene" : "no tiene"} dientes filosos`;
  }
}

const rocket = new Perro(
  "grande",
  4,
  "perro",
  8,
  "Rocket",
  true,
  "ladridos",
  "Arturo",
  "labrador",
  true,
  true,
  "amarillo",
  false,
  "corto",
);
const salsita = new Perro(
  "grande",
  4,
  "perro",
  10,
  "Salsita",
  false,
  "ladridos",
  "Jorge",
  "criolla",
  true,
  true,
  "negro",
  true,
  "corto",
);
const chofris = new Perro(
  "pequeño",
  4,
  "perro",
  3,
  "Chofris",
  true,
  "ladridos",
  "Romina",
  "salchicha",
  true,
  true,
  "cafe",
  true,
  "corto",
);
const thomas = new Perro(
  "grande",
  4,
  "perro",
  3,
  "Thomas",
  true,
  "ladridos",
  "Muriel",
  "labrador",
  true,
  true,
  "negro",
  true,
  "corto",
);
const pulgas = new Perro(
  "grande",
  4,
  "perro",
  7,
  "Pulgas",
  true,
  "ladridos",
  "Lee",
  "Pastor Belga",
  true,
  true,
  "beige",
  true,
  "mediano",
);

console.log(rocket);
console.log(rocket.getAllProperties());
console.log(salsita.getAllProperties());
console.log(chofris.getAllProperties());
console.log(thomas.getAllProperties());
console.log(pulgas.getAllProperties());
console.log(suma(2, 2));
console.log(multiplicar(3, 7));
