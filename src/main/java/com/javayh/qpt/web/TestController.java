package com.javayh.qpt.web;

import com.javayh.qpt.entity.SysUserEntity;
import com.javayh.qpt.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * <p>
 * 对外接口
 * </p>
 *
 * @author hai ji
 * @version 1.0.0
 * @since 2022-11-24
 */
@RestController
@RequestMapping(value = "/test/api")
public class TestController {
    @Autowired
    private TestService testService;

    @GetMapping(value = "/all")
    public List<SysUserEntity> findAll() {
        return testService.findAll();
    }
}
