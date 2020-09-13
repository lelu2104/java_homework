package School;

public class SchoolWork implements Runnable {
    School school;
    
    SchoolWork(School school) {
        this.school = school;
    }
    
    public void run() {
        for (int i = 1; i < 6; i++) {
            school.rest();
            
        }
    }
}
