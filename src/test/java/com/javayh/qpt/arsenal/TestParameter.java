package com.javayh.qpt.arsenal;

import com.javayh.qpt.config.InterfaceTestCaseBase;
import com.javayh.qpt.entity.SysUserEntity;
import com.javayh.qpt.service.TestService;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Story;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.lang.reflect.Method;
import java.util.List;

/**
 * <p>
 * 数据驱动测试
 * </p>
 *
 * @author hai ji
 * @version 1.0.0
 * @since 2022-11-24
 */
@Slf4j
@SpringBootTest
@Epic(value = "第一个 数据驱动测试")
@Feature("API in 测试")
public class TestParameter extends InterfaceTestCaseBase {
    @Autowired
    private TestService testService;

    @DataProvider(name = "data")
    public Object[][] providerData() {
        Object[][] objects = new Object[][]{
                {"zhangsan", 10},
                {"lisi", 20},
                {"wangwu", 30}
        };

        return objects;
    }


    @DataProvider(name = "methodData")
    public Object[][] methodDataTest(Method method) {
        Object[][] result = null;

        if (method.getName().equals("dataProvider2")) {
            result = new Object[][]{
                    {"zhangsan", 20},
                    {"lisi", 25}
            };
        } else if (method.getName().equals("dataProvider3")) {
            result = new Object[][]{
                    {"wangwu", 50},
                    {"zhaoliu", 60}
            };
        }
        return result;
    }

    @DataProvider(name = "data2")
    public Object[] data2(Method method) {
        List<SysUserEntity> all = testService.findAll();
        return new Object[][]{{all}};
    }


    @Story("第一个数据案例")
    @Test(description = "数据驱动测试", dataProvider = "data")
    public void dataProvider1(String name, Integer age) {
        log.info("name = [{}] ; age = [{}]", name, age);

    }

    @Story("第二个数据案例")
    @Test(description = "数据驱动测试", dataProvider = "methodData")
    public void dataProvider2(String name, Integer age) {
        log.info("dataProvider2 ：name = [{}] ; age = [{}]", name, age);
    }

    @Story("第三个数据案例")
    @Test(description = "数据驱动测试", dataProvider = "methodData")
    public void dataProvider3(String name, Integer age) {
        log.info("dataProvider3： name = [{}] ; age = [{}]", name, age);
    }

    @Story("第四个数据案例")
    @Test(description = "数据驱动测试-传递实体类", dataProvider = "data2")
    public void dataProvider4(List<SysUserEntity> all) {
        for (SysUserEntity sysUserEntity : all) {
            log.info("name = [{}] ; password = [{}]", sysUserEntity.getUsername(), sysUserEntity.getPassword());
        }
    }
}
