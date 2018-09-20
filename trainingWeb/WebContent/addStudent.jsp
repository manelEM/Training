<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="f"  uri="http://java.sun.com/jsf/core"%>
<%@ taglib prefix="h"  uri="http://java.sun.com/jsf/html"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<f:view>
<h:form>
<h:panelGrid border="0" columns="2">

<h:outputText value="name :"></h:outputText>
<h:inputText value="#{studentCtrl.student.name }"></h:inputText>
<h:outputText value="email :"></h:outputText>
<h:inputText value="#{studentCtrl.student.email }"></h:inputText>
<h:outputText value="phone number :"></h:outputText>
<h:inputText value="#{studentCtrl.student.id }"></h:inputText><!-- it s just an example so I m going to use the phone number as an id -->
<h:commandButton value="register" action="#{studentCtrl.registerStudent }"></h:commandButton>
<h:commandButton value="cancel" onclick=""></h:commandButton>
</h:panelGrid>
</h:form>

</f:view>
</body>
</html>