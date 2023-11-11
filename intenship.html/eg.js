// let h="cat";
// console.log(h);
// let x=true
// alert(x)

 let g=25;
 let u=15;
 function mul()
 {
     let res=g*u;
    return res;
 console.log(res)
 }
 mul();

let a=15;
let b=13;
function sin()
{
    console.log(a==b)
    console.log(a!=b)
    console.log(a>=b)
    console.log(a<=b)
    console.log(a>b)
    console.log(a<b)

    console.log(true&&true);
    console.log(true&&false);
    console.log(false&&true);
    console.log(false&&false);
    
    console.log(true||true);
      
    console.log(true||false);
    console.log(false||true); 
    console.log(false||false);
     
    console.log(!true);
    console.log(!false);
    
    
    // assignment operator
    console.log(a+=10)
    console.log(a-=10)
    console.log(a/=10)
    console.log(a*=10)    
    console.log(a%=10)    
    console.log(a=10)    



    
}
sin()
// algibal to vote or not
function age(){
    let age=10;
    if(age<18){
        console.log("pass")

    }
    else{console.log("fail")}
}
age()

let p="34";
let j=Number(p);
console.log(j);

let v="94.99";
let x=parseInt(v);
console.log(x);

let r="34.98";
let t=parseFloat(r);
console.log(t);

let f=25;
let c=(p.toString())
console.log(c)
console.log(typeof(c))

let m=65;
let n=m.toExponential(2)
console.log(n)
console.log(typeof(n))

let z=65.888;
let y=(z.toFixed())
console.log(y)
console.log(typeof(y))

let h=6567777;
let k=(Number.isFinite())
console.log(k)
console.log(typeof(k))
// .isInteger

// string and methods
let d="anushree";
let s=d.charAt(5);
console.log(s);


let d1="A";
let s1=d1.charCodeAt(0);
console.log(s1);

let d2="anushree";
let s2=d2.concat('kuppast');
console.log(s2);

let d3="nitin";
let s3=d3.indexOf('i');
console.log(s3);

let d4="nitin";
let s4=d4.lastIndexOf('i');
console.log(s4);

let d5="anushree is haveri";
let s5=d5.match('anushree is');
console.log(s5);


