/*
           1
          121
         12321
        1234321

 */

public class NumPatternThree {
    public static void main(String[] args){
        // int x=0;
        for(int i=4,x=0;i>=1;i-- , x++){
            for(int j=1;j<=i-1;j++){
                System.out.print(" ");
            }
            for(int k=4;k>=i;k--){
                System.out.print(5-k);
            }
            for(int m=x; m >= 1; m-- ){
                System.out.print(m);
            }    
            System.out.println();
            // x++;
        }
    }
    
}
