public class Arm4 {
    public int arm4(Monster geshila,Character XiaoMing,int Possible){
        geshila.setHp(geshila.getHp()-XiaoMing.getAg());
        if (geshila.isalive()==0) return 1;
        if (Possible>=0&&Possible<=14){
            geshila.count++;
            if (geshila.count==4) geshila.count=0;
            return 0;
        }
        XiaoMing.setHp(XiaoMing.getHp()-XiaoMing.hit(geshila.getAg()));
        if (XiaoMing.isalive()==0) return 1;
        return 0;
    }
}
