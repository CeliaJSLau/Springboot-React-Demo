import React, { Component } from 'react';
import {
    Collapse,
    Nav,
    Navbar,
    NavbarBrand,
    NavbarToggler,
    NavItem,
    NavLink
} from 'reactstrap';
import {
    BrowserRouter,
    Route,
    Switch,
    Link
} from 'react-router-dom';
import logo from './logo.svg';

class MyNavbar extends Component {
    constructor(props) {
        super(props);
        this.state = {
            collapse: true
        };
        this.toogleNavbar = this.toogleNavbar.bind(this);
    }

    toogleNavbar() {
        this.setState({
            collapse: !this.state.collapse
        });
    }

    render() {
        return (
            <Navbar color="dark" dark>
                <NavbarBrand href="/" className="mr-auto">
                    <img
                        alt=""
                        src={logo}
                        width="30"
                        height="30"
                        className="d-inline-block align-top"
                    />
                    {' Aiden'}
                </NavbarBrand>
                <NavbarToggler onClick={this.toogleNavbar} className="mr-2"/>
                <Collapse isOpen={!this.state.collapse} navbar>
                    <Nav className="ml-auto" navbar>
                        <BrowserRouter>
                            <NavItem>
                                <NavLink href="/">首頁</NavLink>
                            </NavItem>
                            <NavItem>
                                <NavLink href="/members">會員中心</NavLink>
                            </NavItem>
                            <NavItem>
                                <NavLink href="/skills">技能樹</NavLink>
                            </NavItem>
                            <NavItem>
                                <NavLink href="/certificates">證照資訊</NavLink>
                            </NavItem>
                            <NavItem>
                                <NavLink href="/vendors">協辦單位</NavLink>
                            </NavItem>
                            <NavItem>
                                <NavLink href="https://ithelp.ithome.com.tw/users/20119510/articles">關於我</NavLink>
                            </NavItem>
                            <NavItem>
                                <NavLink href="https://github.com/AidenYang12345">GitHub</NavLink>
                            </NavItem>
                           
                        </BrowserRouter>
                    </Nav>
                </Collapse>
            </Navbar >
        )
    }
}

export default MyNavbar;