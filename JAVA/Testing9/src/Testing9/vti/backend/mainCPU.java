package Testing9.vti.backend;

import Testing9.vti.enity.exe3.CPU;

public class mainCPU {
@SuppressWarnings("unused")
public static void main(String[] args) {
	CPU cpu = new CPU("abcxyz");
	CPU.Processor  processor = cpu.new Processor(1, "abc");
	System.out.println(processor.getCache());
	CPU.Ram ram = cpu.new Ram(1, "bcd");
	System.out.println(ram.getClockSpeed());
}
}