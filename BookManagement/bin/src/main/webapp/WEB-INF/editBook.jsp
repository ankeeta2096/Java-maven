<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>  
 <%-- <%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>   --%> 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">
<html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Edit Book</title>
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
        <h2>Edit book</h2>
        <form:form action="save" method="post" modelAttribute="book">
            <table border="0" cellpadding="5">
                <tr>
                    <td>ID: </td>
                    <td>${book.book_id}
                        <form:hidden path="Book_id"/>
                    </td>
                </tr> 
                   
                <tr>
                    <td>Name: </td>
                    <td><form:input path="Name" /></td>
                </tr>
                <tr>
                    <td>Author: </td>
                    <td><form:input path="Author" /></td>
                </tr>
                <tr>
                    <td>Publisher: </td>
                    <td><form:input path="Publisher" /></td>
                </tr> 
                <tr>
                    <td>Price: </td>
                    <td><form:input path="Price" /></td>
                </tr>     
                <tr>
                    <td colspan="2"><input type="submit" value="Save"></td>
                </tr>                    
            </table>
        </form:form>
    </div>
  <div align="right">
 <h5 ><a href="home">Home</a></h5>  </div>
</body>
</html>

