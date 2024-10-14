function verificarPalabras() {
  let texto = prompt("Ingresar palabra/frase: ");
  let invertido;
  texto = texto.toLowerCase();
  texto = texto.normalize("NFD");
  texto = texto.replace(/[^a-z0-9]/g, "");
  invertido = texto;
  invertido = invertido.split("").reverse().join("");
  if (texto === invertido) {
    alert("Es un palindromo!\n" + texto + " = " + invertido);
  } else {
    alert("No es un palindromo\n" + texto + " = " + invertido);
  }
}

do {
  verificarPalabras();
} while (confirm("Ingresar otra palabra?"));
