package Util;
// Generated Apr 19, 2024 12:15:48 AM by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * Turma generated by hbm2java
 */
public class Turma  implements java.io.Serializable {


     private int id;
     private String descricao;
     private Set estudantes = new HashSet(0);

    public Turma() {
    }

	
    public Turma(int id) {
        this.id = id;
    }
    public Turma(int id, String descricao, Set estudantes) {
       this.id = id;
       this.descricao = descricao;
       this.estudantes = estudantes;
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
    public Set getEstudantes() {
        return this.estudantes;
    }
    
    public void setEstudantes(Set estudantes) {
        this.estudantes = estudantes;
    }




}

