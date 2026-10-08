public class Choinkaaa {
    public static void main(String[] args) {
        int wys = 11;
        if (args.length > 0 ) {
            wys = Integer.parseInt(args[0]);
        }
    for(int i=0 ; i<wys; i++) {
        for(int j=1; j<=i+1; j++)
            System.out.print("*");
        System.out.print('\n');
        }
    }
}
  