# 工程简介


## 启动命令

- 启动测试
```shell script
mvnw clean test site
或者
mvn clean test site
```

- 启动allure在线报告
```shell script
mvnw io.qameta.allure:allure-maven:serve
或者
mvn io.qameta.allure:allure-maven:serve
```

- 生成离线测试报告
```shell script
mvnw io.qameta.allure:allure-maven:report
或者
mvn io.qameta.allure:allure-maven:report
```

## 注解

### TestNG

|     注解      |                             说明                             |
| :-----------: | :----------------------------------------------------------: |
| @BeforeSuite  | 被@BeforeSuite注解的方法，将会在testng定义的xml根元素里面的所有执行之前运行。 |
|  @AfterSuite  | 被@AfterSuite注解的方法，将会在testng定义的xml根元素里面的所有执行之后运行。 |
|  @BeforeTest  | 被@BeforeTest注解的方法，将会在一个元素定义的所有里面所有测试方法执行之前运行。 |
|  @AfterTest   | 被@AfterTest注解的方法，将会在一个元素定义的所有里面所有的测试方法执行之后运行。 |
| @BeforeClass  | 被@BeforeClass注解的方法，将会在当前测试类的第一个测试方法执行之前运行。 |
|  @AfterClass  | 被@AfterClass注解的方法，将会在当前测试类的最后一个测试方法执行之后运行。 |
| @BeforeMethod | 被@BeforeMethod注解的方法，将会在当前测试类的每一个测试方法执行之前运行。 |
| @AfterMethod  | 被@AfterMethod注解的方法，将会在当前测试类的每一个测试方法执行之后运行。 |
|     @Test     |   被@AfterMethod注解的方法，是一个测试方法，既一个测试用例   |

### Allure

|              注解               |   说明   |                   详情                    |
| :-----------------------------: | :------: | :---------------------------------------: |
|          @Epic("epic")          | epic描述 |  敏捷里面的概念，定义史诗，往下是feature  |
|       @Feature("feature")       | 模块名称 |         功能点的描述，往下是story         |
|         @Story("story")         | 用户故事 |           用户故事，往下是title           |
|         @Issue("issue")         |   缺陷   |        对应缺陷管理系统里面的链接         |
|   @Description("description")   | 用例描述 |              测试用例的描述               |
|          @Step("step")          | 操作步骤 |              测试用例的步骤               |
| @Severity(SeverityLevel.NORMAL) | 用例等级 | blocker，critical，normal，minor，trivial |
|          @Link("link")          |   链接   |       定义一个链接，在测试报告展现        |
|    @Attachment("attachment")    |   附件   |               报告添加附件                |
