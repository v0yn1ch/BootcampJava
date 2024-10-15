const cardElement1 = document.getElementById("card-1");

//querySelector selecciona con base en un selector css
const btnCardElement1 = document.querySelector("#card-btn-1");
console.log(btnCardElement1);

//Agregar Clase
cardElement1.classList.add("bg-primary");
cardElement1.classList.remove("bg-danger");
cardElement1.classList.replace("bg-primary", "bg-secondary");

//classname
cardElement1.className += " bg-danger";

//
btnCardElement1.addEventListener("click", (event) => {
  const h5title = document.querySelector(".card-title");
  h5title.classList.toggle("hidden");
});

//Estilos forma manual
cardElement1.style.backgroundColor = "#fff";
cardElement1.style.border = "solid 2px black";
