public class App {
    public static void main(String[] args) throws Exception {

        // -----------------------------------------------------------------------
        // -----------------------------------------------------------------------
        Retangulo retanguloA = new Retangulo(1, 3, 8, 5);

        Retangulo retanguloB = new Retangulo(6, 1, 9, 5);
        // -----------------------------------------------------------------------
        // -----------------------------------------------------------------------

        if(retanguloA.interceptaRetangulo(retanguloB))
        {
            System.out.println("O retângulo 1 está atrapalhando o retângulo 2");
        }
        else
        {
            System.out.println("Inválido");
        }
        // -----------------------------------------------------------------------
        // -----------------------------------------------------------------------
    }
}
