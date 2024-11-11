// // Escribe tu código aquí.
//
// // funcion que va a comparar las palabras con su tamaño
// function palabrasGrandes(palabra, palabrasArray) {
//   return palabrasArray.filter((element) => element.lenght > palabra.length);
// }
//
// // funcion para imprimir el nuevo array con las palabras mas grandes
// function imprimir(palabrasArray) {
//   const ulElement = document.getElementById(wordList);
//   // ulElement.innerHTML = ""; //Limpia las palabras anteriores
//
//   // Aqui se creara las etiquetas li dentro de la etiqueta ul proporcionada en el html
//   palabrasArray.forEach((palabra) => {
//     const li = document.createElement("li");
//     // Poner la palabra en la etiqueta li
//     li.textContent = palabra;
//     ul.appendChild(li);
//   });
// }
//
// // Definir el arreglo
// const myArray = [
//   "insecto",
//   "bootcamp",
//   "mangos",
//   "reptil",
//   "mosca",
//   "escritorio",
// ];
//
// // Aqui estamos definiendo la funcionalidad del boton opcional del HTML
// document.getElementById("filterButton").addEventListener("click", () => {
//   const input = document.getElementById("inputWord").value;
//   const resultado = palabrasGrandes(input, myArray);
//   console.log(resultado);
//   imprimir(resultado);
// });

document.addEventListener("DOMContentLoaded", () => {
  function bigWords(word, wordArray) {
    const filteredArray = wordArray.filter(
      (element) => element.length > word.length,
    );
    return filteredArray;
  }

  function printArray(wordArray) {
    const ulElement = document.getElementById("wordList");
    ulElement.innerHTML = ""; // Limpiamos el contenido previo

    wordArray.forEach((word) => {
      const li = document.createElement("li");
      li.textContent = word;
      ulElement.appendChild(li);
    });
  }

  const myArray = [
    "insecto",
    "bootcamp",
    "mangos",
    "reptil",
    "mosca",
    "escritorio",
    "piedra",
    "cascada",
    "montaña",
    "orquídea",
  ];

  document.getElementById("filterButton").addEventListener("click", () => {
    const inputWord = document.getElementById("inputWord").value;
    if (!inputWord) {
      alert("Por favor, ingresa una palabra.");
      return;
    }

    const resultArray = bigWords(inputWord, myArray);
    printArray(resultArray);
  });
});
