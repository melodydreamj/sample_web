<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
	String idToken=(String)request.getParameter("idToken2");
	System.out.println(idToken);
	
	
	String idToken2=null;
	if(session.getAttribute("idToken")==null){
		session.setAttribute("idToken", idToken);
	}
	if(session.getAttribute("idToken")!=null){
		
	idToken2= (String)session.getAttribute("idToken");
	}
	System.out.println("세션은"+idToken2);
	
	String idToken3=idToken2;
	
	String url="https://aira-1.appspot.com/paramera2.do?idToken3="+idToken3;
	
%>   



</head>
<body>
<h1>시작되었습니다!</h1>
idToken: <%=idToken%>
세션은 : <%=(String)session.getAttribute("idToken")%>
<a href=<%=url%>>디비에 저장해보기</a>
</body>
</html>



</body>
</html>
