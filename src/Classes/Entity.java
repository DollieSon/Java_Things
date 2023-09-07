package Classes;

public class Entity {
    private String Name;
    private int MaxHealth;
    private int CurrHealth;
    private int Damage;

    public Entity(String name, int maxHealth, int damage) {
        Name = name;
        MaxHealth = maxHealth;
        CurrHealth = maxHealth;
        Damage = damage;
    }

    public String getName() {
        return Name;
    }

    public int getMaxHealth() {
        return MaxHealth;
    }

    public int getCurrHealth() {
        return CurrHealth;
    }
    public int getDamage() {
        return Damage;
    }

    public int GetAttacked(int damage){
        CurrHealth -= damage;
        if(CurrHealth < 0){
            return -1;
        }
        return 0;
    }
    public boolean IsAlive(){
        return (CurrHealth > 0);
    }

    public void ResetHealth(){
        CurrHealth = MaxHealth;
    }

    public void victory(){
        System.out.println(this.Name + " Won!");
    }


}
