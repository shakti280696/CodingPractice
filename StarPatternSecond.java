/*
------------
*****
****
***
------------
*/
class StarPatternSecond{
//creating main method - conflict resolved
    public static void main(String[] args){
        //i=line change
        for(int i=3;i>=1;i--){
            //j=number of stars 
            for(int j=1;j<=i+2;j++){
                System.out.print("*");
            }
            System.out.println();
        }

        //i=line change
        for(int i=5;i>=3;i--){
            //j=number of stars 
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
