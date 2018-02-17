public class StringUtil {

    public static int countAmountOfX(String string) {
        return string.length() - string.replace("x", "").length();
    }

    int count = StringUtil.countAmountOfX("xFunxWithxKotlinx");
}
