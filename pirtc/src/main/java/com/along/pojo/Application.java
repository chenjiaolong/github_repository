package com.along.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Date;

/**
 * @author along
 * @version 1.0
 * @date 2020/1/10 2:25
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Application {
    private Integer userId;
    private Integer hotelFees;
    private Integer travelFees;
    private Integer applicationId;
    private String destination;
    private Integer  approvalStatus;
    private Date approvalTime;
    private String note;

    public Application(Integer userId, Integer hotelFees, Integer travelFees, String destination, Integer  approvalStatus, Date approvalTime, String note) {
        this.userId = userId;
        this.hotelFees = hotelFees;
        this.travelFees = travelFees;
        this.destination = destination;
        this.approvalStatus = approvalStatus;
        this.approvalTime = approvalTime;
        this.note = note;
    }
}
