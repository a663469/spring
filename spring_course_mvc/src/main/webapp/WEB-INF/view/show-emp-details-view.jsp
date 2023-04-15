<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--@elvariable id="employee" type="com.zaurtregulov.spring.mvc.Employee"--%>
<!DOCTYPE html>
<html>
<body>

<h2>Dear Employee, you are WELCOME!!!</h2>

<br>
<br>

<%--Your name: ${param.employeeName}--%>
<%--Your name: ${nameAttribute} ${description}--%>

Your name: ${employee.name}
<br>
Your surname: ${employee.surname}
<br>
Your salary: ${employee.salary}
<br>
Your department: ${employee.department}
<br>
Your car: ${employee.carBrand}
<br>
Language(s):
<ul>
    <c:forEach var="lang" items="${employee.languages}">
        <li>
            ${lang}
        </li>
    </c:forEach>
</ul>

</body>
</html>