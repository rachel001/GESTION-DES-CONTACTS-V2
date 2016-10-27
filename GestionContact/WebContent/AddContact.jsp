<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form method="post" action="AddContact">
<table>
    <tr><td><h2>Groupe</h2></td></tr>
    <tr><td><i>Nom : <input type="text" name="groupName" size="50"></i></td></tr>
    
	<tr><td><h2>Contact</h2></td></tr>
	<tr><td> <i> Nom : <input type="text" name="lastname" size="50"></i></td></tr>
	<tr><td> <i> Prenom : <input type="text" name="firstname" size="50"></i></td></tr>
	<tr><td><i>  Mail : <input type="text" name="email" size="100"></i></td></tr>
	
	<tr><td><h2>Phone number</h2></td></tr>
	<tr><td> <i> Phone Kind : <input type="text" name="phoneKind" size="50"></i></td></tr>
	<tr><td> <i> Phone Number : <input type="text" name="phoneNumber" size="50"></i></td></tr>
	
	<tr><td><h2>Adresse</h2></td></tr>
	<tr><td><i> Street : <input type="text" name="street" size="100"></i></td></tr>
	<tr><td><i> City : <input type="text" name="city" size="100"></i></td></tr>
	<tr><td><i> Zip : <input type="text" name="zip" size="100"></i></td></tr>
	<tr><td><i> Country : <input type="text" name="country" size="100"></i></td></tr>
	<tr><td>
	<input class="button" type="submit" value="Submit" />
	<input class="button" type="reset"  value="Reset" />
	</td>
	</tr>

</table>

</form>


</body>
</html>