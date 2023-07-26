package family_tree;

import java.io.IOException;

import family_tree.model.FamilyTree;
import family_tree.model.Human;
import family_tree.model.IO;
import family_tree.comporator.HumanComporatorByAge;
import family_tree.presenter.Presenter;

public class Main {
     public static void main(String[] args) throws IOException, ClassNotFoundException {
        FamilyTree<Human> familyTree = new FamilyTree<>();

        // добавляем немного данных
        familyTree.addFamilyTree(new Human("Алекс", "муж", 27));
        familyTree.addFamilyTree(new Human("Владимир Владимирович Путин", "муж", 70));
        familyTree.getByName("алекс");

        // MVP 
        View view = new Console();
        IO serialize = new IO();
        HumanComporatorByAge sortAge =  new HumanComporatorByAge();
        new Presenter(view, familyTree, serialize, sortAge);
           view.start();

    }
    
}
