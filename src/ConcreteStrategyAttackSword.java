public class ConcreteStrategyAttackSword implements StrategyAttack {
    public void attack(ICharacter attacker, ICharacter defender){
        System.out.println(attacker.getName() + " slashes " + defender.getName() + " with a sword!");
        int damage = (attacker.getAttack()* - defender.getDefense())+1;
        if (damage < 0){
            damage = 0;
        }
        defender.setHealth(defender.getHealth() - damage);
        System.out.println(defender.getName() + " takes " + damage + " damage!");
    }

    @Override
    public void applySpecialEffects(ICharacter attacker, ICharacter defender) {
        // Bleeding effect
        int bleedingDamage = 5;
        System.out.println(defender.getName() + " starts bleeding due to " + attacker.getName() + "'s sword attack, suffering an additional " + bleedingDamage + " damage!");
        defender.setHealth(defender.getHealth() - bleedingDamage);
    }
}
