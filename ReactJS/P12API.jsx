import {useState} from 'react';
let data = "https://jsonplaceholder.typicode.com/users"

const P12API = () => {
    const [user,setUser] = useState([])

    const userDetails = async() => {
        const response = await fetch(data);
        const response1 = await response.json();
        setUser(response1)
        }
    userDetails()

    return(
    <div>
    {user.map((item) => {
    return(
    <div>
    <h1>ID : {item.id}</h1>
    <h1>Name : {item.name}</h1>
    <h1>Username : {item.username}</h1>
    <h1>Email : {item.email}</h1>
    </div>
    )
    }
    )}
    </div>
    )
    }

export default P12API;