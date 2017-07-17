<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html>

<html>

<head>
	<title>Student registration page</title>
</head>

<body>

	<form:form action="processForm" modelAttribute="student">
	First name: <form:input path="firstName" />
	<br><br>
	Last name: <form:input path="lastName" />
	<br><br>
	County: <form:select path="country">
	
				<form:options items="${student.countryOptions}"/>
				
			</form:select>
	<br><br>
	
	Favorite Language:
	
	Java <form:radiobutton path="favoriteLanguage" value="Java"/>
	C# <form:radiobutton path="favoriteLanguage" value="C#"/>
	C++ <form:radiobutton path="favoriteLanguage" value="C++"/>
	Ruby <form:radiobutton path="favoriteLanguage" value="Ruby"/>
	<br>
	Operating Systems:
	Linux <form:checkbox path="operationSystems" value="Linux"/>
	
	Mac OS <form:checkbox path="operationSystems" value="Mac OS"/>
	
	MS Windows <form:checkbox path="operationSystems" value="MS Windows"/>
	
	
	<input type="submit" value="Submit"/>
	
	
	</form:form>

</body>

</html>