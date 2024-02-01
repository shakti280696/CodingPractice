public class StringTwo {
    //count number of words in a string
    public static void main(String[] args){
        String words = "This is a string";
        String arr[] = words.toLowerCase().split(" ");
     //   int count=0;
     /*   for(int i=1;i<=arr.length;i++){
            count++; 
        }
        System.out.println("number of words in a String is :"+ count);  */

        System.out.println("number of words in a string is : "+arr.length);

    }

    
    
}
