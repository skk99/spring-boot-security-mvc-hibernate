function validateForm() {
    let sid = documents.forms["regForm"]["sid"].value
    let sname = document.forms["regForm"]["sname"].value;
    let semail = document.forms["regForm"]["semail"].value;
    let smobile = document.forms["regForm"]["smobile"].value;
    let saddr = document.forms["regForm"]["saddr"].value;

    if(sid == ""){
        alert("Student Id is required.");
        return false;
    }
    if(sname == ""){
        alert("Student Name is required.");
        return false;
    }
    if(semail == ""){
        alert("Student Email Id is required.");
        return false;
    }
    if (smobile == ""){
        alert("Student Mobile Number is required.");
        return false;
    }
    if(saddr == ""){
        alert("Student Address is required.");
        return false;
    }

}