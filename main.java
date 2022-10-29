package ProjectStudent;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Student aa = new Student("Adam Ant", "S925", true);
		Student bb = new Student("Bob Barker", "S713", false);
		Student cc = new Student("Chevy Chase", "S512", true);
		Student dd = new Student("Doris Day", "S513", true);
		Student ee = new Student("Emilio Estevez", "S516", true);
		Student ff = new Student("Farrah Fawcet", "S956", true);
		Student gg = new Student("Greta Garbo", "S419", true);
		Student hh = new Student("Helen Hunt", "S281", true);
		Student jj = new Student("Jack Johnson", "S790", true);
		Student kk = new Student("Kim Kardashian", "S336", true);
		Student mm = new Student("Martina McBride", "S156", true);
		Student rr = new Student("Renne Russo", "S219", true);
		Student ss = new Student("Susan Serandon", "S472", true);
		Student vv = new Student("Vince Vaughn", "S892", true);
		Student ww = new Student("Walt Whitman", "S901", true);
		
		Course addTesterCourse = new Course("Media Studies", 5, 5);
		
		addTesterCourse.addStudent(aa);
		addTesterCourse.addStudent(bb);
		addTesterCourse.addStudent(cc);
		addTesterCourse.addStudent(dd);
		addTesterCourse.addStudent(ee);
		addTesterCourse.addStudent(ff);
		addTesterCourse.addStudent(gg);
		addTesterCourse.addStudent(hh);
		addTesterCourse.addStudent(jj);
		addTesterCourse.addStudent(kk);
		addTesterCourse.addStudent(mm);
		addTesterCourse.addStudent(rr);
		addTesterCourse.contains(addTesterCourse.getRosterList(), ww);
		System.out.println(addTesterCourse.toString());
		addTesterCourse.dropStudent(cc);
		System.out.println(addTesterCourse.toString());
		
	}

}
