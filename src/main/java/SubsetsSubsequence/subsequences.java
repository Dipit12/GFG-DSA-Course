package SubsetsSubsequence;

public class subsequences {
    public static void main(String[] args) {
        subseq("", "abc");
        char ch = 'a';

    }

    static void subseq(String p, String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);
        subseq(p+ch, up.substring(1));
        subseq(p, up.substring(1));
    }
}
