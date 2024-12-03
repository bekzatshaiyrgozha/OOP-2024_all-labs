package Endterm_preparation.University_system;

public class Teacher extends User{
    String subject;

    public Teacher(String name,String email,String ID,String subject){
        super(name,email,ID);
        this.subject = subject;
    }
    public String getSubject(){
        return subject;
    }
    public void setSubject(String subject){
        this.subject = subject;
    }

    public String toString(){
        return "Subject: "+ subject + super.toString();
    }

    public void setEmail(String email){
        super.setEmail(email);
    }
}
