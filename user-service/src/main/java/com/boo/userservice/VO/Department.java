package com.boo.userservice.VO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
//value object for Department -> means the data is not stored in database but in memory only
public class Department {

    private Long departmentId;
    private String departmentName;
    private String manager;
    private Integer departmentCode;


}
