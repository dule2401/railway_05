package com.vti;


import com.vti.Entity.Group;
import com.vti.repository.RepositoryGroup;

public class program {
	public static void main(String[] args) {
		RepositoryGroup testGroups = new RepositoryGroup();

//		System.out.println("***********GET ALL Groups***********");
//
//		List<Group> groups = testGroups.getAllGroups();
//
//		for (Group group : groups) {
//			System.out.println(group);
//		}
//
//		System.out.println("\n\n***********GET Groups BY ID***********");
//
//		Group GroupsById = testGroups.getGroupsbyid((short) 2);
//		System.out.println(GroupsById);

//		System.out.println("\n\n***********GET Groups BY NAME***********");

		Group GroupsByname = testGroups.getGroupsbyname("Marketting");
		System.out.println(GroupsByname);

//		System.out.println("\n\n***********CREATE Groups***********");
//
//		Group groupcreat = new Group();
//		groupcreat.setName("waiting");
//		testGroups.creatGroups(groupcreat);
//
//		System.out.println("\n\n***********UPDATE Groups 1***********");
//
//		testGroups.updateGroup((short) 3, "Security");
//
//		System.out.println("\n\n***********DELETE Groups***********");
//		testGroups.deleteGroup((short) 2);
//
//		System.out.println("***********CHECK Groups EXISTS BY ID***********");
//		System.out.println(testGroups.isGroupsExistsByID((short) 1));
//
//		System.out.println("***********CHECK Groups EXISTS BY NAME***********");
//		System.out.println(testGroups.isDepartmentExistsByName("Security"));

	}
	
	
}
