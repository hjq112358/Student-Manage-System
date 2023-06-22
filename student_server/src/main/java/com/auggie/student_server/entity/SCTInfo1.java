package com.auggie.student_server.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.apache.ibatis.type.Alias;

/**
 * @Auther: auggie
 * @Date: 2022/2/11 11:14
 * @Description: SCTInfo
 * @Version 1.0.0
 */

@Data
@NoArgsConstructor
@AllArgsConstructor
@Alias("SCTInfo2")
public class SCTInfo1 {
    private Integer tid;
    private Integer cid;
    private String term;

    private String count;
}
