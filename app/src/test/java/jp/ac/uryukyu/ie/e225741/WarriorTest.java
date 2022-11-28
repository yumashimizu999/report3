package jp.ac.uryukyu.ie.e225741;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class WarriorTest {
    @Test
    void attackTest() {
        int defaultWarriorAttack = 100;
        int defaultEnemyHP = 500;
        for (int i=0; i<3; i++) {
            Warrior demoWarrior = new Warrior("デモ戦士", 100, defaultWarriorAttack);
            Enemy demoEnemy = new Enemy("デモスライム", 500, 10);
            demoWarrior.attackWithWeponSkill(demoEnemy);
            assertEquals(defaultWarriorAttack * 1.5, defaultEnemyHP - demoEnemy.getHitPoint()); 
        }
    }
}
