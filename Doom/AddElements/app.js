const mainContainer = document.querySelector("main");
const btnAdd = document.querySelector("button");
console.log(mainContainer);
console.log(btnAdd);

btnAdd.addEventListener("click", () => {
  const cardElement = `<div class="card" style="width: 18rem;">
  <img src="..." class="card-img-top" alt="...">
  <div class="card-body">
    <p class="card-text">Some quick example text to build on the card title and make up the bulk of the card's content.</p>
  </div>
</div>`;
  //agregar elemento con innerHTML
  // mainContainer.innerHTML = cardElement;

  //Puedes pasarle un elemento html escrito o a mano
  mainContainer.insertAdjacentHTML("beforebegin", cardElement);
});
