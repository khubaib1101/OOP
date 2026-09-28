class Circle{
    double radius;
    Circle(){
        radius = 0;
    }
    Circle(double r){
        radius = r;
    }
    double circumference(){
        return 2 * Math.PI * radius;
    }

}
class Main{
    public static void main(String[] args){
        Circle c1 = new Circle();
        Circle c2 = new Circle();
        System.out.println("Circumference = "+ c1.circumference());

        System.out.println("Circumference = "+ c2.circumference());
    }
}

//-----------------------------------------------------------------

class Account{
    double balance;
    Account(){
        balance = 0;
    }
    Account(double b){
        balance = b;
    }
    void deposit(double amount){
        balance = balance + amount;
    }
    void withdraw(double amount){
        if (amount<=balance){
            balance = balance - amount;
        }else{
            System.out.println("Insufficient Balance");
        }

    }
}
class Main{
    public static void main(String[] args){
        Account a1 = new Account(1000);
        a1.deposit(500);
        a1.withdraw(200);
        System.out.println("Balance ="+a1.balance);
    }
}

//--------------------------------------------------------------------------

class Distance{
    int feet,inches;
    Distance(){
        feet = 0;
        inches = 0;
    }
    Distance(int f,int i){
        feet = f;
        inches = i;
    }
    void display(){
        System.out.println("Feet="+feet);

        System.out.println("Inches="+inches);
    }
}
class Main{
    public static void main(String[] args){
        Distance d1 = new Distance();
        Distance d2 = new Distance(5,8);
        d1.display();
        d2.display();
    }
}

//-------------------------------------------------------------------

class Marks{
    int mark1,mark2,mark3;
    Marks(){
        mark1 = mark2 = mark3 = 0;
    }
    Marks(int m1,int m2,int m3){
        mark1 = m1;
        mark2 = m2;
        mark3 = m3;
    }
    int sum(){
        return mark1 + mark2 + mark3;
    }
}
class Main{
    public static void main(String[] args){
        Marks m = new Marks(80,90,60);
        System.out.println("Total Marks = "+ m.sum());
    }
}

//----------------------------------------------------------------------------------

class Time{
    int hr,sec,min;
    Time(){
        hr = min = sec = 0;
    }
    Time(int h,int s,int m){
        if (h>=0 && h<=23){
            hr = h;
        }else{
            hr = 0;
        }
        if (m>=0 && m<=59){
            min = m;

        }else{
            min = 0;
        }
        if (s>=0 && s<=59){
            sec = s;
        }else{
            sec = 0;
        }


    }
    void display(){
        System.out.println(hr+":"+min+":"+sec);
    }

}
class Main{
    public static void main(String[] args){
        Time t1 = new Time();
        Time t2 = new Time(14,30,45);
        Time t3 = new Time(25,70,90);
        t1.display();
        t2.display();
        t3.display();
    }
}