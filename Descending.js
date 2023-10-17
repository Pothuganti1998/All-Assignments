function descending(){
    let a=[8,4,5,9,7,2,3,1,0];
    for(let i=0;i<a.length-1;i++){
        for(j=1;j<a.length-i;j++){
            if(a[j-1]<a[j]){
                let temp=a[j-1];
                a[j-1]=a[j];
                a[j]=temp;
            }
        }
    }
    document.write(a);
}
descending()