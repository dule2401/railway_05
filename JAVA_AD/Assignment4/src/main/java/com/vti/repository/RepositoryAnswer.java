package com.vti.repository;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.query.Query;

import com.vti.Entity.Answer;
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
public class RepositoryAnswer {
	private HibernateUtils hibernateUtils;

	public RepositoryAnswer() {
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
	public List<Answer> getAllAnswer() {

		Session session = null;

		try {

			// get session
			session = hibernateUtils.openSession();

			// create hql query
			Query<Answer> query = session.createQuery("FROM `Answer`");

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
	public Answer getAnswerByID(short id) {

		Session session = null;

		try {

			// get session
			session = hibernateUtils.openSession();

			// get department by id
			Answer Answer = session.get(Answer.class, id);

			return Answer;

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
	public Answer getAnswerByName(String Content) {

		Session session = null;

		try {

			// get session
			session = hibernateUtils.openSession();

			// create hql query
			Query<Answer> query = session.createQuery("FROM `Account` WHERE name = :nameParameter");

			// set parameter
			query.setParameter("nameParameter", Content);

			// get result
			Answer answer = query.uniqueResult();

			return answer;

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
	public void createAnswer(Answer Answer) {

		Session session = null;

		try {

			// get session
			session = hibernateUtils.openSession();
			session.beginTransaction();

			// create
			session.save(Answer);

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
	public void updateAnswer(short id, String newName) {

		Session session = null;

		try {

			// get session
			session = hibernateUtils.openSession();
			session.beginTransaction();

			// get department
			Answer Answer = (Answer) session.load(Answer.class, id);

			// update
			Answer.setContent(newName);

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
	public void updateAnswer(Answer Answer) {

		Session session = null;

		try {

			// get session
			session = hibernateUtils.openSession();
			session.beginTransaction();

			// update
			session.update(Answer);

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
	public void deleteAnswer(short id) {

		Session session = null;

		try {

			// get session
			session = hibernateUtils.openSession();
			session.beginTransaction();

			// get department
			Answer Answer = (Answer) session.load(Answer.class, id);

			// delete
			session.delete(Answer);

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
	public boolean isAnswerExistsByID(short id) {
		
		Answer Answer = getAnswerByID(id);
	
		if (Answer == null) {
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
	public boolean isAnswerExistsByName(String name) {
		Answer Answer = getAnswerByName(name);

		if (Answer == null) {
			return false;
		}
		return true;
	}
}
