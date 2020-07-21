<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>  
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01
    Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Book Manager</title>
<style>.header {

height:70px;
 padding: 25px 50px 75px 100px;
   margin-top: 0px;
  margin-bottom: 50px;
  margin-right: 0px;
  margin-left: 0px;
  text-align: center;
  background: black;
  color: white;
  font-size: 30px;
}

</style>

<script>
function redirectOnClick(){
    document.location ='BookController/getSortedBooks';
}
</script>
</head>
<body bgcolor="#E6E6FA">
<div class="header">
  <h1>Book Manager</h1>
</div>






<div align="center">
    
    <table border="1" cellpadding="5">
        <tr>
        
            <th>Name
            <input type='button' value='Sort' id='myButton' onClick='redirectOnClick()' />
              </th>
            <th>Author</th>
            <th>Publisher</th>
            <th>Price</th>
            <th>Action</th>
        </tr>
        <c:forEach items="${bookList}" var="book">
        <tr>
      
            <td>${book.name}</td>
            <td>${book.author}</td>
            <td>${book.publisher}</td>
             <td>${book.price}</td>
           <td>
                <a href="editBook?Book_id=${book.book_id}">Edit</a>
                &nbsp;&nbsp;&nbsp;
                <a href="deleteBook?Book_id=${book.book_id}">Delete</a> 
            </td> 
        </tr>
        </c:forEach>
    </table>
</div> <div align="right">
 <h5 ><a href="home">Home</a></h5>  </div>
</body>
</html>