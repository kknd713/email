<%@page import="com.jb.cdjj.email.kknd713.entity.MailUser"%>
<%@page import="java.util.List"%>
<%@page import="org.apache.ibatis.session.SqlSession"%>
<%@page import="org.apache.ibatis.session.SqlSessionFactory"%>
<%@page import="org.springframework.context.support.ClassPathXmlApplicationContext"%>
<%@page import="org.springframework.context.ApplicationContext"%>
<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
</head>
<body>
	<%
	
	ApplicationContext ac = new ClassPathXmlApplicationContext("ac.xml");
	SqlSessionFactory sf = (SqlSessionFactory)ac.getBean("sessionFactory");
	SqlSession ss = sf.openSession();
	
	
	List<MailUser> users = ss.selectList("com.jb.cdjj.email.kknd713.dao.MailUserDao.findAll");
	for (MailUser user : users) {
		System.out.println(user);
	}
	
	%>
</body>
</html>