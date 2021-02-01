package gr.hua.dit.ds.hb1.entity;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "stathmoi")
public class Stathmoi {

    @Id
    @Column(name = "stathmos_id")
    private int stathmos_id;

    @Column(name = "max_capacity")
    private int max_capacity;

    @Column(name = "number_students")
    private int number_students;

    @Column(name = "plithos_tmimaton")
    private int plithos_tmimaton;

    public Stathmoi() {
    }

    public Stathmoi(int stathmos_id, int max_capacity, int number_students, int plithos_tmimaton) {
        super();
        this.stathmos_id = stathmos_id;
        this.max_capacity = max_capacity;
        this.number_students = number_students;
        this.plithos_tmimaton = plithos_tmimaton;
    }

    public int getStathmos_id() {
        return stathmos_id;
    }

    public void setStathmos_id(int stathmos_id) {
        this.stathmos_id = stathmos_id;
    }

    public int getMax_capacity() {
        return max_capacity;
    }

    public void setMax_capacity(int max_capacity) {
        this.max_capacity = max_capacity;
    }

    public int getNumber_students() {
        return number_students;
    }

    public void setNumber_students(int number_students) {
        this.number_students = number_students;
    }

    public int getPlithtos_tmimaton() {
        return plithos_tmimaton;
    }

    public void setPlithos_tmimaton(int plithos_tmimaton) {
        this.plithos_tmimaton = plithos_tmimaton;
    }

    @Override
    public String toString() {
        return "Stathmos [id=" + stathmos_id + ", max_Capacity=" + max_capacity + ", number_students=" + number_students + ", plithos_tmimaton=" + plithos_tmimaton + "]";
    }

}