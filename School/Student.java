package School;

public class Student extends Family {
    String nameStudent;
    int classNumber;
    String classLetter;
    int behavior;
    int score;
    boolean delay;
    int basicIQ;
    boolean potential;
    int amountPerDay;

    public Student(String femaleName, String manName, String kidName, String nameStudent, int classNumber, String classLetter, int behavior, int score, boolean delay, int basicIQ, boolean potential, int amountPerDay) {
        super(femaleName, manName, kidName);
        this.nameStudent = nameStudent;
        this.classNumber = classNumber;
        this.classLetter = classLetter;
        this.behavior = behavior;
        this.score = score;
        this.delay = delay;
        this.basicIQ = basicIQ;
        this.potential = potential;
        this.amountPerDay = amountPerDay;
    }

    public String getNameStudent() {
        return nameStudent;
    }

    public void setNameStudent(String nameStudent) {
        this.nameStudent = nameStudent;
    }

    public int getClassNumber() {
        return classNumber;
    }

    public void setClassNumber(int classNumber) {
        this.classNumber = classNumber;
    }

    public String getClassLetter() {
        return classLetter;
    }

    public void setClassLetter(String classLetter) {
        this.classLetter = classLetter;
    }

    public int getBehavior() {
        return behavior;
    }

    public void setBehavior(int behavior) {
        this.behavior = behavior;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public boolean isDelay() {
        return delay;
    }

    public void setDelay(boolean delay) {
        this.delay = delay;
    }

    public int getBasicIQ() {
        return basicIQ;
    }

    public void setBasicIQ(int basicIQ) {
        this.basicIQ = basicIQ;
    }

    public boolean getPotential() {
        return potential;
    }

    public void setPotential(boolean potential) {
        this.potential = potential;
    }

    public int getAmountPerDay() {
        return amountPerDay;
    }

    public void setAmountPerDay(int amountPerDay) {
        this.amountPerDay = amountPerDay;
    }

    @Override
    public String toString() {
        return "Student{" +
                "nameStudent='" + nameStudent + '\'' +
                ", classNumber=" + classNumber +
                ", classLetter='" + classLetter + '\'' +
                ", behavior=" + behavior +
                ", score=" + score +
                ", delay=" + delay +
                ", basicIQ=" + basicIQ +
                ", potential=" + potential +
                ", amountPerDay=" + amountPerDay +
                ", familyBudget=" + familyBudget +
                ", familyBudgetInDay=" + familyBudgetInDay +
                ", femaleName='" + femaleName + '\'' +
                ", manName='" + manName + '\'' +
                ", kidName='" + kidName + '\'' +
                '}';
    }
}
