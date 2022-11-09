public class MathFunction {
    static int multiply(int x, int y)
    {
        return (x*y);
    }
    static float multiply(float x,float y )
        {
            return (x*y);

        }

    static float multiply(float x,int y )
    {
       return (x*y);
    }
    public static void main(String[] args)
    {

        System.out.println(multiply(1,2));
        System.out.println(multiply(2.1f,3.1f));
        System.out.println(multiply(2.1f,3));
    }

}

