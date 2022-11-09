import java.util.Scanner;

class Faculty{
    int id;
    String name;
    float salary;
}
class FullTimeFaculty extends Faculty{
    float basic;
    float allowance;

    public void read(){
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER FULL TIME FACULTY ID:");
        id= sc.nextInt();
        System.out.println("ENTER FULL TIME FACULTY NAME:");
        name= sc.next();
        System.out.println("ENTER BASIC:");
        basic= sc.nextFloat();
        System.out.println("ENTER ALLOWANCE:");
        allowance= sc.nextFloat();
        salary=basic+allowance;

    }
    public void display(){

        System.out.println("FACULTY ID:"+id);
        System.out.println("FACULTY NAME:"+name);
        System.out.println("BASIC:"+basic);
        System.out.println("ALLOWANCE:"+allowance);
        System.out.println("SALARY:"+salary);
        System.out.println("_________________________________________");
    }
}
class PartTimeFaculty extends Faculty{
    int hour;
    int rate;

    public void read1(){
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER PART TIME FACULTY ID:");
        id= sc.nextInt();
        System.out.println("ENTER PART TIME FACULTY NAME:");
        name= sc.next();
        System.out.println("ENTER HOUR:");
        hour= sc.nextInt();
        System.out.println("ENTER RATE:");
        rate= sc.nextInt();
        salary=hour*rate;

    }
    public void display2(){

        System.out.println("FACULTY ID:"+id);
        System.out.println("FACULTY NAME:"+name);
        System.out.println("HOUR:"+hour);
        System.out.println("RATE:"+rate);
        System.out.println("SALARY:"+salary);
        System.out.println("_______________________________________");
    }
}
public class DriverClass {
    public static void main(String[] args) {
        FullTimeFaculty f=new FullTimeFaculty();
        f.read();
        FullTimeFaculty t=new FullTimeFaculty();
        t.read();
        PartTimeFaculty p=new PartTimeFaculty();
        p.read1();
        PartTimeFaculty l=new PartTimeFaculty();
        l.read1();
        System.out.println("******FULL TIME FACULTY DETAILS******");
        f.display();
        t.display();
        System.out.println("******PART TIME FACULTY DETAILS******");
        p.display2();
        l.display2();
    }

}
