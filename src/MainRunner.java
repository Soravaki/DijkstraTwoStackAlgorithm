public class MainRunner {
    public static void main(String[] args) {
        Main a = new Main("( 1 + ( ( 2 + 3 ) * ( 4 * 5 ) ) )");
        Main b = new Main("( 3 + ( ( 3 + 3 ) * ( 3 * 3 ) ) )");
        Main c = new Main("( 12 / ( ( 2 + 4 ) - 2 ) )");
    }
}
