let accessAllowed;
let age = prompt('나이를 입력해주세요.', '');

if(age>18){
    accessAllowed = true;
}else{
    accessAllowed = false;
}

alert(accessAllowed);