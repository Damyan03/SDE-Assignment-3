    public class FireEnchantmentDecorator extends CharacterDecorator {
        public FireEnchantmentDecorator(ICharacter character) {
            super(character);
        }

        @Override
        public void attack(ICharacter opponent) {
        }
        @Override
        public String getName() {
            return "FIRE " + tempCharacter.getName();
        }

        @Override
        public void setStrategy(StrategyAttack strategy) {
            tempCharacter.setStrategy(strategy);
        }
    }