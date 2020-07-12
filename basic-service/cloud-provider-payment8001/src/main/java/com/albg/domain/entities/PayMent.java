package com.albg.domain.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.apache.ibatis.annotations.Mapper;

import java.io.Serializable;

/**
 * @Auther: MrZheng
 * @Date: 2020/7/12 17:43
 * @Description:
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class PayMent implements Serializable {

    private Long id;

    private String serial;

}
