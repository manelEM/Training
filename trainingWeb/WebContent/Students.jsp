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

<h:dataTable border="1" value="#{studentCtrl.allStudent }" var="st">

	<h:column id="ColumnName">
		<f:facet name="header">
			<h:outputText value="name"></h:outputText>
		</f:facet>
		<h:outputText value="#{st.name }"/>
	</h:column>
	
	<h:column id="ColumnPhone">
		<f:facet name="header">
			<h:outputText value="PhoneNumber"></h:outputText>
		</f:facet>
		<h:outputText value="#{st.id }"/>
	</h:column>
	
	<h:column id="ColumnEmail">
		<f:facet name="header">
			<h:outputText value="Email"></h:outputText>
		</f:facet>
		<h:outputText value="#{st.email }"/>
	</h:column>
	

</h:dataTable>

</f:view>
</body>
</html>