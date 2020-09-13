package School;

public class Teacher extends Subject {
    String category;
    int scoreCertificate;
    int basicQuality;
    boolean hiddenPotential;
    int costPerDay;

    public Teacher(String subjectName, String teacherName, String category, int scoreCertificate, int basicQuality, boolean hiddenPotential, int costPerDay) {
        super(subjectName, teacherName);
        this.category = category;
        this.scoreCertificate = scoreCertificate;
        this.basicQuality = basicQuality;
        this.hiddenPotential = hiddenPotential;
        this.costPerDay = costPerDay;
    }



    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public int getScoreCertificate() {
        return scoreCertificate;
    }

    public void setScoreCertificate(int scoreCertificate) {
        this.scoreCertificate = scoreCertificate;
    }

    public int getBasicQuality() {
        return basicQuality;
    }

    public void setBasicQuality(int basicQuality) {
        this.basicQuality = basicQuality;
    }

    public boolean isHiddenPotential() {
        return hiddenPotential;
    }

    public void setHiddenPotential(boolean hiddenPotential) {
        this.hiddenPotential = hiddenPotential;
    }

    public int getCostPerDay() {
        return costPerDay;
    }

    public void setCostPerDay(int costPerDay) {
        this.costPerDay = costPerDay;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "category='" + category + '\'' +
                ", scoreCertificate=" + scoreCertificate +
                ", basicQuality=" + basicQuality +
                ", hiddenPotential='" + hiddenPotential + '\'' +
                ", costPerDay=" + costPerDay +
                ", subjectName='" + subjectName + '\'' +
                ", teacherName='" + teacherName + '\'' +
                '}';
    }
}
