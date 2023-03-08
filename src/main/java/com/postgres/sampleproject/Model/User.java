package com.postgres.sampleproject.Model;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class User {

    private Integer id;
    private String name;
    private Integer age;
    @NonNull
    private String contactNumber;
    private String address;

}
