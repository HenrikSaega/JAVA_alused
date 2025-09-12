package week5;
import java.util.ArrayList;
import java.util.Scanner;
public class Exercise88
{
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<Student>();
        ArrayList<Student> searchedStudents = new ArrayList<Student>();
        Scanner input = new Scanner(System.in);
        Student Carl = new Student("Carl Gustaf Mannerheim", "015696234");
        Student Steve = new Student("Steve Jobs", "013672548");
        Student Edsger = new Student("Edsger Dijkstra", "014662803");
        students.add(Carl);
        students.add(Steve);
        students.add(Edsger);

        System.out.print("Give search term: ");
        String search = input.nextLine();
        for(Student nimi :  students)
            {
                if(nimi.getName().contains(search))
                 {
                     searchedStudents.add(nimi);
                     System.out.println(nimi);
                }
            }
    }
}
