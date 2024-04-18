package Util;
// Generated Apr 19, 2024 12:15:48 AM by Hibernate Tools 4.3.1


import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;

/**
 * Avaliacao generated by hbm2java
 */
public class Avaliacao  implements java.io.Serializable {


     private int id;
     private String descricao;
     private BigDecimal peso;
     private Set disciplinas = new HashSet(0);
     private Set realizas = new HashSet(0);

    public Avaliacao() {
    }

	
    public Avaliacao(int id) {
        this.id = id;
    }
    public Avaliacao(int id, String descricao, BigDecimal peso, Set disciplinas, Set realizas) {
       this.id = id;
       this.descricao = descricao;
       this.peso = peso;
       this.disciplinas = disciplinas;
       this.realizas = realizas;
    }
   
    public int getId() {
        return this.id;
    }
    
    public void setId(int id) {
        this.id = id;
    }
    public String getDescricao() {
        return this.descricao;
    }
    
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    public BigDecimal getPeso() {
        return this.peso;
    }
    
    public void setPeso(BigDecimal peso) {
        this.peso = peso;
    }
    public Set getDisciplinas() {
        return this.disciplinas;
    }
    
    public void setDisciplinas(Set disciplinas) {
        this.disciplinas = disciplinas;
    }
    public Set getRealizas() {
        return this.realizas;
    }
    
    public void setRealizas(Set realizas) {
        this.realizas = realizas;
    }

    @Override
    public String toString() {
        return "Avaliacao{" + "id=" + id + ", descricao=" + descricao + ", peso=" + peso + ", disciplinas=" + disciplinas + ", realizas=" + realizas + '}';
    }




}


