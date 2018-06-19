public class Encrypter {
    public static final String S = "abcdefghijklmnopqrstuvwxyzåäö0123456789 ,.";
    public static String encrypt(String input, String key){
        int[] myKey = convertKey(key);
        int keyPosition = 0;
        String encrypted = "";
        for (int i = 0; i < input.length(); i++) {
            int inValue = getLetterPosition(input.charAt(i));
            int outValue = inValue + myKey[keyPosition];
            if(outValue>S.length()-1){
                outValue = outValue-S.length();
            }
            encrypted += getLetter(outValue);
            keyPosition++;
            if(keyPosition>=myKey.length){
                keyPosition = keyPosition-myKey.length;
            }
        }
        return encrypted;
    }
    public static String decrypt(String input, String key){
        int[] myKey = convertKey(key);
        int keyPosition = 0;
        String decrypted = "";
        for (int i = 0; i < input.length(); i++) {
            int inValue = getLetterPosition(input.charAt(i));
            int outValue = inValue - myKey[keyPosition];
            if(outValue<0){
                outValue = outValue + (S.length());
            }
            decrypted += getLetter(outValue);
            keyPosition++;
            if(keyPosition>=myKey.length){
                keyPosition = keyPosition-myKey.length;
            }
        }
        return decrypted;
    }
    private static int[] convertKey(String key){
        int[] myKey = new int[key.length()];
        for (int i = 0; i < key.length(); i++) {
            myKey[i] = Integer.parseInt(key.substring(i,i+1));
        }
        return myKey;
    }
    private static int getLetterPosition(char c){
            String all = S;
            int index = all.indexOf(c);
            return index;
    }
    private static char getLetter(int i){
            String all = S;
            char c = all.charAt(i);
            return c;
    }
}
