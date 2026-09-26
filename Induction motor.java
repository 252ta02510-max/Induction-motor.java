import java.util.Scanner;

public class InductionMotor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Induction Motor Calculator");
        System.out.println("--------------------------");

        System.out.print("Enter Supply Frequency (Hz): ");
        double f = sc.nextDouble();

        System.out.print("Enter Number of Poles: ");
        int P = sc.nextInt();

        System.out.print("Enter Rotor Speed (RPM): ");
        double Nr = sc.nextDouble();

        // Synchronous speed
        double Ns = (120 * f) / P;

        // Slip
        double slip = (Ns - Nr) / Ns;
        double slipPercent = slip * 100;

        // Rotor frequency
        double rotorFrequency = slip * f;

        System.out.println("\nResults:");
        System.out.println("Synchronous Speed = " + Ns + " RPM");
        System.out.println("Slip = " + slipPercent + " %");
        System.out.println("Rotor Frequency = " + rotorFrequency + " Hz");

        sc.close();
    }
}
