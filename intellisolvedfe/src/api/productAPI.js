import React, {Component} from "react";
import ProductListContainer from "../components/products/ProductListContainer.js";
import Request from "../helpers/Request";



class ProductAPI extends Component{
    constructor(props){
        super();
        this.state={
            products: [],
            food: null
        }
    }

    async componentDidMount(){
        let params = {
            query: "milk",
            offset: 0,
            limit: 10
        }; 
        const request = new Request();
        request.get({
            url: "https://dev.tescolabs.com/grocery/products/?query={params.query}&offset={params.offset}&limit={params.limit}&" + params,
            beforeSend: function(xhrObj){
                // Request headers
                xhrObj.setRequestHeader("Ocp-Apim-Subscription-Key","{2dce742e5c0f455496353c3887116137}");
            },
            type: "GET",
                    // Request body
            data: "{body}",
        }).then((data) => {
            console.log(data)
            // this.setState({products: data.uk});
        })
        .catch((error) => {
            console.log(error)
        });
    };    

    render(){
        console.log(this.state.products);
        return(
            <ProductListContainer products = {this.state.products} />
        )
    }

}

export default ProductAPI;
