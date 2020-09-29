package TestingSystem_Assignment_2;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;
import java.util.Locale;

public class Exercise3 {
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
	thuong.accountID = 3;
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

	// Create CategoryQuestion
	CategoryQuestion category1 = new CategoryQuestion();
	category1.CategoryID = 1;
	category1.CategoryName = "JAVA";

	CategoryQuestion category2 = new CategoryQuestion();
	category2.CategoryID = 2;
	category2.CategoryName = "SQL";

	CategoryQuestion category3 = new CategoryQuestion();
	category3.CategoryID = 3;
	category3.CategoryName = "PHP";

	// Create TypeQuestion
	TypeQuestion type1 = new TypeQuestion();
	type1.TypeID = 1;
	type1.TypeName = "Essay";

	TypeQuestion type2 = new TypeQuestion();
	type2.TypeID = 2;
	type2.TypeName = "Multi-choice";

	// Create Question
	Question question1 = new Question();
	question1.Categorys = category1;
	question1.Content = "Java để làm gì";
	question1.CreateDate =LocalDate.of(2020, 9, 1);
	question1.CreatorID = du;
	question1.QuestionID = 1;
	question1.Type = type1;

	Question question2 = new Question();
	question2.Categorys = category1;
	question2.Content = "java sử dụng như thế nào";
	question2.CreateDate = LocalDate.of(2020, 9, 1);
	question2.CreatorID = du;
	question2.QuestionID = 2;
	question2.Type = type2;

	Question question3 = new Question();
	question3.Categorys = category1;
	question3.Content = "công dụng của ngôn ngữ lập trình";
	question3.CreateDate = LocalDate.of(2020, 9, 1);
	question3.CreatorID = anh;
	question3.QuestionID = 3;
	question3.Type = type1;

	// Create exam
	Exam exam1 = new Exam();
	exam1.code = "de1";
	exam1.createDate = LocalDate.of(2020, 9, 1);
	exam1.creatorID = du;
	exam1.duration = "60";
	exam1.ExamID = 1;
	exam1.title = " Java lập trình";

	Exam exam2 = new Exam();
	exam2.code = "de2";
	exam2.createDate = LocalDate.of(2020, 9, 1);
	exam2.creatorID = anh;
	exam2.duration = "45";
	exam2.ExamID = 2;
	exam2.title = "ngôn ngữ lập trình ";

	// add question to exam
	Question[] questionExam1 = { question1, question2 };
	exam1.questions = questionExam1;

	Question[] questionExam2 = { question3 };
	exam1.questions = questionExam2;

	// Create Answer
	Answer answer1 = new Answer();
	answer1.answerID = 1;
	answer1.content = "java dùng để lập trình";
	answer1.isCorrect = true;
	answer1.question = question1;

	Answer answer2 = new Answer();
	answer2.answerID = 2;
	answer2.content = "ngôn ngữ lập để giúp lập trình nhanh hơn";
	answer2.isCorrect = false;
	answer2.question = question1;
	
//	Question 1:
//	In ra thông tin Exam thứ 1 và property create date sẽ được format theo định
//	dạng vietnamese
	ZoneId defaultZoneId = ZoneId.systemDefault();
	Date dateObject = Date.from(exam1.createDate.atStartOfDay(defaultZoneId).toInstant());

	Locale locale = new Locale("vi", "VN");
	DateFormat dateFormat = DateFormat.getDateInstance(DateFormat.DEFAULT, locale);
	String dateString = dateFormat.format(dateObject);
	System.out.println(exam1.code  );
	System.out.println(exam1.duration );
	System.out.println(exam1.title  );
	System.out.println(dateString);

// 	Question 2:
//	In ra thông tin: Exam đã tạo ngày nào theo định dạng
//	Năm – tháng – ngày – giờ – phút – giây
	Date date = new Date();
	String DATE_FORMAT  = "yyyy/MM/dd hh:mm:ss";
	SimpleDateFormat simpleDateFormat = new SimpleDateFormat(DATE_FORMAT );
	Exam[] examall = {exam1,exam2};
	for (int i = 0; i < examall.length; i++) {
		System.out.println(examall[i].code );
		System.out.println(examall[i].duration);
		System.out.println(examall[i].title );
		System.out.println(simpleDateFormat.format(date));
	}
// 	Question 3:
//	Chỉ in ra năm của create date property trong Question 2
	date = new Date();
	DATE_FORMAT  = "yyyy";
	simpleDateFormat = new SimpleDateFormat(DATE_FORMAT );
	for (int i = 0; i < examall.length; i++) {
		System.out.println(examall[i].code );
		System.out.println(examall[i].duration );
		System.out.println(examall[i].title );
		System.out.println(simpleDateFormat.format(date));
	}

	
// Question 4:
//	Chỉ in ra tháng và năm của create date property trong Question 2
	date = new Date();
	DATE_FORMAT  = "MM/yyyy";
	simpleDateFormat = new SimpleDateFormat(DATE_FORMAT );
	for (int i = 0; i < examall.length; i++) {
		System.out.println(examall[i].code);
		System.out.println(examall[i].duration);
		System.out.println(examall[i].title);
		System.out.println(simpleDateFormat.format(date));
	}

// Question 5:
//	Chỉ in ra "MM-DD" của create date trong Question 2
	
	date = new Date();
	DATE_FORMAT  = "MM/dd";
	simpleDateFormat = new SimpleDateFormat(DATE_FORMAT );
	for (int i = 0; i < examall.length; i++) {
		System.out.println(examall[i].code);
		System.out.println(examall[i].duration);
		System.out.println(examall[i].title);
		System.out.println(simpleDateFormat.format(date));
	}
	
	//  exercire2 question 6
		System.out.printf("%s, %30s, %30s \n " , "email","fullname","accountID");
		System.out.printf("%s, %15s, %20s \n",  du.email, du.fullName,du.accountID);
		System.out.printf("%s, %15s, %20s \n",  thuong.email, thuong.fullName,thuong.accountID);
		System.out.printf("%s, %15s, %25s \n",  anh.email, anh.fullName,anh.accountID);
	
	

	
	
	
	
	
	
	
	
	
	
	
	
	
}
}
