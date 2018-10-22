package softserve.academy;

class Validator {
    static boolean isValid(String arg) {
        int argNum;
        try {
            argNum = Integer.parseInt(arg);
        } catch (NumberFormatException ex) {
            System.out.println("Illegal argument");
            return false;
        }
        if (argNum < 0) {
            System.out.println("Illegal argument");
        }
        return argNum >= 0;
    }
}
