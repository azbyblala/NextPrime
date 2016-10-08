/**
 * Created by 张连芳 on 2016/10/5.
 */
public class Graph01 {
    public static void main(String[] args) {
       for(int i=1;i<=5;i++)
           if(i<=5){
               for(int j=1;j<=4+i;j++)
                   System.out.print("*");
               System.out.println("");
            }
    }
}