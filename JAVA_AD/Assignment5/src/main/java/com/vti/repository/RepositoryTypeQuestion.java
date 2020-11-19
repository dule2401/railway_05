package com.vti.repository;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.query.Query;
import com.vti.Entity.TypeQuestion;
import com.vti.Entity.TypeQuestiontype;
import com.vti.utils.HibernateUtils;

public class RepositoryTypeQuestion {
	private HibernateUtils hibernateUtils;

	public RepositoryTypeQuestion() {
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
	public List<TypeQuestion> getAllTypeQuestion() {

		Session session = null;

		try {

			// get session
			session = hibernateUtils.openSession();

			// create hql query
			Query<TypeQuestion> query = session.createQuery("FROM `TypeQuestion`");

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
	public TypeQuestion getTypeQuestionByID(short id) {

		Session session = null;

		try {

			// get session
			session = hibernateUtils.openSession();

			// get department by id
			TypeQuestion TypeQuestion = session.get(TypeQuestion.class, id);

			return TypeQuestion;

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
	public TypeQuestion getTypeQuestionByName(String Content) {

		Session session = null;

		try {

			// get session
			session = hibernateUtils.openSession();

			// create hql query
			Query<TypeQuestion> query = session.createQuery("FROM `TypeQuestion` WHERE name = :nameParameter");

			// set parameter
			query.setParameter("nameParameter", Content);

			// get result
			TypeQuestion TypeQuestion = query.uniqueResult();

			return TypeQuestion;

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
	public void createTypeQuestion(TypeQuestion TypeQuestion) {

		Session session = null;

		try {

			// get session
			session = hibernateUtils.openSession();
			session.beginTransaction();

			// create
			session.save(TypeQuestion);

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
	public void updateTypeQuestion(short id, TypeQuestiontype newName) {

		Session session = null;

		try {

			// get session
			session = hibernateUtils.openSession();
			session.beginTransaction();

			// get department
			TypeQuestion TypeQuestion = (TypeQuestion) session.load(TypeQuestion.class, id);

			// update
			TypeQuestion.setTypeName(newName);

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
	public void updateTypeQuestion(TypeQuestion TypeQuestion) {

		Session session = null;

		try {

			// get session
			session = hibernateUtils.openSession();
			session.beginTransaction();

			// update
			session.update(TypeQuestion);

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
	public void deleteTypeQuestion(short id) {

		Session session = null;

		try {

			// get session
			session = hibernateUtils.openSession();
			session.beginTransaction();

			// get department
			TypeQuestion TypeQuestion = (TypeQuestion) session.load(TypeQuestion.class, id);

			// delete
			session.delete(TypeQuestion);

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
	public boolean isTypeQuestionExistsByID(short id) {
		
		TypeQuestion TypeQuestion = getTypeQuestionByID(id);
	
		if (TypeQuestion == null) {
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
	public boolean isTypeQuestionExistsByName(String name) {
		TypeQuestion TypeQuestion = getTypeQuestionByName(name);

		if (TypeQuestion == null) {
			return false;
		}
		return true;
	}
}
