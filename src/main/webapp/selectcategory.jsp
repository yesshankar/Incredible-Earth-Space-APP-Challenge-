<%@page language="java"
        contentType="text/html;charset=ISO-8859-1" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=iso-8859-1">
    <title>Album - Earth as an Art</title>

    <link rel="shortcut icon" href="designresources/Web/img/favicon.ico">

    <link href="designresources/Web/css/login.css" rel="stylesheet" type="text/css">
</head>
<body>

<!-- Header -->
<div class="header">

    <!-- Logo -->
    <div class="logo">
        <img src="designresources/Web/img/favicon.png"/>
        <p>
            Incredible Earth
        </p>
    </div>
    <!-- End Logo -->

</div>
<!-- End Header -->

<!--Navigation-->
<div class="navigation">
    <ul>
        <li>
            <a href="#">Home</a>
        </li>
        <li>
            <a href="#">About</a>
        </li>
        <li>
            <a href="#">Contact Us</a>
        </li>
    </ul>

</div>
<!-- End Navigation -->

<!-- Outer Wrapper  -->
<div class="outerWrapper">

    <!-- Accordion -->
    <div class="accordion">
        <div class="accord-header1">
            <p>
                Create New Album
            </p>
        </div>
        <div class="accord-content1">
            <h3>Select Category</h3>
            <form method="post" action="genCategoryImages">
            <select>
                <option value="Desert">Desert</option>
                <option value="Sea">Sea</option>
                <option value="Mountain">Mountain</option>
            </select>
                <a href="#">
                    <input type="submit" value="Submit the Category">
                </a>
            </form>
        </div>

        <div class="accord-header2">
            <p>
                <form method="post" action="myalbums">
                    <button type="submit">My Albums</button>
                </form>
            </p>
        </div>
        <div class="accord-content2">
        </div>
    </div>

    <!-- End Accordion -->

</div>
<!-- End Outer Wrapper -->

<!-- Footer -->
<div class="footer">

</div>
<!-- End Footer -->

<!-- Copyright -->
<div class="copyright">
    <p>
        &copy; 2014, All Rights Reserved. Deerwalk Institute of Technology, Sifal,Kathmandu
    </p>
</div>
<!-- End Copyright -->

</body>

</html>