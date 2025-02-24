class person
{
    #name = 'Shaik';
    #age = 23;
setName(newName)
{
    this.#name = newName
}
setAge(newAge)
{
    this.#age = newAge
}
getName()
{
    return this.#name
}
getAge()
{
    return this.#age
}
}
let obj = new person()
console.log(obj.getName()+' '+obj.getAge())