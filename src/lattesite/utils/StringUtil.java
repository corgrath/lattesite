package lattesite.utils;

public final class StringUtil {

    public static boolean isEmpty(String s) {
        if (s != null && s.equals("null")) {
            throw new RuntimeException("Something went seriously wrong. The string is literally \"null\".");
        }
        return s == null || s.trim().length() == 0;
    }

}
