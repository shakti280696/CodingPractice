/*
          *
         ***
        *****
       *******
        *****
         ***
          *
 */

public class FullDiamondPattern {
    public static void main(String[] args){
        for(int i=1;i<=4;i++){
            for(int j=1;j<=4-i;j++){
                System.out.print(" ");
            }
            for(int k=1;k<=2*i-1;k++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int l=3;l>=1;l--){
            for(int m=1;m<=4-l;m++){
               System.out.print(" "); 
            }
            for(int n=1;n<=2*l-1;n++){
                System.out.print("*");
            }
            System.out.println();
        }
        }
}
