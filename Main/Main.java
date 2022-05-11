package Main;

//Importações
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import entities.Bolsa;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Eduardo Amengual Garcia
 * Processo Seletivo IT Academy  #15
 */

public class Main {
    
     //Iniciando o método main
     public static void main (String args[]) throws FileNotFoundException, IOException{
      
        //Criando  objeto Scanner para ler entradas do usuário
        Scanner leia = new Scanner(System.in);
        
        //Criando uma string com o caminho do diretório do arquivo .csv
        String path = ".\\bolsistas.csv";
       
        //Criando um arraylist List para armazenar os objetos do .csv
        List<Bolsa> list = new ArrayList<Bolsa>();
        
        //Var de opção do Menu
        int op = 1;
        
        //Criando um objeto BufferedReader juntamente com o objeto do arquivo .csv  
        try(BufferedReader br = new BufferedReader(new FileReader(path))){
            
            //Linha do arquivo .csv
            String linha = br.readLine();
            
            //Lendo a primeira linha da planilha .csv (cabeçalho)
            linha = br.readLine();
            
            //Loop para zerar o arquivo .csv e armazenar todos os objetos na List
            while(linha != null){
                
                //recorta a string no " ; " e adiciona no Array
                String[] vect = linha.split(";");
                
                
                String NM_BOLSISTA = vect[0];
                String CPF_BOLSISTA = vect[1];
                String NM_ENTIDADE_ENSINO = vect[2];
                String ME_REFERENCIA = vect[3];
                String AN_REFERENCIA = vect[4];
                String SG_DIRETORIA = vect[5];
                String SG_SISTEMA_ORIGEM = vect[6];
                String CD_MODALIDADE_SGB = vect[7];
                String CD_MODALIDADE_PAGAMENTO = vect[8];
                String CD_MOEDA = vect[9];
                Double VL_BOLSISTA_PAGAMENTO = Double.parseDouble(vect[10]);
                
                //Cria um objeto equivalente a uma linha do arquivo .csv usando método construtor
                Bolsa bolsista = new Bolsa(NM_BOLSISTA,CPF_BOLSISTA,NM_ENTIDADE_ENSINO,ME_REFERENCIA,AN_REFERENCIA,SG_DIRETORIA,SG_SISTEMA_ORIGEM,CD_MODALIDADE_SGB,CD_MODALIDADE_PAGAMENTO,CD_MOEDA,VL_BOLSISTA_PAGAMENTO);
                
                //Adiciona o objto na list
                list.add(bolsista);
                
                //Vai para próxima linha
                linha = br.readLine();
            }
            
        } //Tratando possíveis erros
        catch(IOException e){
            System.out.println("ERRO: "+e.getMessage());
        }
                    
        //Loop do menu principal
        do{
            System.out.println("Programa IT Academy - Processo Seletivo #15 \n");
            System.out.println("1 - Consultar Bolsa zero/ano");
            System.out.println("2 - Codificar nomes");
            System.out.println("3 - Consultar Media anual");
            System.out.println("4 - Ranking de valores da bolsa");
            System.out.println("5 - Finalizar programa \n");
            System.out.println("Digite sua opcao:");
            op = leia.nextInt();
            System.out.println("");
            
            //Swicth case para ler a opção do usuário
            switch (op) {
                
                //Tratando a PRIMEIRA funcionalidade
                case 1:
                    //Criando um menu simples
                    System.out.println("Opcao 1 - Consultar bolsa zero/ano\n");
                    System.out.println("- 2013");
                    System.out.println("- 2014");
                    System.out.println("- 2015");
                    System.out.println("- 2016 \n");
                    System.out.print("Selecione o ano desejado: \n");
                    String op1 = leia.next(); //Lendo a opção do usuário
                    System.out.println("");
                    int count = 0; //Var de controle, para pegar apenas o 1° Objeto com o ano X
                    
                    //Verificando o ano digtado
                    if(op1.equals("2013") || op1.equals("2014") || op1.equals("2015")){
                        
                        //Loop para varrer todo o ArrayList list
                        for(Bolsa bolsista1 : list){
                            
                            /*
                                        Verifica os atributos d objeto temporário
                                      */ 
                            if(bolsista1.getAN_REFERENCIA().equals(op1) && bolsista1.getME_REFERENCIA().equals("1") && count == 0){
                              System.out.println("NOME: "+bolsista1.getNM_BOLSISTA());
                              System.out.println("CPF: "+bolsista1.getCPF_BOLSISTA());
                              System.out.println("ENTIDADE DE ENSINO: "+bolsista1.getNM_ENTIDADE_ENSINO());
                              System.out.println("VALOR BOLSA: "+bolsista1.getVL_BOLSISTA_PAGAMENTO());
                              count = 1;
                              System.out.println("");
                            }
                        }
                    }//Tratando um BUG, por alguma razão, teve de se imprimir o primeiro bolsista de 2016 manualmente
                    else if(op1.equals("2016")){
                        Bolsa bolsistaCerto = list.get(0);
                        System.out.println("NOME: "+bolsistaCerto.getNM_BOLSISTA());
                        System.out.println("CPF: "+bolsistaCerto.getCPF_BOLSISTA());
                        System.out.println("ENTIDADE DE ENSINO: "+bolsistaCerto.getNM_ENTIDADE_ENSINO());
                        System.out.println("VALOR BOLSA: "+bolsistaCerto.getVL_BOLSISTA_PAGAMENTO());
                        System.out.println("");
                    }
                    else{
                        //Tratando possíveis erros
                        System.out.println("ERRO! DIGITE UM ANO VALIDO \n");
                    }
                    break;   
                      
                //Tratando a SEGUNDA funcionalidade !INCOMPLETA!
                case 2:
                    
                    
                    System.out.println("Opcao 2 - Codificar nomes \n");
                    System.out.println("Digite o nome de um bolsista");
                    String nomeBolsista = leia.next(); //Lendo o nome digitado pelo usuário
                    
                    String nomeBolsistaUp = nomeBolsista.toUpperCase(); //Transformando a string digitada em caixa alta
                    int count2 = 0 ;
                    
                    //Loop varrendo todos os objetos do arraylist
                    for(Bolsa bolsista2 : list){
                        
                        //Tentando encontrar o nome do objeto com base na string digitada
                        if( nomeBolsistaUp.contains(bolsista2.getNM_BOLSISTA()) && count2 == 0){
                            System.out.print("O NOME QUE PROCURAS eh;   "+bolsista2.getNM_BOLSISTA());
                            count2 = 1;
                        }
                        else
                        {
                            System.out.println("Not found");
                        }
         
                    }
                  
                    break;
                    
                //Tratando a TERCEIRA funcionalidade
                case 3:
                    //Criando um menu simples
                    System.out.println("Opcao 3 - Consultar media anual\n");
                    System.out.println("- 2013");
                    System.out.println("- 2014");
                    System.out.println("- 2015");
                    System.out.println("- 2016 \n");
                    System.out.print("Selecione o ano desejado: ");
                    String op3 = leia.next(); //Lendo a opção do usuário
    
                    int media = 0; //Média dos valores
                    int pagamentoTotal = 0; //Soma do preço dos valores
                  
                    //ArrayList para adicionar os Objetos e descobrir a quantidade de participantes do determinado ano
                    List lista2 = new ArrayList();
              
                    //Verificando o ano digitado
                    if(op3.equals("2013") || op3.equals("2014") || op3.equals("2015") || op3.equals("2016")){
                        
                        //Loop varrendo a List com os Bolsistas
                        for(Bolsa bolsista : list){
                            
                            //Verificando se o atributo ano dos bolsistas, condiz com o digitado
                            if(bolsista.getAN_REFERENCIA().equals(op3)){
                                pagamentoTotal += bolsista.getVL_BOLSISTA_PAGAMENTO();
                                lista2.add(bolsista);    
                            }
                        }
                        int tamanhoArray = lista2.size(); //Descobrindo o número de participantes do ano X
                        
                        media = pagamentoTotal/tamanhoArray; //Fazendo a média
                        
                        System.out.println(" \n A média dos valores das bolsas de "+op3+" eh de: "+ media);
                    }
                    else{
                        //Tratando possíveis erros
                        System.out.println("ERRO! ANO INVALIDO!");
                    }
                    break;
                    
                //Tratando a QUARTA funcionaldade !INCOMPLETA!
                case 4:
                    System.out.println("Opcao 4 - Ranking dos valores de bolsa \n");
                    
                    //Criando um vetor para adiconar os valores dos atributos VL_BOLSISTA_PAGAMENTO dos objetos
                    Double [] vetorValores = new Double[list.size()];
                    
                    //Loop para varrer o arraylist de objetos e adicionar os valores dos atributos VL_BOLSISTA_PAGAMENTO no vetorValores[]
                    for(int i = 0 ; i < list.size() ; i ++){
                        Bolsa bolsistaTemp = list.get(i);
                        vetorValores[i] = bolsistaTemp.getVL_BOLSISTA_PAGAMENTO();
                    }
                    
                    //Criando um vetor para os 3 maiores valores de bolsa
                    Double [] largest = new Double[3];
                    
                    //Varrendo o vetorValores em busca dos 3 maiores números
                    for(double num : vetorValores){
                        
                        //Estrutura para verificar e adicionar os 3 maiores valores dentro de largest
                        if(largest[2] == null || num > largest[2]){
                            for(int i = 0; i < 3 ; i ++){
                                if( i == 2){
                                    largest[i] = num;
                                }
                                else {
                                    largest[i] = largest[i +1];
                                }
                            }
                        }
                    }
                    
                    System.out.println("Colocacao tipo A: os 3 alunos com os valores de bolsa mais altos \n");
                    
                    //Variáveis auxiliares na varredura dos objetos
                    int auxiliar1 = 0;
                    int auxiliar2 = 0;
                    int auxiliar3 = 0;
                  
                    //Varrendo o arraylist em busca dos objetos certos para imprimir os dados
                    for(Bolsa bolsistaTemp : list){
                        if(bolsistaTemp.getVL_BOLSISTA_PAGAMENTO() == largest[0].doubleValue() && auxiliar1 == 0){
                            auxiliar1 = 1;
                            System.out.println("Nome:  "+ bolsistaTemp.getNM_BOLSISTA() + "\nValor bolsa: "+bolsistaTemp.getVL_BOLSISTA_PAGAMENTO()+"\n");
                        }
                        else if(bolsistaTemp.getVL_BOLSISTA_PAGAMENTO() == largest[1].doubleValue() && auxiliar2 == 0){
                            auxiliar2 = 1;
                            System.out.println("Nome:  "+ bolsistaTemp.getNM_BOLSISTA() + "\nValor bolsa: "+bolsistaTemp.getVL_BOLSISTA_PAGAMENTO()+"\n");
                        }
                        else if(bolsistaTemp.getVL_BOLSISTA_PAGAMENTO() == largest[2].doubleValue() && auxiliar3 == 0){
                            auxiliar3 = 1;
                            System.out.println("Nome:  "+ bolsistaTemp.getNM_BOLSISTA() + "\nValor bolsa: "+bolsistaTemp.getVL_BOLSISTA_PAGAMENTO()+"\n");
                        }
                    }
                    break;
                    
                //Tratando a QUINTA funcionalidade
                case 5:
                    System.out.println("FIM DO PROGRAMA");
                    break;
                    
                default:
                    //Tratando possíveis erros
                    System.out.println("Erro! DIGITE UMA OPCAO VALIDA");
            }
        }while(op !=5); //Finalizando o programa

        leia.close();
    }
}
