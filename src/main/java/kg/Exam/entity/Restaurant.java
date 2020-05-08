package kg.Exam.entity;

import com.sun.javafx.beans.IDProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.metamodel.model.domain.IdentifiableDomainType;

import javax.persistence.*;
import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "restaurant")
public class Restaurant {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne
    @JoinColumn(name = "code_id",nullable = false,unique = true)
    private Integer code;
    @Column(name = "name",nullable = false)
    private String name;
    @Column(name = "address",nullable = false)
    private String address;
    @Column(name = "main_course",nullable = false)
    private String mainCourse;
    @Column(name = "link_site",nullable = false)//Наверное он должен быть уникалным
    private String linkSite;
    @Column(name = "local_date_time",nullable = false)
    private LocalDateTime localDateTime;

    public Restaurant(String name, String address, String mainCourse, String linkSite) {
        this.name = name;
        this.address = address;
        this.mainCourse = mainCourse;
        this.linkSite = linkSite;
    }
}
