import React, {Component} from 'react';
import {Link} from 'react-router-dom';

class NavBar extends Component {
  render() {
    return(
      <React.Fragment>
        <nav>
          <Link className='navButton' to="/">Home</Link>
          <Link className='navButton' to="/offers">Offers</Link>
          <Link className='navButton' to="/offers/new">New Offer</Link>
          <Link className='navButton' to='/Basket'>Basket</Link> 
        </nav>
      </React.Fragment>
    )
  }
}

export default NavBar;
