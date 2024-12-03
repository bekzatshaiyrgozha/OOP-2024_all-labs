package Endterm_preparation.University_system;


import java.util.Comparator;
import java.util.Objects;

public class Student extends User implements Cloneable , Comparable<Student> {
    private String profession;

    public Student(String name,String email,String ID, String profession) {
        super(name,email,ID);
        this.profession = profession;
    }
    public String getProfession() {
        return profession;
    }
    public void setProfession(String profession) {
        this.profession = profession;
    }

    public boolean equals(Object o){
        if(this == o) return true;
        if(o == null || getClass()!=o.getClass()) return false;
        Student student = (Student) o;
        return Objects.equals(profession,student.profession);

    }

    @Override
    public int hashCode() {
        return Objects.hashCode(profession);
    }

    public Object clone() throws CloneNotSupportedException{
        return super.clone();
    }

    public int compareTo(Student student) {
        return this.profession.compareTo(student.profession);
    }

    @Override
    public String toString(){
        return super.toString() + " Profession: " + profession;
    }


}
