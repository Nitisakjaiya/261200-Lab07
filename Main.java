public class Main {
    public static void main(String[] args) {
        Character myCharacter = new Character(100, 50);

        myCharacter.swingSword();
        myCharacter.swingSword();
        myCharacter.swingSword();
        myCharacter.swingSword();
        myCharacter.swingSword();
        myCharacter.swingSword();
        System.out.println("Character's health: " + myCharacter.getHealth() + ",stamina:" + myCharacter.getStamina() );

        myCharacter.takeDamage(30);
        myCharacter.takeDamage(50);
        myCharacter.takeDamage(20);
        System.out.println("Character's health: " + myCharacter.getHealth() + ",stamina:" + myCharacter.getStamina() );

        myCharacter.rest();

        System.out.println("Character's health: " + myCharacter.getHealth() + ",stamina:" + myCharacter.getStamina() );

        myCharacter.takeDamage(110);
        System.out.println("Character's health: " + myCharacter.getHealth() + ",stamina:" + myCharacter.getStamina() );
    }
}