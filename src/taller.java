public class taller {
    public static void main(String[] args) {

    }

    //Versión 1: Usa expresiones regulares
    //Valida un nombre de usuario según las reglas especificadas
    //
    public static boolean isValidUsername1(String username) {
        if (username == null) {
            return false;
        }

        // Expresión regular que vaalid:
        // - Comienza con letra [a-zA-Z]
        // - Seguido de letras, dígitos o guiones bajos
        // - Longitud total entre 6 y 12 caracteres
        return username.matches("^[a-zA-Z][a-zA-Z0-9_]{5,11}$");
    }

    //Versión 2: Validación manual sin expresiones regulares
    public static boolean isValidUsername2(String username) {

        // 1. No puede ser null
        if (username == null) {
            return false;
        }

        // 2. Longitud entre 6 y 12 caracteres
        int length = username.length();
        if (length < 6 || length > 12) {
            return false;
        }

        // 3. El primer carácter debe ser una letra
        char firstChar = username.charAt(0);
        if (!Character.isLetter(firstChar)) {
            return false;
        }

        // 4. Los demás caracteres: letras, números o guión bajo
        for (int i = 1; i < length; i++) {
            char c = username.charAt(i);

            if (!Character.isLetterOrDigit(c) && c != '_') {
                return false;
            }
        }

        // Si pasa todas las validaciones
        return true;
    }

    public static void testUsername(String username) {
        boolean isValid = isValidUsername2(username);
        System.out.println("Nombre de usuarioo: " + username + " - " + (isValid ? "Válido" : "Inválido"));
    }
}