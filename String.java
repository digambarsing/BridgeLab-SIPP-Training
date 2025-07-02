public class WordReverse {
    public static void main(String[] args) {
        String h = "hello world java";
        StringBuilder sb = new StringBuilder(h);

        int i = 0;
        while (i < sb.length()) {
            if (sb.charAt(i) == ' ') {
                i++;
                continue;
            }

            int j = i;
            while (j < sb.length() && sb.charAt(j) != ' ') {
                j++;
            }

            help(sb, i, j - 1);

            i = j;
        }

        System.out.println(sb.toString());
    }

    private static void help(StringBuilder sb, int i, int j) {
        while (i < j) {
            char temp = sb.charAt(i);
            sb.setCharAt(i, sb.charAt(j));
            sb.setCharAt(j, temp);
            i++;
            j--;
        }
    }
}
