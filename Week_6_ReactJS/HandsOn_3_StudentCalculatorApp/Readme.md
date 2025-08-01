# Score Calculator App

In this hands-on I have created the component ```CalculateScore.js``` to calculate the student's score and the stylesheet ```Mystyle.css``` to style the web page.

---

## Set up React environment

Created the React app using the following commands:

```bash
npm install -g create-react-app

npx create-react-app scorecalculator
```

---

## CalculateScore Component

This component is used to calculate the score and return the Name, School, Total, and Score to the ```App.js``` file.

### `CalculateScore.js`

```js
import '../StyleSheets/Mystyle.css';

const percentToDecimal = (decimal) => {
    return (decimal.toFixed(2) + '%');
}

const calcScore = (total, goal) => {
    return percentToDecimal(total / goal);
}

export const CalculateScore = ({ Name, School, total, goal }) => (
    <div className='formatstyle'>
        <h1><font color='Brown'>Student Details</font></h1>
        <div className='name'>
            <b><span> Name: </span></b>
            <span>{Name}</span>
        </div>
        <div className='school'>
            <b><span> School: </span></b>
            <span>{School}</span>
        </div>
        <div className='total'>
            <b><span> Total: </span></b>
            <span>{total}</span>
        </div>
        <div className='score'>
            <b>Score:</b>
            <span>
                {calcScore(total, goal)}
            </span>
        </div>
    </div>
);
```

---

## StyleSheet

I have created the stylesheet ```Mystyle.css``` to apply custom styles to the React page.

### `Mystyle.css`

```css
.name {
    font-weight: 300;
    color: blue;
}

.school {
    color: crimson;
}

.total {
    color: darkmagenta;
}

.formatstyle {
    text-align: center;
    font-size: large;
}

.score {
    color: forestgreen;
}
```

---

## Main Component

`App.js` is the main component where it renders the `CalculateScore` component and displays it on the user screen.

### `App.js`

```js
import logo from './logo.svg';
import './App.css';
import { CalculateScore } from './Components/CalculateScore';

function App() {
  return (
    <div>
      <CalculateScore
        Name={"Pranesh"}
        School={"Akshaya Academy Matric Higher Secondary School"}
        total={284}
        goal={3}
      />
    </div>
  );
}

export default App;
```

---

## Starting the React App

I started the React application using the following command:

```bash
npm start
```
## 🧑‍💻 Author

**Pranesh M**  
🚀 B.Tech - AI & DS, Batch 2026  
📫 [Email Me](mailto:m.pranesh15112004@gmail.com)

---