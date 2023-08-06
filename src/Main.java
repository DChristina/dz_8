import org.w3c.dom.ls.LSOutput;

import java.sql.SQLOutput;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Student studentOdeu = new Student("Pavlo","Melnik");
        Student studentOdeu2 = new Student("Alla","Super");
        Student studentOdeu3 = new Student("Nina","Zaim");
        Student studentOdeu4 = new Student("Svitlana","Bobok");
        Student studentOdeu5 = new Student("Alla","Kucher");
        Student studentOdeu6 = new Student("Nikita","Vengrin");
        Student studentOdeu7 = new Student("Jack","Grealish");

        Group firstGrade = new Group(studentOdeu);
        firstGrade.addGroupMember(studentOdeu);
        firstGrade.addGroupMember(studentOdeu2);
        firstGrade.addGroupMember(studentOdeu3);
        firstGrade.addGroupMember(studentOdeu4);
        firstGrade.addGroupMember(studentOdeu5);
        firstGrade.addGroupMember(studentOdeu6);

        System.out.println("Group list after creation:");
        for (Student printStudentData: firstGrade.getGroupMembers()){
            System.out.println( printStudentData.getStudentId() +" "+ printStudentData.getStudentName( )+" "+printStudentData.getStudentSurname());
        }
        System.out.println("_________________");

        firstGrade.addTaskForGroup("Home task 1");
        firstGrade.addTaskForGroup("Home task 2");
        firstGrade.addTaskForGroup("Home task 3");

        System.out.println("Group list after renaming of one of the students:");
        firstGrade.renameGroupMember(studentOdeu2,"Allusik","Superovich");
        for (Student printStudentData: firstGrade.getGroupMembers()){
            System.out.println( printStudentData.getStudentId() +" "+ printStudentData.getStudentName( )+" "+printStudentData.getStudentSurname());
        }
        System.out.println("_________________");

        System.out.println("Group list after deleting of one of the students:");
        firstGrade.deleteGroupMember(studentOdeu);
        for (Student printStudentData: firstGrade.getGroupMembers()){
            System.out.println( printStudentData.getStudentId() +" "+ printStudentData.getStudentName( )+" "+printStudentData.getStudentSurname());
        }
        System.out.println("_________________");


        System.out.println("I'm changing group head, new group  head is" + " "+ studentOdeu5.getStudentName() +" "+ studentOdeu5.getStudentSurname());
        firstGrade.changeGroupHead(studentOdeu5);
        System.out.println("_________________");

        System.out.println("I'm trying  to change group head, on" + " "+ studentOdeu7.getStudentName() +" "+ studentOdeu7.getStudentSurname());
        firstGrade.changeGroupHead(studentOdeu7);
        System.out.println("_________________");

        System.out.println("I'm deleting group member, new group list:" );
        firstGrade.deleteGroupMember(studentOdeu3);
        for (Student printStudentData: firstGrade.getGroupMembers()){
            System.out.println( printStudentData.getStudentId() +" "+ printStudentData.getStudentName( )+" "+printStudentData.getStudentSurname());
        }
        System.out.println("_________________");

        firstGrade.markTaskAsCompletedByStudentOfTheGroup("Home task 1",studentOdeu6);
        firstGrade.markTaskAsCompletedByStudentOfTheGroup("Home task 1",studentOdeu5);

        firstGrade.getCompletedTasks();

    }
}
