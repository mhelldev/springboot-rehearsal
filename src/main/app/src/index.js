import React from 'react';
import ReactDOM from 'react-dom';
import './index.css';
import SongController from './SongController';
import * as serviceWorker from './serviceWorker';

//ReactDOM.render(<Song name="Black Swan" description="A song about a black swan" />, document.getElementById('root'));


ReactDOM.render(<SongController/>, document.getElementById('root'));

// If you want your app to work offline and load faster, you can change
// unregister() to register() below. Note this comes with some pitfalls.
// Learn more about service workers: https://bit.ly/CRA-PWA
serviceWorker.unregister();
