import java.util.Scanner;

public class App {
    public void app() {
        while (0 != 1) {
            System.out.println("(Enter -h for help)");
            Scanner in = new Scanner(System.in);
            String action = in.nextLine();
            if (action.equals("-h")) {
                System.out.println(help.h());
            }

            // decode the top secret message
            // prompt enter the message
            // enter -h for help
            // enter "quit" to exit
            // enter "who" to view users + privileges
            // enter "username" to view messages
            // enter the key to decrypt


            if (action.equals("who")) {
                Who.who();
                }

            if (action.equals("login")) {
                Request.prompt();
            }


            if (action.equals("decrypt")) {
                DecrypXOR.decryptMessage();
                break;
            }


            if (action.equals("access")) {
                 SecurityScope scope = new SecurityScope();
            }

            if (action.equals("quit")) {
                break;
            }

        }

    }

}

