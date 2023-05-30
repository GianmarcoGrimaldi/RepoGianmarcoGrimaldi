import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexMain {
    public static void main(String[] args) {

        //String regex1 ="\\s[a-zA-Z]{2}\\s";
        String regex1 ="\\b\\w{2}\\b";
        String frase = "questo esercizio trova le parole di n lettere";

        Pattern pattern = Pattern.compile(regex1);
        Matcher matcher = pattern.matcher(frase);

        while(matcher.find()){
            System.out.println(matcher.group());
        }

    }
}
