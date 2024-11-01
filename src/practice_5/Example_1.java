package practice_5;

public class Example_1
{
    public static void main(String[] args)
    {
        int denominator, numerator, ratio;


        numerator   = 5;
        denominator = 2;


        ratio = numerator / denominator;
        System.out.println("The answer is: "+ratio);

        System.out.println("Done."); // Don't move this line
    }
}

//The answer is: 2
//Done.

//if denominator = 0; ->Exception in thread "main" java.lang.ArithmeticException: / by zero
//                     маин методтың қателер библятекасында нолге бөлме дейді


/*
1.коммпиляция уақыты айнымалы дұрыс берілуі,жақшалар т.б
2.орындалу уақыты нөлден үлкен болу керек т.б
 */
/*
try {
    ratio = numerator / denominator;
} catch (ArithmeticException e) {
    // ешнәрсе жазылмайды
}                     //қате шықпайды но тоже дым шықпайды,катч та дым жоқ
 */

/*

try {
    ratio = numerator / denominator;
    System.out.println("The answer is: " + ratio);
} catch (ArithmeticException e) {
    System.out.println("Divide by 0.");
}
        // Divide by 0.
        //Done.
 */

/*
try {
    ratio = numerator / denominator;
    System.out.println("The answer is: " + ratio);
} catch (ArithmeticException e) {
    System.out.println("Divide by 0.");
    e.printStackTrace();
}

//Divide by 0.
//java.lang.ArithmeticException: / by zero
//    at practice_5.Example_1.main(Example_1.java:10)
//Done. //қай жерде қате болғанын көрсететін әдіс
 */