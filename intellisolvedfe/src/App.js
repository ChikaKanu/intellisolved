import React, {Component} from 'react';
import {BrowserRouter as Router, Route, Switch} from 'react-router-dom';
import './App.css';
import Header from  "../src/components/Header.js"
import MainContainer from  "../src/components/MainContainer.js"
import ProductsList from "../src/components/products/ProductsList"

class App extends Component {
  render() {
    return(
      <Router>
        <React.Fragment>
          <Header/>
          <Switch>
            <Route exact path='/' component = {MainContainer} />
            <Route excat path='/offers' component={ProductsList} />
          </Switch>

        </React.Fragment>

      </Router>
    )
  }

}

export default App;
