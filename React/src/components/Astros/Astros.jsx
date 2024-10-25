import Navbar from "../Navbar/Navbar";
import Astro from "./AstroCard/Astro";
import useAstros from "./hooks/useAstros";

export default function Astros() {
  const astros = useAstros();
  return (
    <>
      <Navbar />

      {astros.map((astro, index) => (
        //<Astro name={astro.name} craft={astro.craft} />
        <Astro key={index} {...astro} />
      ))}
    </>
  );
}
