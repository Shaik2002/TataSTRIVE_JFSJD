let data = new Map()
data.set('Shaik','Ibrahim')
data.set('Suresh','Kumar')
data.set('John','Dsouza')
console.log(data.keys())
console.log(data.values())
console.log(data.get('Suresh'))
console.log(data.has('Ravi'))
for(let [k,v] of data)
{
console.log(k,':',v)
}