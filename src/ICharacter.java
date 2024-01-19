public interface ICharacter {
    int getHealth();
    void setHealth(int health);
    String getName();

    StrategyAttack getStrategy();

    int getAttack();

    int getDefense();

    void setStrategy(StrategyAttack strategy);

    void attack(ICharacter opponent);
}