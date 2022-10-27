package Question1;

import java.util.Arrays;

public class Student implements Printable{

    private String name;
    private String[] grades = new String[5];

    public Student(String name, String[] grades){
        this.name = name;

        for (int i = 0; i < grades.length; i++){
            this.grades[i] = grades[i];
        }
    }

    @Override
    public void print(){
        System.out.println("Name of Student: " + this.name);
        System.out.println("grades: ");
        for (String s: grades){
            System.out.println(s + " ");
        }
    }
}
