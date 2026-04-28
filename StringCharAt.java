public class StringCharAt {
    public static void main(String[] args) {
        String name = "Jatin";
        String surname = "Kushwaha";
        String fullname = name + " " + surname;
        System.out.println(fullname.charAt(2)); //print one character
        for (int i = 0; i < fullname.length(); i++) {
            System.out.print(fullname.charAt(i) + " "); //print full string
        }
        System.out.println();
    }
}
