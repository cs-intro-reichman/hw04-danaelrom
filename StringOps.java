public class StringOps {
    ////////////////////////////////////////////////////////////
    //////                                               ///////
    //////              Reminder:                        ///////
    //////        allowed methods                        ///////
    //////                                               ///////
    //////        1.charAt(int index)                    ///////
    //////        2.length()                             ///////
    //////        3.substring(int start)                 ///////
    //////        4.substring(int start,int ends)        ///////
    //////        5.indexOf(String str)                  ///////
    //////                                               ///////
    //////        The rest are not allowed !             ///////
    //////        if you want to use a different         ///////
    //////        method, and you can implement          ///////
    //////        it using material from the course      ///////
    //////        you need to implement a version of     ///////
    //////        the function by yourself.              ///////
    //////                                               ///////
    //////        see example for substring              ///////
    //////        in Recitation 3 question 5             ///////
    //////                                               ///////
    ////////////////////////////////////////////////////////////
    public static void main(String[] args) {
    }

    public static String capVowelsLowRest (String string) {
        String vowels = "aeiou" ;
        String lowers = "";
        String fixed = "";
        for(int i = 0; i < string.length(); i++){
            char current = string.charAt(i);
            if(current > 'A' && current < 'Z'){
                current = (char)(current + 32);
            }
            lowers += current;
        }
        for(int j = 0; j < lowers.length(); j++){
                char currentNew = lowers.charAt(j);
            if (vowels.indexOf(currentNew) != -1){
                currentNew = (char)(currentNew - 32);
            }
            fixed += currentNew;
            
        }
        return fixed;
    }
    

    
    public static String camelCase (String string) {
      String noSpace = "";
      int index = 0;
        while(string.charAt(index) == ' '){
            index++;
        }
        char first = string.charAt(index);
        if( first > 'A' && first < 'Z' ){
            first = (char)(first + 32);
        }
        noSpace = noSpace + first;
        for(int i = index + 1; i < string.length(); i++ ){
            char check = string.charAt(i);
            char before = string.charAt(i-1);
            if(check != ' ' ){
                if(before == ' '){
                    if(check > 'a' && check < 'z'){
                    check = (char)(check - 32);
                    }
                } else  if ( check > 'A' && check < 'Z'){
                    check = (char)(check + 32);
                }
               noSpace = noSpace + check; 
            } 
            
        }
        return noSpace;
    }

    public static int[] allIndexOf (String string, char chr) {
       int count = 0;
       for(int i = 0; i < string.length(); i++){
           if(string.charAt(i) == chr){
            count++;
           }
       }
       int [] counter = new int[count];
       int index = 0;
        for(int j = 0; j < string.length(); j++ ){
            if(string.charAt(j) == chr){
                counter[index] = j;
                index++;
            }
        }
       
        return counter;
        
    }
}
