package com.javayh.qpt.arsenal;

import com.javayh.qpt.config.InterfaceTestCaseBase;
import com.javayh.qpt.entity.SysUserEntity;
import com.javayh.qpt.service.TestService;
import io.qameta.allure.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

/**
 * <p>
 * 测试组件
 * </p>
 *
 * @author hai ji
 * @version 1.0.0
 * @since 2022-11-24
 */
@SpringBootTest
@Epic(value = "第一个内部接口测试")
@Feature("API in 测试")
public class TestUserInformation extends InterfaceTestCaseBase {

    @Autowired
    private TestService testService;

    @Test(priority = 1, description = "测试")
    @Description("测试查询")
    @Story("测试查询")
    public void testFindAll() {
        Allure.step("调用查询接口");
        List<SysUserEntity> all = testService.findAll();
        Allure.step("进行结果断言");
        Assert.assertNotNull(all);
    }
}
