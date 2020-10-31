public class Arm3 {
    public int arm3(Monster geshila,Character XiaoMing,int Possible,int Weapon3){
        System.out.println("霜之哀伤技能触发");
        geshila.setHp(geshila.getHp()-XiaoMing.getAg()-Weapon3);
        if (geshila.isalive()==0) return 1;
        if (Possible>=0&&Possible<=19) {
            System.out.println("霜之哀伤技能触发 目标停止运动一回合");
            return 0;
        }
        XiaoMing.setHp(XiaoMing.getHp()-XiaoMing.hit(geshila.getAg()));
        if (XiaoMing.isalive()==0) return 1;
        return 0;
    }
}
