package lab3.problem_1.abstructs;

public class ClothesTester {
    public static void main(String[] args) {
        Clothes jacket = new Jacket(56,"black",20000);
        Clothes aShort = new Short(56,"black",20000);

        jacket.showDetails();
        jacket.wear();
        aShort.wear();
        aShort.showDetails();



    }
}
