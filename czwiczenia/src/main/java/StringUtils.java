public class StringUtils
{
    public Boolean isAnagram(String a, String b){
        if(a.length() != b.length()){
            return false;
        }

        a = a.toLowerCase().replaceAll(" ", "");
        b = b.toLowerCase().replaceAll(" ", "");

        String[] a_chars = a.split("");
        String[] b_chars = b.split("");

        java.util.Arrays.sort(a_chars);
        java.util.Arrays.sort(b_chars);

        return java.util.Arrays.equals(a_chars, b_chars);
    }
}
