import java.util.ArrayList;
public class Main {
    static ArrayList<String> students = new ArrayList<>();
    public static void main(String [] args){
        System.out.println("Student Record Manager");
        addStudent("Alice");
        addStudent("Bob");
        viewStudents();
    }

    static void addStudent(String name) {
        students.add(name);
        System.out.println(name + " added.");
    }

    static void viewStudents() {
        System.out.println("Student List:");
        for (String name : students) {
            System.out.println(name);
        }
    }
    
}