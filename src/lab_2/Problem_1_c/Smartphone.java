package lab_2.Problem_1_c;

import java.util.Objects;

public class Smartphone extends Device {
    private String operatingSystem;

    public Smartphone(int memory, int dram, String model, int releaseYear, String operatingSystem) {
        super(memory, dram, model, releaseYear);
        this.operatingSystem = operatingSystem;
    }

    public String getOperatingSystem() {
        return operatingSystem;
    }

    @Override
    public String toString() {
        return "Smartphone : memory=" + getMemory() + ", dram=" + getDram() + ", model=" + getModel() +
                ", releaseYear=" + getReleaseYear() + ", operatingSystem=" + operatingSystem ;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Smartphone smartphone = (Smartphone) o;
        return operatingSystem.equals(smartphone.operatingSystem);

    }

    @Override
    public int hashCode() {
        return Objects.hash(operatingSystem);

    }
}
