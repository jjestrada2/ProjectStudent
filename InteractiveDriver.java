package ProjectStudent;


import java.util.Scanner;

public class InteractiveDriver {
	static Scanner scnr =new Scanner(System.in);
	public static void main(String[] args) {
		
		Course cis255 = new Course("CIS255",2,1);
		boolean quitProgram=false;
		
		System.out.println("Welcome For The Course Registration System For the Following course ");
		
		while(!quitProgram) {
		int answer ;
		System.out.println("What action would you like to take?"
				+ "]\n1 to add student"
				+"\n2 to drop a student"
				+"\n3 to print the course"
				+"\n4 to exit");
		answer=Integer.parseInt(scnr.nextLine());
		switch(answer) {
			case 1 :
				addStudent(cis255);
				break;
			case 2:
				dropStudent(cis255);
				break;
			case 3:
				printCourse(cis255);
				break;
			case 4 :
				System.out.println("Goodbye!");
				quitProgram=true;
				break;
			default :
				System.out.println("Invalid Answer");
		}
		
		}
		
	}
	
	
	
	public static void printCourse(Course Course) {
		System.out.println(
				Course.getName()+
				"\n"+Course.getNumEnrolled()+" Enrroled (maximum allowed "+Course.getMaxEnrolled()+")"+
				"\n"+Course.getNumWaitlist()+" on waitlist (maximum allowed " + Course.getMaxWaitlist()+")" );
	}
	public static void addStudent(Course course) {
		String name;
		String id;
		boolean isPaidTution;
		boolean isStudentAdd;
		System.out.println("Enter the student name:");
		name= scnr.nextLine();
		System.out.println("Enter the ID name:");
		id= scnr.nextLine();
		System.out.println("Has the Student paid the tuition ? Enter y or n");
		String answ = scnr.nextLine();
		if(answ.equalsIgnoreCase("y")||answ.equalsIgnoreCase("n")) {
			isPaidTution= answ.equalsIgnoreCase("y") ? true :	false;	
			Student std =new Student(name,id,isPaidTution);
			isStudentAdd=course.addStudent(std);
			if(isStudentAdd) {
				System.out.println(std.toString()+" added succesfully to either roster or waitlist");
			}else {
				System.out.println(std.toString()+" not added");
			}
		}else {
			System.out.println("Invalid Answer");
		}
		
	}
	
	public static void dropStudent(Course course) {
		String name;
		String id;
		boolean isPaidTution;
		boolean isStudentDrop;
		System.out.println("Enter the student name:");
		name= scnr.nextLine();
		System.out.println("Enter the ID name:");
		id= scnr.nextLine();
		System.out.println("Has the Student paid the tuition ? Enter y or n");
		String answ = scnr.nextLine();
		if(answ.equalsIgnoreCase("y")||answ.equalsIgnoreCase("n")) {
			isPaidTution= answ.equalsIgnoreCase("y") ? true :	false;	
			Student std =new Student(name,id,isPaidTution);
			isStudentDrop=course.dropStudent(std);
			if(isStudentDrop) {
				System.out.println(std.toString()+" dropped succesfully to either roster or waitlist");
			}else {
				System.out.println(std.toString()+" not dropped");
			}
		}else {
			System.out.println("Invalid Answer");
		}
	}
}
