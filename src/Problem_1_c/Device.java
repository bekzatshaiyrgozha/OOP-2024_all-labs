package Problem_1_c;

import java.util.Objects;

public class Device {
    private int memory;
    private int dram;
    private String model;
    private int releaseYear;

    public Device(int memory, int dram, String model, int releaseYear) {
        this.memory = memory;
        this.dram = dram;
        this.model = model;
        this.releaseYear = releaseYear;
    }
    public int getMemory() {
        return memory;
    }

    public int getDram() {
        return dram;
    }

    public String getModel() {
        return model;
    }

    public int getReleaseYear() {
        return releaseYear;
    }


    @Override
    public String toString() {
        return "Device memory=" + memory + ", dram=" + dram + ", model=" + model + ", releaseYear=" + releaseYear;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Device device = (Device) o;
        return memory == device.memory && dram == device.dram && model.equals(device.model);
    }

    @Override
    public int hashCode() {
        return Objects.hash(memory, dram, model);
    }
}
