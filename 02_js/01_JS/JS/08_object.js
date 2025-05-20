//object.js 객체
//TODO: 그룹핑(객체): 변수들은 목적에 맞게 묶어서 사용하자
//TODO: 예) 사람변수 (주민번호변수,핸드폰번호변수,)
//TODO: 변수단점: 너무 많이 사용하면 혼란
//TODO: 그룹핑(객체) 사용법) 
// let dog={name:"해피",age:7}

// console.log(dog.name);


// let hdog=[ 
//     {name:"해피",age:7},
//     {name:"유키",age:9},
//     {name:"아메",age:8}
// ]

// alert(hdog[1].name);


let dog={name:"해피",age:2};
console.log(dog.name)

let dog2= new Object();
dog2.name = "삼순이";
dog2.age= 2;
console.log(dog2.name)


let cat={name:"야옹",age:5};
console.log(cat.age)

//TODO:(참고) 그룹핑 변수 만들기2
let dog3= new Object();  //let dog3{} 같음
dog3.name= "삼식이";
dog3.age=2;
console.log(dog3.name);