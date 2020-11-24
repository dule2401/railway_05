package com.vti.controller;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.query.Query;

import com.vti.entity.Account;
import com.vti.utils.HibernateUtils;

/**
 * This class is . 
 * 
 * @Description: .
 * @author: LNDu
 * @create_date: Nov 23, 2020
 * @version: 1.0
 * @modifer: LNDu
 * @modifer_date: Nov 23, 2020
 */
public class AccountController {
	private HibernateUtils hibernateUtils;
	
	public AccountController() {
		hibernateUtils = HibernateUtils.getInstance();
	}
	/**
	 * This method is . 
	 * 
	 * @Description: .
	 * @author: LNDu
	 * @create_date: Nov 23, 2020
	 * @version: 1.0
	 * @modifer: LNDu
	 * @modifer_date: Nov 23, 2020
	 * @return
	 */
	@SuppressWarnings("unchecked")
	public List<Account> getAllAccounts() {
		Session session = null;
		try {
			session = hibernateUtils.openSession();
			Query<Account> query = session.createQuery("FROM `Account`");
			return query.list();

		} finally {
			if (session != null) {
				session.close();
			}
		}
	}
	
}
