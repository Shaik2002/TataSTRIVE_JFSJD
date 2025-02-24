import {useState} from 'react';
import {useEffect} from 'react';
const A = (props) => {

    const {name,age,branch} = props.name
    const [city,setCity] = useState("Chennai")
    useEffect (() => {
            if(city == "Bangalore")
            {
                setCity("Delhi")
            }
            else
            {
                setCity("Mumbai")
            }
        },[])

    return (
        <div>
        <div><h1>{name}</h1></div>
        <div><h1>{age}</h1></div>
        <div><h1>{branch}</h1></div>
        <div><h1>{city}</h1></div>
        </div>
        )
    }

export default A;