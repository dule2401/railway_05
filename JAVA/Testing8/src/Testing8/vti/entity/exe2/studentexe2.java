package Testing8.vti.entity.exe2;

import java.time.LocalDate;

public class studentexe2 {
private int id ;
private String name ;
private LocalDate birtday;
private int poin;

public studentexe2(int id, String name, LocalDate birtday, int poin) {
	super();
	this.id = id;
	this.name = name;
	this.birtday = birtday;
	this.poin = poin;
}

public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public LocalDate getBirtday() {
	return birtday;
}

public void setBirtday(LocalDate birtday) {
	this.birtday = birtday;
}

public int getPoin() {
	return poin;
}

public void setPoin(int poin) {
	this.poin = poin;
}

@Override
public String toString() {
	return "studentexe2 [id=" + id + ", name=" + name + ", birtday=" + birtday + ", poin=" + poin + ", getId()="
			+ getId() + ", getName()=" + getName() + ", getBirtday()=" + getBirtday() + ", getPoin()=" + getPoin()
			+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
}


}
