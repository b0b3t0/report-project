import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReportConsoleApplication {
    public static void main(String[] args) {

        System.out.println("====================================");
        System.out.println("Welcome to Java Report Application");
        System.out.println("====================================");
        System.out.println();

        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))){
            System.out.println("Please enter path to the JSON data file:");
            String dataFileInputPath = reader.readLine();
            System.out.println("Please enter path to the JSON report definition file:");
            String reportDefinitionFilePath = reader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
