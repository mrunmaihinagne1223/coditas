import java.util.StringTokenizer;

class StringDemo {
    static void display()
    {   int count = 0;
        StringTokenizer st = new StringTokenizer("I am Mrunmai");

        while (st.hasMoreTokens()){
            System.out.println(st.nextToken());
            count++;
        }
        System.out.println("NO OF TOKEN: "+count);
    }
}
