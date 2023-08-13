/*
------------
    *
   **
  ***
 ****
*****
------------
*/
// ek loop row ke liye - let say parent loop
// ek loop space print krne ke liye - child loop1
// ek loop star print krne ke liye - child loop2
// child loop1 and loop2 dono sath me chalenge
class StarPatternFour{
    public static void main(String[] args){
        for(int i=5;i>=1;i--){
            for(int j=1;j<=i-1;j++){
                System.out.print(" ");
            }
                for(int w=1;w<=6-i;w++){
                    System.out.print("*");
        }
                    
            System.out.println();
        }

    }
            
            
}

