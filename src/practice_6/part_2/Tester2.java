package practice_6.part_2;

public class Tester2 {
    public static void main(String[] args) {
        Iphone iphone = new Iphone("Iphone 16",300000);
        System.out.println(iphone);
        PowerSocket pw = new PowerSocket();
        pw.charge(iphone);

        App app = new App();
        MemoryGame memoryGame = new MemoryGame();
        Logic_Game logic = new Logic_Game();
        app.getStatistics(memoryGame);
        app.getStatistics(logic);





    }
}
