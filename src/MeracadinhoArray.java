import java.util.Scanner;

public class MeracadinhoArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

Scanner entrada = new Scanner(System.in);
		
		int d = 0;
		System.out.println("Quantos produtos deseja comprar?");
		d=entrada.nextInt();
		
	//VARI�VEIS	
		String [] produto = new String [d];
		String [] produto1 = new String [d];
		double [] preco = new double [d];
		double [] quant = new double [d];
		double [] pt = new double [d];
		double pre�o_total = 0;
		
	//ENTRADA DE DADOS	
		for (int i = 0;i<preco.length; i++) {
			System.out.println("Qual produto "+i+"?");
			produto[i]=entrada.next();
			System.out.print("Escreva o pre�o de "+produto[i]+" kg ou unid - R$ ");
			preco[i] = entrada.nextDouble();
			System.out.print("Qual quantidade deseja comprar de "+produto[i]+"? - kg ou unid:");
			quant[i] = entrada.nextDouble();
			pt[i]=preco[i]*quant[i];
			System.out.println("Valor total de "+produto[i]+" = R$"+pt[i]);
			pre�o_total = pre�o_total + preco[i]*quant[i];
							
		}
	
	//SA�DA DE DADOS	
			System.out.println("_____________________________________________________________");		
			System.out.println("***TOTAL � PAGAR:\n R$"+ pre�o_total+"\n");
			System.out.println("Sua lista de compras: ");
			
			for (int i=0;i<preco.length;i++) {
				System.out.println("*"+produto[i]+"**");
				System.out.println("p/unit: R$"+preco[i]);
				System.out.println("quant: "+quant[i]);
			}
		
	}

}
