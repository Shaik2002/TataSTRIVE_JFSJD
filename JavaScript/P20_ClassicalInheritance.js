class Animal
{
    constructor(name)
    {
      this.name=name;
    }
    walk()
    {
        console.log('Parent Class')
    }
}
class dog extends Animal
{
    constructor(name,breed)
    {
        super(name);
        this.breed=breed
    }
    walk()
    {
        super.walk()
        console.log('Child Class')
    }
}
let obj = new dog('Shinzu','Husky')
console.log(obj.name+' '+obj.breed)
obj.walk()