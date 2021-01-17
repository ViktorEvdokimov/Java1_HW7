package Cats;

public class Bowl {
    private int leftoverFood;

    public Bowl(int leftoverFood) {
        this.leftoverFood = leftoverFood;
    }

    public int getLeftoverFood() {
        return leftoverFood;
    }

    public void setLeftoverFood(int leftoverFood) {
        this.leftoverFood = leftoverFood;
    }
    public void eddFood (int foodQuantity){
        leftoverFood = leftoverFood + foodQuantity;
        System.out.println("Now in bowl " + leftoverFood + "food.");
    }
}
