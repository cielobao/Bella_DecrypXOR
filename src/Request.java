import java.util.Scanner;

public class Request {

    public static void prompt() {
        int liveCL = Access.Access();
        while (liveCL <= 4) {
            System.out.println("Please select a message to view: ");
            System.out.println("0 --- message0");
            System.out.println("1 --- message1 ");
            System.out.println("2 --- message2");
            System.out.println("3 --- message3 [URGENT] ");
            Scanner in = new Scanner(System.in);
            String select = String.valueOf(in.nextLine());
            int selCL = Integer.parseInt(select);


            if (liveCL == 0 && selCL == 0) {
                System.out.println(Message.message0().showSecretMessage());
                break;
            }
            if (liveCL == 0 && selCL == 1) {
                System.out.println(Message.message1().showSecretMessage());
                break;
            }
            if (liveCL == 0 && selCL == 2) {
                System.out.println(Message.message2().showSecretMessage());
                break;
            }
            if (liveCL == 0 && selCL == 3) {
                System.out.println("PERMISSION DENIED");
                break;
            }



            if (liveCL == 1 && selCL == 0) {
                System.out.println("PERMISSION DENIED");
                break;
            }
            if (liveCL == 1 && selCL == 1) {
                System.out.println("PERMISSION DENIED");
                break;
            }
            if (liveCL == 1 && selCL == 2) {
                System.out.println(Message.message2().showSecretMessage());
                break;
            }
            if (liveCL == 1 && selCL == 3) {
                System.out.println("PERMISSION DENIED");
                break;
            }




            if (liveCL == 2 && selCL == 0) {
                System.out.println("PERMISSION DENIED");
                break;
            }
            if (liveCL == 2 && selCL == 1) {
                System.out.println(Message.message1().showSecretMessage());
                break;
            }
            if (liveCL == 2 && selCL == 2) {
                System.out.println(Message.message2().showSecretMessage());
                break;
            }
            if (liveCL == 2 && selCL == 3) {
                System.out.println("PERMISSION DENIED");
                break;
            }





            if (liveCL == 3 && selCL == 0) {
                System.out.println(Message.message0().showSecretMessage());
                break;
            }
            if (liveCL == 3 && selCL == 1) {
                System.out.println(Message.message1().showSecretMessage());
                break;
            }
            if (liveCL == 3 && selCL == 2) {
                System.out.println(Message.message2().showSecretMessage());
                break;
            }
            if (liveCL == 3 && selCL == 3) {
                System.out.println("PERMISSION DENIED");
                break;
            }




            if (liveCL == 4 && selCL == 0) {
                System.out.println(Message.message0().showSecretMessage());
                break;
            }
            if (liveCL == 4 && selCL == 1) {
                System.out.println(Message.message1().showSecretMessage());
                break;
            }
            if (liveCL == 4 && selCL == 2) {
                System.out.println(Message.message2().showSecretMessage());
                break;
            }
            if (liveCL == 4 && selCL == 3) {
                System.out.println(Message.message3().showSecretMessage());
            break;
            }

            App app = new App();
            app.app();

        }
    }
}