const baseEndpoint = "https://api.github.com";
const usersEndpoint = `${baseEndpoint}/users`;
const $n = document.querySelector(".name");
const $b = document.querySelector(".blog");
const $l = document.querySelector(".location");

async function displayUser(username) {
  //se agrego try/catch y las condicionales para que funcione adecuadamente

  try {
    const response = await fetch(`${usersEndpoint}/${username}`);
    const data = await response.json();
    console.log(data);

    $n.textContent = `cargando...`;
    $n.textContent = `${data.name}`;
    $b.textContent = `${data.blog}`;
    $l.textContent = `${data.location}`;
  } catch (error) {
    handleError(error);
  }
}

function handleError(err) {
  console.log("OH NO!");
  console.log(err);
  $n.textContent = `Algo salió mal: ${err}`;
}

displayUser("stolinski").catch(handleError);
