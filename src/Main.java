import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Developer bec=new Backend();
        Developer fro=new Frontend();
        Developer dev=new Devops();
        Developer[] developers={bec,fro,dev};
        System.out.println(Arrays.toString(developers));

    }
}