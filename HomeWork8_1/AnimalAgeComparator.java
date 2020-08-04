package HomeWork8_1;

import java.util.Comparator;

public class AnimalAgeComparator implements Comparator<Animal> {

    public int compare(Animal a1, Animal a2){

        if(a1.getAge()> a2.getAge())
            return 1;
        else if(a1.getAge()< a2.getAge())
            return -1;
        else
            return 0;
    }

}
