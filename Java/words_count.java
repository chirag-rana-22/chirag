class words_count {
    public static void main(String[] args) {
        String str = "My name is chirag";
        int count = 1;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ' ') {
                count++;
            }
        }
        System.out.println("Number of words in a string = " + count);
    }
    
}
