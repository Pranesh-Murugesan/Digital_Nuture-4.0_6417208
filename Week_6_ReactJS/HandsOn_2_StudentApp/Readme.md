# StudentReact App

In this hands-on, I have created multiple components such as `Home.js`, `About.js`, and `Contact.js`, and then rendered them in the `App.js`.

---

## ✅ Set up React Environment

Created the React app using the following commands:

```bash
npm install -g create-react-app

npx create-react-app studentapp
```

> ⚠️ Note: `create-react-app` must be all lowercase — project names cannot contain capital letters.

---

## 🧩 Creating Multiple Components

### `Home.js`

```js
import React, { Component } from "react";

class Home extends Component {
    render() {
        return (
            <center>
                <div>
                    <h3>Welcome to the Home page of Student Management Portal</h3>
                </div>
            </center>
        );
    }
}

export default Home;
```

---

### `About.js`

```js
import React, { Component } from "react";

class About extends Component {
    render() {
        return (
            <center>
                <div>
                    <h3>Welcome to the About page of Student Management Portal</h3>
                </div>
            </center>
        );
    }
}

export default About;
```

---

### `Contact.js`

```js
import React, { Component } from "react";

class Contact extends Component {
    render() {
        return (
            <center>
                <div>
                    <h3>Welcome to the Contact page of Student Management Portal</h3>
                </div>
            </center>
        );
    }
}

export default Contact;
```

---

## 🧩 Rendering the Components

I have rendered all the created components inside `App.js`.

### `App.js`

```js
import './App.css';
import Home from './Components/Home';
import Contact from './Components/Contact';
import About from './Components/About';

function App() {
  return (
    <div className="container">
      <Home />
      <About />
      <Contact />
    </div>
  );
}

export default App;
```

---

## ▶️ Starting the React App

I have started the React application using the following command:

```bash
npm start
```

This opens the app in your default browser at:

```
http://localhost:3000
```

You will see the following messages rendered one below the other:

```
Welcome to the Home page of Student Management Portal
Welcome to the About page of Student Management Portal
Welcome to the Contact page of Student Management Portal
```

---

✅ **Successfully built a simple multi-component React app!**
## 🧑‍💻 Author

**Pranesh M**  
🚀 B.Tech - AI & DS, Batch 2026  
📫 [Email Me](mailto:m.pranesh15112004@gmail.com)

---
