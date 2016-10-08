import com.sun.org.apache.xpath.internal.SourceTree;

/**
 * Created by 张连芳 on 2016/10/7.
 */
public class Graph03 {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 10 - i; j++) {
                System.out.print(".");
            }
            System.out.print("*.");
            for (int k = 0; k < 5 + i; k++) {
                if (i == 0 || i == 4) {
                    System.out.print("*.");
                } else {
                    System.out.print("..");
                }
            }
            System.out.print("*.");
            System.out.println();
        }
    }
}
