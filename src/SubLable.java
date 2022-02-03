import java.util.Set;

public class SubLable {
    private Clearance Clearance;
    private Set<Assigner> Assigner;
    private String name;

    SubLable(Clearance Clearance, Set<Assigner> securityLables, String name) {
        this.Clearance = Clearance;
        this.Assigner = securityLables;
        this.name = name;
    }

    public String getName() { return this.name; }
    public Set<Assigner> getAssigner() { return this.Assigner; }
    public Clearance getClearance() { return this.Clearance;}
}
