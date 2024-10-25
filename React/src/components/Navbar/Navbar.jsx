import "./Navbar.css";
import Button from "../Button/Button";
import logoNasa from "../../assets/nasa.png";
import AccountCircleIcon from "@mui/icons-material/AccountCircle";
import { Link } from "react-router-dom";

const Navbar = () => {
  return (
    <>
      <nav className="navbar-container">
        {/*Logo*/}
        <div className="navbar-logo">
          <Link to="/">
            <img src={logoNasa} alt="nasa logo" />
          </Link>
        </div>
        {/*Menu*/}
        <div className="navbar-menu">
          <div className="menu-links">
            <u>
              <li>
                <Link to="/astros-api" className="link">
                  Astros
                </Link>
              </li>
              <li>
                <Link className="link">NASA</Link>
              </li>
              <li>
                <Link className="link">ISS</Link>
              </li>
            </u>
          </div>
          {/*Button*/}
          <div>
            <Button text="Buscar" />
          </div>
          <Link to="/login">
            <AccountCircleIcon style={{ fontSize: "xx-large" }} />
          </Link>
        </div>
      </nav>
    </>
  );
};

export default Navbar;
