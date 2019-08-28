import React, {Component} from "react";
import ProductList from "../components/products/ProductsList.js/index.js"



class ProductAPI extends Component{
    constructor(props){
        super();
        this.state={
            products: [],
            food: null
        }
    }

    componentDidMount(query, offset, limit){
        const request = new Request();
        request.get("https://dev.tescolabs.com/grocery/products/?query=pizza&offset=0&limit=20", {
            method: 'POST',
            headers: {  
              'Ocp-Apim-Subscription-Key:': '2dce742e5c0f455496353c3887116137',
              'Accept': 'application/json'
            }}).then((data)=> {
                this.setState({products: data.uk.ghs.products.results})
            })
    }


    // SetSearchCriteria(){

    // }

    render(){
        return(
            <ProductList products = {this.state.products} />
        )
    }

}

export default ProductAPI;
