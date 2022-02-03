import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Message extends ObjLable {
    Message(Clearance Clearance, Set<Assigner> securityLables, String message) {
        super(Clearance, securityLables, message);

    }

    public static ObjLable message0() {
        Message message0 = new Message(Clearance.Secret,
                new HashSet<Assigner>(Arrays.asList(Assigner.Alpha, Assigner.Bravo)),
                "Please send me documents regarding P551");
        return (message0);
    }

    public static ObjLable message1() {
        Message message1 = new Message(Clearance.Confidential,
                new HashSet<Assigner>(Arrays.asList(Assigner.Alpha, Assigner.Bravo)),
                "General Melnyk spoke to the press.");
        return (message1);
    }

    public static ObjLable message2() {
        Message message2 = new Message(Clearance.Unclassified,
                new HashSet<Assigner>(Arrays.asList(Assigner.Alpha, Assigner.Bravo)),
                "Lets grab some coffee");
        return (message2);
    }

    public static ObjLable message3() {
        Message message3 = new Message(Clearance.Top_Secret,
                new HashSet<Assigner>(Arrays.asList(Assigner.Alpha, Assigner.Bravo)),
                "222727335432243c2b45272f3e34");
        return (message3);
    }

}