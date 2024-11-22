package practice_6.part_2;

public class Logic_Game implements Game,IGame{

    @Override
    public void csgo() {
        System.out.println("You will play csgo");
    }

    @Override
    public void dota2() {
        System.out.println("You will play dota2");
    }

    @Override
    public void fifa24() {
        System.out.println("You will play fifa24");
    }

    @Override
    public void gta6() {
        System.out.println("You will play Gta6");
    }
}
