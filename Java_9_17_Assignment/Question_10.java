package Java_9_17_Assignment;

public class Question_10 {
    public static void main(String[] args) {
        String str = "Nap Room is Love";
        System.out.println(str.repeat(5));

        String whiteSpace = "\u2005\u2005\u2005 Hey Eveyone";
        System.out.println(whiteSpace.strip());

        System.out.println("\n\u2005".isBlank());
        System.out.println("\n\u2005".isEmpty());


        String html = "\t<html>\n" + "<\t><\t> <body><\n>";
        System.out.println(html);
        System.out.println(html.stripIndent());


        String multiLine = """
                line 1 !!!!!!
                line 2!!!!
                """;
        System.out.println(multiLine);
    }
}
