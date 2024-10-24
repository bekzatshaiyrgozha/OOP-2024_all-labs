package lab_2.Problem_4;
public class Series extends Circuit {
    private Circuit circuit1;
    private Circuit circuit2;

    public Series(Circuit circuit1, Circuit circuit2) {
        this.circuit1 = circuit1;
        this.circuit2 = circuit2;
    }

    @Override
    public double getResistance() {
        return circuit1.getResistance() + circuit2.getResistance();
    }

    @Override
    public double getPotentialDiff() {
        return circuit1.getPotentialDiff() + circuit2.getPotentialDiff();
    }

    @Override
    public void applyPotentialDiff(double V) {
        double totalResistance = getResistance();
        double current = V / totalResistance;
        circuit1.applyPotentialDiff(current * circuit1.getResistance());
        circuit2.applyPotentialDiff(current * circuit2.getResistance());
    }
}
