public class ass {

    public static void main(String[] args) {
        System.out.println("This is the solution for the nigeria flag");
        for(int i = 0; i <= 47; i ++){
            if (i % 12 == 0) {
                System.out.println("");
            }
            int sort = i;
            while (sort > 12) {
                    sort -= 12;
                }

            if (sort <= 3 | sort >= 8){
                System.out.printf("*");
            }
            else{
                System.out.printf("=");
            }
        }
        System.out.println("");
    }
}