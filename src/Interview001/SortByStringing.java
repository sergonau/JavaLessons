package Interview001;

//Sort the letters in the string s by the order they occur in the string t.
//
//        Example
//
//        For s = "weather" and t = "therapyw", the output should be
//        sortByString(s, t) = "theeraw";
//
//        For s = "good" and t = "odg", the output should be
//        sortByString(s, t) = "oodg".
//
//        Input/Output
//
//        [time limit] 3000ms (java)
//        [input] string s
//
//        A string consisting only of lowercase English letters.
//
//        Guaranteed constraints:
//        0 ≤ s.length ≤ 104.
//
//        [input] string t
//
//        A string consisting only of unique lowercase English letters. It is guaranteed that t contains all of the letters that occur in s.

public class SortByStringing {

    public static void main(String[] args) {
        String s = "weather";
        String t = "therapyw";
        sortByString(s, t);
    }

    static String sortByString(String s, String t) {

        StringBuilder sb = new StringBuilder();

        System.out.println(sb.toString());

        char[] s_arr = s.toCharArray();
        char[] t_arr = t.toCharArray();

        for (int i = 0; i < t_arr.length; i++) {
            for (int j = 0; j < s_arr.length; j++) {
                if (t_arr[i]==s_arr[j]) {
                    sb.append(t_arr[i]);
                }
            }
        }
        return sb.toString();

    }

}
