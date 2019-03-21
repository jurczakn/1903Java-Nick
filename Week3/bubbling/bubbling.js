function bubble(element, event) {
    event.stopPropagation();
    console.log(element);
    element.style.backgroundColor = "red";
    alert(element.id);
}
/*
*Event Propagation occurs when you have multiple nested elements
*that all register the same event.
*
*Types:
*
*Bubbling-goes from the child element that was clicked on
*up throught the parent elements
*
*Capturing-goes from the parent element down back through the children
*stopping and the element initially clicked on.
*/
window.onload = function() {
    document.getElementById("A").addEventListener("click", 
    function(event){bubble(this, event)}, false);
    document.getElementById("B").addEventListener("click", 
    function(event){bubble(this, event)}, false);
    document.getElementById("C").addEventListener("click", 
    function(event){bubble(this, event)}, false);
    document.getElementById("D").addEventListener("click", 
    function(event){bubble(this, event)}, false);
}