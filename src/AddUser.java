import java.util.ArrayList;
import java.util.Scanner;

public class AddUser {
        private String firstName;
        private String lastName;
        private String subjectID;
        private int clearance;
        private float budget = 0;
        private static int id = 100;

        public void Subject() {
            Scanner in = new Scanner(System.in);
            System.out.println("Enter first name: ");
            this.firstName = in.nextLine();

            System.out.println("Enter last name: ");
            this.lastName = in.nextLine();

            System.out.println("1 - Unclassified\n2 - Confidential\n3 - Secret\n4 - Top Secret\nEnter clearance level: ");
            this.clearance = in.nextInt();
            setSubjectID();
            System.out.println(firstName + " " + lastName + " " +  "" + subjectID);


        }

        public void budget() {
            System.out.print("Enter their budget: ");
            Scanner funding = new Scanner(System.in);
            String newBudget = String.valueOf(funding.nextLine());
            Float newBal2 = Float.parseFloat(newBudget);
            this.budget = (budget + newBal2);
//            System.out.println("Budget is: " + budget);



        }

        public String showInfo () {
            return "Name: " + firstName + " " + lastName +
                    "\nClearance Level: " + clearance +
                    "\nSubject ID: " + subjectID +
                    "\nCurrent Budget: " + budget;
        }

        private void setSubjectID() {
            id++;
            this.subjectID = clearance + "" + id;
        }

        public static void activeSubjects(String name, int clearance, String activity){
        }

    }
