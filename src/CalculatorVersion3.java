import java.util.Scanner;
public class CalculatorVersion3 {

    public static void main(String[] args) {
        calculator();
    }
    public static void calculator() {
        boolean key=false;

        do {
            Scanner scan = new Scanner(System.in);
            System.out.println("Input the math action:");
            System.out.println("-------------------------------");
            System.out.println("|-| |+| |/| |*| |mod| |div| |^|:");
            System.out.println("-------------------------------");
            String action = scan.next();

            switch (action) {
                case "div": // integer division
                    System.out.println("Input first value - v1:");
                    int value1 = scan.nextInt();
                    System.out.println("Input second value - v2:");
                    int value2 = scan.nextInt();
                    System.out.println("v1 |div| v2 = " + value1 / value2);
                    key=true;
                    break;

                case "-": //double difference
                    System.out.println("Input first value - v1:");
                    double value3 = scan.nextDouble();
                    System.out.println("Input second value - v2:");
                    double value4 = scan.nextDouble();
                    System.out.println("v1 |-| v2 = " + (value3 - value4));
                    key=true;
                    break;

                case "+": //double sum
                    System.out.println("Input first value - v1:");
                    value3 = scan.nextDouble();
                    System.out.println("Input second value - v2:");
                    value4 = scan.nextDouble();
                    System.out.println("v1 |+| v2 = " + (value3 + value4));
                    key=true;
                    break;

                case "/": //double division
                    System.out.println("Input first value - v1:");
                    value3 = scan.nextDouble();
                    System.out.println("Input second value - v2:");
                    value4 = scan.nextDouble();
                    System.out.println("v1 |/| v2 = " + (value3 / value4));
                    key=true;
                    break;

                case "*": //double multiplication
                    System.out.println("Input first value - v1:");
                    value3 = scan.nextDouble();
                    System.out.println("Input second value - v2:");
                    value4 = scan.nextDouble();
                    System.out.println("v1 |*| v2 = " + (value3 * value4));
                    key=true;
                    break;

                case "mod": //remainder of division
                    System.out.println("Input first value - v1:");
                    value3 = scan.nextDouble();
                    System.out.println("Input second value - v2:");
                    value4 = scan.nextDouble();
                    System.out.println("v1 |mod| v2 = " + (value3 % value4));
                    key=true;
                    break;
                case "^": //exponentiation
                    System.out.println("Input first value - v1:");
                    value3 = scan.nextDouble();
                    System.out.println("Input second value - v2:");
                    value4 = scan.nextDouble();
                    System.out.println("v1 |^| v2 = " + (Math.pow(value3, value4)));
                    key=true;
                    break;
                default:
                    System.out.println("Try again");
                    key=false;

            } //switch
        } //do
        while (key==false);//relaunch when key=false
    } //psv

} //end