import java.util.List;

public class CompararStrings {

    public static void main(String[] args) {
            String str1 = "abcde";
            String str2 = "ae";

            int comprimento = maiorSubsequenciaComum(str1, str2);
            System.out.println("O comprimento da maior subsequência comum é: " + comprimento);
        }

        public static int maiorSubsequenciaComum(String s1,String s2) {

            int m = s1.length();
            int n = s2.length();

            // Cria uma matriz para armazenar os comprimentos das subsequências
            int[][] dp = new int[m + 1][n + 1];

            // Preenche a matriz usando a abordagem de programação dinâmica
            for (int i = 1; i <= m; i++) {
                for (int j = 1; j <= n; j++) {
                    if (s1.charAt(i - 1) == s2.charAt(j - 1)) {
                        dp[i][j] = dp[i - 1][j - 1] + 1; // aumenta o comprimento da subsequência
                    } else {
                        dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]); // usa o máximo anterior
                    }
                }
            }

            // O valor na última célula da matriz é o comprimento da maior subsequência comum
            return dp[m][n];
        }
    }

