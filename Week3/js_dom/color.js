var title;
var form;
window.onload = function(){
    form = document.getElementById("authorForm");
    title = document.getElementById("title").value;
    var year = document.createElement("input");
    year.setAttribute("type", "number");
    year.setAttribute("id", "year");
    year.setAttribute("name", "year");
    year.innerHTML = "Year: ";
    form.appendChild(year);
}

function getTitle(){
    var title = document.getElementById("title").value;
    if (title === `Harry Potter`){
        var authors = document.getElementsByName("author");
        for(i of authors){
            if (i.value===`J.K. Rowlings`){
                i.checked = true;
            }
        }
    }

}