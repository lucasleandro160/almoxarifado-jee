
package models;

import javax.persistence.*;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.HashSet;
import java.util.Set;

@Entity
@XmlRootElement
@DiscriminatorValue("C")
public class Usuario {
    private int id;
    private String login;
    private String senha;

    public Usuario() {}

    public Usuario(int id, String login, String senha) {
        this.id = id;
        this.login = login;
        this.senha = senha;
    }

    public Usuario(String login, String senha) {
        this.login = login;
        this.senha = senha;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
    
}
