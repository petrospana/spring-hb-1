package gr.hua.dit.ds.hb1.entity;


import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "ekpaideftikoi")
public class Ekpaideftikoi {

    @Id
    @Column(name = "username")
    private String username;

    @Column(name = "first_name")
    private String first_name;

    @Column(name = "last_name")
    private String last_name;

    @Column(name = "email")
    private String email;
    
    @Column(name = "stathmos_id")
    private int stathmos_id;

    
    @Column(name = "password")
    private String password;
    
    
	    public Ekpaideftikoi() {
    }

    public Ekpaideftikoi(String username, String first_name, String last_name, String email, String password, int stathmos_id) {
        super();
        this.username = username;
        this.first_name = first_name;
        this.last_name = last_name;
        this.email = email;
        this.password = password;
        this.stathmos_id = stathmos_id;
        
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String Email) {
        this.email = email;
    }
    
    public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public int getStathmos_id() {
		return stathmos_id;
	}

	public void setStathmos_id(int stathmos_id) {
		this.stathmos_id = stathmos_id;
	}

   @Override
   public String toString() {
    return "Diefthintis [username=" + username + ", firstName=" + first_name + ", lastName=" + last_name + ", E-mail=" + email + ", Password=" + password + ", PaidikosStathmos=" + stathmos_id + "]";
  }

}