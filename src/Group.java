import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.List;

public class Group {
    private Student groupHead ;
    private List<Student> groupMembers = new ArrayList<>();
    private List<String> tasksForGroup = new ArrayList<>();

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

    public void changeGroupHead(Student newGroupHead){
        this.groupHead = newGroupHead;
    }

    public void addGroupMember(Student student){
        groupMembers.add(student);
    }
    public void deleteGroupMember(Student deletedStudent){
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
    }




}
