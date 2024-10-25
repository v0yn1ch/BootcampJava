import "./Astro.css";

export default function Astro({ name, craft }) {
  return (
    <>
      <div className="astro-container">
        <h3>{name}</h3>
        <p>{craft}</p>
      </div>
    </>
  );
}
