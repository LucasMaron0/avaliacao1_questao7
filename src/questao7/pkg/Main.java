
package questao7.pkg;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author lucas
 */
public class Main {
    
    //Array vai ser usado em dois metodos 
    static ArrayList <User> users = new ArrayList();

    
    public static void main(String[] args) throws ParseException {
        
        
        
        // adicionando Users no array para realizar testes
        
        User userTeste = new User("teste","12345");
        User lucas = new User("lucas","54321");
        User maron = new User("maron","12345");
         
        users.add(userTeste);
        users.add(lucas);
        users.add(maron);
        
           
        
      
        //se logar, retorna true e o programa fecha, se retorna false, pede os dados para tentar novamente. 
       
        while (!login()) {
           
                 System.out.println("ERRO DE LOGIN!");
            
        }
        

   
    }
    
    
    
    public static boolean login () throws ParseException{
        
   //formatar a data, pegando apenas as horas e minuto    
  // Horas(0-23) : minutos (https://docs.oracle.com/javase/7/docs/api/java/text/SimpleDateFormat.html)
   
  SimpleDateFormat sdf = new SimpleDateFormat("HH:mm"); 

                                                          
  
   //declaração dos horários, para realizar a comparação
   
   Date inicioManha = sdf.parse("06:00");
   Date fimManha = sdf.parse ("11:59");
   
   Date inicioTarde = sdf.parse ("12:00");
   Date fimTarde = sdf.parse ("17:59");
   
   Date inicioNoite = sdf.parse ("18:00");
   Date fimNoite = sdf.parse ("23:59");
   
   Date inicioMadrugada = sdf.parse ("00:00");
   Date fimMadrugada = sdf.parse ("05:59");
        
   // new Date retorna o tempo atual, format retorna em STRING, parse em DATE, usando a formatação definida no SimpleDateFormat.
   
   String stringHoraATual = sdf.format(new Date());
   Date horaAtual = sdf.parse(stringHoraATual);  
        

        
    //pegando input de ID e senha do usuário para comparar com aqueles no array.    
        
    String id, senha;
        
    Scanner input = new Scanner(System.in);
    

    System.out.println("-----LOGIN-----");
    
    System.out.println("ID:");
    id = input.nextLine();
    
    System.out.println("SENHA:");
    senha = input.nextLine();
    
    
    
    //comparando os dados digitados com os armazenados no Array, e testando as condições dos horários
    
    for (int i =0; i < users.size();i++){
       
        if(  (id.equals(users.get(i).getId()))
              &&(senha.equals(users.get(i).getSenha()))){
            
                if (horaAtual.after(inicioManha)&& horaAtual.before(fimManha)){
                    
                    System.out.println("Bom dia, você se logou ao nosso sistema");
                    
                    return true;
                }
                if (horaAtual.after(inicioTarde)&& horaAtual.before(fimTarde)){
                    
                    System.out.println("Boa tarde, você se logou ao nosso sistema");
                    
                    return true;
                }
                if (horaAtual.after(inicioNoite)&& horaAtual.before(fimNoite)){
                    
                    System.out.println("Boa noite, você se logou ao nosso sistema");
                    
                    return true;
                }
                if (horaAtual.after(inicioMadrugada)&& horaAtual.before(fimMadrugada)){
                    
                    System.out.println("Boa madrugada, você se logou ao nosso sistema");
                    
                    return true;
                }
  
        }         
    } 
        
       
        return false;
  
        
        
    }
    
    

    
}