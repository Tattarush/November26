package day05.Alishev.Task1;

import java.util.Random;

public class Teaher {
    private String name;
    private String subject;

    public Teaher(String name, String subject) {
        this.name = name;
        this.subject = subject;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public void evaluate(Student student) {

        Random random = new Random();
       int grade = random.nextInt(5) + 1;

        System.out.println("Преподаватель " + name +
                " оценил студента с именем " + student.getName() +
                " на оценку " + Grades.getStrGrade(grade) );


    }
}
