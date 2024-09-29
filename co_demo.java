/**
 * co_demo
 */
public class co_demo {

    public static void main(String[] args) {
        int i;
        for( i=0; i<=100; i++)
        {
            if(i&1==0) continue;
            System.out.println(i);
        }
    }
}