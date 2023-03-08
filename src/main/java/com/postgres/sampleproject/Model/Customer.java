package com.postgres.sampleproject.Model;

import jdk.jfr.DataAmount;
import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.Min;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Table(name="CUSTOMER_DET")
public class Customer {

    @Id
    @GeneratedValue
    private Integer customerId;
    private String customerName;
    @Min(5)
    private Integer age;
    @NonNull
    private String phoneNumber;
    private String address;


}
