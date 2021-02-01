package gr.hua.dit.ds.hb1.entity;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "mathites")
public class Mathites {

    @Column(name = "tmima_id")
    private int tmima_id;

    @Column(name = "stathmos_id")
    private int stathmos_id;
    
    @Id
    @Column(name = "mathitis_id")
    private int mathitis_id;

    
    public Mathites() {
    }

    public Mathites(int stathmos_id, int tmima_id, int mathitis_id) {
        super();
        this.stathmos_id = stathmos_id;
        this.tmima_id = tmima_id;
        this.mathitis_id = mathitis_id;
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

    public int getMathitis_id() {
        return mathitis_id;
    }

    public void setMathitis_id(int mathitis_id) {
        this.mathitis_id = mathitis_id;
    }

   
    @Override
    public String toString() {
        return "Mathitis [id=" + mathitis_id + ", Stathmos_id=" + stathmos_id + ", Tmima_id=" + tmima_id + "]";
    }

}