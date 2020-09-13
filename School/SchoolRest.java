package School;

public class SchoolRest implements Runnable {
    School school;

    SchoolRest(School school) {
        this.school = school;
    }

    public void run() {
        for (int i = 1; i < 6; i++) {
            school.rest();

        }
    }
}

