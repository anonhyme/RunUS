package org.anonymus.model;



import javax.persistence.*;
import java.sql.Date;


/**
 * Created by antoine on 3/5/2015.
 */
@Entity
@Table(name = "mbed")
public class Mbed {

    @Id
    @GeneratedValue
    private Integer id;

    @Column(name = "source")
    private String source;

    @Basic(optional = false)
    @Column(name = "time", insertable = false, updatable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date timestamp;

    @Column(name = "data")
    private String data;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public Date getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Date timestamp) {
        this.timestamp = timestamp;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    
}
