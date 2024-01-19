public class Warrior extends Character {
    public Warrior(String name, int health, int attack, int defense) {
        super(name, health, attack, defense);
    }

    @Override
    protected void prepareForAttack() {
        System.out.println(this.getName() + " is sharpening their blade...");
    }

    @Override
    protected void finalizeAttack() {
        System.out.println(this.getName() + " is adjusting his stance...");
    }
}
