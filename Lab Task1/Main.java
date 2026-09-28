// Practice Q,3:
import java.util.Scanner;

class CarPart{
    private String modelNumber;
    private String partNumber;
    private String cost;

    public void setparameter(String x,String y,String z){
        modelNumber = x;
        partNumber = y;
        cost = z;
    }
    public void display(){
        System.out.println("Model Number is:"+modelNumber+"Part Number is:"+partNumber+"Cost is:"+cost);
    }
}
class CarPartRunner{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        CarPart car1 = new CarPart();
        System.out.println("what is model number");

        System.out.println("what is partnumber");

        System.out.println("what is cost");
        String x = sc.nextLine();
        String y = sc.nextLine();
        String z = sc .nextLine();
        car1.display();
    }

}

//-----------------------------------------------------------------------------------------

// Lab Task 1:
class student{
    String name;
    String gender;
    int age;
    String courseName;
    int GPA;
    public void display(){
        System.out.println("Student's Name:"+name+"\nGender:"+gender+"\nAge:"+age+"\nCourse Name:"+courseName+
                "\nGPA:"+GPA);
    }
    public static void main(String[] args){
        student s1,s2;
        s1 = new student();
        s1.name = "Khubaib";
        s1.gender = "Male";
        s1.age = 123;
        s1.courseName = "OOP";
        s1.GPA = 4;
        s2 = new student();

        s2 = new student();
        s2.name = "Ahmad";
        s2.gender = "Male";
        s2.age = 456;
        s2.courseName = "LA";
        s2.GPA = 4;
        s1.display();
        s2.display();

    }
}
//-----------------------------------------------------------------------------------------------
//Lab Task: 2

class time{
    int hour;
    int min;
    int sec;
    public  void display(){
        System.out.println("Hours:"+hour+"Minutes:"+min+"Seconds"+sec);
    }

    public void setTime(int h,int m,int s){
        hour = h;
        min = m;
        sec = s;

    }
    public static void main(String[] args){
        time t1 = new time();
        t1.setTime(10,30,15);
        t1.display();
    }

}
//------------------------------------------------------------------------------------
// Lab Task 3:
class car{
    String name;
    int model;
    String color;
    int average;
    int speed;
    public void display(){
        System.out.println("Name of Company:"+name+
                "Model:"+model+"Colour:"+color+"Average:"+average+"Speed"+speed);
    }
    public static void main(String[] args){
        car c1;
        c1 = new car();
        c1.name = "Audi";
        c1.average = 30;
        c1.color = "Black";
        c1.speed = 250;
        c1.display();
    }
}
//-------------------------------------------------------------------------------------------------
// Lab Task 4:

class rectangle{
    int length;
    int width;
    public void display(){
        System.out.println(length * width);
    }
    public void cal_area(int l,int w){
        length = l;
        width = w;


    }
    public static void main(String[] args){
        rectangle r1;
        r1 = new rectangle();
        r1.cal_area(20,40);
        r1.display();
    }
}

//------------------------------------------------------------------------