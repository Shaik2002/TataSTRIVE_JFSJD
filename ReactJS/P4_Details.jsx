import { useState, useEffect } from 'react';

const Details = (props) => {

    const [name, setName] = useState("Ibrahim");
    const [friend, setFriend] = useState("Saqlain");
    const [age, setAge] = useState(23);
    const [friendage, setFriendage] = useState(22);


    useEffect(() => {
        if (name == "Shaik Ibrahim" && age == "23")
        {
            setName("Ibrahim");
            setAge(22);
        }
        else
        {
            setName("Mohammed Ibrahim");
            setAge(23);
        }
    }, []);

    useEffect(() => {
        if (name == "Saqlain" && age == "23")
        {
            setFriend("Mohammed");
            setFriendage(22);
        }
        else
        {
            setFriend("Saqlain PJ");
            setFriendage(23);
        }
    }, []);


    return (
        <div>
            <h1>My Name: {name}</h1>
            <h1>My Age: {age}</h1>
            <h1>My Friend's Name: {friend}</h1>
            <h1>My Friend's Age: {friendage}</h1>
        </div>
    );
};

export default Details;