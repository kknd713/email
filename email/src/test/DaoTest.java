package test;

import java.io.IOException;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.jb.cdjj.email.kknd713.entity.MailUser;

public class DaoTest {

	public static void main(String[] args) throws IOException {
		/*
		Reader reader = Resources.getResourceAsReader("mybatis-conf.xml");
		SqlSessionFactory sf = new SqlSessionFactoryBuilder().build(reader);
		SqlSession session = sf.openSession();
		
		
		List<MailUser> users = session.selectList("com.jb.cdjj.kknd713.dao.MailUserDao.findAll");
		for (MailUser user : users) {
			System.out.println(user);
		}
		**/
		ApplicationContext ac = new ClassPathXmlApplicationContext("ac.xml");
		SqlSessionFactory sf = (SqlSessionFactory)ac.getBean("sessionFactory");
		SqlSession session = sf.openSession();
		
	
		
		List<MailUser> users = session.selectList("com.jb.cdjj.kknd713.dao.MailUserDao.findAll");
		for (MailUser user : users) {
			System.out.println(user);
		}
		
	}

}
