package FileHandling;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {

        Scanner input = new Scanner(System.in);
        ArrayList<Student> studentArrayList = new ArrayList<>();

        boolean exit = true;
        while (exit) {
            System.out.println("""
                    Menu
                    1 - Add Student in the List and save to file
                    2 - Read Student List from a file and display on the screen
                    3 - Exit""");

            switch (input.nextInt()) {
                case 1 -> addStudent(studentArrayList);
                case 2 -> readFile();
                case 3 -> exit = false;
            }
        }
    }

    public static void addStudent(ArrayList<Student> studentArrayList) throws IOException {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter name: ");
        String name = input.next();
        System.out.println("Enter id: ");
        int id = input.nextInt();
        System.out.println("Enter marks: ");
        int marks = input.nextInt();

        studentArrayList.add(new Student(name, id, marks));

        FileWriter out = new FileWriter("C:\\Users\\HP\\Desktop\\Folder\\IIT\\2nd_Year_1st_Sem\\NEW\\OOP\\Week 9\\GuiTute\\File\\text.txt", true);
        BufferedWriter bw = new BufferedWriter(out);

        for (int i = 0; i < studentArrayList.size(); i++){
            bw.write("\nStudent Name: " + studentArrayList.get(i).getName() + " Student ID: " + studentArrayList.get(i).getId() + " Student Mark: " + studentArrayList.get(i).getMark());
        }
    }

    public static void readFile() throws IOException {
//        File inputFile = new File();
        FileReader in = new FileReader("C:\\Users\\HP\\Desktop\\Folder\\IIT\\2nd_Year_1st_Sem\\NEW\\OOP\\Week 9\\GuiTute\\File\\text.txt");
        BufferedReader br = new BufferedReader(in);
        String s =br.readLine();
        System.out.println(s);


//        String line = br.readLine();
//        while (line != null) {
//            line = br.readLine();
//            System.out.println(line);
//        }

    }
}
