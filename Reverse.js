
function reverse(){
    let s1="This is a sunny day" , s=" ";
    for(let i=0;i<s1.length;i++){
        if(s1.charAt(i)==' '){
            document.write(s+ ' ');
            s="";

        }
        s=s1.charAt(i)+s;
    }
    document.write(s);
}
reverse()
