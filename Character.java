public class Character {
    private int defen;      //防御力
    private String name;    //名字
    private int hp;         //血条
    private int ag;         //公鸡力
    public int setName(String name) {
        if (name.length()>0&&name.length()<=50) {
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
    public int getHp() {
        return hp;
    }
    public int setHp(int hp) {
        if (hp>0&&hp<=999) {
            this.hp = hp;
            return 1;
        }
        else {
            this.hp=hp;
            return 0;
        }
    }
    public int setDefen(int defen) {
        if (defen>0&&defen<=999){
            this.defen = defen;
            return 1;
        }
        else {
            System.out.print("录入失败！请重新输入防御力:");
            return 0;
        }
    }
    public int getDefen() {
        return defen;
    }//上述函数仅供用于基础修改
    public int isalive(){
        if (hp<=0){
            System.out.println(name+"血量值为0挑战失败");
            hp=0;
            return 0;
        }
        else {
            System.out.println(name+"当前剩余血量为"+hp);
            return 1;
        }
    }
    public int hit(int hit1){
        int hpr;  //扣除的血量
        if (hit1-defen<=0) hpr=1;
        else hpr=hit1-defen;
        return hpr;
    }
}
