package ifcvideira.edu.br;

import javax.swing.JOptionPane;

public class Calculadora2 {
	public static void main(String[] args) {
		Calculadora cal = new Calculadora();
		int op;
		cal.setA(Integer.parseInt(JOptionPane.showInputDialog("Digite um valor:")));
		cal.setB(Integer.parseInt(JOptionPane.showInputDialog("Digite um valor:")));
		
		for(;;){
			op=Integer.parseInt(JOptionPane.showInputDialog("Escolha uma opção:\n\n"
					+"1. Somar \n"
					+"2. Subtrair\n"
					+"3. Dividir \n"
					+"4. Multiplicar \n"
				    +"5. Sair"));
			
			if(op==1){
				int resultado = cal.somar();
				JOptionPane.showMessageDialog(null, "Resultado: "+resultado);
			}else  if(op==2){
				int resultado = cal.subtrair();
				JOptionPane.showMessageDialog(null, "Resultado: "+resultado);
			}else  if(op==3){
				int resultado = cal.dividir();
				JOptionPane.showMessageDialog(null, "Resultado: "+resultado);
			}else  if(op==4){
				int resultado = cal.multiplicacao();
				JOptionPane.showMessageDialog(null, "Resultado: "+resultado);
			}else if(op==5){
				JOptionPane.showMessageDialog(null, "Finalizado");
				break;
			}else{
				JOptionPane.showMessageDialog(null, "Opção inválida");
			}
		}
	}
}
	

