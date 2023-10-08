import java.util.Scanner;

public class tree{


    public  static void xunhuan(){
        Scanner  a = new Scanner(System.in);
        System.out.println("输入你的成绩");
       int f = a.nextInt();
       int conut = 0;
       while (f<60){
           f++;
           conut++;
       }
        System.out.println("最终分数："+f);
        System.out.println("加分次数："+conut);
    }
}
