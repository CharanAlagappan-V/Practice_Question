public class ReverseStringPunctuations {
    public static void main(String[] args) {
        String input = "house no : 123@ cbe ";
        System.out.println(reverseStringWithoutChangingSymbols(input));
    }

    public static String reverseStringWithoutChangingSymbols(String input){
        char[] inputCharArr = input.toCharArray();
        int left = 0;
        int right = input.length()-1;

        while(left<right){

            if(!Character.isLetterOrDigit(inputCharArr[left]))
                left++;
            else if(!Character.isLetterOrDigit(inputCharArr[right]))
                right--;
            else{
                char temp = inputCharArr[left];
                inputCharArr[left] = inputCharArr[right];
                inputCharArr[right] = temp;
                left++;
                right--;
            }
        }
        return new String(inputCharArr);
    }
}
