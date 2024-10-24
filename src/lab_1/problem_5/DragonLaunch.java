package lab_1.problem_5;

import java.util.Vector;


public class DragonLaunch{
    private Vector<Person> kinappedpeople;

    public DragonLaunch() {
        kinappedpeople = new Vector<>();
    }
    public void kinap(Person p){
        kinappedpeople.add(p);
    }
    public boolean DragonWiilEat() {
        int boycount = 0;
        for(Person person : kinappedpeople) {
            if(person.getGender() == Gender.BOY) {
                boycount++;
            }else if(boycount > 0) {
                boycount--;
            }
        }
        return boycount >0 || kinappedpeople.size()%2!=0;
    }
}
