public class Arm2 {
    public int arm2(Monster geshila,Character XiaoMing,int Weapon2){
        System.out.println("王者权杖技能触发");
        geshila.setHp(geshila.getHp()-XiaoMing.getAg()-Weapon2);
        if (geshila.isalive()==0) return 1;
        XiaoMing.setHp(XiaoMing.getHp()-XiaoMing.hit(geshila.getAg()));
        if (XiaoMing.isalive()==0) return 1;
        return 0;
    }
}
