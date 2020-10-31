public class Monster {
    private String name;
    private int hp;
    private int ag;
    int count=0;
    public int setName(String name) {
       if (name.length()>0&&name.length()<=50){
           this.name = name;
           return 1;
       }
       else {
           System.out.print("录入失败！请重新输入名称:");
           return 0;
       }
    }
    public String getName() {
        return name;
    }
    public int setAg(int ag) {
        if (ag>0&&ag<=999) {
            this.ag = ag;
            return 1;
        }
        else {
            System.out.print("录入失败！请重新输入攻击力:");
            return 0;
        }
    }
    public int getAg() {
        return ag;
    }
    public int setHp(int hp) {
        if (hp>0&&hp<=999)  {
            this.hp = hp;
            return 1;
        }
        else {
            this.hp=hp;
            return 0;
        }
    }
    public int getHp() {
        return hp;
    }
    public int isalive(){
        if (hp<=0){
            System.out.println(name+"血量值为0挑战成功");
            hp=0;
            return 0;
        }
        else {
            System.out.println(name+"当前剩余血量为"+hp);
            return 1;
        }
    }
}
