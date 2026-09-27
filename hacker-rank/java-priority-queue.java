import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.PriorityQueue;
import java.util.Comparator;

class Student {
    int    id;
    String name;
    double cgpa;
    
    Student(int id, String name, double cgpa) {
        this.id = id;
        this.name = name;
        this.cgpa = cgpa;
    }
    
    int getId() {return this.id;}
    String getName() {return this.name;}
    double getCGPA() {return this.cgpa;}
}

class Priorities {
    List<Student> getStudents(List<String> events) {
        PriorityQueue<Student> pq = new PriorityQueue<>(new Comparator<Student>() {
            @Override
            public int compare(Student a, Student b) {
                if (a.getCGPA() == b.getCGPA()) {
                    if (a.getName().equals(b.getName())) {
                        return Integer.compare(a.getId(), b.getId());
                    }
                    return a.getName().compareTo(b.getName());
                }
                return Double.compare(b.getCGPA(), a.getCGPA());
            }
        });
        
        for (String e : events) {
            String[] s = e.split(" ");
            if (s[0].equals("ENTER")) {
                pq.add(new Student(Integer.parseInt(s[3]), s[1], Double.parseDouble(s[2])));
            } else if (s[0].equals("SERVED")) {
                pq.poll();
            }
        }
        
        List<Student> result = new ArrayList<>();
        
        while (!pq.isEmpty()) {
            result.add(pq.poll());
        }
        
        return result;
    }
}


class Solution {
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
