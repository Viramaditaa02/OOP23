/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bab4;

/**
 *
 * @author USER
 */
public class login {
    private String username,pass;
    public String nama;
    public login (){
        nama = "Vira";
        username = "vvira";
        pass= "12345";
    }
    public String getusername (){
        return username;
}
    public void setusername (String username){
            this.username = username;
}
    public String getpass (){
        return pass;
 
    }
    public void setpass (String pass){
            this.pass = pass;
}
    boolean ceklogin (String username,String pass){
        if (username.equals(getusername())&& pass.equals(getpass())){
        return true;
        
    }
        return false;
    }
}
