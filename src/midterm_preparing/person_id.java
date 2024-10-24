package midterm_preparing;

import java.util.Objects;

public class person_id {
    int id;
    String name;

    public person_id(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public boolean equals(Object o){
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        person_id person_id = (person_id) o;
        return id == person_id.id && Objects.equals(name, person_id.name);


    }
    public String toString() {
        return "person_id{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }




    public static void main(String[] args) {
        person_id p = new person_id(7, "p");
        person_id q = new person_id(7, "p");
        System.out.println(p);
        System.out.println(q);
        if (p.equals(q)) {
            System.out.println("Objects are equal");
        } else {
            System.out.println("Objects are not equal");
        }



    }
}
