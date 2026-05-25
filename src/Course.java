public class Course {
    private int courseID;
    private String courseName;
    private int courseDuration;

    // Constructor
    public Course(int id, String name, int duration){
        this.courseID = id;
        this.courseName = name;
        this.courseDuration = duration;
    }

    // Getters
    public int getCourseID(){
        return courseID;
    }

    public String getCourseName(){
        return courseName;
    }

    public int getCourseDuration(){
        return courseDuration;
    }

    // Setters
    public void setCourseID(int id){
        this.courseID = id;
    } 

    public void setCourseName(String name){
        this.courseName = name;
    }

    public void setcourseDuration(int duration){
        this.courseDuration = duration;
    } 

    // Display
    public void dipalyCourse(){
        System.out.println("Course ID: " + courseID);
        System.out.println("Course Name: " + courseName);
        System.out.println("Course Duration: " + courseDuration);
    }
}
