public class NewString {
    public void NextString(String name) {
        String newString = "";
        String newName = name.toLowerCase();
        for (int i = 0; i < name.length(); i++) {
            char ch = newName.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' ||
                    ch == 'o' || ch == 'u') {
                newString = newString + ch;
            } else if (ch >= 'a' || ch <= 'z') {
                ch++;
                newString = newString + ch;
            }
        }
        System.out.println("NewString without vowels:: "+ newString);
    }
}
