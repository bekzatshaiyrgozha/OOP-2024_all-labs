package Problem_5;

class PhDStudent extends Person {
    private String researchArea;

    public PhDStudent(String name, int age, String researchArea) {
        super(name, age, null);
        this.researchArea = researchArea;
    }

    @Override
    public String getOccupation() {
        return "PhD Student - research in " + researchArea;
    }

    @Override
    public void assignPet(Animal pet) {
        if (pet instanceof Dog) {
            System.out.println("PhD students cannot have dogs!");
        } else {
            super.assignPet(pet);
        }
    }
}