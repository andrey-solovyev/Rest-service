package payroll.data.entity;


import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "o")
public class Order {
    private @Id @GeneratedValue long
            id;

    @Column(name = "warranty")
    private boolean warranty;

    @Column(name = "category")
    private String category;

    @Column(name = "firm")
    private String firm;

    @Column(name = "dataGet")
    private String dataGet;

    @Column(name = "dataEnd")
    private String dataEnd;

    @Column(name = "comment")
    private String comment;

    @Column(name = "fullComment")
    private String fullComment;

    @Column(name = "status")
    private String status;

    @Column(name = "master")
    private String master;


    public Order() {
    }

    public Order(boolean warranty, String category, String firm, String dataGet, String dataEnd, String comment, String fullComment, String status, String master) {
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


    public String getDataGet() {
        return dataGet;
    }

    public void setDataGet(String dataGet) {
        this.dataGet = dataGet;
    }

    public String getDataEnd() {
        return dataEnd;
    }

    public void setDataEnd(String dataEnd) {
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
