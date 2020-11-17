package com.vti.utils;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

import com.vti.Entity.Account;
import com.vti.Entity.Answer;
import com.vti.Entity.CategoryQuestion;
import com.vti.Entity.Department;
import com.vti.Entity.Exam;
import com.vti.Entity.Group;
import com.vti.Entity.Position;
import com.vti.Entity.Question;
import com.vti.Entity.Salary;
import com.vti.Entity.TypeQuestion;

/**
 * This class is . 
 * 
 * @Description: .
 * @author: LNDu
 * @create_date: Nov 17, 2020
 * @version: 1.0
 * @modifer: LNDu
 * @modifer_date: Nov 17, 2020
 */
public class HibernateUtils {
	private static HibernateUtils instance;

	private Configuration configuration;
	private SessionFactory sessionFactory;
	
	/**
	 * This method is . 
	 * 
	 * @Description: .
	 * @author: LNDu
	 * @create_date: Nov 17, 2020
	 * @version: 1.0
	 * @modifer: LNDu
	 * @modifer_date: Nov 17, 2020
	 * @return
	 */
	public static HibernateUtils getInstance() {
		if (null == instance) {
			instance = new HibernateUtils();
		}
		return instance;
		
	}
	/**
	 * Constructor for class HibernateUtils.
	 * 
	 * @Description: .
	 * @author: LNDu
	 * @create_date: Nov 17, 2020
	 * @version: 1.0
	 * @modifer: LNDu
	 * @modifer_date: Nov 17, 2020
	 */
	private HibernateUtils() {
		configure();
	}
	/**
	 * This method is . 
	 * 
	 * @Description: .
	 * @author: LNDu
	 * @create_date: Nov 17, 2020
	 * @version: 1.0
	 * @modifer: LNDu
	 * @modifer_date: Nov 17, 2020
	 */
	private void configure() {
		// load configuration
		configuration = new Configuration();
		configuration.configure("hibernate.cfg.xml");

		// add entity
		configuration.addAnnotatedClass(Group.class);
		configuration.addAnnotatedClass(Account.class);
		configuration.addAnnotatedClass(Department.class);
		configuration.addAnnotatedClass(Answer.class);
		configuration.addAnnotatedClass(Exam.class);
		configuration.addAnnotatedClass(Position.class);
		configuration.addAnnotatedClass(Question.class);
		configuration.addAnnotatedClass(Salary.class);
		configuration.addAnnotatedClass(TypeQuestion.class);
		configuration.addAnnotatedClass(CategoryQuestion.class);
		
	}
	/**
	 * This method is . 
	 * 
	 * @Description: .
	 * @author: LNDu
	 * @create_date: Nov 17, 2020
	 * @version: 1.0
	 * @modifer: LNDu
	 * @modifer_date: Nov 17, 2020
	 * @return
	 */
	private SessionFactory buildSessionFactory() {
		if (null == sessionFactory || sessionFactory.isClosed()) {
			ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder()
					.applySettings(configuration.getProperties()).build();

			sessionFactory = configuration.buildSessionFactory(serviceRegistry);
		}

		return sessionFactory;
	}
	/**
	 * This method is . 
	 * 
	 * @Description: .
	 * @author: LNDu
	 * @create_date: Nov 17, 2020
	 * @version: 1.0
	 * @modifer: LNDu
	 * @modifer_date: Nov 17, 2020
	 */
	public void closeFactory() {
		if (null != sessionFactory && sessionFactory.isOpen()) {
			sessionFactory.close();
		}
	}
	/**
	 * This method is . 
	 * 
	 * @Description: .
	 * @author: LNDu
	 * @create_date: Nov 17, 2020
	 * @version: 1.0
	 * @modifer: LNDu
	 * @modifer_date: Nov 17, 2020
	 * @return
	 */
	public Session openSession() {
		buildSessionFactory();
		return sessionFactory.openSession();
	}
	

}
