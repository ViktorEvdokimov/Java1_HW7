import Cats.Bowl;
import Cats.Cat;

public class Main {

    public static void main(String[] args) {
	Bowl bowl = new Bowl(500);
	Cat[] cats = new Cat[] {new Cat(100, "Cat1"),
            new Cat(200, "Cat2"),
            new Cat(140, "Cat3"),
            new Cat(300, "Cat4"),
            new Cat(10, "Cat5")};
	for(int i=0; i<cats.length; i++){
	    cats[i].eat(bowl);
	    cats[i].printInfo();
    }
	bowl.eddFood(500);
    }

}
