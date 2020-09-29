package TestingSystem_Assignment_2;

import java.time.LocalDate;

public class Exercise1 {
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
		
		// position data
		Position  DEVPosition = new Position();
		DEVPosition.positionID = 1;
		DEVPosition.positionName = "DEV";
		
		Position TESTPosition = new Position();
		TESTPosition.positionID = 2;
		TESTPosition.positionName = "TEST";
		
		Position SCRUM_MASTERPosition = new Position();
		SCRUM_MASTERPosition.positionID = 3;
		SCRUM_MASTERPosition.positionName = "SCRUM_MASTER";
		
		Position PMPosition = new Position();
		PMPosition.positionID = 4 ;
		PMPosition.positionName = "PM";
		
		// Account
		Account du = new Account();
		du.accountID = 1;
		du.email = "alka.asura@gmail.com";
		du.username = "ngocdu";
		du.fullName = "le ngoc du";
		du.department  = devDapertment;
		du.positions = DEVPosition;
		du.createDate = LocalDate.of(2020, 8, 31);

		Account anh = new Account();
		anh.accountID = 2;
		anh.email = "account1@gmail.com";
		anh.username = "caoanh";
		anh.fullName = "cao thi anh";
		anh.department = devDapertment;
		anh.positions = DEVPosition;
		anh.createDate = LocalDate.of(2020, 9, 1);
		
		Account thuong =new Account();
		thuong.accountID = 2;
		thuong.email = "account2@gmail.com";
		thuong.username = "huyenthuong";
		thuong.fullName = "truong huyen thuong";
		thuong.department = saleDapertment;
		thuong.positions = PMPosition;
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
		Account[] Accountsall = {du,thuong,anh};
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
			
		// Question 1:
		if(du.department == null) {
			 System.out.println("Nhân viên này chưa có phòng ban");
		 }
			 else {
				 System.out.println("Phòng ban của nhân viên này là "+ du.department.departmentName);
		 }
		 // Question 2: 
		if(du.groups == null) {
			 System.out.println("Nhân viên này chưa có group");
		} else if(du.groups.length == 1 )
			if(du.groups == null) {
				 System.out.println("group cuả nhân viên là ");
				for (GroupAccount groupn : du.groups) {
					System.out.println(groupn.group.groupName);
				}
			
			}
		// Question 3:
		System.out.println(du.department == null ? "Nhân viên này chưa có phòng ban" : "Phòng ban của nhân viên này là "+ du.department.departmentName);

		
		//      Question 4:Question 4:
//		Sử dụng toán tử ternary để làm yêu cầu sau:
//			Kiểm tra Position của account thứ 1
//			Nếu Position = Dev thì in ra text "Đây là Developer"
//			Nếu không phải thì in ra text "Người này không phải là Developer"
		System.out.println(du.positions == DEVPosition ? "nhân viên này là devloper" : "Người này không phải là Developer");	
						
		// Question 5:
		switch (group1.Accounts.length) {
		case 1:
			System.out.println("Nhóm có một thành viên");
			break;
		case 2:
			System.out.println( "Nhóm có hai thành viên");
			break;
		case 3:
			System.out.println("Nhóm có ba thành viên");
			break;

		default:
			System.out.println( "Nhóm có nhiều thành viên");
			break;
		}
		
		// Question 6:
		// Sử dụng switch case để làm lại Question 2
		switch (du.groups.length) {
		case 0:
			System.out.println("Nhân viên này chưa có group");
			break;
		case 1:
			System.out.println("Nhân viên này có 1 group");
			break;
		case 2:
			System.out.println("Nhân viên này có 2 group");
			break;
		default:
			System.out.println("Nhân viên này có nhiều group");	
			break;
		}
		// Question 7:
		// Sử dụng switch case để làm lại Question 4
		switch (du.positions.positionName) {
		case "DEV":
			System.out.println("nhân viên này là devloper");
			break;
		default:
			System.out.println("Người này không phải là Developer");
			break;
		}
		// Question 8:
//		In ra thông tin các account bao gồm: Email, FullName và tên phòng ban của
//		họ
		for (Account Account : Accountsall) {
			System.out.println("email: " +Account.email);
			System.out.println("fullname: "+Account.fullName);
			System.out.println("department: "+Account.department.departmentName);
		}
		// Question 9:
		// In ra thông tin các phòng ban bao gồm: id và name
		Department[] departmentall = {saleDapertment,marketingDapertment,devDapertment};
		for (Department Departmentn : departmentall ) {
			System.out.println("id phòng ban của họ là: "+Departmentn.departmentID);
			System.out.println("tên phòng ban của họ là: "+Departmentn.departmentName);
		}

