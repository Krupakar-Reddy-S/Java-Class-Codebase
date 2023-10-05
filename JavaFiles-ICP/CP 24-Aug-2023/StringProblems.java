 class StringProblems{

    public static void PrintAllCharacters(String S){
        for(int i = 0; i < S.length(); i++){
            System.out.println(S.charAt(i));
        }
    }

     public static void main(String[] args) {

         String s = "abc";
         s = s + "d";
         s = s + 100;
         System.out.println(s);
         System.out.println();

         PrintAllCharacters(s);

     }
 }