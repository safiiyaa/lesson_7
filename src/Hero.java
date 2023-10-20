public abstract class Hero implements HavingSuperAbility {
    protected int health;
    protected   int damage;
    protected String superAbility;
    public Hero(int health, int damage, String superAbility){
        this.damage = damage;
        this.health = health;
        this.superAbility = superAbility;
    }



    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }
}
