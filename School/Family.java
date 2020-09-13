package School;

public class Family  extends Parent {
    int familyBudget;
    int familyBudgetInDay;

    public Family(String femaleName, String manName, String kidName) {
        super(femaleName, manName, kidName);
        this.familyBudget = familyBudget;
        this.familyBudgetInDay = familyBudgetInDay;
    }


    public int getFamilyBudget() {
        return familyBudget;
    }

    public void setFamilyBudget(int familyBudget) {
        this.familyBudget = familyBudget;
    }

    public int getFamilyBudgetInDay() {
        return familyBudgetInDay;
    }

    public void setFamilyBudgetInDay(int familyBudgetInDay) {
        this.familyBudgetInDay = familyBudgetInDay;
    }
}
