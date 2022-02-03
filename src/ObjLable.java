import java.util.Set;

public class ObjLable {

    private Clearance Clearance;
    private Set<Assigner> Assigner;
    private String secretMessage;

    ObjLable(Clearance Clearance, Set<Assigner> securityLables, String message) {
        this.Clearance = Clearance;
        this.Assigner = securityLables;
        this.secretMessage = message;
    }

    public Set<Assigner> getAssigner() {
        return this.Assigner;
    }

    public Clearance getClearance() {
        return this.Clearance;
    }

    public String showSecretMessage() {
        System.out.println(" ");
        System.out.println(this.secretMessage);
        return "";
    }


}
