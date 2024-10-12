//console.log("suma");
//console.log(1 + 1);
//console.log("resta");
//console.log(3 - 1);
//console.log("multiplicacion");
//console.log(3 * 3);
//console.log("division");
//console.log(4 / 2);
//console.log("modulo o resto");
//console.log(44 % 3);
//console.log("exponente");
//console.log(2 ** 3);

//sigue la jerarquia de matematicas:
//multiplicacion, division, suma, resta
//va de izquierda a derecha


//operadores logicos

//and(&&): regresa true solo si los dos lados de la comparacion son true, sino,
//regresa false

//or(||): regresa true si uno de los lados es verdadero,
//si los dos lados son false regresa false

//nullish:

//not(!) niega lo que tengamos
//not true = false
//not false = true

// falsy values: Al ser considerados en una condicion booleana son considerados false
// 0
// undefines
// null
// **

//truthy values: Al ser considerados en una condicion booleana son considerados true
//strings que no sean una cadena vacia
//numeros que no sean 0
//[] inclusive vacios
//{} inclusive vacios

console.log("Pruebas and");
console.log(false && true);
console.log(true && true);
console.log(false && false);
console.log(true && false);

console.log(0 && 1);
console.log(true && 1);
console.log(undefined && "Neri");

console.log("Pruebas or");
console.log(false || true);
console.log(true || false);
console.log(false || false);

console.log(0 || 2);
console.log(2 || 4);
console.log(4 || 2);
console.log("" || "Jorge");
console.log("Marthan" || "Carlos");
console.log(null || "Muriel");
console.log(undefined || "Brandon");
console.log("Flor" || undefined);
console.log("Jose Manuel Lara" || null);
console.log(null || undefined);

console.log("Pruebas not");
console.log("!Teresa");
console.log(!false);
console.log(!true);
console.log(!!true);

console.log("nullish");
console.log(0 ?? 42);
