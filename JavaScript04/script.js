const currentDate = document.querySelector(".current-date");
const daysTag = document.querySelector(".days");
const prevNextIcon = document.querySelectorAll(".icons span");


//getting new date and current year and month
let date = new Date();
let currYear = date.getFullYear();
let currMonth = date.getMonth();

const months = ["January" , "February" , "March" , "April" , "May" , "June" , "July" , "August" , "September" , "October" , "November" , "December"];

const renderCaledar = () => {
    let firstDaysOfMonth = new Date(currYear , currMonth, 1).getDay(); //getting first day  of current month
    let lastDateOfMonth = new Date(currYear , currMonth + 1, 0).getDate(); //getting last date of current month
    let lastDateOfLastMonth = new Date(currYear , currMonth, 0).getDate(); //getting last date of previous month
    let lastDayOfMonth = new Date(currYear , currMonth, lastDateOfMonth).getDay(); //getting last day of current month

    let liTag = "";

    //displaying previous dates
    for(let i = firstDaysOfMonth ; i > 0 ; i--){
        liTag += `<li class = "inactive">${lastDateOfLastMonth - i + 1}</li>`
    }
    
    //displaying all the dates in the calendar
    for(let i = 1 ; i <= lastDateOfMonth ; i++){
        //adding active class to current date
        let isToday = i === date.getDate() && currMonth === new Date().getMonth() && currYear === new Date().getFullYear() ? "active" : "";
        liTag += `<li class = "${isToday}">${i}</li>`;
    }
    
    //displaying all the dates from next month
    for(let i = lastDayOfMonth ; i<6 ; i++){
        liTag += `<li class = "inactive">${ i - lastDayOfMonth + 1}</li>`  
    }

    currentDate.innerHTML = `${months[currMonth]} ${currYear}`;
    daysTag.innerHTML = liTag;
}

renderCaledar();

prevNextIcon.forEach(icon => {
    //adding click event on both icons
    icon.addEventListener("click" , () =>{
        currMonth = icon.id === "prev" ? currMonth - 1 : currMonth + 1;

        //if the month is less than 0 or greater than 11
        if(currMonth > 11){
            currMonth = 0;
            currYear += 1;
        }

        if(currMonth < 0){
            currMonth = 11;
            currYear -=1;
        }

        renderCaledar();
    });
});

