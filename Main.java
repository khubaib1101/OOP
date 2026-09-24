class rectangle{
    public int length, width;
    public int cal_area(){
        return (length * width);
    }

    public static void main(String[] args){
        rectangle r = new rectangle();
        r.length = 10;
        r.width = 20;
        System.out.println(r.cal_area());

    }
}

// Activity 1:

import java.util.Scanner;
class rect{
    int length,width;
    public void parameter(int l,int w){
        length = l;
        width = w;
    }
    public void display(){
        System.out.println(length*width);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        rect r = new rect();
        System.out.println("Enter Length");
        System.out.println("Enter Width");
        int l = sc.nextInt();
        int w = sc.nextInt();
        r.parameter(l,w);
        r.display();

    }

}

// Activity 2:

class Rectangle{
    int length , width;
    Rectangle(){
        length = 5;
        width = 4;
    }
    public Rectangle(int l, int w){
        length = l;
        width = w;
    }
    public int cal_area(){
        return (length * width);
    }
}
class runner{
    public static void main(String[] args){
        Rectangle r1 = new Rectangle();
        System.out.println(r1.cal_area());
        Rectangle r2 = new Rectangle(10,3);
        System.out.println(r2.cal_area());


    }
}

// Activity 3:

class Point{
    int x,y;
    Point(){
        x =1;
        y = 2;

    }
    public Point(int a, int b){
        x = a;
        y = b;
    }
    public void setX(int a){
        x = a;
    }
    public void setY(int b){
        y = b;
    }
    public void display(){
        System.out.println("x coordinate = " + x + " y coordinate = " + y);
    }
    public void movePoint(int a, int b){
        x = x+a;
        y = y+b;
        System.out.println("x coordinate after moving = " + x +
                " y coordinate after moving = " + y);
    }

}

class Runner{
    public static void main(String[] args){
        Point p1 = new Point();
        p1.movePoint(2,3);

        p1.display();

        Point p2 = new Point();
        p2.movePoint(2,3);
        p2.display();
    }
}

//-----------------------------------------------------------------------------------

// Task 1:
class circle{
    int radius;
    float pie;
    circle(){
        radius = 5;
        pie = 3.1415f;
    }
    public circle(int r,float p){
        radius = r;
        pie = p;
    }
    public float circumference(){
        return (2 * pie * radius);
    }

}
class runner{
    public static void main(String[] args){
        circle c1 = new circle();
        System.out.println(c1.circumference());
    }
}

//----------------------------------------------------------------------------

// Task 2:
class account{
    int balance;
    int withdraw;
    int deposit;
    account(){
        balance = 50000;
        withdraw = 10000;
        deposit = 10000;
    }
    public account(int b,int w,int d){
        balance = b;
        withdraw = w;
        deposit = d;
    }
    public int depo(){
        return (balance + deposit);
    }
    public int with(){
        return (balance - withdraw);

    }
}
class runner{
    public static void main(String[] args){
        account a1 = new account();
        System.out.println(a1.depo());
        System.out.println(a1.with());
    }
}

//---------------------------------------------------------------------------------

// Task 3:

//------------- my own way-----------------------------------

class Student{
    String name;
    int Result_array1;
    int Result_array2;
    int Result_array3;
    int Result_array4;
    int Result_array5;
    Student(String n,int r1,int r2,int r3,int r4,int r5){
        name = n;
        Result_array1 = r1;
        Result_array2 = r2;
        Result_array3 = r3;
        Result_array4 = r4;
        Result_array5 = r5;
    }
    public float average(){
        return ((Result_array1 + Result_array2+ Result_array3 + Result_array4
                + Result_array5)/5.0f);

    }

}
class Runner{
    public static void main(String[] args){
        Student s1 = new Student("Khubaib",100,100,100,100,100);
        System.out.println(s1.average());
        Student s2 = new Student("Ahmad",80,90,80,90,100);
        System.out.println(s2.average());
    }
}

//--------------- according to array requirements------------------------

class Student{
    String name;
    int[] result_array;
    Student(String n,int[] r){
        name = n;
        result_array = r;
    }
    public float average(){
        return ((result_array[0]+result_array[1]+result_array[2]+result_array[3]
                +result_array[4])/5.0f);
    }
}
class Runner{
    public static void main(String[] args){
        int [] r1 = {85,90,86,87,92};
        int [] r2 = {86,91,88,89,93};
        Student s1,s2;
        s1 = new Student("Khubaib",r1);
        s2 = new Student("Ahmad",r2);
        System.out.println(s1.average());
        System.out.println(s2.average());

    }
}

//---------------------------------------------------------------------------------------
//Task 4:
class HotDogStand{
    int ID;
    int hotdogssold;
    HotDogStand(int i,int h){
        ID = 1;
        hotdogssold = h;
    }
    public void justsold(){
        hotdogssold = hotdogssold + 1;

    }
    public int get(){
        return (hotdogssold);
    }

}
class Runner{
    public static void main(String[] args){
        HotDogStand h1,h2,h3;
        h1 = new HotDogStand(101,0);
        h2 = new HotDogStand(102,0);
        h3 = new HotDogStand(102,0);

        h1.justsold();
        h1.justsold();
        System.out.println(h1.get());

        h2.justsold();
        System.out.println(h2.get());

        h3.justsold();
        h3.justsold();
        System.out.println(h3.get());
    }
}