/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package questao7.pkg;

/**
 *
 * @author lucas
 */
public class User {
    
    private String id;
    private String senha;

    public User(String id, String senha) {
        this.id = id;
        this.senha = senha;
    }
    
    // método para testar se id e senha digitados são compatíveis 
    // com os do User
    
    public boolean autenticar(String id, String senha){
        if(id.equals(this.id)
        &&(senha.equals(this.senha))){
            
            return true;
        }
            return false;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
    
    
    
    
    
    
}
