package com.vti.enity;

/**
 * This class is . 
 * 
 * @Description: .
 * @author: LNDu
 * @create_date: Oct 25, 2020
 * @version: 1.0
 * @modifer: LNDu
 * @modifer_date: Oct 25, 2020
 */
public class Project {
	private int projectId;
	private int teamSize;
	private int idManager;
	private int idEmployees;

	/**
	 * Constructor for class Admin.
	 * 
	 * @Description: .
	 * @author: LNDu
	 * @create_date: Oct 25, 2020
	 * @version: 1.0
	 * @modifer: LNDu
	 * @modifer_date: Oct 25, 2020
	 * @param projectId
	 * @param teamSize
	 * @param idManager
	 * @param idEmployees
	 */
	public Project(int projectId, int teamSize, int idManager, int idEmployees) {
		super();
		this.projectId = projectId;
		this.teamSize = teamSize;
		this.idManager = idManager;
		this.idEmployees = idEmployees;
	}

	/**
	 * @return the projectId
	 */
	public int getProjectId() {
		return projectId;
	}

	/**
	 * @param projectId the projectId to set
	 */
	public void setProjectId(int projectId) {
		this.projectId = projectId;
	}

	/**
	 * @return the teamSize
	 */
	public int getTeamSize() {
		return teamSize;
	}

	/**
	 * @param teamSize the teamSize to set
	 */
	public void setTeamSize(int teamSize) {
		this.teamSize = teamSize;
	}

	/**
	 * @return the idManager
	 */
	public int getIdManager() {
		return idManager;
	}

	/**
	 * @param idManager the idManager to set
	 */
	public void setIdManager(int idManager) {
		this.idManager = idManager;
	}

	/**
	 * @return the idEmployees
	 */
	public int getIdEmployees() {
		return idEmployees;
	}

	/**
	 * @param idEmployees the idEmployees to set
	 */
	public void setIdEmployees(int idEmployees) {
		this.idEmployees = idEmployees;
	}

	/*
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Admin [projectId=" + projectId + ", teamSize=" + teamSize + ", idManager=" + idManager
				+ ", idEmployees=" + idEmployees + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}

}
