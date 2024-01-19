public class WarriorFactory implements CharacterFactory {
    public Character makeCharacter(String name, int health, int attack, int defense){
        return new Warrior(name, health, attack, defense);
    }
}
