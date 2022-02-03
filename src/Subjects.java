import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Subjects extends SubLable {


    Subjects(Clearance Clearance, Set<Assigner> securityLables, String name) {
        super(Clearance, securityLables, name);
    }

    public static SubLable subject0() {
        Subjects subject0 = new Subjects(Clearance.Secret,
                new HashSet<Assigner>(Arrays.asList(Assigner.Alpha)), "Martha");
        return subject0;
    }

    public static SubLable subject1() {
        Subjects subject1 = new Subjects(Clearance.Unclassified,
                new HashSet<Assigner>(Arrays.asList(Assigner.Alpha)), "Stanley");
        return (subject1);
    }

    public static SubLable subject2() {
        Subjects subject2 = new Subjects(Clearance.Confidential,
                new HashSet<Assigner>(Arrays.asList(Assigner.Alpha)), "Barbra");
        return (subject2);
    }

    public static SubLable subject3() {
        Subjects subject4 = new Subjects(Clearance.Secret,
                new HashSet<Assigner>(Arrays.asList(Assigner.Alpha)), "Chris");
        return (subject4);
    }

    public static SubLable subject4() {
        Subjects subject4 = new Subjects(Clearance.Top_Secret,
                new HashSet<Assigner>(Arrays.asList(Assigner.Alpha)), "William");
        return (subject4);
    }
}
