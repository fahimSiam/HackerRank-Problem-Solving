import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Scanner;
/*
 * Create the Student and Priorities classes here.
 */

class Priorities {
    public Priorities(){
    }
    PriorityQueue<Student> pQueue = 
        new PriorityQueue<>(
            Comparator.comparing(Student::getCgpa).reversed()
            .thenComparing(Student::getName)
            .thenComparing(Student::getId));


    public List<Student> getStudents(List<String> events) {
        events.forEach((event)->{
            if(event.equals("SERVED")){
                pQueue.poll();
            } else{
                String[] details = event.split(" ");
                pQueue.add(new Student(Integer.parseInt(details[3]),details[1], Double.parseDouble(details[2])));
            }

        }
    );
            List<Student> students=new ArrayList<>();
            while(!pQueue.isEmpty()){
                students.add(pQueue.poll());
            }
            return students;
    }
}


/* class StudentComparator implements Comparator<Student>{

    @Override
    public int compare(Student s1, Student s2) {
        // TODO Auto-generated method stub
        if(s1.cgpa<s2.cgpa){
            return 1;
        }
        else if(s1.cgpa>s2.cgpa){
            return -1;
        }
        else if(s1.cgpa==s2.cgpa){
            if(s1.name.compareTo(s2.name)!=0){
                return s1.name.compareTo(s2.name);
            }
            else{
                if(s1.id<s2.id){
                    return 1;
                }
                else if(s1.id>s2.id){
                    return -1;
                }
                return 0;
            }
        }
        return 0;
    }
} */


class Student {
    int id;
    String name; 
    double cgpa;
    public Student(int id, String name, double cgpa) {
        this.id=id;
        this.name=name;
        this.cgpa=cgpa;
    }
   /*  public void Student(int id, String name, double cgpa){
        id=this.id;
        name=this.name;
        cgpa=this.cgpa;
    } */
    public String getName() {
        return name;
    }

    public int getId(){
        return id;
    }

    public double getCgpa(){
        return cgpa;
    }

}


public class JavaPriorityQueue {
    private final static Scanner scan = new Scanner(System.in);
    private final static Priorities priorities = new Priorities();
    
    public static void main(String[] args) {
        int totalEvents = Integer.parseInt(scan.nextLine());    
        List<String> events = new ArrayList<>();
        
        while (totalEvents-- != 0) {
            String event = scan.nextLine();
            events.add(event);
        }
        
        List<Student> students = priorities.getStudents(events);
        
        if (students.isEmpty()) {
            System.out.println("EMPTY");
        } else {
            for (Student st: students) {
                System.out.println(st.getName());
            }
        }
    }
}