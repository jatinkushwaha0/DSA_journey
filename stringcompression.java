public class stringcompression {
    public static void main(String[] args) {
        String str="abbcccdddd";
        StringBuilder sb = new StringBuilder();
        int count=1;
        for (int i = 0; i < str.length(); i++) {
            if(i < str.length() - 1 && str.charAt(i) == str.charAt(i + 1)) {
                count++;
            }else{
            sb.append(str.charAt(i));
            sb.append(count);
            count=1;
            }
        }
        System.out.println(sb.toString());
    }
}