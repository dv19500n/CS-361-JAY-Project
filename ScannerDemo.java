
public class ScannerDemo {

    private static String file1 = "prog1.jay";
    private static int counter = 1;

    public static void main(String args[]) {

        TokenStream ts = new TokenStream(file1);

      while (!ts.isEndofFile()) {

            Token tk = ts.nextToken();

            if (tk.getValue().isEmpty()) {
                continue;
            }

            System.out.println(
                "Token " + counter++ +
                " - Type: " + tk.getType() +
                " - Value: " + tk.getValue()
            );
        }
    }
}
