package io.zipcoder;


/**
 * @author tariq
 */
public class StringsAndThings {

    /**
     * Given a string, count the number of words ending in 'y' or 'z' -- so the 'y' in "heavy" and the 'z' in "fez" count,
     * but not the 'y' in "yellow" (not case sensitive). We'll say that a y or z is at the end of a word if there is not an alphabetic
     * letter immediately following it. (Note: Character.isLetter(char) tests if a char is an alphabetic letter.)
     * example : countYZ("fez day"); // Should return 2
     *           countYZ("day fez"); // Should return 2
     *           countYZ("day fyyyz"); // Should return 2
     */
    public Integer countYZ(String input){
        String[] words = input.split(" ");
        int counter = 0;
        for (String element: words
             ) {
            if(element.indexOf('z') == element.length() - 1){
                counter++;
            }if(element.indexOf('y') == element.length() -1){
                counter++;
            }
        }
        return counter;
    }

    /**
     * Given two strings, base and remove, return a version of the base string where all instances of the remove string have
     * been removed (not case sensitive). You may assume that the remove string is length 1 or more.
     * Remove only non-overlapping instances, so with "xxx" removing "xx" leaves "x".
     *
     * example : removeString("Hello there", "llo") // Should return "He there"
     *           removeString("Hello there", "e") //  Should return "Hllo thr"
     *           removeString("Hello there", "x") // Should return "Hello there"
     */
    public String removeString(String base, String remove){
        String nw = base.replaceAll(remove, "");
        return nw;
    }

    /**
     * Given a string, return true if the number of appearances of "is" anywhere in the string is equal
     * to the number of appearances of "not" anywhere in the string (case sensitive)
     *
     * example : containsEqualNumberOfIsAndNot("This is not")  // Should return false
     *           containsEqualNumberOfIsAndNot("This is notnot") // Should return true
     *           containsEqualNumberOfIsAndNot("noisxxnotyynotxisi") // Should return true
     */
    public Boolean containsEqualNumberOfIsAndNot(String input){
        int isCounter = 0;
        int notCounter = 0;
        String nw = input.replaceAll("is", "1"); // is
        String nw2 = nw.replaceAll("not","2"); // not
        for(int i = 1; i < nw2.length(); i++){
            if(nw2.charAt(i) == '1'){
                isCounter++;
            }
            if(nw2.charAt(i) == '2'){
                notCounter++;
            }
        }
        if(notCounter == isCounter){
            return true;
        }else {
            return false;
        }

    }

    /**
     * We'll say that a lowercase 'g' in a string is "happy" if there is another 'g' immediately to its left or right.
     * Return true if all the g's in the given string are happy.
     * example : gHappy("xxggxx") // Should return  true
     *           gHappy("xxgxx") // Should return  false
     *           gHappy("xxggyygxx") // Should return  false
     */
    public Boolean gIsHappy(String input){
        String newString = input.replaceAll("gg","1");
        boolean anyG = true;
        for(int i = 0; i < newString.length(); i++){
            if(newString.charAt(i) == 'g'){
                return false;
            }

        }
        return true;
    }


    /**
     * We'll say that a "triple" in a string is a char appearing three times in a row.
     * Return the number of triples in the given string. The triples may overlap.
     * example :  countTriple("abcXXXabc") // Should return 1
     *            countTriple("xxxabyyyycd") // Should return 3
     *            countTriple("a") // Should return 0
     */
    public Integer countTriple(String input){
        int tripCount = 0;
        for(int i = 0; i <input.length() - 2; i++){
            if(input.charAt(i) == input.charAt(i + 1) && input.charAt(i+1) == input.charAt(i + 2)){
                tripCount++;
            }
        }
        return tripCount;
    }
}
