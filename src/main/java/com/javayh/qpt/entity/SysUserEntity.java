package com.javayh.qpt.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * <p>
 * 用户实体
 * </p>
 *
 * @author hai ji
 * @version 1.0.0
 * @since 2022-11-24
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class SysUserEntity {
    private Integer id;
    private String username;
    private String password;
}
