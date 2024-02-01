public class StringFour {
    // count occurrences of each character in a String [including spaces]

    public static void main(String[] args){
        String str = "All Is Well";
        char[] c = str.toCharArray();
        char[] v = new char[c.length];
        for(int i=0;i<c.length;i++){  //loop on current character
            int count = 1;
        //loop to compare current character with remaining characters one by one
            for(int j=i+1;j<c.length;j++){  
                if(c[i]== c[j]){
                    count++;
                }
            }
            System.out.println("character is : "+c[i]+" count is "+count);
            v[i] = c[i];
        }
        System.out.println(v);

    }

    
}
