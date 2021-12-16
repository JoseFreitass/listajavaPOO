public class Retangulo {

    private int a1; private int b2; private int c3; private int c4;

    // -----------------------------------------------------------------------
    // -----------------------------------------------------------------------


    public Retangulo(int a1, int c3, int b2, int c4)
    {
        this.a1 = a1; this.c3 = c3; this.b2 = b2; this.c4 = c4;
    }

    // -----------------------------------------------------------------------
    // -----------------------------------------------------------------------


    public int geta1() {
        return a1;
    }

    public void seta1(int a1) {
        this.a1 = a1;
    }

    // -----------------------------------------------------------------------
    // -----------------------------------------------------------------------

    public int getc4() {
        return c4;
    }


    public void setc4(int c4) {
        this.c4 = c4;
    }

    // -----------------------------------------------------------------------
    // -----------------------------------------------------------------------

    public int getb2() {
        return b2;
    }


    public void setb2(int b2) {
        this.b2 = b2;
    }

    // -----------------------------------------------------------------------
    // -----------------------------------------------------------------------

    public int getc3() {
        return c3;
    }


    public void setc3(int c3) {
        this.c3 = c3;
    }

    // -----------------------------------------------------------------------
    // -----------------------------------------------------------------------


    public boolean contemPonto(int x, int y)
    {
        if((x >= a1) && (x <= b2) &&
        (y >= c3) && (y <= c4))
        {
            return true;
        }
        return false;
    }

    // -----------------------------------------------------------------------
    // -----------------------------------------------------------------------

    public boolean interceptaRetangulo(Retangulo retangulo)
    {
        if(contemPonto(retangulo.geta1(),
        retangulo.getc3()))
        {
            return true;
        }

        if(contemPonto(retangulo.geta1(),
        retangulo.getc4()))
        {
            return true;
        }

        if(contemPonto(retangulo.getb2(),
        retangulo.getc3()))
        {
            return true;
        }

        if(contemPonto(retangulo.getb2(),
        retangulo.getc4()))
        {
            return true;
        }
        return false;
    }

    // -----------------------------------------------------------------------
    // -----------------------------------------------------------------------

    public double getArea()
    {
        double larguraX = this.b2 - this.a1;
        double alturaY= this.c4 - this.c3;
        return larguraX * alturaY;
    }

    public double diferencaRetangulos(Retangulo retangulo)
    {
        if(interceptaRetangulo(retangulo))
        {
            return getArea() - retangulo.getArea();
        }
        return -1;
    }
}
    // -----------------------------------------------------------------------
    // -----------------------------------------------------------------------  