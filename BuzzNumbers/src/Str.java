public class Str {

    public static StringBuilder createEnglishAlphabet() {
        // write your code here
        StringBuilder str = new StringBuilder("A");
        for (char letter = 'B'; letter < 'Z'; letter++) {
            str.append(" ").append(letter);
        }
        str.append(" ").append('Z');
        return str;
    }

    public static void main(String[] args) {
        System.out.println(createEnglishAlphabet());
    }

}
