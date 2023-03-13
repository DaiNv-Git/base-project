package com.example.itspower.response;

import com.example.itspower.model.entity.EmployeeRestEntity;
import lombok.Data;

@Data
public class EmployeeResponse {
    private String empName;
    private String emCode;
    private Integer reasonId;
    private Integer id;
    private Integer reportId;

    public EmployeeResponse(EmployeeRestEntity restEntity) {
        this.empName = restEntity.getEmpName();
        this.emCode = restEntity.getEmpCode();
        this.reasonId = restEntity.getReasonId();
        this.id = restEntity.getId();
        this.reportId = restEntity.getReportId();
    }
}
