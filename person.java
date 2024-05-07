import java.util.Scanner;
class Person{
    String name;
    int age;

    public Person(String name,int age){
        this.name=name;
        this.age=age;
    }
}
class Student extends Person{
    int grade;

    public Student(String name,int age,int grade){
        super(name,age);
        this.grade=grade;
    }
}
class Main{
    public static void main(String a[]){
        Scanner s=new Scanner(System.in);

        System.out.println("enter the name");
        String name=s.nextLine();
        System.out.println("enter the age");
        int age=s.nextInt();
        System.out.println("enter the grade");
        int grade=s.nextInt();

        System.out.println(name);
        System.out.println(age);
        System.out.println(grade);
    }
}