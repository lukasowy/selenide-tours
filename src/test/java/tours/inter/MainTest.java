package tours.inter;

public class MainTest {

    public static void main(String[] args) {

        String str = withoutX2("a");
        System.out.println(str);
    }

    public static String withoutX2(String str) {
        if (str.length() == 0) {
            return str;
        }

        if (str.length() == 1) {
            if (str.charAt(0) == 'x') {
                return "";
            } else {
                return str;
            }
        }

        if (str.charAt(0) == 'x' && str.charAt(1) == 'x') {
            return str.substring(2);
        }

        if (str.charAt(0) == 'x' && str.charAt(1) != 'x') {
            return str.substring(1);
        }

        if (str.charAt(0) != 'x' && str.charAt(1) == 'x') {
            return str.charAt(0) + str.substring(2);
        }

        return str;
    }
}
