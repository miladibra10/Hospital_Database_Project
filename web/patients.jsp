<%--
  Created by IntelliJ IDEA.
  User: miladibra
  Date: 6/21/18
  Time: 6:32 PM
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

<!-- =======================================================
  Theme Name: Avilon
  Theme URL: https://bootstrapmade.com/avilon-bootstrap-landing-page-template/
  Author: BootstrapMade.com
  License: https://bootstrapmade.com/license/
======================================================= -->
<style>
    .table-striped tbody tr:nth-of-type(odd) {
        background: linear-gradient(45deg, rgba(29, 224, 153, 0.55), rgba(29, 200, 205, 0.55)) !important;
    }

    .table-striped tbody tr:hover {
        background: linear-gradient(45deg, rgba(29, 224, 153, 0.5), rgba(29, 200, 205, 0.5)) !important;
        opacity: 0.6;
    }

    #intro {
        background: linear-gradient(45deg, rgba(29, 224, 153, 0.8), rgba(29, 200, 205, 0.8)), url("static/img/Patient.jpeg") center top no-repeat;
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

    <!--==========================
      About Us Section
    ============================-->
    <section id="about" class="section-sm">
        <div class="container-fluid">
            <div class="section-header">
                <h3 class="section-title">Patients</h3>
                <span class="section-divider"></span>
                <p class="section-description">
                    find your patient here
                </p>
            </div>


            <form action="/action_page.php" class="form col-sm-12">
                <div class="row">

                    <div class="col-sm-6 wow fadeInLeft">

                        First name:<br>
                        <input class="col-sm-12 form-control" type="text" name="firstname"
                               placeholder="Enter First Name">
                        <br>

                    </div>

                    <div class="col-sm-6 content wow fadeInRight">

                        Last name:<br>
                        <input class="col-sm-12 form-control" type="text" name="lastname" placeholder="Enter Last Name">
                        <br>

                    </div>

                    <div class="col-sm-12 wow fadeInUp">
                        <br>

                        <input class="col-sm-2 search btn form-control"
                               style="background:linear-gradient(45deg, rgba(29, 224, 153, 0.5), rgba(29, 200, 205, 0.5)) !important"
                               type="submit" value="search">

                    </div>

                </div>
            </form>

        </div>

    </section><!-- #about -->

    <section id="patientList">
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