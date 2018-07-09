<%--
  Created by IntelliJ IDEA.
  User: miladibra
  Date: 6/21/18
  Time: 6:20 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html lang="en" xmlns="http://www.w3.org/1999/html">
<head>
    <meta charset="utf-8">
    <title>Hospital</title>
    <meta content="width=device-width, initial-scale=1.0" name="viewport">
    <meta content="" name="keywords">
    <meta content="" name="description">

    <!-- Favicons -->
    <link href="static/img/favicon3.png" rel="icon">
    <link href="static/img/apple-touch-icon3.png" rel="apple-touch-icon">

    <!-- Google Fonts -->
    <link href="https://fonts.googleapis.com/css?family=Montserrat:300,400,500,700|Open+Sans:300,300i,400,400i,700,700i"
          rel="stylesheet">

    <!-- Bootstrap CSS File -->
    <link href="static/lib/bootstrap/css/bootstrap.min.css" rel="stylesheet">

    <!-- Libraries CSS Files -->
    <link href="static/lib/animate/animate.min.css" rel="stylesheet">
    <link href="static/lib/font-awesome/css/font-awesome.min.css" rel="stylesheet">
    <link href="static/lib/ionicons/css/ionicons.min.css" rel="stylesheet">
    <link href="static/lib/magnific-popup/magnific-popup.css" rel="stylesheet">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">

    <!-- Main Stylesheet File -->
    <link href="static/css/style.css" rel="stylesheet">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>

    <!-- =======================================================
      Theme Name: Avilon
      Theme URL: https://bootstrapmade.com/avilon-bootstrap-landing-page-template/
      Author: BootstrapMade.com
      License: https://bootstrapmade.com/license/
    ======================================================= -->

</head>
<style>
    .x{
        padding-left: 0;
        padding-right: 0;
    }
</style>

<body>

<!--==========================
  Header
============================-->
<header id="header">
    <div class="container">

        <div id="logo" class="pull-left">
            <h1><a href="#intro" class="scrollto">Hospital</a></h1>
            <!-- Uncomment below if you prefer to use an image logo -->
            <!-- <a href="#intro"><img src="img/logo.png" alt="" title=""></a> -->
        </div>

        <nav id="nav-menu-container">
            <ul class="nav-menu">
                <li><a href="/">Home</a></li>
                <li><a href="/patients">Patient</a></li>
                <li><a href="/doctors">Doctors</a></li>
                <li><a href="/drugs">Drugs</a></li>
                <li><a href="/labs">Labs</a></li>
                <li><a href="/rooms">Rooms</a></li>
                <li><a href="/services">Services</a></li>
            </ul>
        </nav><!-- #nav-menu-container -->
    </div>
</header><!-- #header -->

<!--==========================
  Intro Section
============================-->
<section id="intro">

    <div class="intro-text">
        <h2>Welcome to Hospital</h2>
    </div>

</section><!-- #intro -->

<main id="main">
</main>

<section class="gallery-item">
    <div class="container-fluid">
        <div class="section-header">
            <br>
            <br>
            <br>
            <br>
            <h3 class="section-title">Gallery</h3>
            <span class="section-divider"></span>
        </div>
        <div id="myCarousel" class="carousel slide" data-ride="carousel">
            <div class="row">
                <div class="col-sm-2">

                </div>
                <div class="col-sm-8 wow fadeInUp x">
                    <!-- Indicators -->
                    <ol class="carousel-indicators">
                        <li data-target="#myCarousel" data-slide-to="0" class="active"></li>
                        <li data-target="#myCarousel" data-slide-to="1"></li>
                        <li data-target="#myCarousel" data-slide-to="2"></li>
                    </ol>

                    <!-- Wrapper for slides -->

                    <div class="carousel-inner">
                        <div class="item active">
                            <img src="static/img/1.jpg" alt="" style="width:100%;">
                        </div>

                        <div class="item">
                            <img src="static/img/1.jpg" alt="" style="width:100%;">
                        </div>

                        <div class="item">
                            <img src="static/img/1.jpg" alt="" style="width:100%;">
                        </div>
                    </div>

                    <!-- Left and right controls -->
                    <a class="left carousel-control" href="#myCarousel" data-slide="prev">
                        <span class="glyphicon glyphicon-chevron-left"></span>
                        <span class="sr-only">Previous</span>
                    </a>
                    <a class="right carousel-control" href="#myCarousel" data-slide="next">
                        <span class="glyphicon glyphicon-chevron-right"></span>
                        <span class="sr-only">Next</span>
                    </a>
                </div>
                <div class="col-sm-2">
                </div>
            </div>

        </div>
    </div>
    <br>
</section>
<!--==========================
  Footer
============================-->
<footer id="footer">
    <div class="container">
        <div class="row">
            <div class="col-lg-6 text-lg-left text-center">
                <div class="copyright">
                    &copy; Copyright <strong>Avilon</strong>. All Rights Reserved
                </div>
                <div class="credits">
                    <!--
                      All the links in the footer should remain intact.
                      You can delete the links only if you purchased the pro version.
                      Licensing information: https://bootstrapmade.com/license/
                      Purchase the pro version with working PHP/AJAX contact form: https://bootstrapmade.com/buy/?theme=Avilon
                    -->
                    Designed by <a href="https://bootstrapmade.com/">BootstrapMade</a>
                </div>
            </div>
            <div class="col-lg-6">
                <nav class="footer-links text-lg-right text-center pt-2 pt-lg-0">
                    <a href="#intro" class="scrollto">Home</a>
                    <a href="#about" class="scrollto">About</a>

                </nav>
            </div>
        </div>
    </div>


</footer><!-- #footer -->

<a href="#" class="back-to-top"><i class="fa fa-chevron-up"></i></a>

<!-- JavaScript Libraries -->
<script src="static/lib/jquery/jquery.min.js"></script>
<script src="static/lib/jquery/jquery-migrate.min.js"></script>
<script src="static/lib/bootstrap/js/bootstrap.bundle.min.js"></script>
<script src="static/lib/easing/easing.min.js"></script>
<script src="static/lib/wow/wow.min.js"></script>
<script src="static/lib/superfish/hoverIntent.js"></script>
<script src="static/lib/superfish/superfish.min.js"></script>
<script src="static/lib/magnific-popup/magnific-popup.min.js"></script>

<!-- Contact Form JavaScript File -->
<script src="static/contactform/contactform.js"></script>

<!-- Template Main Javascript File -->
<script src="static/js/main.js"></script>

</body>
</html>
