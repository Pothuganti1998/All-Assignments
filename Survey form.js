let btn1=document.getElementById("btn1");
console.log(btn1);

btn1.addEventListener("click",(e)=>{
    e.preventDefault()
    let lname=document.getElementById("lname").value
    console.log(lname);
    let phone=document.getElementById("phone").value
    console.log(phone);
    if(phone===""){
        span[0].style.visibility="visible"
    }

    if(phone===""){
        span[1].style.visibility="visible"
    }
    let fname=document.getElementById("fname").value
    console.log(fname);
    if(lname===""){
        span[0].style.visibility="visible";
    }
    if(lname===""){
        span[1].style.visibility="visible";
    }
    if(lname===""){
        span[2].style.visibility="visible";
    }
    if(fname===""){
        span[3].style.visibility="visible";
    }
    if(fname===""){
        span[4].style.visibility="visible";
    }
    let reg=/^\w+([\.-]?\w+)*@\w+([\.-]?\w+)*(\.\w{2,3})+$/
    console.log(reg);
    console.log(reg.test(email));
})

let btn2=document.getElementById("btn2");
 console.log(btn2);
//   btn2.document.getElementById(btn2)
