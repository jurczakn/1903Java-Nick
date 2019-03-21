var title;
var form;
window.onload = function(){
    form = document.getElementById("authorForm");
    title = document.getElementById("title").value;
    
    var year = document.createElement("input");
    year.setAttribute("type", "number");
    year.setAttribute("id", "year");
    year.setAttribute("name", "year");
    
    var yearLabel = document.createElement("label");
    yearLabel.setAttribute("for", "year");
    yearLabel.innerHTML = "Year: ";
    
    /* form.appendChild(year);
    form.appendChild(yearLabel); */
    form.insertBefore(yearLabel, form.lastElementChild);
    form.insertBefore(year, form.lastElementChild);
    form.insertBefore(document.createElement("br"), form.lastElementChild);
    //form.innerText="this is new text";
    //                                                                v----callback
    document.getElementById("submitButton").addEventListener("click", grabBook);
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

function grabBook(event){
    event.preventDefault();
    var title = document.getElementById("title").value || 'default title';
    var year = document.getElementById("year").value || 'default title';

    var form = document.getElementById("authorForm").elements;
    var author = form['author'].value || 'default author';

    var book = new Book(author, title, year);
    console.log(book);
    return book;

}

function Book(author, title, year){
    this.author = author;
    this.title = title;
    this.year = year;
}