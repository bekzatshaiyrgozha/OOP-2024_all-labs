package practice_5;

public class Example_3
{
    public static void main(String[] args)
    {
        int              i;
        int[]            data = {50, 320, 97, 12, 2000};


        try
        {
            for (i=0; i < 10; i++)
            {
                System.out.println(data[i]);
            }
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Done");
        }
    }
}

//Done шығады себебі ұзындық онға дейін деп тұр
//Жай ғана lenght ға дейін деп шығарсақ болады,сосын шығыс өзгермеу керек дейді , яғни Done;


/*
for (int i = 0; i < data.length; i++)  {
        System.out.println(data[i]);
        }
        System.out.println("Done");
 */
