import { useState, useEffect } from 'react';

const StateEffect = (props) => {
    const { name, age, branch } = props.name;

    const [city, setCity] = useState("Chennai");
    const [fruit, setFruit] = useState("Apple");
    const [vegetable, setVegetable] = useState("Carrot");

    useEffect(() => {
        if (city == "Bangalore")
        {
            setCity("Delhi");
        }
        else
        {
            setCity("Mumbai");
        }
    }, []);

    useEffect(() => {
        if (fruit == "Apple" && vegetable == "Carrot")
        {
            setFruit("Mango");
            setVegetable("Tomato");
        }
        else
        {
            setFruit("Banana");
            setVegetable("Potato");
        }
    }, []);


    return (
        <div>
            <h1>Name: {name}</h1>
            <h1>Age: {age}</h1>
            <h1>Branch: {branch}</h1>
            <h1>City: {city}</h1>
            <h1>Fruit: {fruit}</h1>
            <h1>Vegetable: {vegetable}</h1>
        </div>
    );
};

export default StateEffect;