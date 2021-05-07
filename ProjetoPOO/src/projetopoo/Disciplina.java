
package projetopoo;


public class Disciplina {
    
    private String nome;
    private String professor;
    private String emailProfessor;
    
    
    public Disciplina(String nome, String professor, String email) {
        this.nome = nome;
        this.professor = professor;
        emailProfessor = email;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getProfessor() {
        return professor;
    }

    public void setProfessor(String professor) {
        this.professor = professor;
    }

    public String getEmailProfessor() {
        return emailProfessor;
    }

    public void setEmailProfessor(String emailProfessor) {
        this.emailProfessor = emailProfessor;
    }
        
    public String toString() {
        return String.format("Nome: " + getNome() + "\nProfessor: " + getProfessor() + "\nE-mail do professor: " + getEmailProfessor() + "\n");
    }
    
    public String toFileWriter() {
        return String.format(getNome() + "|" + getProfessor() + "|" + getEmailProfessor());
    }
    
}
