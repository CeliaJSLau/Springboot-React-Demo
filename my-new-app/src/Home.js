import React, { Component } from 'react';
import './App.css';
import 'bootstrap/dist/css/bootstrap.min.css';
import MyNavbar from './MyNavbar';
import MyCarousel from './MyCarousel';
import MyCard from './MyCard';

class Home extends Component {

    render() {
        return (
            <div>
                <MyNavbar />
				<MyCarousel />
				<MyCard />
            </div>
        );
    }

}

export default Home;