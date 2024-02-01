public class StringThree {
    
    //count number of occurrences of a given character in a String
    public static void main(String[] args){
        String s = "Java is java again java again java again";
        char c = 'g';
        //character g kitni bar string me aya hai calculate krna hai
        int count = s.length() - s.replace("g","").length();
        System.out.println("number of occurrences of a given character g is : "+count);
    }
}
