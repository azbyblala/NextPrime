/**
 * Created by 张连芳 on 2016/10/5.
 */
public class NextPrime {
    public static void main(String[] args) {
        int a=20160913;
        for(int i=2;;){
            int b=a%i;
            if (b==0){
                a++;continue;
            }else{
                i++;
                if (i<a){
                            b=a%i;
                    }else{
                        System.out.println("a="+a);
                        break;
                    }
                }
            }
        }
    }
