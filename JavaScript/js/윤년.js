let year = prompt("연도는? ", "2020");
if(year != null){
    year = parseInt(year);
    if(year%4==0 && year%100!=0 ||year%400==0){
        console.log(`${year}는 윤년입니다.`);
    }else{
        console.log(`${year}는 윤년이 아닙니다.`);
    }
}