const secretN = [];
let num;

function secretName(secretN) {
  let letter = "";
  for (let i = 0; i < secretN.length; i++) {
    letter += secretN[i].charAt(0);
  }
  return letter.toUpperCase();
}

while (num != "0") {
  num = prompt(
    "Ingrese los nombres para la sociedad secreta (Ingrese 0 para finalizar)",
  );
  if (num != "0") {
    secretN.push(num);
  } else {
    break;
  }
}

console.log("Su sociedad secreta es: " + secretName(secretN));
