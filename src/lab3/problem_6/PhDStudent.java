package lab3.problem_6;

class PhDStudent extends Person {
    private String researchTopic;

    public PhDStudent(String name, int age, String major, String researchTopic) {
        super(name, age);
        this.researchTopic = researchTopic;
    }

    public String getOccupation() {
        return "PhD Student - Research: " + researchTopic;
    }

    @Override
    public void assignPet(Animal pet) {
        if (pet instanceof Dog) {
            System.out.println("PhD students cannot have a dog.");


        } else {
            super.assignPet(pet);
        }
    }
}
