import Classes.*;

public class Main {
    public static void main(String[] args) {
        Entity mc = new Entity("Person",10,2);
        Entity enemy = new Entity("Goblin", 5, 1);
        while(mc.IsAlive() && enemy.IsAlive()){
            mc.GetAttacked(enemy.getDamage());
            System.out.println(enemy.getName() + " Attacks " + mc.getName() + " For "+ enemy.getDamage() + " Damage");
            enemy.GetAttacked(mc.getDamage());
            System.out.println(mc.getName() + " Attacks " + enemy.getName() + " For "+ mc.getDamage() + " Damage ");
        }
        System.out.println("  ");
        if(mc.IsAlive()){
            mc.victory();
        }else{
            enemy.victory();
        }
    }

}