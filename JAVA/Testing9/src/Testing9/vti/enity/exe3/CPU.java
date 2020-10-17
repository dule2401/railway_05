package Testing9.vti.enity.exe3;

public class CPU {
private String price;
public Processor processor;
public Ram ram;

public CPU(String price) {
	this.price = price;
}


public String getPrice() {
	return price;
}

public void setPrice(String price) {
	this.price = price;
}
	public class Processor {
		private int coreAmount;
		private String menufacturer;
		public Processor(int coreAmount, String menufacturer) {
			this.coreAmount = coreAmount;
			this.menufacturer = menufacturer;
		}
		public int getCoreAmount() {
			return coreAmount;
		}
		public void setCoreAmount(int coreAmount) {
			this.coreAmount = coreAmount;
		}
		public String getMenufacturer() {
			return menufacturer;
		}
		public void setMenufacturer(String menufacturer) {
			this.menufacturer = menufacturer;
		}
		public double getCache() {
			return 4.3;
		}
		
		
	}
	public class Ram {
		private int memory;
		private String menufacturer;
		
		public Ram(int memory, String menufacturer) {
			this.memory = memory;
			this.menufacturer = menufacturer;
		}
		public int getMemory() {
			return memory;
		}
		public void setMemory(int memory) {
			this.memory = memory;
		}
		public String getMenufacturer() {
			return menufacturer;
		}
		public void setMenufacturer(String menufacturer) {
			this.menufacturer = menufacturer;
		}
		
		public double getClockSpeed() {
			return 5.5;
			
		}
	}
}
