package com.dailycodebuffer.spring.data.jpa.tutorial.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Customer1 {

    @Id
    @GeneratedValue(
            strategy = GenerationType.AUTO
    )
    private Long customerId;
    private String name;
    private String email;
    private String subject;
    private String message;
//    @OneToOne(
//            cascade = CascadeType.ALL,
//            fetch = FetchType.EAGER,
//            optional = false
//    )
    @OneToMany(
            mappedBy = "customer",
            cascade = CascadeType.ALL
    )
//    @JoinColumn(
//            name = "address_ids"
//    )
    private List<Address> address;

        /*@OneToMany(
            cascade = CascadeType.ALL
    )
    @JoinColumn(
            name = "teacher_id",
            referencedColumnName = "teacherId"
    )
    private List<Course> courses;*/
}
