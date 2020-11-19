package com.vti.repository;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.query.Query;

import com.vti.Entity.Department;
import com.vti.utils.HibernateUtils;

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
public class RepositoryDepartment {
	private HibernateUtils hibernateUtils;

	public RepositoryDepartment() {
		hibernateUtils = HibernateUtils.getInstance();
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
	public List<Department> getAllDepartments() {

		Session session = null;

		try {

			// get session
			session = hibernateUtils.openSession();

			// create hql query
			Query<Department> query = session.createQuery("FROM Department");

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
	public Department getDepartmentByID(short id) {

		Session session = null;

		try {

			// get session
			session = hibernateUtils.openSession();

			// get department by id
			Department department = session.get(Department.class, id);

			return department;

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
	@SuppressWarnings("unchecked")
	public Department getDepartmentByName(String name) {

		Session session = null;

		try {

			// get session
			session = hibernateUtils.openSession();

			// create hql query
			Query<Department> query = session.createQuery("FROM Department WHERE name = :nameParameter");

			// set parameter
			query.setParameter("nameParameter", name);

			// get result
			Department department = query.uniqueResult();

			return department;

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
	 * @param department
	 */
	public void createDepartment(Department department) {

		Session session = null;

		try {

			// get session
			session = hibernateUtils.openSession();
			session.beginTransaction();

			// create
			session.save(department);

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
	 * @param newName
	 */
	public void updateDepartment(short id, String newName) {

		Session session = null;

		try {

			// get session
			session = hibernateUtils.openSession();
			session.beginTransaction();

			// get department
			Department department = (Department) session.load(Department.class, id);

			// update
			department.setDepartmentName(newName);

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
	 * @param department
	 */
	public void updateDepartment(Department department) {

		Session session = null;

		try {

			// get session
			session = hibernateUtils.openSession();
			session.beginTransaction();

			// update
			session.update(department);

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
	public void deleteDepartment(short id) {

		Session session = null;

		try {

			// get session
			session = hibernateUtils.openSession();
			session.beginTransaction();

			// get department
			Department department = (Department) session.load(Department.class, id);

			// delete
			session.delete(department);

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
	public boolean isDepartmentExistsByID(short id) {

		// get department
		Department department = getDepartmentByID(id);

		// return result
		if (department == null) {
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
		Department department = getDepartmentByName(name);

		if (department == null) {
			return false;
		}
		return true;
	}


}
