package com.javayh.qpt.config;


import lombok.extern.slf4j.Slf4j;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
import org.testng.IHookCallBack;
import org.testng.ITestResult;
import org.testng.annotations.*;

import java.lang.reflect.Method;

/**
 * <p>
 * 接口测试父类
 * </p>
 *
 * @author hai ji
 * @version 1.0.0
 * @since 2022-11-24
 */
@Slf4j
public class InterfaceTestCaseBase extends AbstractTestNGSpringContextTests {
    public InterfaceTestCaseBase() {
        super();
    }

    @BeforeClass(alwaysRun = true)
    @Override
    protected void springTestContextBeforeTestClass() throws Exception {
        super.springTestContextBeforeTestClass();
//        logger.info("-----------springTestContextBeforeTestClass-------------");
    }

    @BeforeClass(alwaysRun = true, dependsOnMethods = {"springTestContextBeforeTestClass"})
    @Override
    protected void springTestContextPrepareTestInstance() throws Exception {
        super.springTestContextPrepareTestInstance();
//        logger.info("-----------springTestContextPrepareTestInstance-------------");
    }

    @BeforeMethod(alwaysRun = true)
    @Override
    protected void springTestContextBeforeTestMethod(Method testMethod) throws Exception {
        super.springTestContextBeforeTestMethod(testMethod);
//        logger.info("------------springTestContextBeforeTestMethod------------");
    }

    @Override
    public void run(IHookCallBack callBack, ITestResult testResult) {
        super.run(callBack, testResult);
//        logger.info("-----------run-------------");
    }

    @AfterMethod(alwaysRun = true)
    @Override
    protected void springTestContextAfterTestMethod(Method testMethod) throws Exception {
        super.springTestContextAfterTestMethod(testMethod);
//        logger.info("----------springTestContextAfterTestMethod--------------");
    }

    @AfterClass(alwaysRun = true)
    @Override
    protected void springTestContextAfterTestClass() throws Exception {
        super.springTestContextAfterTestClass();
//        logger.info("------------springTestContextAfterTestClass------------");
    }
}
