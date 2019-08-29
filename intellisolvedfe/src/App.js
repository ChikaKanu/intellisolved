import React, {Component} from 'react';
import {BrowserRouter as Router, Route, Switch} from 'react-router-dom'
import './App.css';
import Header from  "../src/components/Header.js"
import MainContainer from  "../src/components/MainContainer"
import ProductsList from "../src/components/products/ProductsList"
import ProductAPI from "../src/api/ProductAPI"

class App extends Component{
  render(){
    return(
      <Router>
        <React.Fragment>
          <Header/>
          <Switch>
            <Route exact path='/' component = {MainContainer} />
            <Route excat path='/offers' component={ProductAPI} />
          </Switch>
        </React.Fragment>
      </Router>
    )
  }

}

export default App;
