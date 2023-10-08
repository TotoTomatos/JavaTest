import java.util.Scanner;

public abstract class num implements InterFa{
    public static void scan(){
        System.out.println("请输入一个单伟书");
        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();
        if(i>=100&&i<1000){
            System.out.println("百位："+i/100);
            System.out.println("十位："+i%100/10);
            System.out.println("个位："+i%10);
        }else
        {
            System.out.println("请按要求输入");
        }
    }

}
