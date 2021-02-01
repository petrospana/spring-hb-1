package gr.hua.dit.ds.hb1.entity;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tmimata")
public class Tmimata {

    @Id
    @Column(name = "tmima_id")
    private int tmima_id;

    @Column(name = "stathmos_id")
    private int stathmos_id;

    @Column(name = "username")
    private String username;

    
    public Tmimata() {
    }

    public Tmimata(int stathmos_id, int tmima_id, String username) {
        super();
        this.stathmos_id = stathmos_id;
        this.tmima_id = tmima_id;
        this.username = username;
        }

    public int getStathmos_id() {
        return stathmos_id;
    }

    public void setStathmos_id(int stathmos_id) {
        this.stathmos_id = stathmos_id;
    }

    public int getTmima_id() {
        return tmima_id;
    }

    public void setTmima_id(int tmima_id) {
        this.tmima_id = tmima_id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

   
    @Override
    public String toString() {
        return "Tmima [id=" + tmima_id+ ", Stathmos_id=" + stathmos_id + ", Daskalos=" + username + "]";
    }

}