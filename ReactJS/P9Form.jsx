import {useState} from 'react';
import { ToastContainer, toast } from 'react-toastify';

const P9Form = () => {
    const [data,setData] = useState("")
    const [newData,setNewData] = useState()
    const notify = () => toast("Data Submitted Successfully!");

    const userdata = (Data) => {
        setData(Data.target.value)
    }

    const submitdata = (a) => {
        a.preventDefault()
        setNewData(data)
        notify()
    }
return(
    <section>
        <form onSubmit={submitdata}>
    <h2>{newData}</h2>
    <ToastContainer />
    <div>
    <input type="text" placeholder="Enter Data" onChange={userdata} /><br></br>
    <button type="Submit">Submit</button>
    </div>
        </form>
    </section>
    )
    }
export default P9Form;