package kg.Exam.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.context.annotation.EnableMBeanExport;

import javax.persistence.*;
import javax.xml.namespace.QName;
import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "cinema")
public class Cinema {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne
    @JoinColumn(name = "code_id",nullable = false,unique = true)
    private Integer code;
    @Column(name = "name", nullable = false)
    private String name;
    @Column(name = "capacity", nullable = false)
    private Integer capacity;
    @Column(name = "address", nullable = false)
    private String address;
    @Column(name = "link_site", nullable = false)
    private String linkSite;
    @Column(name = "local_date_time",nullable = false)
    private LocalDateTime localDateTime;

    public Cinema( String name, Integer capacity, String address, String linkSite) {
 //       this.code = code;
        this.name = name;
        this.capacity = capacity;
        this.address = address;
        this.linkSite = linkSite;
    }
}
