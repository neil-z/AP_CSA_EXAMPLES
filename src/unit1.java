public class unit1 {
    public static void main(String[] args) {
//        variable();
//        if_else();
        enhanced_if_else();
//        for_loop();
    }
    private static void variable(){
        // variables
        char x , y;
        x = 'a';
        y = 'b';
        double z = 2e2;
        boolean t = true;
        boolean f = false;
        final double TAX_RATE = 0.15;
        System.out.println("true && false is "+(t&&f));
        System.out.println("z*TAX_RATE is greater than 100: "+(z*TAX_RATE>100));
        // Operator precedence
        System.out.println(!t&&f);
        // String equality
        String a = "123456789";
        String b = "123456789";
        System.out.println(a.equals(b));
        System.out.println(""+(a==b));
        b = new String("123456789");
        System.out.println(a.equals(b));
        System.out.println(a==b);
    }

    private  static  void  if_else(){
        int n=7;
        if (n>0)
            if (n % 2 == 0)
                System.out.println(n+" is even.");
            else
                System.out.println(n+" is negative.");
    }
    
    private static void enhanced_if_else(){
        int score = 65;
        if (score >= 90)
            System.out.println("Your score is A");
        else if (score >= 75)
            System.out.println("Your score is B");
        else if (score >= 60)
            System.out.println("Your score is C");
        else
            System.out.println("Your score is D");
    }

    private static void for_loop(){
        int i;
        for (i = 1; i < 5; i++)
            System.out.print(i);

        System.out.print('\n');

        char abc [] = new char [] {'a', 'b', 'c'};
        for (char c: abc)
            System.out.print(c);
    }
}
