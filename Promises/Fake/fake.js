const URL_BASE = "https://fakestoreapi.com/products";
const mainContainer = document.querySelector(".container-j");
const showAllProducts = async function (productsArray) {
  //evento de carga de pagina
  window.addEventListener("load", () => {
    const productsArray = JSON.parse(localStorage.getItem("products"));
    showAllProducts(productsArray);
  });

  // if(productsArray.length > 0) return;
  const products = await productsArray;
  if (!products) return; //guard clause early return su objetivo es evaluar el caso de error donde ya no vamos a hacer nada

  for (let i = 0; i < products.length; i++) {
    const cardProduct = `<div class="card" style="width: 18rem;">
<img src="${products[i].image}" class="card-img-top" alt="...">
  <div class="card-body">
<h5 class="card-title">${products[i].title}</h5>
<p class="card-text">${products[i].description}</p>
  </div>
  <ul class="list-group list-group-flush">
<li class="list-group-item">${products[i].price}</li>
<li class="list-group-item">${products[i].category}</li>
  </ul>
</div>`;
    mainContainer.insertAdjacentHTML("afterbegin", cardProduct);
  }
};

//function declaration async
async function getAllProducts() {
  if (localStorage.getItem("products")) return;
  try {
    const response = await fetch(URL_BASE);
    if (!response) throw new Error("Error al obtener los productos");
    const data = await response.json();
    //Si retornamos algo dentro de una funcion async, siempre regresa una promesa
    localStorage.setItem("products", JSON.stringify(data));
    return data;
  } catch (error) {
    console.log("Error", error);
  }
}

//function expression async
const getSingleProduct = async function (id) {
  try {
    const response = await fetch(`${URL_BASE}/${id}`);
    if (!response) throw new Error("Error al obtener los productos");
    const data = await response.json();
    console.log(data);
  } catch (error) {
    console.log("Error", error);
  }
};

//arrow function
const addProduct = async (productObject) => {
  const response = await fetch(URL_BASE, {
    method: "POST",
    body: JSON.stringify(productObject),
  });
  const data = await response.json();
  console.log(data);
};

const updateProduct = async (productObject, id = "") => {
  try {
    const response = await fetch(`${URL_BASE}/${id}`, {
      method: "PUT",
      body: JSON.stringify(productObject),
    });
    const data = await response.json();
    console.log(data);
  } catch (error) {
    console.log("Error", error);
  }
};

const deleteProduct = async (id) => {
  try {
    const response = await fetch(`${URL_BASE}/${id}`, {
      method: "DELETE",
    });
    const data = await response.json();
    console.log(data);
  } catch (error) {
    console.log("Error", error);
  }
};

getAllProducts();
getSingleProduct(18);
addProduct({
  title: "test product",
  price: 13.5,
  description: "lorem ipsum set",
  image: "https://i.pravatar.cc",
  category: "electronic",
});
showAllProducts(getAllProducts());
deleteProduct(8);
updateProduct(
  {
    title: "test product",
    price: 13.5,
    description: "lorem ipsum set",
    image: "https://i.pravatar.cc",
    category: "electronic",
  },
  6,
);
