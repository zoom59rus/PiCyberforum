public class ApplicationRunner {
    public static void main(String[] args) {
        System.out.println("Result password: " + Util.find("src/main/resources/PiSequence.txt", args[0]));
    }
}
