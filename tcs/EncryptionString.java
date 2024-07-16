package tcs;

public class EncryptionString {
    public static void main(String[] args) {
        System.out.println(encryptString("AdyZ89",2));
    }
    public static String encryptString(String str,int key){
        char ch[] = str.toCharArray();
        StringBuilder s = new StringBuilder();
        for(int i=0;i<ch.length;i++){

            if(ch[i]>=65 && ch[i]<=90){
                int index = ch[i]-'A';
                index = (index+key)%26;
                s.append((char)(index+'A'));
            }
            else if(ch[i]>=97 && ch[i]<=122){
                int index = ch[i]-'a';
                index =(index+key)%26;
                s.append((char)(index+'a'));
            }
            else if(ch[i]>=48 && ch[i]<=57){
                int index = ch[i]-'0';
                index = (index+key)%10;
                s.append((char)(index+'0'));
            }

        }
        return s.toString();

    }
}
