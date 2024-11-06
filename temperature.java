import java.util.Scanner;

class Recording {
    String name = "";
    float[] temperature = new float[6];

    float average() {
        float sum = 0;
        for (int i = 0; i < 6; i++) {
            sum += temperature[i];
        }
        return sum / 6;
    }

    int coldestDay() {
        int indexl = 0;
        float mint = Float.MAX_VALUE;
        for (int i = 0; i < 6; i++) {
            if (temperature[i] < mint) {
                mint = temperature[i];
                indexl = i;
            }
        }
        return indexl + 1;
    }

    int hottestDay() {
        int indexh = 0;
        float maxt = Float.MIN_VALUE;
        for (int i = 0; i < 6; i++) {
            if (temperature[i] > maxt) {
                maxt = temperature[i];
                indexh = i;
            }
        }
        return indexh + 1;
    }
}

public class temperature {
    public static void main(String[] args) {
        int totalCity = 5;
        int totalDay = 6;
        Scanner input = new Scanner(System.in);
        Recording[] cities = new Recording[totalCity];

        System.out.println("Temperature Recordings for the Month of January for the first 6 days\nEnter the details:");

        for (int j = 0; j < totalCity; j++) {
            cities[j] = new Recording();

            System.out.print("\nEnter the name of the " + (j + 1) + "th City: ");
            cities[j].name = input.next();

            System.out.println("Enter the temperatures for " + cities[j].name + " for " + totalDay + " days:");

            for (int k = 0; k < totalDay; k++) {
                System.out.print("Temperature on day " + (k + 1) + ": ");
                cities[j].temperature[k] = input.nextFloat();
            }
        }

        float max = Float.MIN_VALUE, min = Float.MAX_VALUE;
        int indexh = 0, indexl = 0;

        for (int i = 0; i < totalCity; i++) {
            float avgTemp = cities[i].average();

            if (avgTemp > max) {
                max = avgTemp;
                indexh = i;
            }
            if (avgTemp < min) {
                min = avgTemp;
                indexl = i;
            }
        }

        System.out.println("\nCity with highest average temperature: " + cities[indexh].name +
                "\nAverage temperature: " + cities[indexh].average() +
                "\nHottest day: Day " + cities[indexh].hottestDay());

        System.out.println("\nCity with lowest average temperature: " + cities[indexl].name +
                "\nAverage temperature: " + cities[indexl].average() +
                "\nColdest day: Day " + cities[indexl].coldestDay());

        input.close();
    }
}