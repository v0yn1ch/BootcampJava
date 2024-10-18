class Animales {
  patas;
  tamaño;
  especie;
  edad;
  nombre;
  cola;
  sonidos;
  constructor(tamaño, patas, especie, edad, nombre, cola, sonidos) {
    this.patas = patas;
    this.tamaño = tamaño;
    this.especie = especie;
    this.edad = edad;
    this.nombre = nombre;
    this.cola = cola;
    this.sonidos = sonidos;
  }
  set setNombre(nuevoNombre) {
    this.nombre = nuevoNombre;
  }
  get getNombre() {
    return this.nombre;
  }
  set setPatas(nuevoPatas) {
    this.patas = nuevoPatas;
  }
  get getPatas() {
    return this.patas;
  }
  set setTamaño(nuevoTamaño) {
    this.tamaño = nuevoTamaño;
  }
  get getTamaño() {
    return this.tamaño;
  }
  set setEspecie(nuevoEspecie) {
    this.especie = nuevoEspecie;
  }
  get getEspecie() {
    return this.especie;
  }
  set setEdad(nuevoEdad) {
    this.edad = nuevoEdad;
  }
  get getEdad() {
    return this.edad;
  }
  set setCola(nuevoCola) {
    this.cola = nuevoCola;
  }
  get getCola() {
    return this.cola;
  }
  set setSonidos(nuevoSonidos) {
    this.sonidos = nuevoSonidos;
  }
  get getSonidos() {
    return this.sonidos;
  }

  //Por Array
  // getAllProperties() {
  //   return [
  //     this.cola,
  //     this.edad,
  //     this.especie,
  //     this.sonidos,
  //     this.tamaño,
  //     this.nombre,
  //     this.patas,
  //   ];
  // }

  //Por Objeto
  getAllProperties() {
    return {
      cola: this.cola,
      especie: this.getEspecie,
      sonidos: this.getSonidos,
      tamanio: this.getTamanio,
      edad: this.getEdad,
      nombre: this.getNombre,
      patas: this.getPatas,
    };
  }
  static getAnimal() {
    return "tortuga 🐢";
  }
}

const pantera = new Animales(4, 1, 3, "felino", 3, "Blacky", false, "rugido");
pantera.setCola = true;
console.log(pantera.getCola);
console.log(pantera.getNombre);
console.log(pantera.getAllProperties());

//Llamando metdo estatico
console.log(Animales.getAnimal);

function suma(a, b) {
  return a + b;
}

export default function multiplicar(a, b) {
  return a * b;
}

export { Animales, suma };
