public class Mage extends Character {
    public Mage(String name, int health, int attack, int defense) {
        super(name, health, attack, defense);
    }

    @Override
    protected void prepareForAttack() {
        System.out.println(this.getName() + " is charing up an attack...");
    }

    @Override
    protected void finalizeAttack() {
        System.out.println(this.getName() + " is feeling drained after the attack...");
    }
}