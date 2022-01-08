package atividade_pratica;
import java.io.Console;

//import javax.swing.JOptionPane;

public class VerificaQuantidade {
	
	public void solicitarEndereco(){
		//double endereco = String.parseString(JOptionPane.showInputDialog(""));
		Console console = System.console();
		String input = console.readLine("Escreva seu nome: ");
		System.out.println(input);
	}
	
}