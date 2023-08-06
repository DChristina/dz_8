import java.util.*;

public class Group {
    private Student groupHead ;
    private List<Student> groupMembers = new ArrayList<>();
    private List<String> tasksForGroup = new ArrayList<>();
    private Map<String, List<Student>> completedTasks = new HashMap<>();

    public Group(Student groupHead){
        this.groupHead = groupHead;
        groupMembers.add(groupHead);
    }

    public Student getGroupHead() {
        return groupHead;
    }

    public List<Student> getGroupMembers() {
        return groupMembers;
    }

    public List<String> getTasksForGroup() {
        return tasksForGroup;
    }

    public void getCompletedTasks(){
            for (Map.Entry<String, List<Student>> entry: completedTasks.entrySet() ){
                String key = entry.getKey();
                ArrayList<Student> values = (ArrayList<Student>) entry.getValue();
                if (values.size()>0) {
                    System.out.println("Task:" + key + ", was completed by: ");
                    for (Student st : values) {
                        System.out.println(st.getStudentId( ) + " " + st.getStudentName( ) + " " + st.getStudentName( ));
                    }
                } else{
                    System.out.println("Task:" + key + ", wasn't completed yet by onybody.");
                }
            }
    }

    public void changeGroupHead(Student newGroupHead){
        if (groupMembers.contains(newGroupHead)){
            this.groupHead = newGroupHead;
        } else {
            System.out.println("You can't set "+  newGroupHead.getStudentSurname() + " " + newGroupHead.getStudentName()+ "as a group head, because he/she is not a member of the group");
        }
    }

    public void addGroupMember(Student student){
        if (!groupMembers.contains(student)){
            groupMembers.add(student);
        } else {
            System.out.println("This student ("+student.getStudentSurname() + " " + student.getStudentName() +")is already belong to this group, and don't need to be added." );
        }

    }
    public void deleteGroupMember(Student deletedStudent){
        if (groupMembers.contains(deletedStudent)){
            if (deletedStudent==groupHead){
                System.out.println( "It is impossible to delete droup  head.");
            } else {
                for (Student searchedStudent :groupMembers){
                    if(deletedStudent==searchedStudent){
                        groupMembers.remove(deletedStudent);
                        break;
                    }
                }
            }
        } else {
            System.out.println("You can't delete this student from the group, because he/she doesn't belong to this group");
        }
    }

    public void renameGroupMember(Student neededToBeUpdatedStudent, String newName, String newSurname){
        for(Student updatedStudent: groupMembers){
            if (neededToBeUpdatedStudent==updatedStudent){
                updatedStudent.setStudentName(newName);
                updatedStudent.setStudentSurname(newSurname);
            }
        }
    }

    public  void addTaskForGroup(String task){
        tasksForGroup.add(task);
        completedTasks.put(task,  new ArrayList<Student>());
    }
    public void markTaskAsCompletedByStudentOfTheGroup (String task,Student student){
        completedTasks.get(task).add(student);
        student.markTaskAsMadeByStudent(task,true);
    }
}
