package frotaBr.util;

public class Validador {
    public static void validaString(String mensagem, String string) {
        validaStringVazia(mensagem, string);
        validaStringNula(mensagem, string);

    }

    private static void validaStringNula(String mensagem, String string) {
        if (string == null) {
            throw new IllegalArgumentException(mensagem);
        }
    }

    private static void validaStringVazia(String mensagem, String string) {
        if (string.trim().isEmpty()) {
            throw new IllegalArgumentException(mensagem);
        }
    }

    public static void validaDoubleNegativo(double d, String mensagem) {
        if (d < 0) {
            throw new IllegalArgumentException(mensagem);
        }
    }
    public static void validaInteiroNegativo(int i, String mensagem) {
        if (i < 0) {
            throw new IllegalArgumentException(mensagem);
        }
    }
}
