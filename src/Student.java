import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Student {
    private int studentId;
    private static int generator = 0;
    private String studentName;
    private String studentSurname;
    private boolean taskDoneByStudent;
    Map<String, Boolean> statesOfTasks = new HashMap<String, Boolean>();

    public Student (String name, String surname){
        this.studentId = generator++;
        this.studentName = name;
        this.studentSurname = surname;
    }

    public int getStudentId() {
        return studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public String getStudentSurname() {
        return studentSurname;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public void setStudentSurname(String studentSurname) {
        this.studentSurname = studentSurname;
    }

    public void markTaskAsMadeByStudent (String task,Boolean isDone){
       statesOfTasks.put(task,isDone);
    }

}
