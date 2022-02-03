import java.util.Scanner;

public class DecrypXOR {
    private static Scanner in;


    static void decryptMessage() {
        while (1 != 0) {
            System.out.println(" ");
            System.out.print("Copy and Paste The Message: ");
            Scanner msg1 = new Scanner(System.in);
            String msg = String.valueOf(msg1.nextLine());


            System.out.println("(TIP: WHAT'S THE NAME OF OUR COMPANY | LOWERCASE ONLY)");
            System.out.print("Enter key: ");
            Scanner in = new Scanner(System.in);
            String key = String.valueOf(in.nextLine());
            if (!key.equals("revature")) {
                try {
                    Key.error();
                } catch(invalidException e){
                System.out.println("Try again");
                decryptMessage();
            }
        }

            String hexToDeci = "";
            for (int i = 0; i < msg.length() - 1; i += 2) {
                String output = msg.substring(i, (i + 2));
                int decimal = Integer.parseInt(output, 16);
                hexToDeci += (char) decimal;
            }

            String decrypText = "";
            int keyItr = 0;
            for (int i = 0; i < hexToDeci.length(); i++) {
                int temp = hexToDeci.charAt(i) ^ key.charAt(keyItr);

                decrypText += (char) temp;
                keyItr++;
                if (keyItr >= key.length()) {
                    keyItr = 0;
                }

            }

            System.out.println("Decrypted Text: " + decrypText);

            String XOR = decrypText;
            XOR = XOR.toUpperCase();

            int key0 = 13;
            String decrypText13 = "";
            for (int i = 0; i < XOR.length(); i++) {
                int temp = (int) XOR.charAt(i) - key0;
                if ((int) XOR.charAt(i) == 32) {
                    decrypText13 += " ";
                } else if (temp < 65) {
                    temp += 26;
                    decrypText13 += (char) temp;
                } else {
                    decrypText13 += (char) temp;
                }
            }

            System.out.println("Decrypted Message: " + decrypText13);

            if (key.equals("revature")) {
                break;
            }

        }
    }
}
