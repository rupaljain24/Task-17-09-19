<%@ page isELIgnored="false" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="fr" %>
<html>
<body>
<h3>Update-Students-Using-JSTL</h3>
<hr>
<fr:form action="changeDetails"  modelAttribute="student">
	<pre>

	Roll no	:<fr:input path="rno" value="${rno}"/>
	Name	:<fr:input path="name" value="${name}"/>
	Branch	:<fr:input path="branch" value="${branch}"/>
	Sem		:<fr:input path="sem" value="${sem}"/>
			<input type="submit" value="Update">
	
</pre>
</fr:form>

<hr>
</body>
</html>