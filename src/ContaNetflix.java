public class ContaNetflix {
    private String idiomaPreferido;
    private String resolucaoTela;

    public void entrar(){
        buscarPreferenciasDoUsuario();
        identificarResolucao();
    }

    private void buscarPreferenciasDoUsuario(){
        idiomaPreferido = "PT-BR";
    }

    private void identificarResolucao(){
        resolucaoTela = "Full HD";
    }

    public void assistirFilme(String nomeFilme){
        System.out.format("Iniciando o filme '%s'\n", nomeFilme);
        System.out.println("Carregando o filme na resolucao " + resolucaoTela);
        carregarAudioFilme();
    }

    private void carregarAudioFilme(){
        if(idiomaPreferido == "PT-BR" || idiomaPreferido == "EN-US"){
            System.out.println("Carregando o audio em " + idiomaPreferido);
        } else{
            System.out.println("Carregando o audio em EN-US");
        }
    }
}