		// Question 10:
		for (int i = 0; i < Accountsall.length; i++) {
			System.out.println("thông tin account thứ " +i+1+"là: ");
			System.out.println("email là: "+ Accountsall[i].email);
			System.out.println("fullname là: "+ Accountsall[i].fullName);
			System.out.println("phòng ban của họ là: "+Accountsall[i].department);
		}
		// Question 11:
		// In ra thông tin các phòng ban bao gồm: id và name
		for (int i = 0; i < departmentall.length; i++) {
			System.out.println("thông tin phòng ban thứ " +i+1+"là: ");
			System.out.println(" id phòng ban của họ là: "+departmentall[i].departmentID);
			System.out.println("tên phòng ban của họ là: "+departmentall[i].departmentName);
		}
		// Question 12:
		// Chỉ in ra thông tin 2 department đầu tiên theo định dạng như Question 10
		for (int i = 0; i < 2; i++) {
			System.out.println("thông tin phòng ban thứ " +i+1+"là: ");
			System.out.println(" id phòng ban của họ là: "+departmentall[i].departmentID);
			System.out.println("tên phòng ban của họ là: "+departmentall[i].departmentName);
			
		}
		// Question 13:
		// In ra thông tin tất cả các account ngoại trừ account thứ 2
		for (int i = 0; i < Accountsall.length; i++) {
			if(i != 1) {
			System.out.println("thông tin account thứ " +i+1+"là: ");
			System.out.println("email là: "+ Accountsall[i].email);
			System.out.println("fullname là: "+ Accountsall[i].fullName);
			System.out.println("phòng ban của họ là: "+Accountsall[i].department);
			}
		}
		// Question 14:
		// In ra thông tin tất cả các account có id < 4
		for (int i = 0; i < Accountsall.length; i++) {
			if(Accountsall[i].accountID <4) {
				System.out.println("thông tin account thứ " +i+1+"là: ");
				System.out.println("email là: "+ Accountsall[i].email);
				System.out.println("fullname là: "+ Accountsall[i].fullName);
				System.out.println("phòng ban của họ là: "+Accountsall[i].department);
			}
		}
		// do -- while đọc thêm có phỏng vấn 
		// Question 15:
		for (int j = 0; j < 20; j++) {
			if (j == 10) {
				continue;
			} else if (j % 2 == 0) {
				System.out.println(j);
			}
		}
		// Question 16:
		//Làm lại các Question ở phần FOR bằng cách sử dụng WHILE kết hợp với
		//lệnh break, continue
		// 10
		int i = 0;
		while (i < Accountsall.length) {
			System.out.println("thông tin account thứ " +i+1+"là: ");
			System.out.println("email là: "+ Accountsall[i].email);
			System.out.println("fullname là: "+ Accountsall[i].fullName);
			System.out.println("phòng ban của họ là: "+Accountsall[i].department);
			i++;
		}
		//11
		i = 0;
		while (i < Accountsall.length) {
			System.out.println("thông tin phòng ban thứ " +i+1+"là: ");
			System.out.println(" id phòng ban của họ là: "+departmentall[i].departmentID);
			System.out.println("tên phòng ban của họ là: "+departmentall[i].departmentName);
			i++;
		}

		//12.
		i = 0;
		while (i < 2) {
			System.out.println("thông tin phòng ban thứ " +i+1+"là: ");
			System.out.println(" id phòng ban của họ là: "+departmentall[i].departmentID);
			System.out.println("tên phòng ban của họ là: "+departmentall[i].departmentName);
			
			i++;
		}

		//13.
		i = 0;
		while (i < departmentall.length) {

			if (i == 1) {
				i++;
				continue;
			}
			System.out.println("thông tin account thứ " +i+1+"là: ");
			System.out.println("email là: "+ Accountsall[i].email);
			System.out.println("fullname là: "+ Accountsall[i].fullName);
			System.out.println("phòng ban của họ là: "+Accountsall[i].department);
			}

		// 14.
		i = 0;
		while (i < Accountsall.length) {
			if (Accountsall[i].accountID >= 4) {
				i++;
				continue;
			}
			System.out.println("thông tin account thứ " +i+1+"là: ");
			System.out.println("email là: "+ Accountsall[i].email);
			System.out.println("fullname là: "+ Accountsall[i].fullName);
			System.out.println("phòng ban của họ là: "+Accountsall[i].department);
			i++;
		}

		// 15.
		i = 2;
		while (i <= 20) {
			System.out.println(i);
			i = i + 2;
		}
		// Question 17:
//		Làm lại các Question ở phần FOR bằng cách sử dụng DO-WHILE kết hợp với
//		lệnh break, continue
		//10
		i= 0;
		do {
			System.out.println("thông tin account thứ " +i+1+"là: ");
			System.out.println("email là: "+ Accountsall[i].email);
			System.out.println("fullname là: "+ Accountsall[i].fullName);
			System.out.println("phòng ban của họ là: "+Accountsall[i].department);
			i++;
		}
		while(i < Accountsall.length);
		
		//11
		i=0;
		do {
			System.out.println("thông tin phòng ban thứ " +i+1+"là: ");
			System.out.println(" id phòng ban của họ là: "+departmentall[i].departmentID);
			System.out.println("tên phòng ban của họ là: "+departmentall[i].departmentName);
			i++;
		} while (i < Accountsall.length);

		//12
		i=0;
		do {
			System.out.println("thông tin phòng ban thứ " +i+1+"là: ");
			System.out.println(" id phòng ban của họ là: "+departmentall[i].departmentID);
			System.out.println("tên phòng ban của họ là: "+departmentall[i].departmentName);
			
			i++;
		} while (i < 2);
		
		//13
		i=0;
		do {
			System.out.println("thông tin account thứ " +i+1+"là: ");
			System.out.println("email là: "+ Accountsall[i].email);
			System.out.println("fullname là: "+ Accountsall[i].fullName);
			System.out.println("phòng ban của họ là: "+Accountsall[i].department);
			i++;
		} while (i < departmentall.length);
		if (i!=1);
		//14
		i=0;
		do {
			System.out.println("thông tin account thứ " +i+1+"là: ");
			System.out.println("email là: "+ Accountsall[i].email);
			System.out.println("fullname là: "+ Accountsall[i].fullName);
			System.out.println("phòng ban của họ là: "+Accountsall[i].department);
			i++;
		} while (i < Accountsall.length);
		if(Accountsall[i].accountID <4);
		// 15
		i=0;
		do {
			System.out.println(i);
		} while (i <= 20);
		if(i % 2 ==0);
		

		
	}
}

	
	
	
	
