package Util;
// Generated Apr 19, 2024 12:15:48 AM by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * Estudante generated by hbm2java
 */
public class Estudante  implements java.io.Serializable {


     private int nrMatricula;
     private Curso curso;
     private Turma turma;
     private String nome;
     private String apelido;
     private String endereco;
     private String contacto;
     private Set realizas = new HashSet(0);

    public Estudante() {
    }

	
    public Estudante(int nrMatricula) {
        this.nrMatricula = nrMatricula;
    }
    public Estudante(int nrMatricula, Curso curso, Turma turma, String nome, String apelido, String endereco, String contacto, Set realizas) {
       this.nrMatricula = nrMatricula;
       this.curso = curso;
       this.turma = turma;
       this.nome = nome;
       this.apelido = apelido;
       this.endereco = endereco;
       this.contacto = contacto;
       this.realizas = realizas;
    }
   
    public int getNrMatricula() {
        return this.nrMatricula;
    }
    
    public void setNrMatricula(int nrMatricula) {
        this.nrMatricula = nrMatricula;
    }
    public Curso getCurso() {
        return this.curso;
    }
    
    public void setCurso(Curso curso) {
        this.curso = curso;
    }
    public Turma getTurma() {
        return this.turma;
    }
    
    public void setTurma(Turma turma) {
        this.turma = turma;
    }
    public String getNome() {
        return this.nome;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getApelido() {
        return this.apelido;
    }
    
    public void setApelido(String apelido) {
        this.apelido = apelido;
    }
    public String getEndereco() {
        return this.endereco;
    }
    
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    public String getContacto() {
        return this.contacto;
    }
    
    public void setContacto(String contacto) {
        this.contacto = contacto;
    }
    public Set getRealizas() {
        return this.realizas;
    }
    
    public void setRealizas(Set realizas) {
        this.realizas = realizas;
    }




}


