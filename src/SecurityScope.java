import java.util.*;

public class SecurityScope {
    public List<ObjLable> allObjects = new ArrayList<>();
    public List<SubLable> allSubjects = new ArrayList<>();

    SecurityScope() {
        allObjects.add(new ObjLable(Clearance.Secret,
                new HashSet<Assigner>(Arrays.asList(Assigner.Alpha, Assigner.Bravo)),
                "Please send me documents regarding P551"));
        allObjects.add(new ObjLable(Clearance.Confidential,
                new HashSet<Assigner>(Arrays.asList(Assigner.Alpha)),
                "General Melnyk spoke to the press."));
        allObjects.add(new ObjLable(Clearance.Unclassified,
                new HashSet<Assigner>(Arrays.asList(Assigner.Alpha)),
                "Lets grab some coffee"));
        allObjects.add(new ObjLable(Clearance.Top_Secret,
                new HashSet<Assigner>(Arrays.asList(Assigner.Alpha)),
                "222727335432243c2b45272f3e34"));


        Subjects martha = new Subjects(
                Clearance.Secret,
                new HashSet<Assigner>(Arrays.asList(Assigner.Alpha)), "Martha");
        allSubjects.add(martha);
        Subjects stanley = new Subjects(
                Clearance.Unclassified,
                new HashSet<Assigner>(Arrays.asList(Assigner.Alpha)), "Stanley");
        allSubjects.add(stanley);
        Subjects barbra = new Subjects(
                Clearance.Confidential,
                new HashSet<Assigner>(Arrays.asList(Assigner.Alpha)), "Barbra");
        allSubjects.add(barbra);
        Subjects chris = new Subjects(
                Clearance.Secret,
                new HashSet<Assigner>(Arrays.asList(Assigner.Alpha)), "Chris");
        allSubjects.add(chris);
        Subjects william = new Subjects(
                Clearance.Top_Secret,
                new HashSet<Assigner>(Arrays.asList(Assigner.Alpha)), "William");
        allSubjects.add(william);


        for (ObjLable ol : allObjects) {
            for (SubLable sl : allSubjects) {
                int obj_level = Arrays.asList(Clearance.values()).indexOf(ol.getClearance());
                int sub_level = Arrays.asList(Clearance.values()).indexOf(sl.getClearance());

                if (sub_level >= obj_level) {
                    if (sl.getAssigner().containsAll(ol.getAssigner())) {
                        System.out.print(sl.getName() + " ");
                        ol.showSecretMessage();

                    }

                }
            }
        }
    }
}