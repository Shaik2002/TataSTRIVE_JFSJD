import { useState } from "react";
import "./Calculator.css";

const Calculator = () => {
  const [input, setInput] = useState("");
  const [result, setResult] = useState("");

  const handleButtonClick = (value) => {
    if (value === "=") {
      try {
        setResult(new Function("return " + input)());
      } catch {
        setResult("Error");
      }
    } else if (value === "C") {
      setInput("");
      setResult("");
    } else {
      setInput(input + value);
    }
  };

  return (
    <div className="calculator">
      <input type="text" className="display" value={input} readOnly />
      <div className="result">{result}</div>
      <div className="buttons">
        {["7", "8", "9", "/", "4", "5", "6", "*", "1", "2", "3", "-", "0", ".", "=", "+"].map(
          (char) => (
            <button key={char} onClick={() => handleButtonClick(char)}>
              {char}
            </button>
          )
        )}
        <button onClick={() => handleButtonClick("C")}>C</button>
      </div>
    </div>
  );
};

export default Calculator;