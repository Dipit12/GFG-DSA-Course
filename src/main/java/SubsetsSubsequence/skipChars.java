package SubsetsSubsequence;

public class skipChars {
    public static void main(String[] args) {
        String s = "abcdae";
        System.out.println(skipChar(s,0));
    }
    static StringBuilder sb  = new StringBuilder();
    static StringBuilder skipChar(String s, int n){
        if(n >= s.length()){
            return sb;
        }

        if(s.charAt(n) != 'a'){
            sb.append(s.charAt(n));
        }

        return skipChar(s,n+1);
    }
}
