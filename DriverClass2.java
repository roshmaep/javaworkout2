class OneBHK {
    double roomArea;
    double hallArea;
    double price;

    OneBHK() {
        roomArea = 3.38;
        hallArea = 17.35;
        price = 1200000;
    }

    OneBHK(double room, double hall, double amt) {
        roomArea = room;
        hallArea = hall;
        price = amt;

    }

    void show() {
        System.out.println("ROOM AREA" + roomArea);
        System.out.println("HALL AREA" + hallArea);
        System.out.println("PRICE" + price);
    }
}
    class TwoBHK extends OneBHK {
        double room2Area;

        TwoBHK() {
            double roomArea1 = super.roomArea;
            double hallArea2=super.hallArea;
            double price1=super.price;
            room2Area = 4.38;

        }

        TwoBHK(double a,double b,double c,double room2)
        {
            super.roomArea=a;
            super.hallArea=b;
            super.price=c;
            room2Area = room2;


        }

        void show() {
            System.out.println("ROOM AREA:" +super.roomArea);
            System.out.println("HALL AREA:" +super.hallArea);
            System.out.println("PRICE:" +super.price);
            System.out.println("ROOM2 AREA:" + room2Area);
        }
    }

public class DriverClass2 {
    public static void main(String[] args) {
        System.out.println("FIRST FLAT INFORMATION");
        System.out.println("_______________________");
        TwoBHK t=new TwoBHK(3.56,17.34,1300000,2.48);
        t.show();
        System.out.println("SECOND FLAT INFORMATION");
        System.out.println("_______________________");
        TwoBHK m=new TwoBHK(4.67,12.38,1400000,1.99);
        m.show();
        System.out.println("THIRD FLAT INFORMATION");
        System.out.println("_______________________");
        TwoBHK p=new TwoBHK(5.78,12.44,1600000,3.88);
        p.show();
        double total=t.price+ m.price+p.price;
        System.out.println("TOTAL FLAT AMOUNT:"+total);
    }
}
