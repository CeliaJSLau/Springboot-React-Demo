import React, { Component } from 'react';
import './App.css';
import {
  BrowserRouter,
  Route,
  Switch
} from 'react-router-dom';
import Home from './Home';
import Member from './Member';
import Vendor from './Vendor';
import SkillTree from './SkillTree';
import Certificate from './Certificate';
import AddMember from './AddMember';
class App extends Component {
  render() {
    return (
      <BrowserRouter>
        <Switch>
          <Route path="/" component={Home} exact={true}></Route>
          <Route path="/members" component={Member} exact={true}></Route>
          <Route path="/member/new" component={AddMember} exact={true}></Route>
          <Route path="/certificates" component={Certificate} exact={true}></Route>
          <Route path="/vendors" component={Vendor} exact={true}></Route>
          <Route path="/skills" component={SkillTree} exact={true}></Route>
        </Switch>
      </BrowserRouter>
    );
  }

}

export default App;