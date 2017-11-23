
# Mybatis 增强工具包

### 1. mybatis-generator 生成工具增强 
强增内容： 
>   1. 生成工具模板化代码（不再需要配置XML文件）
>   1. 自动加载当前工程jar包
>   1. 设置文件生成不可覆盖，包括XML文件
>   1. SQL关键字大写
>   1. SQL语句格式化
>   1. 简化SQL语句，
>   1. 只生成必须的SQL语句    
>   1. 支持Model类名添加固定后缀
>   1. Model的Field以及Getter和Setter添加注释

使用说明：    
首先加入生成工具依赖包以及数据库驱动包
```
<dependencies>
    <dependency>
        <groupId>org.mybatis.generator</groupId>
        <artifactId>mybatis-generator-core</artifactId>
        <version>1.3.5</version>
    </dependency>
    <dependency>
        <groupId>mysql</groupId>
        <artifactId>mysql-connector-java</artifactId>
        <version>5.1.44</version>
    </dependency>
</dependencies>
```

生成工具模板化代码示例：

```
public class XGeneratorTest {

    @Test
    public void run() throws Exception {
        new XGenerator(){
            @Override
            protected void configureJdbcConnection(XJdbcConnection jdbcConnection) {
                jdbcConnection.setConnectionURL("jdbc:mysql://localhost:3306/world");
                jdbcConnection.setDriverClass("com.mysql.jdbc.Driver");
                jdbcConnection.setUserId("root");
                jdbcConnection.setPassword("root");
            }

            @Override
            protected void configureSqlMapGenerator(XSqlMapGenerator sqlMapGenerator) {
                sqlMapGenerator.setTargetPackage("mapper");
                sqlMapGenerator.setTargetProject("src/test/resources");
            }

            @Override
            protected void configureJavaModelGenerator(XJavaModelGenerator javaModelGenerator) {
                javaModelGenerator.setTargetPackage("model");
                javaModelGenerator.setTargetProject("src/test/java");
            }

            @Override
            protected void configureJavaClientGenerator(XJavaClientGenerator javaClientGenerator) {
                javaClientGenerator.setTargetPackage("mapper");
                javaClientGenerator.setTargetProject("src/test/java");
            }

            @Override
            protected void configureTables(List<XTable> tables) {
                tables.add(new XTable.Builder(){
                    @Override
                    protected void configureTable(XTable table) {
                        table.setTableName("city");
                    }

                    @Override
                    protected XGeneratedKey configureGeneratedKey(XGeneratedKey generatedKey) {
                        generatedKey.setColumn("id");
                        generatedKey.setIdentity(true);
                        return generatedKey;
                    }
                }.build());
            }
        }.run();
    }

}
```  
