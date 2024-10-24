package midterm_preparing;

public class StudentKBTU extends Person {
    private int year;
    private int fee;
    private String program;
    public StudentKBTU(String name, int age, int year, int fee, String program){
        super(name,age);
        this.year = year;
        this.fee = this.fee;
        this.program = program;
    }
    public int getYear(){
        return year;
    }
    public int getFee(){
        return fee;
    }
    public String getProgram(){
        return program;
    }
    public void setYear(int year){
        this.year = year;
    }
    public void setFee(int fee) {
        this.fee = fee;
    }
    public void setProgram(String program){
        this.program = program;
    }
    public String toString(){
        return super.toString()+" year:"+year+" fee:"+fee+" program:"+program;
    }
}
