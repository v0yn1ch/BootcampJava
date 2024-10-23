import "./Navbar.css";
import Button from "../Button/Button";
import logoNasa from "./nasa.png";

const Navbar = () => {
  return (
    <>
      <nav className="navbar-container">
        {/*Logo*/}
        <div className="navbar-logo">
          <img src={logoNasa} alt="nasa logo" />
        </div>
        {/*Menu*/}
        <div className="navbar-menu">
          <div className="menu-links">
            <a href="">Astros</a>
            <a href="">NASA</a>
            <a href="">ISS</a>
          </div>
          {/*Button*/}
          <div>
            <Button text="Buscar" />
          </div>
        </div>
      </nav>
    </>
  );
};

export default Navbar;
