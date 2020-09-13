package School;

public class Parent {
    String femaleName;
    String manName;
    String kidName;

    public Parent(String femaleName, String manName, String kidName) {
        this.femaleName = femaleName;
        this.manName = manName;
        this.kidName = kidName;
    }

    public String getFemaleName() {
        return femaleName;
    }

    public void setFemaleName(String femaleName) {
        this.femaleName = femaleName;
    }

    public String getManName() {
        return manName;
    }

    public void setManName(String manName) {
        this.manName = manName;
    }

    public String getKidName() {
        return kidName;
    }

    public void setKidName(String kidName) {
        this.kidName = kidName;
    }
}
