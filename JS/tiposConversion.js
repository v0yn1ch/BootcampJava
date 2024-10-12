let textToNumber = "123";
let textToInteger = "ffdjsafhdfd";
let textToBoolean = "Hola CH";
let booleanToString = false;
let textToFloat = "13.1416fdsafdsafd";

console.log(typeof textToNumber);
console.log(typeof Number(textToNumber));

console.log("--------String to int-----------");
console.log(typeof textToInteger);
console.log(parseInt(textToInteger));
console.log(typeof parseInt(textToInteger));

console.log("----------String to float--------");
console.log(textToFloat);
console.log(typeof textToFloat);
console.log(parseFloat(textToFloat));
console.log(typeof parseFloat(textToFloat));
console.log(parseInt(parseFloat(textToFloat)));

console.log("--------String to boolean--------");
console.log(textToBoolean);
console.log(typeof textToBoolean);
console.log(Boolean(textToBoolean));
console.log(typeof Boolean(textToBoolean));

//Para strings, mientras no sea una cadena vacia regresa true
//Para numbers si no es 0 regresa true
//undefined y null regresan false

console.log(Boolean(0));

console.log(Boolean(NaN));
console.log(Number(undefined));
