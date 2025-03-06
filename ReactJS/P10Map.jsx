let data = ["Shaik",23,{name:"Prajna",age:22},{name1:"Poojari",age1:20}]
const P10Map = () => {
    return(
        <div>
        <h2>{data[0]}</h2>
        <h2>{data[1]}</h2>
        <h2>{data[2].name}</h2>

        {data.map((item) => {
        return(
        <div>
        <h2>{item.name}</h2>
        <h2>{item.age}</h2>
        <h2>{item.name1}</h2>
        <h2>{item.age1}</h2>
        </div>
        )
        })

        }
        </div>
        )
    }
export default P10Map;