/*
------------
*****
 ****
  ***
   **
    *
------------
*/
public class StarPatternFive {
    public static void main(String[] args){
    /*    for(int i=5;i>=1;i--){
            for(int j=1;j<=i;j++){
                System.out.print("*");

            }
            System.out.println();
            for(int w=1;w<=6-i && i!=1;w++){
                System.out.print(" ");
            }
            
        }  */

        for(int i=5;i>=1;i--){
            for(int j=1;j<=5-i;j++){
                System.out.print(" ");
            }
            for(int w=1;w<=i;w++){
                System.out.print("*");

            }
            System.out.println();
        }
    } 
}


