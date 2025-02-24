async function fetchData()
{
return new Promise((resolve)=>{
setTimeout(()=>{
resolve("Data is fetched successfully")
},3000)
})
}
async function displayData()
{
console.log("Data is fetching.......");
let data =await fetchData()
console.log(data);
}
displayData()