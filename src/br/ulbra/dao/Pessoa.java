package br.ulbra.dao;

/**
 * @author s.lucas
 */
public class Pessoa {

    private String name;
    private String phone;
    private String email;

    public Pessoa(String name, String phone, String email) {
        this.name = name;
        this.phone = phone;
        this.email = email;
    }

    public Pessoa() {

    }

    public String getName() {
        if(this.name.equals("")){
            return "Nome vazio";
        }
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return this.phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
    
    public String getEmail(){
        return this.email;
    }
    
    public void setEmail(String email){
        this.email = email;
    }

}
