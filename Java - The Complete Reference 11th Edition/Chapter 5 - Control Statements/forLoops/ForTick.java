package forLoops;
// Demonstrate the for loop.
class ForTick {
    public static void main(String[] args) {
        int n;

        for (n = 10; n > 0; n--) {
            System.out.println("tick " + n);
        }

        /*
            Or...
            Decalare a loop control variable inside the for.
        */
        for (int i = 10; i > 0; i--) {
            System.out.println("tick " + i);
        }
    }
}


