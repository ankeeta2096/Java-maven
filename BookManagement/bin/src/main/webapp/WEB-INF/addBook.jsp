<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%> 
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>     
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Add Book</title>
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


.ajax_response {
    padding: 10px 20px;
    border: 0;
    display: inline-block;
    margin-top: 20px;
    cursor: pointer;
	display:none;
	color:#555;
}

</style>
<script src="http://code.jquery.com/jquery-1.10.2.js"></script>	
<script type="text/javascript">






</script>	

</head>
<body bgcolor="#E6E6FA">
<div class="header">
  <h1>Book Manager</h1>
</div>
    <div align="center">
        <h2>Add Book</h2>
        <form:form action="save"  id="addForm" modelAttribute="book">
            <table border="0" cellpadding="5">
          
                <tr>
                    <td>Name: </td>
                    <td><form:input path="Name" id="Name" required="required" /></td>
                </tr>
                <tr>
                    <td>Author: </td>
                    <td><form:input path="Author" id="Author" required="required"/></td>
                </tr>
                <tr>
                    <td>Publisher: </td>
                    <td><form:input path="Publisher" id="Publisher" required="required"/></td>
                </tr>  
                 <tr>
                    <td>Price: </td>
                    <td><form:input path="Price" id="Price" required="required"/></td>
                </tr>    
                <tr>
                 <!--  <td colspan="2"><input type="submit" value="save""></td> -->
                  <td><button type="submit" name="btn-submit" id="btn-submit" value="save" onclick=submitForm()>Submit</button></td>
          </tr>  
    </table>
    
	
    
                                
           
        </form:form>
  
     <div align="right"> 
 <h5 ><a href="home">Home</a></h5>  </div>
 
 
</body>


</html>