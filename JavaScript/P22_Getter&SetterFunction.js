function Person()
{
    let _name = 'Ravi';
    let _age = 20;
this.setName = function(newName)
{
    _name = newName
}
this.setAge = function(newAge)
{
    _age = newAge
}
this.getName = function()
{
    return _name;
}
this.getAge = function()
{
    return _age;
}
}
let obj = new Person()
obj.setName('Ajay')
obj.setAge(22)
console.log(obj.getName()+' '+obj.getAge())