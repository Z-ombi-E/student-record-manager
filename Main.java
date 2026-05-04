import java.util.ArrayList;
public class Main {
    static ArrayList<String> students = new ArrayList<>();
    public static void main(String [] args){
        System.out.println("Student Record Manager");
        addStudent("Alice");
        addStudent("Bob");
    }

    static void addStudent(String name) {
        students.add(name);
        System.out.println(name + " added.");
    }
    
}