function Animal(name)
{
    this.name=name;
}
function Dog(name,breed)
{
    Animal.call(this,name)
    this.breed=breed
}
let obj = new Dog('Oreo','GermanShepard')
console.log(obj.name+' '+obj.breed)