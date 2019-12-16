<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page import="java.util.*" %>
<%@page import="com.softtek.academia.controller.StateController"%>
<%@page import="com.softtek.academia.web.model.State"%>
<c:set var="names" value="Joe, Zhou" scope="page" />


<%

StateController controller = new StateController();
List<State> states = controller.getStates();
pageContext.setAttribute("states", states);

%>


    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

   <c:set var = "salary" scope = "session" value = "${2000*2}"/>
   <p>My salary is:  <c:out value = "${salary}"/><p>
   
   
   <table>
      <TH>Id</th>
      <TH>Nombre Estado</th>
      <c:forEach items="${states}" var="state">
        <tr>
          <td><c:out value="${state.id}" /><td>
          <td><c:out value="${state.description}" /><td>
        </tr>
      </c:forEach>
    </table>


</body>
</html>