
import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class Main {

    private static final Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        System.out.println("========================================");
        System.out.println(" VARIANCE AND STANDARD DEVIATION");
        System.out.println("========================================");

        double[] data = readData();

        double mean = calculateMean(data);
        double populationVariance = calculatePopulationVariance(data, mean);
        double populationStdDev = Math.sqrt(populationVariance);

        System.out.println("\nChoose the dataset type:");
        System.out.println("1 - Population");
        System.out.println("2 - Sample");

        int choice = readChoice();

        System.out.println("\n============== RESULTS ==============");
        System.out.println("Data: " + Arrays.toString(data));
        System.out.printf("Number of values: %d%n", data.length);
        System.out.printf("Mean: %.4f%n", mean);

        System.out.printf(
            "Population variance: %.4f%n",
            populationVariance
        );
        System.out.printf(
            "Population standard deviation: %.4f%n",
            populationStdDev
        );

        if (data.length >= 2) {
            double sampleVariance = calculateSampleVariance(data, mean);
            double sampleStdDev = Math.sqrt(sampleVariance);

            System.out.printf(
                "Sample variance: %.4f%n",
                sampleVariance
            );
            System.out.printf(
                "Sample standard deviation: %.4f%n",
                sampleStdDev
            );
        } else {
            System.out.println(
                "Sample statistics require at least two values."
            );
        }

        System.out.println("\nSelected interpretation:");

        if (choice == 1) {
            System.out.println("The dataset represents a population.");
            System.out.printf(
                "Variance: %.4f%n",
                populationVariance
            );
            System.out.printf(
                "Standard deviation: %.4f%n",
                populationStdDev
            );
        } else if (data.length >= 2) {
            System.out.println("The dataset represents a sample.");
            System.out.printf(
                "Variance: %.4f%n",
                calculateSampleVariance(data, mean)
            );
            System.out.printf(
                "Standard deviation: %.4f%n",
                Math.sqrt(calculateSampleVariance(data, mean))
            );
        } else {
            System.out.println(
                "A sample requires at least two observations."
            );
        }

        System.out.println("=====================================");
        System.out.println("Calculation completed successfully.");

        SCANNER.close();
    }

    private static double[] readData() {
        int size;

        while (true) {
            System.out.print("\nEnter the number of values (minimum 1): ");

            if (SCANNER.hasNextInt()) {
                size = SCANNER.nextInt();

                if (size >= 1) {
                    break;
                }

                System.out.println("Please enter a positive integer.");
            } else {
                System.out.println("Invalid input. Enter an integer.");
                SCANNER.next();
            }
        }

        double[] data = new double[size];

        for (int i = 0; i < size; i++) {
            while (true) {
                System.out.printf("Enter value %d: ", i + 1);

                if (SCANNER.hasNextDouble()) {
                    double value = SCANNER.nextDouble();

                    if (Double.isFinite(value)) {
                        data[i] = value;
                        break;
                    }

                    System.out.println(
                        "Please enter a finite numeric value."
                    );
                } else {
                    System.out.println(
                        "Invalid input. Enter a numeric value."
                    );
                    SCANNER.next();
                }
            }
        }

        return data;
    }

    private static int readChoice() {
        while (true) {
            System.out.print("Enter your choice (1 or 2): ");

            if (SCANNER.hasNextInt()) {
                int choice = SCANNER.nextInt();

                if (choice == 1 || choice == 2) {
                    return choice;
                }
            } else {
                SCANNER.next();
            }

            System.out.println("Invalid choice. Please enter 1 or 2.");
        }
    }

    public static double calculateMean(double[] data) {
        validateData(data);

        double sum = 0.0;

        for (double value : data) {
            sum += value;
        }

        return sum / data.length;
    }

    public static double calculatePopulationVariance(
        double[] data,
        double mean
    ) {
        validateData(data);

        double sumSquaredDifferences = 0.0;

        for (double value : data) {
            double difference = value - mean;
            sumSquaredDifferences += difference * difference;
        }

        return sumSquaredDifferences / data.length;
    }

    public static double calculateSampleVariance(
        double[] data,
        double mean
    ) {
        validateData(data);

        if (data.length < 2) {
            throw new IllegalArgumentException(
                "Sample variance requires at least two values."
            );
        }

        double sumSquaredDifferences = 0.0;

        for (double value : data) {
            double difference = value - mean;
            sumSquaredDifferences += difference * difference;
        }

        return sumSquaredDifferences / (data.length - 1);
    }

    private static void validateData(double[] data) {
        if (data == null || data.length == 0) {
            throw new IllegalArgumentException(
                "The dataset cannot be empty."
            );
        }

        for (double value : data) {
            if (!Double.isFinite(value)) {
                throw new IllegalArgumentException(
                    "All values must be finite numbers."
                );
            }
        }
    }
}
