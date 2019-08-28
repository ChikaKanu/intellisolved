import React, {Component} from "react";
import NavBar from "./NavBar";

class Header extends Component {
    render(){
        return(
            <React.Fragment>
                <header>
                    <h1>Welcome to I-Saver</h1>
                    <h2>We Strive to Satisfy You!</h2>
                    <NavBar/>
                </header>
            </React.Fragment>

        )
    }


}

export default Header;