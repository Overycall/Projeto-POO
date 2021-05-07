
package projetopoo;

import java.util.Calendar;

public class Aluno {
    
    private String nome;
    private String curso;
    //private Calendar periodo;
    private String periodo;
    
    
    public Aluno(String nome, String curso, String periodo) {
        this.nome = nome;
        this.curso = curso;
        this.periodo = periodo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }
/*
    public Calendar getPeriodo() {
        return periodo;
    }

    public void setPeriodo(Calendar periodo) {
        this.periodo = periodo;
    }
 */

    public String getPeriodo() {
        return periodo;
    }

    public void setPeriodo(String periodo) {
        this.periodo = periodo;
    }
    
    public String toString() {
        return String.format("Nome: " + getNome() + "\nCurso: " + getCurso() + "\n" + "Período: " + getPeriodo() + "\n");
    }
    
    public String toFileWriter() {
        return String.format(getNome() + "|" + getCurso() + "|" + getPeriodo());
    }
    
}
