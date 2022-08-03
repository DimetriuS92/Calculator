import java.util.Scanner;

public class ReadLine {
    private String line;

    private String[] parseLine;


    public ReadLine() {
        System.out.println("Enter your math example with next format (e.g. 1 + 3): ");

        Scanner in = new Scanner(System.in);

        if (in.hasNextLine()) {
            line = in.nextLine();
            parseLine = line.split(" ");

        }

    }


    public int getA() {
        return Integer.parseInt(parseLine[0]);

    }
    public String getOperator() {
        return parseLine[1];

    }
    public int getB() {
        return Integer.valueOf(parseLine[2]);
    }





}




