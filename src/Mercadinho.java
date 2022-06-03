import java.util.Scanner;

public class Mercadinho {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

Scanner entrada = new Scanner(System.in);
		
		//VARIÁVEIS
		
		//VARIÁVEIS CORREDOR HORTIFRUTI
	double q1 = (double) 0; //QUANT BANANA
	float p1 = (float) 4.50; //PREÇO BANANA
	float q2 = (float) 0; //QUANT MAÇA
	float p2 = (float) 3.00; //PREÇO MAÇA
	float q3 = (float) 0; //QUANT MELÃO
	float p3 = (float) 6.45; //PREÇO MELÃO
	float q4 = (float) 0; //QUANT GOIABA
	float p4 = (float) 2.90; //PREÇO GOIANA
	float q5 = (float) 0; //QUANT MAMÃO
	float p5 = (float) 3.50; //PREÇO MAMÃO
		//VARIÁVEIS CORREDOR CASA
	float q6 = (float) 0; //QUANT CADEIRA
	float p6 = (float) 25.50; //PREÇO CADEIRA
	float q7 = (float) 0; //QUANT MESA
	float p7 = (float) 60.00; //PREÇO MESA
	float q8 = (float) 0; //QUANT ROUPÃO
	float p8 = (float) 23.45; //PREÇO ROUPÃO
	float q9 = (float) 0; //QUANT ÓCULOS DE SOL
	float p9 = (float) 10.6; //PREÇO ÓCULOS DE SOL
		//VARIÁVEIS CORREDOR MATERIAIS DE CONSTRUÇÃO
	float q10 = (float) 0; //QUANT TINTA
	float p10 = (float) 2.90; //PREÇO TINTA
	float q11 = (float) 0; //QUANT PINCEL
	float p11 = (float) 3.50; //PREÇO PINCEL
	float q12 = (float) 0; //QUANT BALDE DE PLÁSTICO
	float p12 = (float) 10.6; //PREÇO BALDE DE PLÁSTICO
	float q13 = (float) 0; //QUANT ESCADA
	float p13 = (float) 2.90; //PREÇO ESCADA
	float q14 = (float) 0; //QUANT MARTELO
	float p14 = (float) 3.50; //PREÇO MARTELO
	
	int resp2 = 0;
	
		System.out.println("Bem vindo ao Mercadinho Fuctura");
		
	
	while(resp2 < 2) {			
					
			System.out.println("Deseja adicionar produtos?\nDigite 1 para sim e 2 para finalizar a compra");
			resp2 = entrada.nextInt();
			
			//ESCOLHA DO CORREDOR
			if(resp2==1) {
			System.out.println("Deseja produtos de qual corredor?");
			System.out.println("1 - Hortifruti");
			System.out.println("2 - Casa");
			System.out.println("3 - Materiais de Construção");
			int resp1 = entrada.nextInt();
			
					//CORREDOR DE HORTIFRUTI
						//Escolha do produto
					if(resp1==1) { 
						System.out.println("Qual produto deseja?");
						System.out.println("1 - Banana");
						System.out.println("2 - Maça");
						System.out.println("3 - Melão");
						System.out.println("4 - Goiaba");
						System.out.println("5 - Mamão");		
								
					
							int numero = entrada.nextInt();
								switch (numero) {
								case 1:
									System.out.println("Banana");
									System.out.println("Quantos quilos deseja?");
									q1 =(float) entrada.nextFloat();
									System.out.println("total do produto = R$"+q1*p1);
									break;
									
								case 2:
									System.out.println("Maça");
									System.out.println("Quantos quilos deseja?");
									q2 = entrada.nextFloat();
									System.out.println("total do produto = R$"+q2*p2);	
									break;		
									
								case 3:
									System.out.println("Melão");
									System.out.println("Quantos quilos deseja?");
									q3 =(float) entrada.nextFloat();
									System.out.println("total do produto = R$"+q3*p3);
									break;
									
								case 4:
									System.out.println("Goiaba");
									System.out.println("Quantos quilos deseja?");
									q4 = entrada.nextFloat();
									System.out.println("total do produto = "+q4*p4);	
									break;		
									
								case 5:
									System.out.println("Mamão");
									System.out.println("Quantos quilos deseja?");
									q5 = entrada.nextFloat();
									System.out.println("total do produto = R$"+q5*p5);	
									break;	
									
									default:
										System.out.println("Número inválido");
										}
				
						
					// CORREDOR DE CASA
						} else if(resp1==2) {  
							
							System.out.println("Qual produto deseja?");
							System.out.println("1 - Cadeira");
							System.out.println("2 - Mesa");
							System.out.println("3 - Roupão");
							System.out.println("4 - Óculos de Sol");
							
																
								int numero = entrada.nextInt();
									switch (numero) {
									case 1:
										System.out.println("Cadeira");
										System.out.println("Quantos deseja?");
										q6 =(float) entrada.nextFloat();
										System.out.println("total do produto = R$"+q6*p6);
										break;
										
									case 2:
										System.out.println("Mesa");
										System.out.println("Quantos deseja?");
										q7 = entrada.nextFloat();
										System.out.println("total do produto = R$"+q7*p7);	
										break;		
										
									case 3:
										System.out.println("Roupão");
										System.out.println("Quantos deseja?");
										q8 =(float) entrada.nextFloat();
										System.out.println("total do produto = R$"+q8*p8);
										break;
										
									case 4:
										System.out.println("Óculos de Sol");
										System.out.println("Quantos deseja?");
										q9 = entrada.nextFloat();
										System.out.println("total do produto = "+q9*p9);	
										break;		
										
									default:
										System.out.println("Número inválido");
											
										
											}
									
						//CORREDOR MATERIAIS DE CONSTRUÇÃO		
						} else if(resp1==3) {  
							
							System.out.println("Qual produto deseja?");
							System.out.println("1 - Tinta");
							System.out.println("2 - Pincel");
							System.out.println("3 - Balde de Plástico");
							System.out.println("4 - Escada");
							System.out.println("5 - Martelo");		
									
						
								int numero = entrada.nextInt();
									switch (numero) {
									case 1:
										System.out.println("Tinta");
										System.out.println("Quantas deseja?");
										q10 =(float) entrada.nextFloat();
										System.out.println("total do produto = R$"+q10*p10);
										break;
										
									case 2:
										System.out.println("Pincel");
										System.out.println("Quantos deseja?");
										q11 = entrada.nextFloat();
										System.out.println("total do produto = R$"+q11*p11);	
										break;		
										
									case 3:
										System.out.println("Balde de Plástico");
										System.out.println("Quantos deseja?");
										q12 =(float) entrada.nextFloat();
										System.out.println("total do produto = R$"+q12*p12);
										break;
										
									case 4:
										System.out.println("Escada");
										System.out.println("Quantas deseja?");
										q13 = entrada.nextFloat();
										System.out.println("total do produto = "+q13*p13);	
										break;		
										
									case 5:
										System.out.println("Martelo");
										System.out.println("Quantos deseja?");
										q14 = entrada.nextFloat();
										System.out.println("total do produto = R$"+q14*p14);	
										break;	
										
									default:
										System.out.println("Número inválido");
										
											}
																		
															
						}
			}else {
				System.out.println("Compra finalizada.Total a pagar: R$"+(q2*p2+q1*p1+q3*p3+q4*p4+q5*p5+q6*p6+q7*p7+q8*p8+q9*p9+q10*p10+p11*q11+q12*p12+q13*p13+p14*q14));
				
			}
	}//FIM DO WHILE		
		
	}

}
