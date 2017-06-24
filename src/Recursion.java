/**
 * Created by Robert Ayers on 6/23/17.
 */
public class Recursion
{
    public static void moving(int spaces)
    {
        do {

                if (spaces <= 1)
                System.out.printf("The total number of spaces is: %d and will increase until it reaches 100", spaces);
                else
                {
                    for(int counter = 0; counter <= spaces; counter++)
                        System.out.print(" ");

                    moving(spaces + 1);

                }


        } while (spaces <= 1);

    }

    public static void main(String[] args)
    {

        moving(1);
//        for (int counter = 0; counter <= 21; counter++)
//            System.out.printf("%d! = %d%n", counter, factorial(counter));
    }
}
