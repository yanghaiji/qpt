package com.javayh.qpt.arsenal;

import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.TypeReference;
import com.javayh.qpt.config.InterfaceTestCaseBase;
import com.javayh.qpt.entity.SysUserEntity;
import com.javayh.qpt.utils.HttpUtils;
import io.qameta.allure.Allure;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

/**
 * <p>
 *
 * </p>
 *
 * @author hai ji
 * @version 1.0.0
 * @since 2022-11-24
 */
@Slf4j
@Epic(value = "第一个http接口测试")
@Feature("API in 测试")
@SpringBootTest
public class TestHttpInterface extends InterfaceTestCaseBase {

    @Test(description = "http接口测试")
    public void testHttp() {
        Allure.step("http接口调用");
        String s = HttpUtils.get("http://127.0.0.1:8080/test/api/all");
        Allure.step("进行数据转换");
        List<SysUserEntity> sysUserEntities = JSONObject.parseObject(s, new TypeReference<List<SysUserEntity>>() {
        });
        log.info("查询后的返回结果{}", sysUserEntities);
        Allure.step("进行断言");
        Assert.assertNotNull(sysUserEntities);

    }
}
