<%-- 
    Document   : index
    Created on : Apr 6, 2017, 8:48:33 PM
    Author     : Mohammad
--%>

<%@page import="services.ViewBag"%>
<%
    ViewBag.Title = "Start";
%>

<%@include file="../_viewStart.jsp" %>

<body class="body">

    <div class="start"><h1 class="glyphicon glyphicon-search">Start</h1></div>

    <div class="w3-dropdown-hover w3-right">
        <button class="w3-button" style="background-color: transparent; color: white;">Mohammad Dehghan | <i class="glyphicon glyphicon-chevron-down"></i></button>
        <div class="w3-dropdown-content w3-bar-block" style="width: 100%; background-color: transparent; color: white;">
            <a href="#" class="w3-bar-item w3-button"><i class="glyphicon glyphicon-user"></i> | Profile</a>
            <a href="#" class="w3-bar-item w3-button"><i class="glyphicon glyphicon-cog"></i> | Settings</a>
            <a href="#" class="w3-bar-item w3-button"><i class="glyphicon glyphicon-wrench"></i> | Help</a>
            <a href="#" class="w3-bar-item w3-button"><i class="glyphicon glyphicon-off"></i> | Logout</a>
        </div>
    </div>

    <div style="clear:both;"></div>

    <div id="wrapper">
        <ul class="sortable-list" id="dashboard-layout">
            <li id="a" ondblclick="" class="item small" style="background-image:url(../../img/start/people.png);">
                People
            </li>
            <li id="b" ondblclick="" class="item normal" style="background-image:url(../../img/start/tasks.png);">
                Home Tasks
            </li>
            <li id="c" ondblclick="" class="item wide" style="background-image:url(../../img/start/outlook.png);">
                Outlook
            </li>
            <li id="d" ondblclick="" class="item large" style="background-image:url(../../img/start/skype.png);">
                Skype
            </li>
            <li id="e" ondblclick="" class="item wide" style="background-image:url(../../img/start/photos.png);">
                Photos
            </li>
            <li id="f" ondblclick="" class="item normal" style="background-image:url(../../img/start/xbox.png);">
                Xbox
            </li>
            <li id="g" ondblclick="" class="item normal" style="background-image:url(../../img/start/settings.png);">
                Settings
            </li>
            <li id="h" ondblclick="" class="item normal" style="background-image:url(../../img/start/calculator.png);">
                Calculator
            </li>
            <li id="i" ondblclick="" class="item normal" style="background-image:url(../../img/start/feedback.png);">
                Feedback
            </li>
            <li id="j" ondblclick="" class="item normal" style="background-image:url(../../img/start/visual_studio.png);">
                Visual Studio
            </li>
        </ul>
    </div>

    <script>
//        $('.body').bind('contextmenu', function (e) {
//            return false;
//        });

        $(function () {
            $('#dashboard-layout').contextMenu({
                selector: 'li',
                callback: function (key, options) {
                    var m = "clicked: " + key + " on " + $(this).text();
                    window.console && console.log(m) || alert(m);
                },
                items: {
                    "edit": {name: "Edit", icon: "edit"},
                    "cut": {name: "Cut", icon: "cut"},
                    "copy": {name: "Copy", icon: "copy"},
                    "paste": {name: "Paste", icon: "paste"},
                    "delete": {name: "Delete", icon: "delete"},
                    "sep1": "---------",
                    "quit": {name: "Quit", icon: function ($element, key, item) {
                            return 'context-menu-icon context-menu-icon-quit';
                        }}
                }
            });
        });
    </script>

    <!-- Windows -->
    <%@include file="apps.jsp" %>

</body>
