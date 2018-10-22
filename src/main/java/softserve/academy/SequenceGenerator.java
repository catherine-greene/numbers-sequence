package softserve.academy;

class SequenceGenerator {
    static String getSequence(int length, int minSquare) {
        StringBuilder result = new StringBuilder();
        int firstNum = (int) Math.ceil(Math.sqrt(minSquare));
        if (length > 0) {
            for (int i = 0; i < length; i++, firstNum++) {
                result.append(firstNum).append(", ");
            }
            result.deleteCharAt(result.length() - 2);
        }
        return result.toString().trim();
    }
}
