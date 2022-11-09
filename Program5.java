import java.util.*;

class Tile{
    private int edge;
    private int area;

    Tile(int edge){
        this.edge=edge;
        this.area=edge*edge;
    }

    int getArea(){
        return area;
    }
}

class Floor{
    private int length;
    private int width;
    private int area2;

    Floor(int length, int width){
        this.length = length;
        this.width = width;
       this.area2=length*width;
    }
    int getArea2(){
        return area2;
    }

    void totalTiles(Tile t,Floor f){
        double tileArea = t.getArea();
        double floorArea = f.getArea2();
        double noOfTiles = floorArea/tileArea;
        System.out.println("Number of Tiles: "+noOfTiles);
    }
}

class Program5{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the length of Tile: ");
        int tileLength = sc.nextInt();
//Tile object
        Tile t = new Tile(tileLength);

        System.out.println("Enter the length and width of Floor: ");
        int fLength = sc.nextInt();
        int fWidth = sc.nextInt();
//Floor Object
        Floor f = new Floor(fLength,fWidth);

        f.totalTiles(t,f);
    }
}
