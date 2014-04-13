<%@page language="java"
        contentType="text/html;charset=ISO-8859-1" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
    <title>Album - Earth as an Art</title>

    <link rel="shortcut icon" href="designresources/Web/img/favicon.ico">

    <link href="designresources/Web/css/main.css" rel="stylesheet" type="text/css">

    <style>
            /* Category
             ------------------------------------------------------------ */
        div.category {
            margin: 0 auto;
            width: 930px;
            border: 2px solid;
            height: 360px;
            position: relative;
            top: 50px;
            padding: 10px;
        }
        div.topic {
            background: #DDD;
            display: inline-block;
            width: 950px;
            margin: -10px 0px 0px -10px;
            height: 50px;
            border-bottom: 2px solid;
        }
        .topic h3 {
            padding: 0px 0px 0px 20px;
        }
        div.upCat {
            width: 930px;
            margin: 0 auto;
        }
        div.subCat img {
            width: 455px;
            height: 300px;
            border-radius: 5px;
            box-shadow: 2px 5px 5px #666;
        }
        div.subCat {
            padding: 5px;
            float: left;
            margin-top: 10px
        }
        .view {
            margin-top: -40px;
            margin-right: 20px;
            background: #0E4092;
            float: right;
            border-radius: 5px;
        }
        .view:hover {
            background: #F5331F;
        }
        h3.view a {
            color: #FFF;
        }
        h3.view {
            padding: 5px;
        }
            /* Sub Box
             -------------------------------------------- */
        .subBox input[type="checkbox"] {
            float: left;
            margin-top: 3px;
        }
        div.subBox {
            margin: 0 auto;
            width: 430px;
            height: 277px;
            margin-top: 2px;
            border: 2px solid;
            padding: 10px;
        }
        div.zanel {
            padding: 10px;
            margin: 0px 0px 0px -10px;
        }
        div.zpanel p {
            margin: 5px 200px 0px 0px;
            float: right;
        }
            /* Submit button
             ------------------------------------------ */
        div.sbBtn {
            float: right;
            margin-right: 25px;
            margin-top: 10px;
        }
            /* Album
             ----------------------------------------------------	 */
        div.album ul li {
            list-style: none;
            margin: 0 auto;
            width: 923px;
            margin-left: -40px;
            padding: 10px;
            border-bottom: 2px solid;
        }
        .album {
            padding: 10px;
        }
        .album ul {
            border: 2px solid #ddd;
        }
        .album p {
            background: #0E4092;
            display: inline-block;
            padding: 10px;
            width: 149px;
            color: #FFF;
            font-size: 16px;
            font-weight: bold;
            border-radius: 5px;
            text-align: center;
        }
        input#albName {
            padding: 10px;
            width: 300px;
            font-size: 16px;
        }
        input#albDesc {
            padding: 10px;
            width: 725px;
            font-size: 16px;
        }
        input[type="submit"] {
            font-size: 16px;
            font-weight: bold;
        }
        input[type="button"] {
            font-size: 16px;
        }
        select {
            padding: 6px;
            width: 215px;
            background: #E7E7E7;
        }

    </style>

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
            <a href="#">Contact Us</a>
        </li>
    </ul>

</div>
<!-- End Navigation -->

<!-- Outer Wrapper  -->
<div class="outerWrapper">
    <form method="post" action="newalbum">
    <div class="album">
            <ul>
                <li>
                    <p>
                        Albumn Name
                    </p>
                    <input type="text" placeholder="Album Name" id="albName">
                </li>
                <li>
                    <p>
                        Album Description
                    </p>
                    <input type="text" placeholder="Album Description" id="albDesc">
                </li>

            </ul>
    </div>

    <!-- Container -->
    <div class="container">
        <!-- Category -->
        <c:forEach var="imageUrl" items="${imagesUrlList}" varStatus="imageCounter" begin = "0" end = "3">
            <br>
            <div class="upCat">

                <div class="subCat">
                    <img src="${imageUrl}"/>
                </div>
                <div class="subCat">
                    <div class="subBox">
                        <input type="checkbox" name="imagesID" value="${imageUrl}">
                        <p>
                            Select this image
                        </p>
                        <div class="zpanel">
                            <input type="button"  value="Like">
                            <input type="button" value="Dislike">

                            <p>
                                Likes & Dislikes:
                            </p>

                            <b> Choose Category </b>

                            <select>

                                <option value="Desert">Desert</option>
                                <option value="Sea">Sea</option>
                                <option value="Mountain">Mountain</option>
                            </select>
                        </div>
                    </div>
                </div>
            </div>
        </c:forEach>
        <!-- End Category -->
    </div>
    <!-- End Container -->
    <div class="sbBtn">
        <input type="submit" value="Submit">
    </div>
    </form>
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