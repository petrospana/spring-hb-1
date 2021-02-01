package gr.hua.dit.ds.hb1.entity;


import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "aitiseis")
public class Aitiseis {

    @Id
    @Column(name = "aitisi_id")
    private int aitisi_id;

    @Column(name = "first_name")
    private String first_name;

    @Column(name = "last_name")
    private String last_name;

    @Column(name = "etisioIsodima")
    private int etisioIsodima;
    
    @Column(name = "dateOfBirth")
    private Date dateOfBirth;
    
    
	

	@Column(name = "onomaPatera")
    private String onomaPatera;
    
    @Column(name = "onomaMiteras")
    private String onomaMiteras;

    public Aitiseis() {
    }

    public Aitiseis(String first_name, String last_name, int etisioIsodima, Date dateOfBirth, String onomaPatera, String onomaMiteras) {
        super();
        this.first_name = first_name;
        this.last_name = last_name;
        this.etisioIsodima = etisioIsodima;
        this.dateOfBirth = dateOfBirth;
        this.onomaPatera = onomaPatera;
        this.onomaMiteras = onomaMiteras;
    }

    public int getAitisi_d() {
        return aitisi_id;
    }

    public void setAitisi_id(int aitisi_id) {
        this.aitisi_id = aitisi_id;
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

    public int getEtisioIsodima() {
        return etisioIsodima;
    }

    public void setEtisioIsodima(int etisioIsodima) {
        this.etisioIsodima = etisioIsodima;
    }
    
    public Date getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public String getOnomaPatera() {
		return onomaPatera;
	}

	public void setOnomaPatera(String onomaPatera) {
		this.onomaPatera = onomaPatera;
	}

	public String getOnomaMiteras() {
		return onomaMiteras;
	}

	public void setOnomaMiteras(String onomaMiteras) {
		this.onomaMiteras = onomaMiteras;
	}

   @Override
   public String toString() {
    return "Aitisi [id=" + aitisi_id + ", firstName=" + first_name + ", lastName=" + last_name + ", EtisioIsodima=" + etisioIsodima + ", ImerominiaGennisis=" + dateOfBirth + ", onomaPatera=" + onomaPatera + ", onomaMiteras=" + onomaMiteras + "]";
  }

}