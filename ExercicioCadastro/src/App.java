public class App {
    public static void main(String[] args) throws Exception {


    // ------------------------------------------------------------------
    // ------------------------------------------------------------------
        Pessoa jose = new Pessoa();
        Pessoa caue = new Pessoa();
    // ------------------------------------------------------------------
    // ------------------------------------------------------------------

        jose.setNome("jose");
        jose.setEndereco("AV C");
        jose.setIdade("9");
    // ------------------------------------------------------------------
    // ------------------------------------------------------------------
        caue.setNome("jose");
        caue.setEndereco("Rua A");
        caue.setIdade("6");
    // ------------------------------------------------------------------
    // ------------------------------------------------------------------
        CRUDPessoas crud = new CRUDPessoas();

        crud.AdicionarPessoa(jose);
        crud.AdicionarPessoa(caue);
    // ------------------------------------------------------------------
    // ------------------------------------------------------------------
        System.out.println(crud.GerarRelatorio()); 

        crud.RemoverPessoa(jose);

        System.out.println(crud.GerarRelatorio()); 

        caue.setNome("caue");
        crud.AtualizarPessoa(caue);

        System.out.println(crud.GerarRelatorio()); 
    // ------------------------------------------------------------------
    // ------------------------------------------------------------------
    }
}
