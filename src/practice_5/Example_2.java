package practice_5;

public class Example_2
{
    public static void main(String[] args)
    {
        int        i=0, ratio;
        int[]      numbers = {100,10,0,5,2,8,0,30};

        try
        {
            for (i=0; i < numbers.length-1; i++)
            {
                ratio = numbers[i] / numbers[i+1];
                System.out.println(numbers[i]+"/"+numbers[i+1]+"="+ratio);
            }
        }
        catch (ArithmeticException ae)
        {
            System.out.println("Couldn't calculate "+
                    numbers[i]+"/"+numbers[i+1]);
        }
    }
}

//Алғаш запускать еткенде variable i might not have been initialized деп шығады
//себебі i ға бастапқы мән берілмеген деп көрсетеді . Мәні траи да анықталған,ол катч да қолданылады ,

/*
for(i=0;i<numbers.length;i++){
            try {
                ratio = numbers[i] / numbers[i+1];
                System.out.println(numbers[i]+"/"+numbers[i+1]+"="+ratio);
            }
            catch (ArithmeticException ae)
            {
                System.out.println("Couldn't calculate "+
                        numbers[i]+"/"+numbers[i+1]);
            }
        }  //түзетілген код , әр цикл сайын тексеріп отырады .
 */