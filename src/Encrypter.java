public class Encrypter {
    public static final String S = "abcdefghijklmnopqrstuvwxyzåäö0123456789 ,.";
    public static String encrypt(String input, String key){
        int[] myKey = convertKey(key);
        int keyPosition = 0;
        String encrypted = "";
        for (int i = 0; i < input.length(); i++) {
            int inValue = getLetterPosition(input.charAt(i));
            int outValue = inValue + myKey[keyPosition];
            outValue = normalizeIndex(outValue);
            encrypted += getLetter(outValue);
            keyPosition++;
            keyPosition = normalizeKeyIndex(keyPosition,myKey.length);
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
            outValue = normalizeIndex(outValue);
            decrypted += getLetter(outValue);
            keyPosition++;
            keyPosition = normalizeKeyIndex(keyPosition,myKey.length);
        }
        return decrypted;
    }

    // Convert the our key to an int array
    private static int[] convertKey(String key){
        int[] myKey = new int[key.length()];
        for (int i = 0; i < key.length(); i++) {
            myKey[i] = Integer.parseInt(key.substring(i,i+1));
        }
        return myKey;
    }
    // Gets the index of our letter
    private static int getLetterPosition(char c){
            String all = S;
            int index = all.indexOf(c);
            return index;
    }
    // Gets our letter from an index
    private static char getLetter(int i){
            String all = S;
            char c = all.charAt(i);
            return c;
    }
    // Normalize letter index
    private static int normalizeIndex(int index){
        if(index>S.length()-1){
            index = index-S.length();
        }
        if(index<0){
            index = index + (S.length());
        }
        return index;
    }
    // Normalize key index
    private static int normalizeKeyIndex(int index, int length){
        if(index>=length){
            index = index-length;
        }
        if(index>=length){
            index = index-length;
        }
        return index;
    }

}
