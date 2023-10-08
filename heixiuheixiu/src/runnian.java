import java.util.Scanner;

public class runnian {
    public static  void a(){
        System.out.println("请输入一个年份");
        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();
        if(i%400==0){
            System.out.println("润年");
        }else {
            if(i%100!=0&&i%4==0){
                System.out.println("润年");
            }else {
                System.out.println("非润年");
            }
        }
    }
}
