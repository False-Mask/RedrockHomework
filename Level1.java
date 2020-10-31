import java.util.Scanner;
import java.util.Random;
public class Level1 {
    public static void main(String[] args){
    //角色 怪物 输入  对象的建立
    Character XiaoMing=new Character();
    Monster geshila=new Monster();
    Scanner Sc=new Scanner(System.in);
    //属性值
        int hp1,hp2,ag1,ag2,defen1;String name1,name2 ;
    //怪物对象以及角色对象属性的录入
        System.out.print("请输入角色的血量：");
        for (;;) {
            hp1=Sc.nextInt();
            if (XiaoMing.setHp(hp1)==1) break;
            System.out.print("录入失败！请重新输入血量:");
        }
        System.out.print("请输入角色的攻击力：");
        for (;;){
            ag1=Sc.nextInt();
            if (XiaoMing.setAg(ag1)==1) break;
        }
        System.out.print("请输入角色的名称：");
        for (;;){
            name1=Sc.next();
            if (XiaoMing.setName(name1)==1) break;
        }
        System.out.print("请输入角色的防御力：");
        for (;;){
            defen1=Sc.nextInt();
            if (XiaoMing.setDefen(defen1)==1) break;
        }
        SmallPart.Sleep(1000);
        System.out.print("\n\n恭喜你已经完成了角色信息的录入\n");
        SmallPart.Sleep(1000);
        System.out.print("下面即将开始怪兽信息的录入\n");
        SmallPart.Sleep(500);
        System.out.print("请输入怪兽的血量：");
        for (;;){
            hp2=Sc.nextInt();
            if (geshila.setHp(hp2)==1) break;
            System.out.print("录入失败！请重新输入血量:");
        }
        System.out.print("请输入怪兽的攻击：");
        for (;;){
            ag2=Sc.nextInt();
            if (geshila.setAg(ag2)==1) break;
        }
        System.out.print("请输入名称：");
        for (;;){
            name2=Sc.next();
            if (geshila.setName(name2)==1) break;
        }
        System.out.println("数据录入完成");
        SmallPart.Sleep(400);
        System.out.println("正在加载程序请稍后");
        SmallPart.Sleep(1000);
        System.out.println("程序加载完成");
        System.out.println("请为"+XiaoMing.getName()+"选择武器");
        System.out.println("1.血色冠冕："+"\n"+"作用效果描述：每回合开始随机扣除角色5-20血量，本回合结束后随机扣除目标20-30血量");
        SmallPart.Sleep(3000);
        System.out.println("2.王者权杖："+"\n"+"作用效果描述：附加角色的攻击值（随机附加10-20）");
        SmallPart.Sleep(3000);
        System.out.println("3.霜之哀伤："+"\n"+"为目标对象每回合附加5-10霜冻伤害，同时有20%可能使得目标停止行动1回合");
        SmallPart.Sleep(3000);
        System.out.println("4.万钧"+"\n"+"无任何伤害携带此物有15%可能使得目标处于眩晕状态（无法发达攻击）4回合");
        System.out.print("请选择：");
        //随机数生成
        int choice=Sc.nextInt();
        Random rand=new Random();
        for (int i=1,count=0;geshila.getHp()!=0 && XiaoMing.getHp()!=0; i++) {
            int Weapon1t= rand.nextInt(15)+5;
            int Weapon1= rand.nextInt(10)+20;
            int Weapon2= rand.nextInt(10)+10;
            int Weapon3= rand.nextInt(5)+5;
            int Possible= rand.nextInt(99);
            System.out.print("第"+i+"回合：");
            //战斗过程
            if (choice==1){
                Arm1 Armm1=new Arm1();
                if (Armm1.arm1(geshila,XiaoMing,Weapon1t,Weapon1)==1) break;
            }
            if (choice==2){
                Arm2 Armm2=new Arm2();
                if (Armm2.arm2(geshila,XiaoMing,Weapon2)==1) break;
            }
            if (choice==3){
                Arm3 armm3=new Arm3();
                if (armm3.arm3(geshila,XiaoMing,Possible,Weapon3)==1) break;
            }
            if (choice==4){
                Arm4 armm4=new Arm4();
                if(armm4.arm4(geshila,XiaoMing,Possible)==1) break;
            }
            SmallPart.Sleep(1000);
        }
    }
}
