import java.util.ArrayList;
public class Main {
    static ArrayList<String> students = new ArrayList<>();
    public static void main(String [] args){
        System.out.println("Student Record Manager");
        addStudent("Alice");
        addStudent("Bob");
        viewStudents();
        deleteStudent("Alice");
        countStudents();

        searchStudent("alice");
        searchStudent("Charlie");
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

    static void deleteStudent(String name) {
        students.remove(name);
        System.out.println(name + " removed.");
    }

    static void countStudents() {
        System.out.println("Total students: " + students.size());
    }

    static void searchStudent(String name){
        boolean studentFound = false;
        for(String student : students){
            if(student.equalsIgnoreCase(name)){
                System.out.println(student +" found.");
                studentFound = true;
                break;
            }
        }
        if(!studentFound){
            System.out.println(name + " not found! Try another..");
        }
    }
    
}