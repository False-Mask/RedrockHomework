public class Arm1{//
    public int arm1(Monster geshila,Character XiaoMing,int Weapon1t,int Weapon1){
        System.out.println("血色冠冕技能触发！\n"+XiaoMing.getName()+"扣除"+Weapon1t+"血量");
        XiaoMing.setHp(XiaoMing.getHp()-Weapon1t);
        if (XiaoMing.isalive()==0) return 1;
        System.out.println(XiaoMing.getName()+"触发攻击"+"对"+geshila.getName()+"造成"+XiaoMing.getAg()+"点伤害");
        geshila.setHp(geshila.getHp()-XiaoMing.getAg());
        if (geshila.isalive()==0) return 1;
        System.out.println(geshila.getName()+"触发攻击"+"对"+XiaoMing.getName()+"造成"+geshila.getAg()+"点伤害");
        XiaoMing.setHp(XiaoMing.getHp()-XiaoMing.hit(geshila.getAg()));
        if (XiaoMing.isalive()==0) return 1;
        System.out.println("本回合结束");
        geshila.setHp(geshila.getHp()-Weapon1);
        if (geshila.isalive()==0) return 1;
        SmallPart.Sleep(1000);
        return 0;
    }
}