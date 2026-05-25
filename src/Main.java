public class Main {
    public static void main(String[] args) {
        // Create courses
        Course javaCourse = new Course(15, "Java Backend", 3);
        Course sql = new Course(3, "SQL Database", 4);

        // Create teacher
        Teacher teacher1 = new Teacher(109, "W3Schools", "Programming");

        // Create students
        Student student1 = new Student(20, "Shashi", 21);
        Student student2 = new Student(19, "Sowmaaa", 21);

        // Assign course
        student1.setCourse(sql);
        student2.setCourse(javaCourse);

        // Display information
        System.out.println("===== STUDENT DETAILS =====");
        student1.displayStudent();
        System.out.println();

        student2.displayStudent();
        System.out.println();

        System.out.println("===== TEACHER DETAILS =====");
        teacher1.displayTeacher();
    }
}
