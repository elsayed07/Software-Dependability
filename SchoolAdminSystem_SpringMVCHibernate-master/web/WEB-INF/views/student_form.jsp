<%-- 
    Document   : student_form
    Created on : 30-Apr-2018, 5:39:20 PM
    Author     : Julian
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <%@include file="/WEB-INF/views/head.jsp" %>
        <title>MCIT - Add Student</title>
    </head>
    <body>
        <%@include file="/WEB-INF/views/nav.jsp" %>

        <div class="container">
            <div class="mt-5 d-flex align-items-start flex-column">
                <h2 class="align-self-center">Add Student</h2>
                <c:url var="addAction" value="/student/add" ></c:url>

                <form:form action="${addAction}" commandName="student">
                    <table class="align-self-center">
                        <tr>
                            <td>
                                <form:label path="firstName">
                                    <spring:message text="First Name"/>
                                </form:label>
                            </td>
                            <td>
                                <form:input path="firstName" />
                            </td> 
                        </tr>
                        <tr>
                            <td>
                                <form:label path="lastName">
                                    <spring:message text="Last Name"/>
                                </form:label>
                            </td>
                            <td>
                                <form:input path="lastName" />
                            </td>
                        </tr>
                        <tr>
                            <td colspan="2">
                                <input type="submit" value="<spring:message text="Submit"/>" />
                            </td>
                        </tr>
                    </table>	
                </form:form>
                <a class="mt-5" href="<c:url value='/student_list' />" >List of students</a>
            </div>
        </div>
        <%@include file="/WEB-INF/views/libs.jsp" %>
    </body>
</html>
