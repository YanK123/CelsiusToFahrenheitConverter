package yo;

public class CelsiusToFahrenheitConverter {
    public static void main(String[] args) {
        double celsius = 20.0;
        double celsius1  = 0.0;

        double fahrenheit = celsius * 9 / 5 + 32;
        double fahrenheit1 = celsius1 * 9 / 5 + 32;

        System.out.println(celsius + " °C -> " + fahrenheit + " °F");
        System.out.println(celsius1 + " °C -> " + fahrenheit1 + " °F");


    }

}
