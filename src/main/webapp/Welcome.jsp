<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>


<fmt:bundle basename="i18n">
    <html>
    <link rel="stylesheet" type="text/css" media="screen" href="css/style.css">
    <head>
        <title>Welcome</title>
    </head>
    <body>
    <h1 id="hello"> Hello </h1>

    <div align="center">
        <form method="post" action="${pageContext.request.contextPath}/Result">
            <p><fmt:message key="input.text"/></p>
            <tr>
                <td><textarea name="enteredValue" id="" cols="100" rows="30"></textarea></td>
            </tr>

            <table cellpadding="0" cellspacing="0" border="0">
                <tr>
                    <td><fmt:message key="value1"/></td>
                    <td><input type="checkbox" name="options" value="1"/></td>
                </tr>
                <tr>
                    <td><fmt:message key="value1"/></td>
                    <td><input type="checkbox" name="options" value="2"/></td>
                </tr>
                <tr>
                    <td><input type="submit" name="Send" value="Submit"/></td>
                </tr>
            </table>

        </form>
    </div>

    </body>
    </html>
</fmt:bundle>