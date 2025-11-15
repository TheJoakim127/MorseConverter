package morseconverter;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Logic converter = new Logic();


        while (true) {
            System.out.print("Skriv vad du vill översätta från/till morsekod:");
            String input = scanner.nextLine();

            try {
                if (input.equalsIgnoreCase("stop"))
                    break;
                System.out.println("Översattes till: " + converter.convert(input));
                System.out.println("\nSkriv stop för att avsluta");



            }catch (Exception e){
                System.out.println("Oväntat fel.. Försök igen!");
                System.out.println(e);

            }
        }

    }
}
