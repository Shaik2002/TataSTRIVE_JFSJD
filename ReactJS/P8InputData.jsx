import {useState} from 'react';
const P8InputData = () => {
    const [data,setData] = useState("")
    const [newData,setNewData] = useState()

    const userdata = (Data) => {
        setData(Data.target.value)
    }

    const submitdata = () => {
        setNewData(data)
    }
return(
    <section>
    <h2>{newData}</h2>
    <input type="text" placeholder="Enter Data" onChange={userdata} /><br></br>
    <button onClick={submitdata}>Submit</button>
    </section>
    )
    }
export default P8InputData;