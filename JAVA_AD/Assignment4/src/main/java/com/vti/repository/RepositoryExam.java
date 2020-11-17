package com.vti.repository;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.query.Query;
import com.vti.Entity.Exam;
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
public class RepositoryExam {
	private HibernateUtils hibernateUtils;

	public RepositoryExam() {
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
	public List<Exam> getAllExam() {

		Session session = null;

		try {

			// get session
			session = hibernateUtils.openSession();

			// create hql query
			Query<Exam> query = session.createQuery("FROM `Answer`");

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
	public Exam getExamByID(short id) {

		Session session = null;

		try {

			// get session
			session = hibernateUtils.openSession();

			// get department by id
			Exam Exam = session.get(Exam.class, id);

			return Exam;

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
	public Exam getExamByName(String Content) {

		Session session = null;

		try {

			// get session
			session = hibernateUtils.openSession();

			// create hql query
			Query<Exam> query = session.createQuery("FROM `Exam` WHERE name = :nameParameter");

			// set parameter
			query.setParameter("nameParameter", Content);

			// get result
			Exam Exam = query.uniqueResult();

			return Exam;

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
	public void createAnswer(Exam Exam) {

		Session session = null;

		try {

			// get session
			session = hibernateUtils.openSession();
			session.beginTransaction();

			// create
			session.save(Exam);

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
	public void updateExam(short id, String newName) {

		Session session = null;

		try {

			// get session
			session = hibernateUtils.openSession();
			session.beginTransaction();

			// get department
			Exam Exam = (Exam) session.load(Exam.class, id);

			// update
			Exam.setTitle(newName);

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
	public void updateExam(Exam Exam) {

		Session session = null;

		try {

			// get session
			session = hibernateUtils.openSession();
			session.beginTransaction();

			// update
			session.update(Exam);

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
	public void deleteExam(short id) {

		Session session = null;

		try {

			// get session
			session = hibernateUtils.openSession();
			session.beginTransaction();

			// get department
			Exam Exam = (Exam) session.load(Exam.class, id);

			// delete
			session.delete(Exam);

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
	public boolean isExamExistsByID(short id) {
		
		Exam Exam = getExamByID(id);
	
		if (Exam == null) {
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
	public boolean isExamExistsByName(String name) {
		Exam Exam = getExamByName(name);

		if (Exam == null) {
			return false;
		}
		return true;
	}
}
