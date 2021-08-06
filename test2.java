public class test2{

    public static void main(String []args){
        findChar("I am engineer","g");
    }
    
    public static void findChar(String sentence, String character) {
       int str = 0;
        for (int i = 1; i <= sentence.length(); i++) {
            if (sentence.substring(i-1, i).equals(character)) {
                str = i;
            }
        }
        System.out.println("result: " + str);
        
    }
}
