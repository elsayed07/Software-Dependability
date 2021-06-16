<%-- 
    Document   : _Layout
    Created on : Apr 6, 2017, 8:45:01 PM
    Author     : Mohammad
--%>
<%@page import="services.ViewBag"%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<html>
    <head>
        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <meta name="description" content="Automation">
        <meta name="author" content="Mohammad Dehghan">
        <%
            response.getWriter().print("<title>" + ViewBag.Title + "</title>");
        %>

        <link href="../../js/jquery-ui-1.12.1.custom/jquery-ui.css" rel="stylesheet"/>
        <link href="../../css/bootstrap.min.css" rel="stylesheet"/>
        <link href="../../css/w3.css" rel="stylesheet"/>
        <link href="../../css/start/win8.1.css" rel="stylesheet"/>

        <script type="text/javascript" src="../../js/jquery.min.js"></script>
        <script type="text/javascript" src="../../js/start/jquery-ui-1.8.23.custom.min.js"></script>
        <script type="text/javascript" src="../../js/start/win8.1.js"></script>
        <script type="text/javascript" src="../../js/bootstrap.min.js"></script>
        <script type="text/javascript" src="../../js/npm.js"></script>
        <script type="text/javascript" src="../../js/angular.min.js"></script>

    </head>

    <div id="task-bar" class="navbar-fixed-bottom">
        <img id="sni" src="../../img/start/storelogo-sdk.png" class="start-nav-icon"/>

        <!-- TODO: Load other running apps from session -->

    </div>

</html>
