<%--
  Created by IntelliJ IDEA.
  User: user
  Date: 27/06/2018
  Time: 11:41 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html lang="en">
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
    .table-striped tbody tr:nth-of-type(odd) {
        background: linear-gradient(45deg, rgba(29, 224, 153, 0.55), rgba(29, 200, 205, 0.55)) !important;
    }

    .table-striped tbody tr:hover {
        background: linear-gradient(45deg, rgba(29, 224, 153, 0.5), rgba(29, 200, 205, 0.5)) !important;
        opacity: 0.6;
    }

    #intro {
        background: linear-gradient(45deg, rgba(29, 224, 153, 0.8), rgba(29, 200, 205, 0.8)), url("static/img/Lab.jpg") center top no-repeat;
    }

    .search {
        display: block;
        margin-left: auto;
        margin-right: auto;
        width: 20%;
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
                <li><a href="../Hospital/index.html">Home</a></li>
                <li><a href="../Hospital/Patient.html">Patient</a></li>
                <li><a href="../Hospital/Doctors.html">Doctors</a></li>
                <li><a href="../Hospital/Drugs.html">Drugs</a></li>
                <li><a href="../Hospital/Labs.html">Labs</a></li>
                <li><a href="../Hospital/Rooms.html">Rooms</a></li>
                <li><a href="../Hospital/Services.html">Services</a></li>
                <li><a href="../Hospital/Admin.html">Admin</a></li>
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

    <section id="about" class="section-sm">
        <div class="container-fluid">
            <div class="section-header">
                <h3 class="section-title">Labratoars</h3>
                <span class="section-divider"></span>
                <p class="section-description">
                    find your needing Labs
                </p>
            </div>
        </div>
    </section><!-- #about -->

    <section id="PatientsList">
        <div class="container-fluid col-sm-10">
            <table class="table table-hover table-striped">
                <thead>
                <tr>
                    <th>Firstname</th>
                    <th>Lastname</th>
                    <th>Email</th>
                </tr>
                </thead>
                <tbody>
                <tr>
                    <td>John</td>
                    <td>Doe</td>
                    <td>john@example.com</td>
                </tr>
                <tr>
                    <td>Mary</td>
                    <td>Moe</td>
                    <td>mary@example.com</td>
                </tr>
                <tr>
                    <td>July</td>
                    <td>Dooley</td>
                    <td>july@example.com</td>
                </tr>
                </tbody>
            </table>

        </div>

        </div>
    </section><!-- #gallery -->
</main>

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
<script src="lib/jquery/jquery.min.js"></script>
<script src="lib/jquery/jquery-migrate.min.js"></script>
<script src="lib/bootstrap/js/bootstrap.bundle.min.js"></script>
<script src="lib/easing/easing.min.js"></script>
<script src="lib/wow/wow.min.js"></script>
<script src="lib/superfish/hoverIntent.js"></script>
<script src="lib/superfish/superfish.min.js"></script>
<script src="lib/magnific-popup/magnific-popup.min.js"></script>

<!-- Contact Form JavaScript File -->
<script src="contactform/contactform.js"></script>

<!-- Template Main Javascript File -->
<script src="js/main.js"></script>

</body>
</html>
