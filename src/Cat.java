public class Cat {
    int levelEating;

    public Cat(int levelEating) {
        this.levelEating = levelEating;
    }

    public int feed(Food food) {
        levelEating += food.additionEat;
        if (levelEating > 100) {
            levelEating = 100;
        }
        return levelEating;
    }
    public int levelEating(Food eat) {
        return 0;
    }
}
