package lab_1.problem_4;

public class Course {
    private String name;
    private String description;
    private int credits;
    private String prerequisites;

    public Course(String name,String description,int credits,String prerequisite) {
        this.credits = credits;
        this.description = description;
        this.name = name;
        this.prerequisites = prerequisite;
    }

    public String toString() {
        return name + ": " + description + " (" + credits + " credits, prerequisites: " + prerequisites + ")";


    }
}
