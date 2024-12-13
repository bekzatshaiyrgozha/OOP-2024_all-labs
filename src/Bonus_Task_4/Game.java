package Bonus_Task_4;

public class Game {

    public static boolean canReachFood(Slime slime, Food food) {
        int distance = Math.abs(slime.getX()- food.getX())+Math.abs(slime.getY()- food.getY());

        return distance <= slime.getXp();
    }

    public static void moveToFood(Slime slime, Food food) {

        while(slime.getXp()>0 && slime.getX() != food.getX() || slime.getY() != food.getY()) {
            int currentX =slime.getX();
            int currentY= slime.getY();

            if(currentX < food.getX()) {
                slime.move(currentX + 1, currentY);
            }
            else if(currentX > food.getX()) {
                slime.move(currentX -1, currentY);
            }

            else if(currentY < food.getY()) {
                slime.move(currentX, currentY+1);
            }
            else if(currentY > food.getY()) {
                slime.move(currentX, currentY-1);
            }
        }


    }
    public static void main(String[] args) {
        Slime slime = new Slime(3,1,4);
        Food food = new Food(0,0);

        if(canReachFood(slime, food)) {
            System.out.println("He can reach!");
            moveToFood(slime, food);
            System.out.println("Slime reach food at: " + slime.getX()+ "," + slime.getY() + " with "+ slime.getXp() + "xp");

        }
        else {
            System.out.println("Call to Steve! The slime cannot reach the food :( ");
        }



    }
}
