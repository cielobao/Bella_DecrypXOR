import java.util.Scanner;

public class Who {
    public static void who() {
        String s0Name = Subjects.subject0().getName();
        String s0Clearance = String.valueOf(Subjects.subject0().getClearance());
        System.out.println(s0Name + " " + "--- " + s0Clearance);

        String s1Name = Subjects.subject1().getName();
        String s1Clearance = String.valueOf(Subjects.subject1().getClearance());
        System.out.println(s1Name + " " + "--- " + s1Clearance);

        String s2Name = Subjects.subject2().getName();
        String s2Clearance = String.valueOf(Subjects.subject2().getClearance());
        System.out.println(s2Name + " " + "--- " + s2Clearance);

        String s3Name = Subjects.subject3().getName();
        String s3Clearance = String.valueOf(Subjects.subject3().getClearance());
        System.out.println(s3Name + " " + "--- " + s3Clearance);

        String s4Name = Subjects.subject4().getName();
        String s4Clearance = String.valueOf(Subjects.subject4().getClearance());
        System.out.println(s4Name + " " + "--- " + s4Clearance);
    }
}
