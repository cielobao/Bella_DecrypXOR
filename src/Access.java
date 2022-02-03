import java.util.Scanner;

public class Access {

    public static int Access(){
        System.out.println("Please enter a number for a subject: ");
        System.out.println("0 --- Martha");
        System.out.println("1 --- Stanley");
        System.out.println("2 --- Barbra");
        System.out.println("3 --- Chris");
        System.out.println("4 --- William");
        Scanner in = new Scanner(System.in);
        String user = String.valueOf(in.nextLine());
        int userCL = Integer.parseInt(user);

        int access = userCL;

        switch (access) {
            case 0:
                System.out.println("Martha | Clearance Level: Secret");
                System.out.println("");
                break;
            case 1:
                System.out.println("Stanley | Clearance Level: Unclassified");
                System.out.println("");
                break;
            case 2:
                System.out.println("Barbra | Clearance Level: Confidential");
                System.out.println("");
                break;
            case 3:
                System.out.println("Chris | Clearance Level: Secret");
                System.out.println("");
                break;
            case 4:
                System.out.println("William | Clearance Level: Top Secret");
                System.out.println("");
                break;

            default:
                System.out.println("PERMISSION DENIED");
        }
        return access;
    }

}
