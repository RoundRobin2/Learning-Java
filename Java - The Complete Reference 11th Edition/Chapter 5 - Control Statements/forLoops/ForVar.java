package forLoops;
// Parts of the for loop can be empty.

public class ForVar {
    public static void main(String[] args){
        int i;
        boolean done = false;

        i = 0;
        for (; !done; ) {
            System.out.println("i is " + i);
            if (i==0) done = true;
            i++;
        }
    }
}