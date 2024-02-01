public class StringReverse {
    //reverse a string
    public static void main(String[] args){
        String s = "MyJava";
        /* char array me store kr liye toCharArray() method use krke, fr last index se print 
        krane lage one by one */
        char arr[] = s.toCharArray();
        for(int i=arr.length-1;i>=0;i--){
           System.out.print(arr[i]);
        }
        System.out.println();  
        // % na de end me isliye ye print kr rhe
        

    }
    
}
