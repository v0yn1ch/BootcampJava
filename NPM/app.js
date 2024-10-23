const axios = require("axios").default;

axios
  .get("https://fakestoreapi.com/products")
  .then(function (response) {
    // manejar respuesta exitosa
    console.log(response);
  })
  .catch(function (error) {
    // manejar error
    console.log(error);
  })
  .finally(function () {
    // siempre sera executado
  });

async function getAllProducts() {
  try {
    //axios automaticamente transforma la respuesta de texto plano a
    const response = await axios("https://fakestoreapi.com/products");
    if (!response) throw new Error("Error al obtener los productos");
    console.log(response);
  } catch (error) {
    console.log(error);
  }
}

getAllProducts();
