package practice_6.part_2;

public class App {
    public void getStatistics(Game g) {
        g.csgo();
        g.dota2();
        g.fifa24();
        if (g instanceof IGame) {
            ((IGame)g).gta6();
        }

    }

}
