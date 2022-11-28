package jp.ac.uryukyu.ie.e225741;

public class LivingThings {
    String name;
    int hitPoint;
    int attack;
    boolean dead;

    public String getName(){
        return name;
    }
    public boolean getDead(){
        return dead;
    }
    public int getHitPoint(){
        return hitPoint;
    }

    public LivingThings(String name, int maximumHP,int attack){
        this.name = name;
        hitPoint = maximumHP;
        this.attack = attack;
        dead = false;
        System.out.printf("%sのHPは%d。攻撃力は%dです。\n", name, maximumHP, attack);
    }

    public boolean isDead(){
        return dead;
    }

    public void attack(LivingThings opponent){
        if (this.dead == false){
            int damage = (int)(Math.random() * attack);
            System.out.printf("%sの攻撃！%sに%dのダメージを与えた！！\n", name, opponent.getName(), damage);
            opponent.wounded(damage);
        }
    }

    public void wounded(int damage){
        hitPoint -= damage;
        if (hitPoint < 0){
            dead = true;
            System.out.printf("モンスター%sは倒れた。\n", name);
        }
    }
}