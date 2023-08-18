/*
create a pattern:
------------
*****
****
***
**
*
**
***
****
*****

------------
*/
class StarPatternThree{
    public static void main(String[] args){
        for(int i=5;i>=1;i--){
            for(int j=1;j<=i;j++){
                System.out.print("*");
               }                                                                                                                      
               System.out.println();
        }
        for(int a=4;a>=1;a--){
            for(int b=1;b<=6-a;b++){
                System.out.print("*");
               }
                System.out.println();
        } 
    }
}
//end of program