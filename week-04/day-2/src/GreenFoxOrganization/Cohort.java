package GreenFoxOrganization;

import java.util.ArrayList;

public class Cohort {

        String name;
        ArrayList<Student> students;
        ArrayList<Mentor> mentors;


        public void addStudent(Student x) {
            students.add(x);
        }

        public void addMentor(Mentor x) {
            mentors.add(x);
        }

        public void info() {
            System.out.println("The name cohort has "+students.size()+" students and "+mentors.size()+" mentors.");

        }

        public Cohort(String name) {
            this.name = name;
            this.students = new ArrayList<>();
            this.mentors = new ArrayList<>();
        }
}

