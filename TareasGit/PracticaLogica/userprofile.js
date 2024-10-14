let username;
let age;
let movie;
let favMovies = [];
let n;

function userProfile() {
  username = prompt("Ingresa tu usuario: ");
  age = prompt("Ingresa tu edad: ");
  console.log("Usuario: " + username);
  console.log("Edad: " + age);
  for (let i = 0; i < favMovies.length; i++) {
    console.log(favMovies[i] + " es una de mis peliculas favoritas.");
  }
}

while (movie != "0") {
  movie = prompt(
    "Cuales son tus peliculas favoritas? (Ingresar 0 al terminar)",
  );
  if (movie != 0) {
    favMovies.push(movie);
  } else {
    break;
  }
}

userProfile();
