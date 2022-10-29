package ProjectStudent;



import java.util.ArrayList;
import java.util.Arrays;

public class Course {

	private String name;
	private  Student rosterList[];
	private Student waitList[];
	private int maxNumRosterList;
	private int maxNumWaitList;
	private int numEnrolled;
	private int numWaitlist;
	
	
	public Course(String name,int maxNumRosterList,int maxNumWaitList) {
		this.name=name;
		this.rosterList=new Student[] {};
		this.waitList=new Student[] {};
		this.maxNumRosterList=maxNumRosterList;
		this.maxNumWaitList=maxNumWaitList;
		numEnrolled=0;
		numWaitlist=0;
	}
	
	//getterSetter
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Student[] getRosterList() {
		return rosterList;
	}

	/*RosterList Should just be modified with the add and drop method
	 * public void setRosterList(Student[] rosterList) {
		this.rosterList = rosterList;
	}*/
	
	public Student[] getWaitList() {
		return waitList;
	}

	/*WaitList Should just be modified with the add and drop method
	 * public void setWaitList(Student[] waitList) {
		this.waitList = waitList;
	}*/

	public int getMaxEnrolled() {
		return maxNumRosterList;
	}
	
	/*Change the maxNumRoster could produce an error 
	public void setMaxNumRosterList(int maxNumRosterList) {
		this.maxNumRosterList = maxNumRosterList;
	}*/

	public int getMaxWaitlist() {
		return maxNumWaitList;
	}

	/*Change the maxNumWaitlist could produce an error 
	public void setMaxNumWaitList(int maxNumWaitList) {
		this.maxNumWaitList = maxNumWaitList;
	}*/

	public int getNumEnrolled() {
		return numEnrolled;
	}

	/*this variable is just to help adding students to the array and nobody should modified
	public void setNumEnrolled(int numEnrolled) {
		this.numEnrolled = numEnrolled;
	}*/

	
	public int getNumWaitlist() {
		return numWaitlist;
	}

	/*this variable is just to help adding students to the array and nobody should modified
	 * public void setNumWaitlist(int numWaitlist) {
		this.numWaitlist = numWaitlist;
	}*/

	

	
	@Override
	public String toString() {
		return "---------------------------------------------------------------------------------------"+
				"\nCourse name: \t\t" + this.name +
	"\nRoster List Students: \t\t" + this.getNumEnrolled() + 
	"\nMaximum number in Roster List: \t"+ this.getMaxEnrolled() +
	"\nRoster List Students: \t\t"+ Arrays.toString(this.rosterList)+
	"\nWaitlist Students: \t\t"+this.getNumWaitlist()+
	"\nMaximum number in Waitlist: \t" +this.getMaxWaitlist()+
	"\nWaitList Students \t\t"+Arrays.toString(this.waitList)+
	"\n---------------------------------------------------------------------------------------";
	}
	
	
	
	
	public boolean contains(Student [] arr,Student otherStudent) {
		boolean test = false;
        for (Student stdnt : arr) {
            if (stdnt.equals(otherStudent)) {
                test = true;
                break;
            }
        }
        return test;
		
	}
	
	
	public boolean addStudent(Student student) {
		boolean isAdded=false;

		boolean isStdInRoster=contains(this.rosterList,student);
		boolean isStdnInWait=contains(this.waitList,student);
		boolean isEligible=!isStdInRoster&&!isStdnInWait&&student.isTuitionPaid();
		boolean isRoominRoster=this.getMaxEnrolled()>this.getNumEnrolled();
		boolean isRoominWait=this.getMaxWaitlist()>this.getNumWaitlist();
		
		if(isEligible) {
			if(isRoominRoster) {
				Student[] tempList= new Student[this.rosterList.length+1];
				System.arraycopy(this.rosterList, 0, tempList, 0, this.rosterList.length);
				this.rosterList=tempList;
				this.rosterList[this.numEnrolled]=student;
				this.numEnrolled++;
				isAdded=true;
			}else if(isRoominWait) {
				Student[] tempList= new Student[this.waitList.length+1];
				System.arraycopy(this.waitList, 0, tempList, 0, this.waitList.length);
				this.waitList=tempList;
				this.waitList[this.numWaitlist]=student;
				this.numWaitlist++;
				isAdded=true;
				
			}
		}
		
		
		return isAdded;
	}
	
	public boolean dropStudent(Student student) {
		boolean isDrop=false;
		boolean isStdInRoster=contains(this.rosterList,student);
		boolean isStdInWait= contains(this.waitList,student);
		
		
		if(isStdInRoster) {
					Student[] tempList= new Student[this.rosterList.length-1];
					for(int i=0, k=0;i<this.rosterList.length;i++){
			            if(!(this.rosterList[i].equals(student))){
			                tempList[k]=this.rosterList[i];
			                k++;
			            	}
			            }
					this.rosterList=tempList;
					this.numEnrolled--;
					isDrop=true;
					if(this.waitList.length!=0) {
							Student tempStudent=this.waitList[0];
							Student[] tempList1= new Student[this.waitList.length-1];
							for(int i=0, k=0;i<this.waitList.length;i++){
					            if(i!=0){
					                tempList1[k]=this.waitList[i];
					                k++;
					            	}
					            }
						this.waitList=tempList1;
						this.numWaitlist--;
						addStudent(tempStudent);
						isDrop=true;
						
					}
			
		}else if(isStdInWait) {
					Student[] tempList= new Student[this.waitList.length-1];
							for(int i=0, k=0;i<this.waitList.length;i++){
					            if(!(this.waitList[i].equals(student))){
					                tempList[k]=this.waitList[i];
					                k++;
					            	}
					            }
					this.waitList=tempList;
					this.numWaitlist--;
					isDrop=true;
		}
		return isDrop;
		
	}
	
}
	