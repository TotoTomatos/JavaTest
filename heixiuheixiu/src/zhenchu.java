public class zhenchu {
    public static void a(){
        int count = 0;
        for (int i = 1; i < 1001; i++) {
            if(i%3==0&&i%5==0){
                System.out.print(i+"\t");
                count++;
            }
            if(count==5){
                System.out.println("");
                count=0;
            }
        }
    }
}
