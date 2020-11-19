package com.vti.repository;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import com.vti.Entity.Group;


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
public class RepositoryGroup {
	private SessionFactory sessionFactory;

	/**
	 * Constructor for class RepositoryGroup.
	 * 
	 * @Description: .
	 * @author: LNDu
	 * @create_date: Nov 17, 2020
	 * @version: 1.0
	 * @modifer: LNDu
	 * @modifer_date: Nov 17, 2020
	 */
	public RepositoryGroup() {
		sessionFactory = buildSessionFactory();
	}
	private static SessionFactory buildSessionFactory() {
		// load configuration
		Configuration configuration = new Configuration();
		configuration.configure("hibernate.cfg.xml");

		// add entity
		configuration.addAnnotatedClass(Group.class);

		StandardServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder()
				.applySettings(configuration.getProperties()).build();

		return configuration.buildSessionFactory(serviceRegistry);
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
	 * @param group
	 */
	public void creatGroups( Group group) {
		Session session = null;
		try {
			session = sessionFactory.openSession();
			session.beginTransaction();

			for (int i = 0; i <= 5; i++) {
				Group creategroups = new Group();
				creategroups.setGroupName("groups" + (i + 1));

				session.save(creategroups);
			}
			System.out.println("create Successfully");

			session.getTransaction().commit();
		} catch (Exception sqlException) {
			if (null != session.getTransaction()) {
				System.out.println("\n.......");
				session.getTransaction().rollback();
			}
			sqlException.printStackTrace();
		} finally {
			if (session != null) {
				session.close();
			}
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
	@SuppressWarnings("unchecked")
	public List<Group> getAllGroups() {

		Session session = null;

		try {

			// get session
			session = sessionFactory.openSession();

			// create hql query
			Query<Group> query = session.createQuery("FROM  Group");

			return query.list();

		} finally {
			if (session != null) {
				session.close();
			}
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
	 * @param id
	 * @return
	 */
	public Group getGroupsbyid(short id ) {
		Session session = null;

		try {

			// get session
			session = sessionFactory.openSession();

			// get department by id
			Group groups = session.get(Group.class, id);

			return groups;

		} finally {
			if (session != null) {
				session.close();
			}
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
	 * @param name
	 * @return
	 */
	public Group getGroupsbyname(String name) {
		Session session = null;

		try {

			// get session
			session = sessionFactory.openSession();

			// create hql query
			@SuppressWarnings("unchecked")
			Query<Group> query = session.createQuery("FROM Group WHERE GroupName = :nameParameter");

			// set parameter
			query.setParameter("nameParameter", name);

			// get result
			Group groups = query.uniqueResult();

			return groups;

		} finally {
			if (session != null) {
				session.close();
			}
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
	 * @param id
	 * @param newName
	 */
	public void updateGroup(short id, String newName) {
		Session session = null;
		
		try {

			// get session
			session = sessionFactory.openSession();
			session.beginTransaction();
			// 
			Group groups = (Group) session.load(Group.class, id );

			// update
			groups.setGroupName(newName);

			session.getTransaction().commit();

		} finally {
				if (session != null) {
					session.close();
				}
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
	 * @param id
	 */
	public void deleteGroup (short id) {
		Session session = null;

		try {

			// get session
			session = sessionFactory.openSession();
			session.beginTransaction();

			// get department
			Group groups = (Group) session.load(Group.class, id);

			// delete
			session.delete(groups);

			session.getTransaction().commit();

		} finally {
			if (session != null) {
				session.close();
			}
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
	 * @param id
	 * @return
	 */
	public boolean isGroupsExistsByID(short id) {

		// get Account
		Group groups = getGroupsbyid(id);

		// return result
		if (groups == null) {
			return false;
		}

		return true;
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
	 * @param name
	 * @return
	 */
	public boolean isDepartmentExistsByName(String name) {
		Group groups = getGroupsbyname(name);

		if (groups == null) {
			return false;
		}
		return true;
	}
	

}
