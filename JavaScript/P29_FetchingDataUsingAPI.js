fetch("https://jsonplaceholder.typicode.com/posts/1")
.then(response=>response.json())
.then(data=>console.log(data))  //Fetching API using Fetch Method

async function fetchData()
{
let response1= await fetch("https://jsonplaceholder.typicode.com/posts/1")
let data2= await response1.json();
console.log(data2);
}
fetchData()  //Async&Await Method

import axios from 'axios'
axios.get("https://jsonplaceholder.typicode.com/posts/1")
.then(response2=>console.log(response2.data))  //Axios Method