package Java.Lesson001;


public class FourthTask {
    public static boolean isPalindrome(String s) {
        boolean ans = true;
        int len = s.length() - 1;
        int markStart = 0;
        int markEnd = len;
        while (markStart <= markEnd && ans) {
            while (markStart <= len &&
                    !(Character.isLetterOrDigit(s.charAt(markStart)))) markStart++;
            while (markEnd >= 0 &&
                    !(Character.isLetterOrDigit(s.charAt(markEnd)))) markEnd--;
            if (markStart <= len && markEnd >= 0) {
                if (Character.toLowerCase(s.charAt(markStart))
                        != Character.toLowerCase(s.charAt(markEnd))) {
                    ans = false;
                }
            }
            markStart++;
            markEnd--;
        }
        return ans;
    }
}
