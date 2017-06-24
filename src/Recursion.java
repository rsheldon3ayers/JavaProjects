/**
 * Created by Robert Ayers on 6/23/17.
 */
public class Recursion
{
    public static void moving(int spaces)
    {
//        determines how many time the method will run
        if(spaces <= 100)
        {
//            prints the spaces before the sentence
            for(int counter = 0; counter <= spaces; counter++)
                System.out.print(" ");
//            prints the sentence
            System.out.printf("There are %d spaces before this sentence%n", spaces);

//            increments the total spaces and calls the method

            moving(spaces + 1);
        }

    }

    public static void main(String[] args)
    {
        System.out.println("Calling this method only once will result in 100 lines being printed");

//        recursive method called
        
        moving(0);

    }
}
