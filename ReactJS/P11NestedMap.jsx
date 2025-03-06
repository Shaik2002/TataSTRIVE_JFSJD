let data = [{ name:
    {
        fname: "Shaik",
        lname: "Ibrahim"
    }, age: 22 }];

const P11NestedMap = () => {
    return (
        <div>
            {data.map((item, index) => (
                <div>
                    <h2>{item.name.fname}</h2>
                    <h2>{item.name.lname}</h2>
                    <h2>{item.age}</h2>
                </div>
            ))}
        </div>
    )
}
export default P11NestedMap;