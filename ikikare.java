import java.util.Scanner;

class ikikare {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("sayi gir:");
        int sayi = inp.nextInt();
        for(int i=0;i<sayi;i++){
            for(int j=0;j<sayi;j++){
                if(i*i+j*j==sayi){
                    System.out.println(i+"^2+"+j+"^2");
                }
            }
        }
    }
}
