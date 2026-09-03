import java.util.ArrayList;

public class Case {

    private String caseName;

    private ArrayList<Suspect> suspects;
    private ArrayList<Evidence> evidence;
    private ArrayList<Statement> statements;

    public Case(String caseName) {

        this.caseName = caseName;

        suspects = new ArrayList<>();
        evidence = new ArrayList<>();
        statements = new ArrayList<>();
    }

    public void addSuspect(Suspect suspect) {
        suspects.add(suspect);
    }

    public void addEvidence(Evidence evidenceItem) {
        evidence.add(evidenceItem);
    }

    public void addStatement(Statement statement) {
        statements.add(statement);
    }

    public ArrayList<Suspect> getSuspects() {
        return suspects;
    }

    public ArrayList<Evidence> getEvidence() {
        return evidence;
    }

    public ArrayList<Statement> getStatements() {
        return statements;
    }

    public String getCaseName() {
        return caseName;
    }
}