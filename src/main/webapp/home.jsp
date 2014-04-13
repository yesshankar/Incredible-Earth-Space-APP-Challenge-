<%@page language="java"
        contentType="text/html;charset=ISO-8859-1" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
    <title>Earth as an Art</title>

    <link rel="shortcut icon" href="designresources/Web/img/favicon.ico">

    <link href="designresources/Web/css/main.css" rel="stylesheet" type="text/css">
    <link href="designresources/Web/css/lightbox.css" rel="stylesheet" type="text/css">

    <!-- Insert to your webpage before the  -->
    <script src="designresources/Web/sliderengine/jquery.js"></script>
    <script src="designresources/Web/sliderengine/amazingslider.js"></script>
    <script src="designresources/Web/sliderengine/initslider-1.js"></script>
    <!-- End of head section HTML codes -->

</head>
<body>

<!-- Markerly -->

<script type="text/javascript" src="http://files.markerly.com/markerly-cdn.js#pub_id=ma-534a311daa082"></script>
<script type="text/javascript">
    var markerly_settings = {
        "services" : "facebook,twitter,email,evernote,linkedin,googleplus",
        "image_services" : "facebook,twitter,email,pinterest",
        "service_color" : "0E4092",
        "text_sharing" : 0,
        "sidebar_sharing" : 1
    }
</script>
<!-- End Markerly -->

<!-- Header -->
<div class="header">
    <div class="loginFix">
        <!-- Login  -->
            <div class="login">
                <p style="margin: 0px 0px 0px 5px;font-size: 15px; font-weight: bold;">
                    Login with your Gmail ID
                </p>
                <form action="/ISAC/selectcategory.jsp" method="post">
                    <input type="text" placeholder="Username" id="username">
                    <input type="password" placeholder="Password" id="password">
                    <a href="#">
                        <input type="submit" value="Login">
                    </a>

                    <input type="checkbox" value="1" name="persistent" >
                    <p style="margin: 7px;">
                        Keep me logged in
                    </p>
                    <p style="margin: -22px 0px 0px 0px; position: relative; left: 180px;">
                        Forgot your password?
                    </p>
                </form>
            </div>

    </div>
    <!-- End Login -->

    <!-- Logo -->
    <div class="logo">
        <img src="designresources/Web/img/logo.png"/>
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
            <a href="http://localhost:8080/ISAC/bar">View Report</a>
        </li>
    </ul>

</div>
<!-- End Navigation -->

<!-- Outer Wrapper  -->
<div class="outerWrapper">

<!-- Slider -->
<div class="slider">

    <!-- Insert to your webpage where you want to display the slider -->
    <div id="amazingslider-1" style="display:block;position:relative;margin:16px auto 6px;">
        <ul class="amazingslider-slides" style="display:none;">
            <c:forEach var="imageUrl" begin = "0" items = "${listUrl}">
                <li>
                    <a href = "#"><img src="${imageUrl}"/></a>
                    <c:set var="imgid" value="${imageUrl}" scope="page"></c:set>
                </li>
            </c:forEach>
        </ul>
        <ul class="amazingslider-thumbnails" style="display:none;">
            <c:forEach var="imageUrl" begin = "0" items = "${listUrl}">
                <li>
                    <img src="${imageUrl}"/>
                </li>
            </c:forEach>
        </ul>
    </div>
    <!-- End of body section HTML codes -->

</div>
<!-- End Slider -->

<!-- Category -->
<div class="category">

    <div class="topic" >
        <h3> Desert</h3>

        <h3 class="view"><a href="#">View All</a></h3>

    </div>

    <div class="subCat">
        <img src="designresources/Web/images/01.jpg"/>
        <div class="panel">
            <form>
                <input type="button"  value="Like">
                <input type="button" value="Dislike">

                <p>
                    "51" Likes , "1" Dislikes
                </p>
            </form>
        </div>
    </div>

    <div class="subCat">
        <img src="designresources/Web/images/01.jpg"/>
        <div class="panel">
            <form>
                <input type="button"  value="Like">
                <input type="button" value="Dislike">

                <p>
                    "51" Likes , "1" Dislikes
                </p>
            </form>
        </div>
    </div>

    <div class="subCat">
        <img src="designresources/Web/images/01.jpg"/>
        <div class="panel">
            <form>
                <input type="button"  value="Like">
                <input type="button" value="Dislike">

                <p>
                    "51" Likes , "1" Dislikes
                </p>
            </form>
        </div>
    </div>

</div>
<!-- Category -->

<!-- Category -->
<div class="category">

    <div class="topic" >
        <h3>Sea</h3>

        <h3 class="view"><a href="#">View All</a></h3>

    </div>

    <div class="subCat">
        <img src="designresources/Web/images/01.jpg"/>
        <div class="panel">
            <form>
                <input type="button"  value="Like">
                <input type="button" value="Dislike">

                <p>
                    "51" Likes , "1" Dislikes
                </p>
            </form>
        </div>
    </div>

    <div class="subCat">
        <img src="designresources/Web/images/01.jpg"/>
        <div class="panel">
            <form>
                <input type="button"  value="Like">
                <input type="button" value="Dislike">

                <p>
                    "51" Likes , "1" Dislikes
                </p>
            </form>
        </div>
    </div>

    <div class="subCat">
        <img src="designresources/Web/images/01.jpg"/>
        <div class="panel">
            <form>
                <input type="button"  value="Like">
                <input type="button" value="Dislike">

                <p>
                    "51" Likes , "1" Dislikes
                </p>
            </form>
        </div>
    </div>

</div>
<!-- Category -->

<!-- Category -->
<div class="category">

    <div class="topic" >
        <h3> Mountain</h3>

        <h3 class="view"><a href="#">View All</a></h3>

    </div>

    <div class="subCat">
        <img src="designresources/Web/images/01.jpg"/>
        <div class="panel">
            <form>
                <input type="button"  value="Like">
                <input type="button" value="Dislike">

                <p>
                    "51" Likes , "1" Dislikes
                </p>
            </form>
        </div>
    </div>

    <div class="subCat">
        <img src="designresources/Web/images/01.jpg"/>
        <div class="panel">
            <form>
                <input type="button"  value="Like">
                <input type="button" value="Dislike">

                <p>
                    "51" Likes , "1" Dislikes
                </p>
            </form>
        </div>
    </div>

    <div class="subCat">
        <img src="designresources/Web/images/01.jpg"/>
        <div class="panel">
            <form>
                <input type="button"  value="Like">
                <input type="button" value="Dislike">

                <p>
                    "51" Likes , "1" Dislikes
                </p>
            </form>
        </div>
    </div>

</div>
<!-- Category -->

</div>

<!-- End Outer Wrapper -->

<!-- Footer -->
<div class="footer">

    <div class="fixCool">

        <div class="cool">
            <h3 >Ready to join Incredible Earth?</h3>
            <p>
                Browse images, create and manage albums, and commit changes - all from your browser.
            </p>

            <a class="btnLgn" href="#">Start Your Journey Today!</a>

        </div>

    </div>

</div>
<!-- Footer -->

<!-- Copyright -->
<div class="copyright">
    <p>
        &copy; 2014, All Rights Reserved. Deerwalk Institute of Technology, Sifal,Kathmandu
    </p>
</div>
<!-- End Copyright -->

</body>

</html>