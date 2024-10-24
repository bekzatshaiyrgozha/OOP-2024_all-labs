package midterm_preparing;

public class Macbook {
    private  String name;
    private String color;
    private MacbookType macbookType;
    public Macbook(String name, String color, MacbookType macbookType) {
        this.name = name;
        this.color = color;
        this.macbookType = macbookType;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public MacbookType getMacbookType() {
        return macbookType;
    }
    public void setMacbookType(MacbookType macbookType) {
        this.macbookType = macbookType;
    }
    public String toString() {
        return "Name: " + name + ", Color: " + color + ", Type: " + macbookType;
    }


}
