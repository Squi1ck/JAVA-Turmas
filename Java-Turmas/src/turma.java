public class turma {
    private int codigo;
    private String nomeCurso;
    private int anoInicio;
    private int anofim;


    
    public turma(int codigo, String nomeCurso, int anoInicio, int anofim) {
        this.codigo = codigo;
        this.nomeCurso = nomeCurso;
        this.anoInicio = anoInicio;
        this.anofim = anofim;
    }
    public turma() {
        this.codigo = 0;
        this.nomeCurso = "";
        this.anoInicio = 0;
        this.anofim = 0;
    }

    public int getCodigo() {
        return codigo;
    }
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    public String getNomeCurso() {
        return nomeCurso;
    }
    public void setNomeCurso(String nomeCurso) {
        this.nomeCurso = nomeCurso;
    }
    public int getAnoInicio() {
        return anoInicio;
    }
    public void setAnoInicio(int anoInicio) {
        this.anoInicio = anoInicio;
    }
    public int getAnofim() {
        return anofim;
    }
    public void setAnofim(int anofim) {
        this.anofim = anofim;
    }
    @Override
    public String toString() {
        return "turma [codigo=" + codigo + ", nomeCurso=" + nomeCurso + ", anoInicio=" + anoInicio + ", anofim="
                + anofim + "]";
    }

    public String getNomeCompleto() {
        /*return ;*/
        
    }
    
}
