public class Palindrome {
  public static void main(String args[]) {

    // A partir de un texto (palindromo), evaluar si es palindromo
    // CONSIDERAR: textos como "anita lava la tina", es palindromo, pero no se
    // consireran los espacio
    // EJEMPLO: ojo, radar son palindromos, lapiz no es palindromo

    // TODO: 1: Limpiar el texto, quitar los espacios

    // TODO: 2: Obtener el palindromo, el texto al reves
    // TODO: recibir el texto
    // TODO: inicializar un string para guardar el palindromo
    // TODO: recorrer el texto, desde la ultima letra hast al primera letra
    // TODO: ir guardando la letra en el palindromo
    // TODO: retornar el palindromo

    // TODO: 3: comprobar si es palindromo
    // TODO: comprobar el texto es igual al palindromo calculado
    // TODO: imprimir la validacion

    // NOTAS: no usar el metodo reverse()

    try {
      final String text = "anita lava la tina";
      System.out.println("Text: " + text);

      final Palindrome obj = new Palindrome();
      final boolean isPalindrome = obj.isPalindrome(text);
      System.out.println("Is Palindrome: " + isPalindrome);
    } catch (Exception e) {
      System.out.println(e.getMessage());
    }
  }

  private boolean isPalindrome(final String text) {
    final String cleanedText = this.cleanText(text);
    System.out.println("CleanedText: " + cleanedText);
    final String palindrome = this.palindrome(cleanedText);
    System.out.println("Palindrome: " + palindrome);

    final boolean isPalindrome = cleanedText.equals(palindrome);
    return isPalindrome;
  }

  public String palindrome(final String text) {
    String palindrome = "";
    for (int i = text.length() - 1; i >= 0; i--) {
      final char letter = text.charAt(i);
      palindrome += letter;
    }
    return palindrome;
  }

  private String cleanText(final String text) {
    return text.replaceAll("\\s+", "").toLowerCase();
  }

}