public class Student {
    private int studentID;
    private String studentName;
    private int studentAge;
    private Course course;

    // Constructor
    public Student(int id, String name, int age){
        this.studentID = id;
        this.studentName = name;
        this.studentAge = age;
    }

    // Getters
    public int getstudentID(){
        return studentID;
    }

    public String getstudentName(){
        return studentName;
    }

    public int getstudentAge(){
        return studentAge;
    }

    public Course getCourse(){
        return course;
    }

    // Setters
    public void setstudentID(int id){
        this.studentID = id;
    }

    public void setstudentName(String name){
        this.studentName = name;
    }

    public void setstudentAge(int age){
        this.studentAge = age;
    }

    public void setCourse(Course course){
        this.course = course;
    }

    // Display
    public void displayStudent(){   
        System.out.println("Student ID: " + studentID);
        System.out.println("Student Name: " + studentName);
        System.out.println("Student Age: " + studentAge);
        
        if(course != null){
            System.out.println("Enrolled Course: " + course.getCourseName());
        } else {
            System.out.println("No course assigned.");
        }
    }
}