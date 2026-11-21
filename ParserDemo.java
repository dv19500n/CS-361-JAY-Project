
public class ParserDemo {

    public static void main(String[] args) {

        // Change the path!
		TokenStream tStream = new TokenStream("parserTest.jay");

        ConcreteSyntax cSyntax = new ConcreteSyntax(tStream);
        Program p = cSyntax.program();
        System.out.println(p.display());

    }

}
