package Testing5.vti.entity.exe1.question1;

import java.util.Scanner;

public class News implements INews{
private int id;
private String title;
private String publishDate;
private String author;
private String content;
private float averagerate;
private int[]  rates;
public News() {
	Scanner scanner = new Scanner(System.in);
	System.out.println("Nhập title");
	title = scanner.nextLine();
	System.out.println("Nhập publishDate");
	publishDate = scanner.nextLine();
	System.out.println("Nhập author");
	author = scanner.nextLine();
	System.out.println("Nhập content");
	content = scanner.nextLine();
}

public News(int id, String title, String publishDate, String author, String content, float averagerate) {
	super();
	this.id = id;
	this.title = title;
	this.publishDate = publishDate;
	this.author = author;
	this.content = content;
	this.averagerate = averagerate;
	
}


public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getTitle() {
	return title;
}
public void setTitle(String title) {
	this.title = title;
}
public String getPublishDate() {
	return publishDate;
}
public void setPublishDate(String publishDate) {
	this.publishDate = publishDate;
}
public String getAuthor() {
	return author;
}
public void setAuthor(String author) {
	this.author = author;
}
public String getContent() {
	return content;
}
public void setContent(String content) {
	this.content = content;
}
public float getAveragerate() {
	return averagerate;
}
public void Display() {
	System.out.println(title);
	System.out.println(publishDate);
	System.out.println(author);
	System.out.println(content);
	System.out.println(averagerate + "là console");
	
}
public float Calculate() {
	averagerate =  (float)(rates[0]+rates[1]+rates[2]) / 3;
	return averagerate;
}

public String toString() {
	return "News [id=" + id + ", title=" + title + ", publishDate=" + publishDate + ", author=" + author + ", content="
			+ content + ", averagerate=" + averagerate + "]";
}

}
