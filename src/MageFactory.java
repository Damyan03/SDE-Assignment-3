public class MageFactory implements CharacterFactory{
    public Character makeCharacter(String name, int health, int attack, int defense){
        return new Mage(name, health, attack, defense);
    }
}
