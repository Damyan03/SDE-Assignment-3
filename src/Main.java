public class Main {
    public static void main(String[] args) {
        MageFactory mf = new MageFactory();
        WarriorFactory wf = new WarriorFactory();

        // Create characters and set their strategies
        ICharacter player1 = mf.makeCharacter("Warrior", 1000, 32, 12);

        ICharacter player2 = wf.makeCharacter("Mage", 1000, 20, 10);

        // Decorate player 2 with a fire enchantment
        ICharacter player2Fire = new FireEnchantmentDecorator(player2);

        String winner = battle(player1, player2Fire);

        System.out.println(winner + " wins!");

    }

    public static String battle(ICharacter player1, ICharacter player2) {
        // Initialize strategies
        StrategyAttack bowStrategy = new ConcreteStrategyAttackBow();
        StrategyAttack swordStrategy = new ConcreteStrategyAttackSword();

        // Initial strategy assignment
        player1.setStrategy(bowStrategy);
        player2.setStrategy(swordStrategy);

        while (player1.getHealth() > 0 && player2.getHealth() > 0) {
            // Randomly switch strategies
            if (Math.random() < 0.10){
                player1.setStrategy(player1.getStrategy() == bowStrategy ? swordStrategy : bowStrategy);
                player2.setStrategy(player2.getStrategy() == swordStrategy ? bowStrategy : swordStrategy);
            }

            // Player 1's turn
            System.out.println(player1.getName() + " attacks " + player2.getName() + "!");
            player1.attack(player2); // Now this follows the Template Method pattern
            System.out.println(player2.getName() + " has " + player2.getHealth() + " health remaining.");


            // Check if player 2 is defeated
            if (player2.getHealth() <= 0) {
                System.out.println(player2.getName() + " is defeated!");
                return player1.getName();
            }

            // Player 2's turn
            System.out.println(player2.getName() + " attacks " + player1.getName() + "!");
            player2.attack(player1); // Now this follows the Template Method pattern
            System.out.println(player1.getName() + " has " + player1.getHealth() + " health remaining.");

            // Check if player 1 is defeated
            if (player1.getHealth() <= 0) {
                System.out.println(player1.getName() + " is defeated!");
                return player2.getName();
            }

            System.out.println("---------------------------------");
        }
        throw new IllegalStateException("Players have <0 starting health");
    }
}