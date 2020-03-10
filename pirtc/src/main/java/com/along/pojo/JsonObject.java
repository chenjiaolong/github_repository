package com.along.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author along
 * @version 1.0
 * @date 2020/1/9 22:42
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class JsonObject {
    private  User user;
    private  String msg;
}
