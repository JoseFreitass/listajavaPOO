public class App {
    public static void main(String[] args) throws Exception {

        // ----------------------------------------------------------------------

        Circulo circulo = new Circulo();
        circulo.Draw();
        // ----------------------------------------------------------------------

        Quadrado quadrado = new Quadrado();
        quadrado.Draw();
        // ----------------------------------------------------------------------


        Triangulo triangulo = new Triangulo();
        triangulo.Draw();
        Parametro(triangulo);

        // ----------------------------------------------------------------------
    }

    public static void Parametro(Figura f) 
    {
        f.DrawShape();
    }
        // ----------------------------------------------------------------------
}

