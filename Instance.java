public class Instance {
    static int count;
    static int id;
    public Instance()
    {
        count++;
    }
    public static void main(String[] args) throws InterruptedException
    {
        Instance t1=new Instance();
        Instance t2=new Instance();
        Instance t3=new Instance();
        Instance t4=new Instance();
        Instance t5=new Instance();
        t1=null;
        t2=null;
        t3=null;
        Runtime.getRuntime().gc();
        System.out.println("object created:"+count);
        System.out.println("object destroyed:"+id);
        System.out.println("object alive:"+(count-id));
    }
    protected void finalize()
    {
        id++;
    }
}
