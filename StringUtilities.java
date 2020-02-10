
public class StringUtilities {
    /**
     * @param input value to be returned
     * @return `input`
     */
    public String returnInput(String input) {
        return input;
    }

    /**
     * @param baseValue value to be added to
     * @param valueToBeAdded value to add
     * @return the concatenation of `baseValue` and `valueToBeAdded`
     */
    public String concatenate(String baseValue, String valueToBeAdded) {
        return baseValue.concat(valueToBeAdded);
    }

    /**
     * @param valueToBeReversed value to be reversed
     * @return identical string with characters in opposite order
     */
    public String reverse(String valueToBeReversed) {
        String inv = "";
        for(int i = valueToBeReversed.length()-1; i >= 0; i --){
            inv += valueToBeReversed.charAt(i);
        }
        return inv;
    }

    /**
     * @param word word to get middle character of
     * @return middle character of `word`
     */
    public Character getMiddleCharacter(String word) {
        int  half = Math.round(word.length() / 2);
        return word.charAt(half);
    }

    /**
     * @param value value to have character removed from
     * @param charToRemove character to be removed from `value`
     * @return `value` with char of value `charToRemove` removed
     */
    public String removeCharacter(String value, Character charToRemove) {
        String retVal = "";
        for(int i = 0; i < value.length(); i++){
            Character a = value.charAt(i);
            if(!a.equals(charToRemove)){
                retVal += value.charAt(i);
            }
        }
        return retVal;
    }

    /**
     * @param sentence String delimited by spaces representative of a sentence
     * @return last `word` in sentence
     */
    public String getLastWord(String sentence) {
        int lastWordIndex = 0;
        for(int i = sentence.length()-1; i > 0; i--){
            if(sentence.charAt(i) == ' '){
                lastWordIndex = i+1;
                break;
            }
        }
        String lastWord = sentence.substring(lastWordIndex, sentence.length());
        return lastWord;
    }
}
