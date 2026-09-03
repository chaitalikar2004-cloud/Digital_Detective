public class Suspect {

    private String name;
    private String occupation;
    private String alibi;

    public Suspect(String name, String occupation, String alibi) {
        this.name = name;
        this.occupation = occupation;
        this.alibi = alibi;
    }

    public String getName() {
        return name;
    }

    public String getOccupation() {
        return occupation;
    }

    public String getAlibi() {
        return alibi;
    }
}