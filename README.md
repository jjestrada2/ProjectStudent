# ProjectStudent
Project Requirements Part A: The Course Class
Write a Course class. A Course keeps track of Students enrolled in the Course. Some are enrolled on the roster and some are enrolled on the waitlist. Implement methods to add a student to the course and drop a student from the course.

Your program must compile. Programs that do not compile will receive 0 points.

Your class should contain: 

(5 points) Instance Data Variables: Declare instance data variables to represent:
the course name
the roster and waitlist as two Student[] variables
the maximum number of students allowed on the waitlist and on the roster
any other variables you think are helpful
(5 points) Constructor:  A constructor will initialize Course objects.
A Course object is initially created by specifying the maximum number of students allowed on the roster and on the waitlist. Take these values in as parameters to the constructor.
In the constructor, initialize the instance data variables. 
The roster and waitlist arrays are initially empty.
(5 points) Getters and Setters
Carefully consider which variables should have setters. If you choose not to include a setter, add a comment as to why.
Include validity checks in setters when appropriate to prevent invalid values from being assigned.
Note: the tester program relies on some getter methods existing that use these names: getMaxEnrolled, getMaxWaitlist, getNumEnrolled, and getNumWaitlist. If you want to use different names, you can search-and-replace those names in the tester program.
(10 points) toString: Write the toString method. The text representation of a course should include:
the name of the course
the number of students enrolled in the course and the maximum number that can be enrolled
the roster of enrolled students (all student data for all enrolled students should be included)
the number of students on the waitlist and the maximum number that can be on the waitlist
the students on the waitlist (all student data for all waitlisted students should be included)
note: make sure that there are no "nulls" printed with the arrays
(20 points) addStudent: An addStudent method adds a Student to the Course.
method header: public boolean addStudent(Student student) 
this method adds a student to the course if they are eligible and if there is room
a student is eligible to add the course if:
they have paid tuition and
they are not already enrolled on the roster or waitlist
if a student is eligible to add:
if there is room on the roster, add the student to the roster
if the roster is full but there is room on the waitlist, add the student to the waitlist
if there is no room on the roster or waitlist, do not add the student
return true or false based on whether the student is added or not
if a student is added to either the roster or the waitlist, the method should return true
(25 points) dropStudent: A dropStudent method removes a Student from the Course.
method header: public boolean dropStudent(Student student)
this method drops a student from the course
if the student is not on the roster or waitlist, the student cannot be dropped
if the student is on the waitlist, remove the student from the waitlist
if the student is on the roster, remove the student from the roster
since there is now one more space in the class, if the waitlist is not empty, take the first student off the waitlist and add them to the roster; then remove that student from the waitlist (and then shift everyone else up in their waitlist position)
return true or false based on whether the student is dropped or not
if a student is dropped from either the roster or the waitlist, the method should return true
(10 points) Code Design 

Follow object-oriented and general coding principles, including principles of encapsulation.
Follow naming conventions and other Java coding conventions.
Design your code to reduce repeated or duplicated code.
Use helper methods. Find yourself writing the same or very similar code in more than one place? Put it in a private helper method instead! Remember that you are allowed to pass instance data variables as parameters to private methods if it helps!
Choose appropriate visibility for methods.
Methods that are part of the functionality of the object should be public.
Helper methods should be private.
Choose appropriately whether methods and variables should be instance (non-static) or static.
Methods and variables associated with each individual object should not be static.
Methods and variables associated with the class itself that are common across all objects should be static.
Summary of Rules for Adding/Dropping Students
Students on the roster can be stored in any order.
Students on the waitlist should be stored in the order they were added.
A student can only be added to the course if they have paid their tuition.
A student cannot be on the roster or waitlist more than once.
A student cannot be on both the roster and the waitlist.
If a student on the roster drops the course, the first student from the waitlist should be added to the roster (and removed from the waitlist).
When searching for whether a student is on the roster or waitlist, compare the Student ids to see if a student is a match. 
Watch the video under the Review the Example Interactive Driver section below to see an example of the add/drop methods being used.

Back to Top

Before You Move on to Part B: Run the Test Program
I have provided a tester program called CourseTester. Use this to test that your Part A Course class works correctly. The test program runs similar to the homework drivers and displays the expected and actual value for several tests. It will also display a message if a test fails. Note that there is no automated test for the toString method, you need to manually review the output of that.

Pay close attention to what the roster and waitlist names should be after each add/drop.

Make sure that Part A is complete and working before beginning Part B! 

Back to Top

Project Requirements Part B: Interactive Driver
Make sure your Course class works with the CourseTester program first! Then begin Part B.

(20 points) Interactive Driver: Write an interactive driver program that gets information from the user (through the keyboard) to create Students and add/drop them to a Course. 

Create a Course object (you can decide the name and roster/waitlist sizes).
Note: this part does not need to be interactive. You can hard-code the Course information into your program.
Inside of a loop, show the user a menu and let them choose one of these actions:
Add a student by entering the student's name, id, and paid tuition status. 
Drop a student by entering the student's information (you can decide what information is needed)
View a text representation of the course 
Quit the program.
If the user chooses to add or drop, display the result (success/failure) of that action.
Use the loop so that the user can repeat these actions as many times as they want before quitting.
The code design requirements listed in Part A apply to both Part A and Part B.
