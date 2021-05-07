
package projetopoo;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class ProjetoPOO {

    private String filename;
    private String text;
    
    public ProjetoPOO(String file) {
        filename = file;
    }
    
    Aluno aluno;
    
    public Aluno lerArquivo() throws IOException {
        try {
                    Scanner text = new Scanner(new File(filename));
                    while(text.hasNextLine()) {
                        String aux = text.nextLine();
                        
                        String nome[] = aux.split("\\|");
                                
                        aluno = new Aluno(nome[0], nome[1], nome[2]);
                    }
                                        
                    //Se não encontrar o arquivo, vai abrir modais para o usuário digitar suas informaçoes                   
                } catch (FileNotFoundException ex) {
                    System.out.println("Erro: " + ex.getMessage());
                    JOptionPane.showMessageDialog(null, "Bem vindo! Como é sua primeira vez usando o programa é necessário você inserir algumas informações...");
                    String nome = JOptionPane.showInputDialog(null, "Informe seu nome");
                    String curso = JOptionPane.showInputDialog(null, "Informe seu curso");
                    String periodo = JOptionPane.showInputDialog(null, "Informe o período de aula (Ex: dd/mm/yyyy até dd/mm/yyyy)");
                    
                    aluno = new Aluno(nome, curso, periodo);
                    
                    gravarArquivo(aluno);   //Gravar arquivo aluno.txt com as informações do aluno
                }
        return aluno;
    }
    
    public void gravarArquivo(Aluno a) throws IOException {
        try {
            FileWriter fw = new FileWriter(filename);
            PrintWriter pw = new PrintWriter(fw);

            pw.println(a.toFileWriter());
                            
            pw.flush();
            pw.close();
            fw.close();
        }
        catch (IOException ex) {
            System.out.println("Erro: " + ex.getMessage());
            JOptionPane.showMessageDialog(null, "Erro ao criar arquivo aluno.txt");
        }
    }
}
