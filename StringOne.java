public class StringOne {

    public static void main(String[] args) {
        // print one string and then find out how many duplicates are present and what
        // is the count
        // for each duplicate
        String s = "a b c d e a b c e e";
        /*
         * string me jitne bhi letters hai usko split krke String array me store kr rhe
         * split(" ")-> ye method tab use krte hai jab hme har space ke bad present
         * letter ya word ko alag
         * alag krna hota hai
         */
        String arr[] = s.toLowerCase().split(" ");
       // String[] b = new String[10];
        //int bI= 0;
        // int n = arr.length; -> length of String array
        for (int x = 0; x < arr.length; x++) {  //loop on current word
           
            int count = 1;
            // System.out.println("step 2");
            for(int j=x+1;j<arr.length;j++){   //loop for comparing current word with other words
                if(arr[x].equals(arr[j])){    //equals() is used for content/value comparison
                    count++;
                }
            }
            // System.out.println("step 3");
            if(count>1){
                
                System.out.println("word is :"+ arr[x] +  "count is :" + count );
            }
        
          //  b[bI] = arr[x];
        }

    }

}
