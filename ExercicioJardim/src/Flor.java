public class Flor {
    String nome;
    Petala petala;

//  -----------------------------------------------------------------------------------
//  -----------------------------------------------------------------------------------
    public boolean TemPetala(Petala petala)
    {
        if (petala == null) {
            return false;
        }
        return true;
    }
//  -----------------------------------------------------------------------------------
//  -----------------------------------------------------------------------------------
    public void SetPetala(Petala petala)
    {
        this.petala = petala;
    }
//  -----------------------------------------------------------------------------------
//  -----------------------------------------------------------------------------------
    public Petala GetPetala()
    {
        return this.petala;
    }
//  -----------------------------------------------------------------------------------
}
