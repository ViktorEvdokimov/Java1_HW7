package Cats;


public class Cat {
    private int doseSize;
    private boolean isHungry = false;
    private String name;

    public Cat(int doseSize, String name) {
        this.doseSize = doseSize;
        this.name = name;
        this.isHungry = false;
    }
    public void eat (Bowl bowl){
        if (bowl.getLeftoverFood()>doseSize){
            bowl.setLeftoverFood(bowl.getLeftoverFood()-doseSize);
            isHungry = true;
            System.out.print(String.format("Cat %s eat. Now in bowl %d food%n", name, bowl.getLeftoverFood()));
        } else System.out.print(String.format("Cat %s can`t eat%n", name));
    }
    public void printInfo(){
        System.out.print(String.format("Name: %s%nDoze size: %d%nCat is %shungry%n", name, doseSize, isHungry ? "not " : ""));
    }

}
