package jp.ac.uryukyu.ie.e225741;

public class Warrior extends Hero{
    public Warrior(String name,int maximumHP,int attack){
        super(name,maximumHP,attack);
    }
    public void attackWithWeponSkill(LivingThings a){
        if (this.dead == false){
            int damage = (int)(this.attack * 1.5);
            System.out.printf("%sの攻撃！ウェポンスキルを発動！%sに%dのダメージを与えた！！\n", name, a.getName(), damage);
            a.wounded(damage);
        }
    }
    
}
