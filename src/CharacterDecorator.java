public abstract class CharacterDecorator implements ICharacter {
    protected ICharacter tempCharacter;

    public CharacterDecorator(ICharacter character) {
        this.tempCharacter = character;
    }

    @Override
    public int getAttack() {
        return tempCharacter.getAttack();
    }

    @Override
    public int getDefense() {
        return tempCharacter.getDefense();
    }

    public int getHealth() {
        return tempCharacter.getHealth();
    }

    public void setHealth(int health) {
        tempCharacter.setHealth(health);
    }

    public String getName() {
        return tempCharacter.getName();
    }

    public StrategyAttack getStrategy() {
        return tempCharacter.getStrategy();
    }

    public void attack(Character opponent) {
        tempCharacter.attack(opponent);
    }
}