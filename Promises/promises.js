const waitSeconds = (miliseconds) => {
  console.log("Esperando " + miliseconds + " milisegundos");
  return new Promise((resolve, reject) => {
    //Inicializamos el timeout
    setTimeout(() => {
      const success = false;
      if (success) {
        resolve("La peticion fue exitosa");
      } else {
        reject("La peticion fallo");
      }
    }, miliseconds);
  });
};

waitSeconds(6000)
  .then(function (res) {
    console.log(res);
  })
  .catch((error) => {
    console.log(error);
  });

console.log("Voy despues de la funcion wait");
console.log("Voy despues de la funcion wait 2");
console.log("Voy despues de la funcion wait 3");
console.log("Voy despues de la funcion wait 4");
