public class Teacher {
    private int teacherID;
    private String teacherName;
    private String subject;

    // Constructor

    public Teacher(int id, String name, String subject){
        this.teacherID = id;
        this.teacherName = name;
        this.subject = subject;
    }

    // Getters
    public int getTeacherID(){
        return teacherID;
    }

    public String getTeacherName(){
        return teacherName;
    }

    public String getSubject(){
        return subject;
    }

    // Setters
    public void setTeacherID(int id){
        this.teacherID = id;
    }

    public void setTeacherName(String Name){
        this.teacherName = Name;
    }

    public void setSubject(String subject){
        this.subject = subject;
    }

    // Display
    public void displayTeacher(){
        System.out.println("Teacher ID: " + teacherID);
        System.out.println("Teacher Name: " + teacherName);
        System.out.println("Subject: " + subject);
    }
}
