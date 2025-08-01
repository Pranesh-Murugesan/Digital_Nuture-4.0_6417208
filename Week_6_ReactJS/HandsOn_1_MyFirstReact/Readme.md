# MyFirstReact App

In this hands-on, I have created a simple React app and modified the `App.js` file to display a heading, demonstrating the concept of a Single Page Application (SPA).

## 🔧 Setup Process

### ✅ Step 1: Set up React Environment

Installed React globally and created a new React application using the following commands:

```bash
npm install -g create-react-app
npx create-react-app myfirstreact
```

### ✅ Step 2: Modify `App.js`

In the `src/App.js` file, I cleared the default content and updated it to show a custom heading.

#### 🔹 Updated `App.js` Code:

```jsx
import logo from './logo.svg';
import './App.css';

function App() {
  return (
    <center>
      <h1>Welcome to my first React app</h1>
    </center>
  );
}

export default App;
```

### ✅ Step 3: Start the React Application

To start the development server and run the app locally:

```bash
npm start
```

Then, open your browser and go to:  
[http://localhost:3000](http://localhost:3000)

## 📷 Output

The application displays the following centered heading on the webpage:

```
Welcome to my first React app
```
## 🧑‍💻 Author

**Pranesh M**  
🚀 B.Tech - AI & DS, Batch 2026  
📫 [Email Me](mailto:m.pranesh15112004@gmail.com)

---