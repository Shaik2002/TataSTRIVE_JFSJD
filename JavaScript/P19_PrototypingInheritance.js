//const Animal =
//{
//    name:'Cat',
//    color:'White',
//        walk()
//        {
//            console.log('Walking')
//        }
//}
//let dog = Object.create(Animal)
//console.log(dog.name+ ' ' +dog.color)
//dog.walk()

let College =
{
    name:'Engineering College',
    address:'Bangalore',
    type:'University',
    University()
    {
        console.log('Presidency University')
    }
}
let Student = Object.create(College)
console.log('It is an '+Student.name+' located in '+Student.address+' and it is an '+Student.type)
Student.University()