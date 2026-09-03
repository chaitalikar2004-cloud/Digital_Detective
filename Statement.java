public class Statement {

    private String suspectName;
    private String statement;

    public Statement(String suspectName, String statement) {
        this.suspectName = suspectName;
        this.statement = statement;
    }

    public String getSuspectName() {
        return suspectName;
    }

    public String getStatement() {
        return statement;
    }
}