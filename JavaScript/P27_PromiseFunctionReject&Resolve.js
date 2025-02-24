const fetchData = (Success) =>{
return new Promise((resolve,reject) => {
setTimeout(() => {
if(Success)
{
resolve('Data Fetched')
}
else
{
reject('Unable to Fetch Data')
}
},3000)
});
}
fetchData(false)
.then((data) => console.log(data))
.catch((error) => console.log(error))