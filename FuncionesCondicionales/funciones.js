////function declaration
//function greeting(nombre) {
//  console.log(nombre)
//  return `Hola ${nombre} mucho gusto`;
//}
//
////variable globar
//let nombre = "Flor";
//console.log(nombre);
//
//console.log(greeting("Josue"));
//console.log(greeting("Martha"));
//console.log(greeting("Muriel"));
//console.log(greeting("Tere"));
//
////function expression
//const esMayorDeEdad = function(age) {
//  if (age >= 18) {
//    return "Ya eres mayor de edad";
//
//  } else if (age > 0 && age < 18) {
//    return "Aun no eres mayor de edad";
//
//  }
//  return "No haz nacido";
//}
//
//console.log(esMayorDeEdad(18));
//console.log("--------------------------");
//console.log(esMayorDeEdad(2));
//console.log("--------------------------");
//console.log(esMayorDeEdad(0));
//
////Arrow function
//const hola = () => "hola";
//console.log(hola());
//
//const isEven = (number) => number%2 == 0?"es par":"no es par";
//
//console.log(isEven(2));
//console.log(isEven(5));
//console.log(isEven(4));
//console.log(isEven(3));

//ejercicio
//function cF(celcius) {
//  return celcius * (9 / 5) + 32;
//}
//
//console.log(cF(parseFloat(prompt("Ingresa temperatura (C)"))).toFixed(1) +" F");

//ejercicio2
function descuento(dineroPagado) {
  if (dineroPagado <= 200) {
    console.log("No se aplica descuento");
  } else if (dineroPagado > 200 && dineroPagado < 500) {
    console.log("Tienes un descuento del 10%");
    let descuento = dineroPagado * 0.1;
    dineroPagado = dineroPagado - descuento;
  } else if (dineroPagado >= 500 && dineroPagado <= 1000) {
    let descuento = dineroPagado * 0.2;
    dineroPagado = dineroPagado - descuento;
    console.log("Tienes un descuento del 20%");
  } else {
    console.log("Tienes un descuento del 30%");
    let descuento = dineroPagado * 0.3;
    dineroPagado = dineroPagado - descuento;
  }
  return "El precio quedaria en: " + "$" + dineroPagado;
}

console.log(descuento(parseFloat(prompt("Ingresar monto total: ")).toFixed(1)));
