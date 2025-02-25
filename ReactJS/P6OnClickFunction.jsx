import { useState } from 'react';

const P6OnClickFunction = () => {
    const [digit, setDigit] = useState(0)

    const increment = () => {
        setDigit(digit + 1)
    }
    const decrement = () => {
        setDigit(digit - 1)
    }
    const reset = () => {
        setDigit(0)
    }

    return (
        <div>
            <h1>{digit}</h1>
            <button onClick={increment}>Increment</button>
            <button onClick={decrement}>Decrement</button>
            <button onClick={reset}>Reset</button>
        </div>
        )
    }
export default P6OnClickFunction;