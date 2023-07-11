package encryption;

public class Encrypt {
    public static void main(String[] args){
        String text = "Rtts~%\twryfnq%Ufiktty%Uwtslx";
        char[] chars = text.toCharArray();
        for(char c: chars){
            c-=5;
            System.out.print(c);
        }
    }
}
