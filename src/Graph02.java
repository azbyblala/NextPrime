/**
 * Created by 张连芳 on 2016/10/5.
 */
public class Graph02 {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 10 - i; j++)
                System.out.print(" ");
            for (int k = 0; k < 5 + i; k++)
                System.out.print("* ");
            System.out.println();
        }
    }
}