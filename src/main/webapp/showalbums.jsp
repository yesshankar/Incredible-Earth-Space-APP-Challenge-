<%@page language="java"
        contentType="text/html;charset=ISO-8859-1" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=iso-8859-1">
    <title>Show Albums</title>
</head>
<body>

    Albums:
    <c:forEach var="album" items="${user_albums}">

        <br>
        <form action="images" method="post">
            <input type="hidden" value="${album.albumName}" name = "albumName">
        <button type="submit">${album.albumName}</button>
        </form>
    </c:forEach>
</body>
</html>