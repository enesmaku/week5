import java.util.Scanner;

class ucvebeskatlari {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("sayi gir:");
        int sayi = inp.nextInt();
        for(int i=0;i<sayi/3;i++){
            for(int j=0;j<sayi/5;j++){
                if(3*i+5*j==sayi){
                    System.out.println(i+" _ "+j);
                }
            }
        }
    }
}
