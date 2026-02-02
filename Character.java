// Character.java
public class Character {
    private int health;
    private int stamina;
    private final int maxHealth;
    private final int maxStamina;

    public int getHealth() {
        return health;
    }

    public int getStamina() {
        return stamina;
    }

    public Character(int health, int stamina) {
        this.maxHealth = health;
        this.maxStamina = stamina;
        this.health = health;
        this.stamina = stamina;
        System.out.println("Character created with " + health + " health and " + stamina + " stamina.");
    }

    public void swingSword() {
        if (stamina >= 10) {
            stamina -= 10;
            System.out.println("Character swings sword. Stamina is now " + stamina + ".");
        }
        if (stamina == 0) {
            System.out.println("Your character needs to cool down.");
        }
    }

    public void takeDamage(int dmg) {
        System.out.print("Character takes " + dmg);
        if (dmg > health) dmg = health;

        health -= dmg;

        System.out.println(" damage. Health is now " + health + ".");

        if (health == 0) {
            System.out.println("Character is dead.");
        }
    }

    public void rest() {
        health = maxHealth;
        stamina = maxStamina;
        System.out.println("Character has rested. Health and stamina restored to maximum.");
    }
}