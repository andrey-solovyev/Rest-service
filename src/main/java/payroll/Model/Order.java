package payroll.Model;



import lombok.Data;

import javax.persistence.*;
import java.util.Calendar;

@Entity
@Data
@Table(name="order")
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    private boolean warranty;

    private String category;

    private String firm;

    private Calendar dataGet;

    private Calendar dataEnd;

    private String comment;

    private String fullComment;

    private String status;

    private String master;

    private Long personId;
    public Order() {
    }

    public Order(boolean warranty, String category, String firm, Calendar dataGet, Calendar dataEnd, String comment, String fullComment, String status, String master) {
        this.warranty = warranty;
        this.category = category;
        this.firm = firm;
        this.dataGet = dataGet;
        this.dataEnd = dataEnd;
        this.comment = comment;
        this.fullComment = fullComment;
        this.status = status;
        this.master = master;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }


    public boolean isWarranty() {
        return warranty;
    }

    public void setWarranty(boolean warranty) {
        this.warranty = warranty;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getFirm() {
        return firm;
    }

    public void setFirm(String firm) {
        this.firm = firm;
    }

    public Calendar getDataGet() {
        return dataGet;
    }

    public void setDataGet(Calendar dataGet) {
        this.dataGet = dataGet;
    }

    public Calendar getDataEnd() {
        return dataEnd;
    }

    public void setDataEnd(Calendar dataEnd) {
        this.dataEnd = dataEnd;
    }



    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getMaster() {
        return master;
    }

    public void setMaster(String master) {
        this.master = master;
    }
}
