package com.along.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author along
 * @version 1.0
 * @date 2020/1/10 2:43
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
public class JsonApplication {

    private Application application;
    private String msg;
}
