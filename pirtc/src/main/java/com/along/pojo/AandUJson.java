package com.along.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author along
 * @version 1.0
 * @date 2020/1/10 19:44
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class AandUJson {
    private User user;
    private Application application;

}
