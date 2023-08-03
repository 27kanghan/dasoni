import React from 'react';
import { createRoot } from 'react-dom/client';
import { Provider } from 'react-redux';
import { store } from './app/store';
import App from './App';
import reportWebVitals from './reportWebVitals';
import './index.css';
import setAuthorizationToken from './utils/setAuthorizationToken';
const container = document.getElementById('root')!;
const root = createRoot(container);

import axios from 'axios';
axios.defaults.baseURL =
  process.env.REACT_APP_ENV === 'development' ? 'http://i9a307.p.ssafy.io/' : '/';

console.log(`axios.defaults.baseURL ${axios.defaults.baseURL}`);
console.log(`process.env.REACT_APP_ENV ${process.env.REACT_APP_ENV}`);

setAuthorizationToken(localStorage.getItem('jwtToken'));

root.render(
  // <React.StrictMode>
  <Provider store={store}>
    <App />
  </Provider>,
  // </React.StrictMode>,
);

// If you want to start measuring performance in your app, pass a function
// to log results (for example: reportWebVitals(console.log))
// or send to an analytics endpoint. Learn more: https://bit.ly/CRA-vitals
reportWebVitals();
