import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternEMatcherDois {

    public static void main(String[] args) {
        String str1 = "abcde";
        String str2 = "abce";

        int comprimento = maiorSubsequenciaComum(str1, str2);
        System.out.println("O comprimento da maior sequência coincidente é: " + comprimento);
    }

    public static int maiorSubsequenciaComum(String s1, String s2) {
        int maxComprimento = 0;

        // Verifica todas as subsequências de s1
        for (int i = 0; i < s1.length(); i++) {
            for (int j = i + 1; j <= s1.length(); j++) {
                String subsequencia = s1.substring(i, j);

                // Compila o padrão e cria um matcher
                Pattern pattern = Pattern.compile(Pattern.quote(subsequencia));
                Matcher matcher = pattern.matcher(s2);

                // Se a subsequência for encontrada em s2, atualiza o comprimento máximo
                if (matcher.find()) {
                    maxComprimento = Math.max(maxComprimento, subsequencia.length());
                }
            }
        }

        return maxComprimento;
    }
}

