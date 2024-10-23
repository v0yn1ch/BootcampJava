import "./App.css";
//import Button from "./assets/components/Button/Button";
import Navbar from "./assets/components/Navbar/Navbar";
import Products from "./assets/components/Products/Products";
import RecipeReviewCard from "./assets/components/Card/Card";

function App() {
  const tenisMorados =
    "https://ng.jumia.is/unsafe/fit-in/300x300/filters:fill(white)/product/82/6142201/1.jpg?2933";
  const tenisNegros =
    "https://ng.jumia.is/unsafe/fit-in/300x300/filters:fill(white)/product/01/241417/1.jpg?6747";
  const tenisCamel =
    "https://ng.jumia.is/unsafe/fit-in/300x300/filters:fill(white)/product/06/4410121/1.jpg?4437";

  const stylesCard = {
    display: "flex",
    justifyContent: "center",
    marginTop: "50px",
    marginBottom: "50px",
  };

  return (
    <>
      <Navbar />
      <h1>Hola React</h1>
      <Products
        image={tenisMorados}
        title="Tenis Morados"
        description="Tenis aerodinamicos para correr"
        price="$2599.99"
      />
      <Products
        image={tenisNegros}
        title="Tenis Negros"
        description="Tenis elegantes y sofisticadods"
        price="$1855"
      />
      <Products
        image={tenisCamel}
        title="Tenis Camel"
        description="Tenis para el viernes de oficina"
        price="$2000"
      />

      <h2 style={{ color: "#CD5C5C", fontSize: 28 }}>
        Material UI - Components
      </h2>

      <div style={stylesCard}>
        <RecipeReviewCard />
      </div>
      {/*
      <h1>Hola React</h1>
      <Button text="Registrarse" />
      <br />
      <Button text="Iniciar Sesion" />
      <br />
      <Button text="Olvide mis contraseña" /> 
      */}
    </>
  );
}

export default App;
