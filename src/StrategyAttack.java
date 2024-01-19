public interface StrategyAttack {
    public void attack(ICharacter attacker, ICharacter defender);

    void applySpecialEffects(ICharacter attacker, ICharacter defender);
}