import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternEMatcher {

    public static void main(String[] args) {

        String texto = "A programação em Java é divertida. Java é poderosa!!";
        String padrao = "Java"; // A substring que queremos encontrar

    // Compila o padrão
    Pattern pattern = Pattern.compile(padrao);
    Matcher matcher = pattern.matcher(texto);

    // Verifica se há correspondências e conta quantas vezes o padrão aparece
    int contador = 0;
        while (matcher.find()) {
        contador++;
        System.out.println("Encontrado '" + padrao + "' na posição: " + matcher.start());
    }

        System.out.println("O padrão '" + padrao + "' foi encontrado " + contador + " vezes.");
}
}
