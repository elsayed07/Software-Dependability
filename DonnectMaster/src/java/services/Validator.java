package services;

import java.util.regex.Pattern;

/**
 *
 * @author Mohammad
 */
public class Validator {

    private static final String sp = "\\!\\#\\$\\%\\&\\'\\*\\+\\-\\/\\=\\?\\^\\_\\`\\{\\|\\}\\~";
    private static final String atext = "[a-zA-Z0-9" + sp + "]";
    private static final String atom = atext + "+"; //one or more atext chars
    private static final String dotAtom = "\\." + atom;
    private static final String localPart = atom + "(" + dotAtom + ")*"; //one atom followed by 0 or more dotAtoms.

    //RFC 1035 tokens for domain names:
    private static final String letter = "[a-zA-Z]+$";
    private static final String domainLetter = "[a-zA-Z]+";
    private static final String letDig = "[a-zA-Z0-9]+$";
    private static final String letDigHyp = "[a-zA-Z0-9-]+$";
    private static final String digit = "[0-9]";

    public static final String rfcLabel = "[a-zA-Z0-9]+" + "[a-zA-Z0-9-]+" + "{0,61}" + "[a-zA-Z0-9]+";

    private static final String domain = rfcLabel + "(\\." + rfcLabel + ")*\\." + domainLetter + "{2,6}";
    //Combined together, these form the allowed email regexp allowed by RFC 2822:
    private static final String addrSpec = "^" + localPart + "@" + domain + "$";

    //private static final String phoneNumberRegEx = "(\\d-)?(\\d{3}-)?\\d{3}-\\d{4}";
    private static final String phoneNumberRegEx = "(\\d{3})(\\d)+";
    private static final String mobileNumberRegEx = "0?9(\\d{9})";
    private static final String birthdate = "(\\d{2})/(\\d{2})/(\\d{4})";

    //now compile it:
    public static final Pattern EMAIL_PATTERN = Pattern.compile(addrSpec);

    public static final Pattern PHONE_PATTERN = Pattern.compile(phoneNumberRegEx);
    public static final Pattern MOBILE_PATTERN = Pattern.compile(mobileNumberRegEx);

    public static final String zipCodeRegEx = "\\d{5}(-\\d{4})?";
    public static final Pattern ZIPCODE_PATTERN = Pattern.compile(zipCodeRegEx);

    public static final Pattern ALPHA_NUMERIC_PATTERN = Pattern.compile(letDig);
    public static final Pattern LETTERS_PATTERN = Pattern.compile(letter);
    public static final Pattern DIGIT_PATTERN = Pattern.compile("(\\d+?)");

    public static final Pattern BIRTHDATE_PATTERN = Pattern.compile(birthdate);

    public static boolean isEmpty(Object value) {
        if (value == null) {
            return true;
        } else if (value.toString().trim().length() == 0) {
            return true;
        }
        return false;
    }

    public static boolean isEmailValid(String value) {
        return EMAIL_PATTERN.matcher(value).matches();
    }

    public static boolean isMobileValid(String value) {
        return MOBILE_PATTERN.matcher(value).matches();
    }

    public static boolean isNumeric(String value) {
        if (value == null) {
            return false;
        }
        return DIGIT_PATTERN.matcher(value).matches();
    }

    public static boolean isLettersOnly(String value) {
        if (value == null) {
            return false;
        }
        return LETTERS_PATTERN.matcher(value).matches();
    }

    public static boolean isAlphaNumeric(String value) {
        return ALPHA_NUMERIC_PATTERN.matcher(value).matches();
    }

    public static boolean isValidPhone(String value) {
        return PHONE_PATTERN.matcher(value).matches();
    }

    public static boolean isZipCodeValid(String value) {
        return ZIPCODE_PATTERN.matcher(value).matches();
    }

    public static boolean isBirthdateValid(String value) {
        return BIRTHDATE_PATTERN.matcher(value).matches();
    }

    public static boolean matches(String value1, String value2) {
        try {
            if (value1 == null || value2 == null) {
                return false;
            } else if (value1.trim().length() == 0 || value2.trim().length() == 0) {
                return false;
            } else {
                return value1.equals(value2);
            }
        } catch (Exception e) {
            return false;
        }
    }

    /**
     * Returns -1 if too short, 1 if too long, else 0 if ok
     *
     * @param value value to measure
     * @param min - Minimum string length(must be greater than)
     * @param max - Maximum string length (cannot be greater than)
     * @return -1 if too short, 1 if too long, else 0 if ok
     */
    public static int lengthMinMax(String value, int min, int max) {
        if (null == value) {
            return -1;
        } else if (value.trim().length() < min) {
            return -1;
        } else if (value.trim().length() > max) {
            return 1;
        } else {
            return 0;
        }
    }

    public static boolean isTooShort(String value, int min) {
        if (null == value) {
            return true;
        } else {
            return value.trim().length() < min;
        }
    }

    public static boolean isTooLong(String value, int max) {
        if (null == value) {
            return false;
        } else {
            return value.trim().length() > max;
        }
    }

//        public static boolean isCreditCardValid(Object value) {
//                return true;
//        }
//
//        public static boolean isValidUrlValid(Object value) {
//                return true;
//        }
    public static String escapeXML(String s) {
        return s.replaceAll("&", "&amp;").replaceAll("<", "&lt;").replaceAll(">", "&gt;");
    }
}
