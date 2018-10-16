public class StringMethodHW {

    public static String alternateStrings(String str1, String str2) {
        String finalWord="";
        String longerString="";
        String shorterString="";
        if(str1.length()>str2.length()){
            longerString=str1;
            shorterString=str2;
        }else{
            longerString=str2;
            shorterString=str1;
        }
        for(int i=0; i<shorterString.length(); i++){
            String letter1=str1.substring(i, i+1);
            String letter2=str2.substring(i, i+1);
            finalWord=finalWord+letter1+letter2;

        }
        for(int j=shorterString.length(); j<longerString.length(); j++){
            finalWord=finalWord+longerString.substring(j, j+1);
        }
        return finalWord;
    }

    public static boolean abcTest(String word) {
        if(!word.contains(".abc")&&word.contains("abc")){
            return true;
        }
        return false;
    }
}
