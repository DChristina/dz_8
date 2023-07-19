import java.util.List;

public class Main {
    public static void main(String[] args) {
        Student studentOdeu = new Student("Pavlo","Melnik");
        Student studentOdeu2 = new Student("Alla","Super");
        Student studentOdeu3 = new Student("Nina","Zaim");
        Student studentOdeu4 = new Student("Svitlana","Bobok");
        Student studentOdeu5 = new Student("Alla","Kucher");
        Student studentOdeu6 = new Student("Nikita","Vengrin");

        Group firstGrade = new Group(studentOdeu);
        // firstGrade.addGroupMember(studentOdeu);
        firstGrade.addGroupMember(studentOdeu2);
        firstGrade.addGroupMember(studentOdeu3);
        firstGrade.addGroupMember(studentOdeu4);
        firstGrade.addGroupMember(studentOdeu5);
        firstGrade.addGroupMember(studentOdeu6);

        for (Student printStudentData: firstGrade.getGroupMembers()){
            System.out.println( printStudentData.getStudentId() +" "+ printStudentData.getStudentName( )+" "+printStudentData.getStudentSurname());
        }
        System.out.println("_________________");

        firstGrade.addTaskForGroup("Home task 1");
        firstGrade.addTaskForGroup("Home task 2");
        firstGrade.addTaskForGroup("Home task 3");

        firstGrade.renameGroupMember(studentOdeu2,"Allusik","Superovich");
        for (Student printStudentData: firstGrade.getGroupMembers()){
            System.out.println( printStudentData.getStudentId() +" "+ printStudentData.getStudentName( )+" "+printStudentData.getStudentSurname());
        }
        System.out.println("_________________");

        firstGrade.deleteGroupMember(studentOdeu);

        for (Student printStudentData: firstGrade.getGroupMembers()){
            System.out.println( printStudentData.getStudentId() +" "+ printStudentData.getStudentName( )+" "+printStudentData.getStudentSurname());
        }
        System.out.println("_________________");

        firstGrade.deleteGroupMember(studentOdeu3);

        for (Student printStudentData: firstGrade.getGroupMembers()){
            System.out.println( printStudentData.getStudentId() +" "+ printStudentData.getStudentName( )+" "+printStudentData.getStudentSurname());
        }
        System.out.println("_________________");

        studentOdeu6.markTaskAsMadeByStudent( firstGrade.getTasksForGroup().get(1),true);
        studentOdeu6.markTaskAsMadeByStudent( firstGrade.getTasksForGroup().get(0),false);
        studentOdeu6.markTaskAsMadeByStudent( firstGrade.getTasksForGroup().get(2),true);
        System.out.println( studentOdeu6.statesOfTasks);
    }
}
