import { useEffect, useState } from "react";

const useAstros = () => {
  //Utilizamos el componente Astros para modificar el estaod del mismo utilizando useState. Para ello, usamos Astro como tarjeta base (card) y llenamos la informacion consumiendo una API con useEffect.

  //1. Guardar en una constante la ruta de la API
  const URL_ASTROS = "/data/astros.json";

  //2. Definir useState (hook)
  const [astros, setAstros] = useState([]);

  //3. Consumir la API utilizandod useEffect(hook)
  useEffect(() => {
    fetch(URL_ASTROS)
      .then((response) => response.json())
      .then((data) => setAstros(data.people));
  }, []);

  return astros;
};

export default useAstros;
