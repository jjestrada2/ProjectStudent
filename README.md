# Course Management Program👨‍🏫

## Description🤗

This project is a course management program developed in raw Java. The program allows users to manage a course by enrolling students, placing them on a waitlist if the course is full, and dropping students from the course. It provides both a non-interactive CourseTester for automated testing and an interactive driver for user input.

## Features🐢

- **Course Management:**
  - Add students to a course.
  - Drop students from a course.
  - Maintain a roster and a waitlist for students.
  - Automatically move students from the waitlist to the roster when space becomes available.
- **Interactive Driver:**
  - Add students by entering their name, ID, and tuition status.
  - Drop students by entering their information.
  - View the current state of the course (roster and waitlist).
  - Quit the program.

## Getting Started🎮

### Prerequisites

- **Java Development Kit (JDK):** Ensure you have the JDK installed. You can download it from the [Oracle website](https://www.oracle.com/java/technologies/javase-downloads.html).

### Installation

1. **Clone the Repository:**

    ```bash
    git clone https://github.com/jjestrada2/course-management-program.git
    cd course-management-program
    ```

2. **Compile the Program:**

    ```bash
    javac Course.java Student.java CourseTester.java InteractiveDriver.java
    ```

### Usage🏋️

1. **Run the CourseTester (for automated testing):**

    ```bash
    java CourseTester
    ```

2. **Run the Interactive Driver (for user interaction):**

    ```bash
    java InteractiveDriver
    ```

3. **Interactive Driver Menu:**
   - **Add a Student:** Enter the student's name, ID, and tuition status.
   - **Drop a Student:** Enter the student's information to remove them from the course.
   - **View Course:** Display the current roster and waitlist.
   - **Quit:** Exit the program.

## Class Details

### Course Class🦸‍♂️

- **Instance Data Variables:**
  - `courseName`: The name of the course.
  - `Student[] roster`: Array for enrolled students.
  - `Student[] waitlist`: Array for waitlisted students.
  - `int maxRosterSize`: Maximum number of students on the roster.
  - `int maxWaitlistSize`: Maximum number of students on the waitlist.

- **Constructor:**
  - Initializes a Course object with specified maximum sizes for the roster and waitlist.

- **Getters and Setters:**
  - Includes necessary getters for `maxEnrolled`, `maxWaitlist`, `numEnrolled`, and `numWaitlist`.
  - Setters with validity checks where appropriate.

- **toString Method:**
  - Returns a string representation of the course, including the course name, number of students enrolled, maximum capacity, roster, waitlist, and their details.

- **addStudent Method:**
  - Adds a student to the course if they have paid tuition and are not already enrolled or waitlisted.
  - Adds to the roster if space is available; otherwise, adds to the waitlist.
  - Returns `true` if the student is added successfully, `false` otherwise.

- **dropStudent Method:**
  - Removes a student from the course.
  - If the student is on the roster, moves the first waitlisted student to the roster.
  - Returns `true` if the student is dropped successfully, `false` otherwise.

### Student Class

- **Instance Data Variables:**
  - `String name`: Name of the student.
  - `int id`: ID of the student.
  - `boolean paidTuition`: Tuition payment status.

- **Constructor:**
  - Initializes a Student object with the specified name, ID, and tuition status.

- **Getters and Setters:**
  - Includes getters and setters for all instance variables.

### Interactive Driver

- **Interactive Menu:**
  - Prompts the user to add or drop students, view the course, or quit.
  - Displays the result of each action (success/failure).

## Contributing🙇‍♂️

If you would like to contribute to this project, please fork the repository and create a pull request with your changes. Contributions are always welcome!

## License📜

This project is licensed under the MIT License - see the [LICENSE](https://choosealicense.com/licenses/mit/) file for details.

## Credits🔥

- [Juan Estrada](https://github.com/jjestrada2) - Developer of this project.

## Contact🦻

For support or inquiries, please contact [Juan Estrada](mailto:juan5801331@gmail.com).
