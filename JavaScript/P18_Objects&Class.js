class Animal
{
    constructor(name,color)
    {
        this.name = name
        this.color = color
    }

walk()
{
    console.log("Animals can walk")
}
}
let obj = new Animal('Dog','Black')
obj.walk()
console.log(obj.name+ '' +obj.color)