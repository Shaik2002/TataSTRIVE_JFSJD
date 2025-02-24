function fact(n)
{
    if(n==0)
    return 1
    else
    return n*fact(n-1);
}
let n=10
let r=fact(n)
console.log(r);