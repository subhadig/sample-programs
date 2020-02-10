public class ReverseAString {

    public static void main(String[] args) {
        String string = "Hi My Name is Subhadip";
        String reversed = reverseString(string);
        System.out.println(reversed);

        string = "123";
        reversed = reverseString(string);
        System.out.println(reversed);

        string = "1234";
        reversed = reverseString(string);
        System.out.println(reversed);
    }

    static String reverseString(String str) {
        if(str == null || str.isEmpty()) {
            return null;
        }
        char[] arr = str.toCharArray();
        int halfLen = arr.length / 2;

        int index = 0;
        while(index < halfLen) {
            char c = arr[index];
            arr[index] = arr[arr.length - index - 1];
            arr[arr.length - index - 1] = c;
            index++;
        }
        return new String(arr);
    }
}
