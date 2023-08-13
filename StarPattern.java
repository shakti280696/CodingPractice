/*
------------
*****
****
***
**
*
------------
*/
class StarPattern{
    public static void main(String[] args){
        //i=line change
        for(int i=5;i>=1;i--){
            //j=number of stars 
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println("-----------------------");
        //i=line change
        for(int i=1;i<=5;i++){
            //j=number of stars 
            for(int j=5;j>=i;j--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}