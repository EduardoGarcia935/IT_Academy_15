package entities;

/**
 *
 * @author Dudu
 */

//Classe do Objeto Bolsa equivalente a uma linha do arquivo .csv
public class Bolsa {
    //Totos os atributos dos campos da tabela
    private String NM_BOLSISTA;
    private String CPF_BOLSISTA;
    private String NM_ENTIDADE_ENSINO;
    private String ME_REFERENCIA;
    private String AN_REFERENCIA;
    private String SG_DIRETORIA;
    private String SG_SISTEMA_ORIGEM;
    private String CD_MODALIDADE_SGB;
    private String DS_MODALIDADE_PAGAMENTO;
    private String CD_MOEDA;
    private Double VL_BOLSISTA_PAGAMENTO;

    //Métodos Getters and Setters dos atributos
    public String getNM_BOLSISTA() {
        return NM_BOLSISTA;
    }

    public void setNM_BOLSISTA(String NM_BOLSISTA) {
        this.NM_BOLSISTA = NM_BOLSISTA;
    }

    public String getCPF_BOLSISTA() {
        return CPF_BOLSISTA;
    }

    public void setCPF_BOLSISTA(String CPF_BOLSISTA) {
        this.CPF_BOLSISTA = CPF_BOLSISTA;
    }

    public String getNM_ENTIDADE_ENSINO() {
        return NM_ENTIDADE_ENSINO;
    }

    public void setNM_ENTIDADE_ENSINO(String NM_ENTIDADE_ENSINO) {
        this.NM_ENTIDADE_ENSINO = NM_ENTIDADE_ENSINO;
    }

    public String getME_REFERENCIA() {
        return ME_REFERENCIA;
    }

    public void setME_REFERENCIA(String ME_REFERENCIA) {
        this.ME_REFERENCIA = ME_REFERENCIA;
    }

    public String getAN_REFERENCIA() {
        return AN_REFERENCIA;
    }

    public void setAN_REFERENCIA(String AN_REFERENCIA) {
        this.AN_REFERENCIA = AN_REFERENCIA;
    }

    public String getSG_DIRETORIA() {
        return SG_DIRETORIA;
    }

    public void setSG_DIRETORIA(String SG_DIRETORIA) {
        this.SG_DIRETORIA = SG_DIRETORIA;
    }

    public String getSG_SISTEMA_ORIGEM() {
        return SG_SISTEMA_ORIGEM;
    }

    public void setSG_SISTEMA_ORIGEM(String SG_SISTEMA_ORIGEM) {
        this.SG_SISTEMA_ORIGEM = SG_SISTEMA_ORIGEM;
    }

    public String getCD_MODALIDADE_SGB() {
        return CD_MODALIDADE_SGB;
    }

    public void setCD_MODALIDADE_SGB(String CD_MODALIDADE_SGB) {
        this.CD_MODALIDADE_SGB = CD_MODALIDADE_SGB;
    }

    public String getDS_MODALIDADE_PAGAMENTO() {
        return DS_MODALIDADE_PAGAMENTO;
    }

    public void setDS_MODALIDADE_PAGAMENTO(String DS_MODALIDADE_PAGAMENTO) {
        this.DS_MODALIDADE_PAGAMENTO = DS_MODALIDADE_PAGAMENTO;
    }

    public String getCD_MOEDA() {
        return CD_MOEDA;
    }

    public void setCD_MOEDA(String CD_MOEDA) {
        this.CD_MOEDA = CD_MOEDA;
    }

    public Double getVL_BOLSISTA_PAGAMENTO() {
        return VL_BOLSISTA_PAGAMENTO;
    }

    public void setVL_BOLSISTA_PAGAMENTO(Double VL_BOLSISTA_PAGAMENTO) {
        this.VL_BOLSISTA_PAGAMENTO = VL_BOLSISTA_PAGAMENTO;
    }

    //Método construtor simples
    public Bolsa(){
        
    }
    
    //Método construtor otimizado
    public Bolsa(String NM_BOLSISTA, String CPF_BOLSISTA, String NM_ENTIDADE_ENSINO, String ME_REFERENCIA, String AN_REFERENCIA, String SG_DIRETORIA, String SG_SISTEMA_ORIGEM, String CD_MODALIDADE_SGB, String DS_MODALIDADE_PAGAMENTO , String CD_MOEDA , Double VL_BOLSISTA_PAGAMENTO){
        super();
        this.NM_BOLSISTA = NM_BOLSISTA;
        this.CPF_BOLSISTA = CPF_BOLSISTA;
        this.NM_ENTIDADE_ENSINO = NM_ENTIDADE_ENSINO;
        this.ME_REFERENCIA = ME_REFERENCIA;
        this.AN_REFERENCIA = AN_REFERENCIA;
        this.SG_DIRETORIA = SG_DIRETORIA;
        this.SG_SISTEMA_ORIGEM = SG_SISTEMA_ORIGEM;
        this.CD_MODALIDADE_SGB = CD_MODALIDADE_SGB;
        this.DS_MODALIDADE_PAGAMENTO = DS_MODALIDADE_PAGAMENTO;
        this.CD_MOEDA = CD_MOEDA;
        this.VL_BOLSISTA_PAGAMENTO = VL_BOLSISTA_PAGAMENTO; 
    }  

    //Método string padrão
    @Override
    public String toString() {
        return "Bolsa{" + "NM_BOLSISTA=" + NM_BOLSISTA + ", CPF_BOLSISTA=" + CPF_BOLSISTA + ", NM_ENTIDADE_ENSINO=" + NM_ENTIDADE_ENSINO + ", ME_REFERENCIA=" + ME_REFERENCIA + ", AN_REFERENCIA=" + AN_REFERENCIA + ", SG_DIRETORIA=" + SG_DIRETORIA + ", SG_SISTEMA_ORIGEM=" + SG_SISTEMA_ORIGEM + ", CD_MODALIDADE_SGB=" + CD_MODALIDADE_SGB + ", DS_MODALIDADE_PAGAMENTO=" + DS_MODALIDADE_PAGAMENTO + ", CD_MOEDA=" + CD_MOEDA + ", VL_BOLSISTA_PAGAMENTO=" + VL_BOLSISTA_PAGAMENTO + '}';
    }
}
