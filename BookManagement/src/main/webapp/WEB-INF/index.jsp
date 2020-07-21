<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>   
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%> 
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
}</style>
 
</head>
<body bgcolor="#E6E6FA">

<div class="header">
  <h1>Book Manager</h1>
</div>    
<div align="center">

 
   
      <%--  <form method="get" action="search">
        <input type="text" name="Name" required="required"/> &nbsp;
        <input type="submit" value="Search" /> 
    </form>    --%>
    <%-- <form:form method="GET" action="search" modelAttribute="bookNames" >
    <table><tr><td>
    <form:label path="book">Books</form:label></td>
    <td>
    <form:select path="bookNames">
   
     <form:options items="${bookNames}" label="Select"/>
     </form:select>
     </td>
     </tr><tr>
     <td colspan="2">
     <input type="submit" value="Search">
     </td></tr>
    value="${bookList.book_id}"
    </table>editBook?Book_id=${book.book_id}
    </form:form> --%>
  <form action="search" method="get" commandName="book">
   
    Select a Book:&nbsp;
    <select name="Name" required="required">
        <c:forEach items="${bookList}" var="book">
            <option>${book.name}</option>
        </c:forEach>
    </select>
    <br/><br/>
    <input type="submit" value="Search" />
</form>
    

    <h3><a href="addBook">Add Book</a></h3>
    <h3><a href="allbooks">List Books</a></h3>
   
</div>   
</body>
</html>