package TugasPraktikum.AttributeBehaviourAndConstructor.NomorSatu;

public class Player {

     private String name;
     private int atk, hp, def;

     public Player(String name, int atk, int def) {
          this.name = name;
          this.def = def;
          this.atk = atk;
          hp = 100;
     }

     public void takeDamage(Player enemy) {
          hp -= (enemy.getAttackPower() - def);
     }

     public int getAttackPower() {
          return atk;
     }

     public void status() {
          System.out.println(name + " status");
          System.out.println("Hp\t : " + hp);
          System.out.println("Atk\t : " + atk);
          System.out.println("Def\t : " + def);
     }
}