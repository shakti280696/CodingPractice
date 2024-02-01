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
        //star pattern using while loop
        int x=1;
        while(x<=5 && x>=1){
        int i=1;  //initialisation
        while(i<=5)  //condition
        {
            System.out.print("*");
            i++;   //increment
        }
        System.out.println();
        i++;

    }

        //star pattern using for loop
        //i=line change
       /* for(int i=5;i>=1;i--){
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
        } */

        
        
        
    }
}