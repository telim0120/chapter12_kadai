public class Thief extends Character {
    public void attack(Monster m) {
        System.out.println(this.name + "の攻撃！");
        System.out.println("敵に5ポイントのダメージ");
        m.hp -= 5;
    }
}