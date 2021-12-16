public class App {
    public static void main(String[] args) throws Exception {

        // -----------------------------------------------------------------------

        Retangulo A1 = new Retangulo(1, 3, 8, 5);
        Retangulo B2 = new Retangulo(6, 1, 9, 5);

        // -----------------------------------------------------------------------
        // -----------------------------------------------------------------------

        if(A1.interceptaRetangulo(B2))
        {
            System.out.println("O retângulo 1 está atrapalhando o retângulo 2");}
        else{
            System.out.println("Inválido");
        }

        // -----------------------------------------------------------------------
        // -----------------------------------------------------------------------

        if(A1.diferencaRetangulos(B2) != -1){
            System.out.println(" " + A1.diferencaRetangulos(A1));
        }

        // -----------------------------------------------------------------------
        // -----------------------------------------------------------------------

    }
}
