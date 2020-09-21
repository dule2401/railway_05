package TestingSystem_Assignment_1;

import java.time.LocalDate;

public class program {
public static void main(String[] args) {
	Department saleDapertment = new Department();
	saleDapertment.departmentID = 1;
	saleDapertment.departmentName = "Sale";
	
	Department marketingDapertment = new Department();
	marketingDapertment.departmentID = 2;
	marketingDapertment.departmentName = "marketing";
	
	Department devDapertment = new Department();
	devDapertment.departmentID = 3;
	devDapertment.departmentName = "dev";
	
	// Account
	Account du = new Account();
	du.accountID = 1;
	du.email = "alka.asura@gmail.com";
	du.username = "ngocdu";
	du.fullName = "le ngoc du";
	du.createDate = LocalDate.of(2020, 8, 31);

	Account anh = new Account();
	anh.accountID = 2;
	anh.email = "account1@gmail.com";
	anh.username = "caoanh";
	anh.fullName = "cao thi anh";
	anh.department = saleDapertment;
	anh.createDate = LocalDate.of(2020, 9, 1);
	
	Account thuong =new Account();
	thuong.accountID = 2;
	thuong.email = "account2@gmail.com";
	thuong.username = "huyenthuong";
	thuong.fullName = "truong huyen thuong";
	thuong.department = devDapertment;
	thuong.createDate = LocalDate.of(2020, 9,2);
	
	// group 
	Group group1 = new Group();
	group1.groupID =1;
	group1.groupName = "group1";
	group1.creatorID = thuong;
	group1.createDate = LocalDate.of(2020, 9, 5);
	
	Group group2 = new Group();
	group2.groupID =2;
	group2.groupName = "group2";
	group2.creatorID = anh;
	group2.createDate = LocalDate.of(2020, 9, 5);
	
	Group group3 = new Group();
	group3.groupID =3;
	group3.groupName = "group3";
	group3.creatorID = anh;
	group3.createDate = LocalDate.of(2020, 9, 5);
	
	// account to department
	Account[] Accounts1 = {du ,anh};
	devDapertment.Accounts = Accounts1;
	Account[] Accounts2 = {thuong ,anh};
	marketingDapertment.Accounts = Accounts2;
	
	// account to group
	GroupAccount groupaccount1 = new GroupAccount();
	groupaccount1.group = group1;
	groupaccount1.account = du;
	groupaccount1.joinDate = LocalDate.of(2020, 9, 5);
	
	GroupAccount groupaccount2 = new GroupAccount();
	groupaccount2.group = group2;
	groupaccount2.account = du;
	groupaccount1.joinDate = LocalDate.of(2020, 9, 5);
	
	GroupAccount[] groupaccount3 = {groupaccount1,groupaccount2};
	du.groups = groupaccount3;
	
	// print 
	System.out.println("thong tin phong ban sale la: ");
	System.out.println("id: " + saleDapertment.departmentID);
	System.out.println("name: "+ saleDapertment.departmentName);
	// print account 
	System.out.println("Thong tin account la : ");
	System.out.println("email: " 	+ du.email);
	System.out.println("Create Date: " 	+ du.createDate);
	System.out.println("Department id: " 	+ du.department.departmentID);
	System.out.println("Department name: " 	+ du.department.departmentName);
	
	System.out.println("Thong tin group1 la : ");
	System.out.println("Id: " 			+ group1.groupID);
	System.out.println("name: " 		+ group1.groupName);
	
	// print 
	 System.out.println("thong tin group1 là:  ");
	 System.out.println("id: "+ group1.groupID);
	 System.out.println("name: "+ group1.groupName);
	 for (GroupAccount groupaccount : group1.Accounts)
	 {
		 System.out.println(groupaccount.account.email);
		 System.out.println(groupaccount.joinDate);
	 }
	
	}
}
