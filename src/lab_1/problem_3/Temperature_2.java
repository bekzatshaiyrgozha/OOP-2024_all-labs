package lab_1.problem_3;
public class Temperature_2 {
    private double temperature;
    private char scale ;

    public Temperature_2() {
        this.temperature = 0;
        this.scale = 'C';
    }
    public Temperature_2(double temperature) {
        this.temperature = temperature;
        this.scale = 0;
    }
    public Temperature_2(char scale) {
        this.temperature = 0;
        this.scale = scale;
    }

    public Temperature_2(double temperature,char scale) {

        this.temperature = temperature;
        this.scale = scale;
    }

    public double toCelsius(double temperature,char scale) {
        if(scale == 'F') {
            return 9*temperature/5+32;
        }

        return temperature;
    }
    public double toForengeit(double temperature,char scale) {
        if(scale == 'C') {
            return 5*(temperature-32)/9;
        }
        return temperature;
    }

    public char getScale() {
        return scale;
    }
    public String getTemperature() {
        return "Temperature: " + temperature + "° " + scale;
    }

}

