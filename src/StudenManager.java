import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

/**
 * Created by AMBE on 28/6/2019 at 16:36 PM.
 */
public class StudenManager {

    private ArrayList<Student> list;

    public StudenManager() {
        list = new ArrayList<>();
    }

    public void addStudent() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Id: ");
        String id = scanner.nextLine();
        System.out.print("Name: ");
        String name = scanner.nextLine();
        System.out.print("Age: ");
        int age = scanner.nextInt();
        System.out.print("Address: ");
        String address = scanner.nextLine();
        System.out.print("Gpa: ");
        float gpa = scanner.nextFloat();

        Student student = new Student(id, name, age, address, gpa);
        list.add(student);

    }

    public void editStudentById(String id) {
        boolean isExisted = false;
        for (Student student : list) {
            if (student.getId().equals(id)) {
                isExisted = true;

                Scanner scanner = new Scanner(System.in);
                System.out.print("New name: ");
                String newName = scanner.nextLine();
                System.out.print("New age: ");
                int newAge = scanner.nextInt();
                System.out.print("New address: ");
                String newAddress = scanner.nextLine();
                System.out.print("New gpa: ");
                float newGpa = scanner.nextFloat();

                student.setName(newName);
                student.setAddress(newAddress);
                student.setAge(newAge);
                student.setGpa(newGpa);
                break;
            }
        }

        if (!isExisted) {
            System.out.println("Not exist");
        } else {
            System.out.println("Update success");
        }

    }

    public void deleteStudentById(String id) {
        boolean isExisted = false;
        for (Student student : list) {
            if (student.getId().equals(id)) {
                isExisted = true;
                list.remove(student);
                break;
            }
        }

        if (!isExisted) {
            System.out.println("Not exist");
        } else {
            System.out.println("Deleted success");
        }
    }

    public void sortByGpa() {
        Collections.sort(list, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return (int) (o1.getGpa() - o2.getGpa());
            }
        });
    }

    public void sortByName() {
        Collections.sort(list, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.getName().compareTo(o2.getName());
            }
        });
    }

    public void showStudent() {
        for (Student student : list) {
            Main.printLine();
            System.out.printf("\n| %-90s %7s", "1. Id student: " + student.getId(), "|");
            System.out.printf("\n| %-90s %7s", "2. Name student: " + student.getName(), "|");
            System.out.printf("\n| %-90s %7s", "3. Age student: " + student.getAge(), "|");
            System.out.printf("\n| %-90s %7s", "4. Address student: " + student.getAddress(), "|");
            System.out.printf("\n| %-90s %7s", "5. Gpa student: " + student.getGpa(), "|");
            Main.printLine();
        }
    }
}
