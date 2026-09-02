public class helloworld {
    private static String[] text = {
        "Hello world!",
        "My name is Reina Wallace!",
        "Additional lines such as:",
        "My address",
        "My phone number",
        "The city where I live"
    };
    public static void main(String[] args) {
        for(String line : text) {
            System.out.println(line);
        }
    }
} 
