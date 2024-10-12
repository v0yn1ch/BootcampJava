/*

operadores de comparacion

= compara si algo es igual a algo
== compara si algo es igual a algo pero tambien compara el tipo de dato 
>< mayor y menor que
>= <= mayor o igual y menor o igual que
!= diferente de

 */

//const calificacion = 5;
//
//if (calificacion <= 5) {
//  console.log("Reprobaste F");
//}else if(console.log(calificacion > 5 && calificacion <=8)){
//  console.log("Aprobaste felicidades");
//}else if(calificacion>8 && calificacion<=10){
//  console.log("Aprobaste con la calificacion mas mejor");
//}else{
//  console.log("esa calificacion no existe");
//}

let primeraCalificacion = prompt("Ingresa tu primera calificacion");
let segundaCalificacion = prompt("Ingresa tu segunda calificacion");
let terceraCalificacion = prompt("Ingresa tu tercera calificacion");
let sumatoria =
  Number(primeraCalificacion) +
  Number(segundaCalificacion) +
  Number(terceraCalificacion);
let promedio = sumatoria / 3;
//
//if (promedio <= 5 && promedio < 5.6) {
//  console.log("Reprobaste con " + promedio);
//} else if (promedio >= 5.6) {
//  console.log(
//    "Tienes " +
//      promedio +
//      " No se, voy a ver si te doy el 6. Bueno ahi esta, ponte las pilas",
//  );
//  promedio = 6;
//  console.log("Pasaste de panzaso cabron");
//} else if (promedio >= 6 && promedio <= 10) {
//  console.log("Felicidades, aprobaste con " + promedio);
//} else {
//  console.log("Esta calificacion no existe");
//}

//switch
//let numDay = prompt("Ingresa el numero de un dia de la semana");
//
//switch (Number(numDay)) {
//  case 1:
//    console.log("Lunes");
//    break;
//  case 2:
//    console.log("Martes");
//    break;
//  case 3:
//    console.log("Miercoles");
//    break;
//  case 4:
//    console.log("Jueves");
//    break;
//  case 5:
//    console.log("Viernes");
//    break;
//  case 6:
//    console.log("Sabado");
//    break;
//  case 7:
//    console.log("Domingo");
//    break;
//  default:
//    break;
//}

//ejercicio
console.log(promedio);

switch (promedio) {
  case (promedio < 6):
    console.log("Reprobaste");
    break;
  case (promedio >= 6 && promedio <= 10):
    console.log("Aprobaste");
    break;
  default:
    console.log("Esa calificacion no existe");
    break;
}
