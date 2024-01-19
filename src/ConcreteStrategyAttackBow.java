public class ConcreteStrategyAttackBow implements StrategyAttack {
    public void attack(ICharacter attacker, ICharacter defender){
        System.out.println(attacker.getName() + " shoots " + defender.getName() + " with a bow!");
        int damage = (attacker.getAttack() - defender.getDefense())-1;
        if (damage < 0){
            damage = 0;
        }
        defender.setHealth(defender.getHealth() - damage);
        System.out.println(defender.getName() + " takes " + damage + " damage!");
    }

    @Override
    public void applySpecialEffects(ICharacter attacker, ICharacter defender) {
        // Chance for a critical hit
        double criticalChance = 0.25;
        if (Math.random() < criticalChance) {
            int criticalDamage = 10;
            System.out.println(attacker.getName() + " lands a critical hit on " + defender.getName() + ", dealing an additional " + criticalDamage + " damage!");
            defender.setHealth(defender.getHealth() - criticalDamage);
        }
    }
}
