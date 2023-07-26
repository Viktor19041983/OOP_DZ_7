package family_tree.comporator;
import java.util.Comparator;

import family_tree.model.Human;

public class HumanComporatorByAge implements Comparator<Human>{
     
    @Override
    public int compare(Human o1, Human o2) {

        return Integer.compare(o1.getAge(), o2.getAge());
    }
    
}
