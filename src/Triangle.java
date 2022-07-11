import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Triangle {

    private int a;
    private int b;

    public Triangle(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public static Integer tryParse(String s) throws Exception{
        try
        {
          return Integer.parseInt(s);

        }
        catch (NumberFormatException e)
        {
            return null;
        }
    }

    public static boolean PositivValidate(Integer a) {

                try {

                    if (a <= 0 )  {

                        return false;
                    }
                    return true;
                }
                catch (NullPointerException e)

                {
                    return false;
                }
    }
    public  Integer getSquare ()
    {
        return (a*b)/2;

    }


    public static void main(String[] args) throws Exception{

       BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
       Integer a= null;
       System.out.println("enter a");
       while (!PositivValidate(a))
               {
                     try
                     {
                         if (a <= 0)
                             {
                                 System.out.println("Error: only positive Integer value");
                             }
                     }
                     catch (NullPointerException q)
                     {}
                     a = tryParse(bufferedReader.readLine());
               }
        Integer b = null;
        System.out.println("enter b");

        while (!PositivValidate(b))
            {
                try
                {
                    if (b <= 0)
                    {
                        System.out.println("Error: only positive Integer value");
                    }
                }
                catch (NullPointerException q)
                {}
                b = tryParse(bufferedReader.readLine());
            }
       Triangle triangle = new Triangle(a,b);
       System.out.println("Square value is:"+triangle.getSquare());



    }


}