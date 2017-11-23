package com.cgling.mybatis.generator.api;

import com.cgling.mybatis.generator.config.*;
import org.junit.Test;

import java.util.List;

/**
 * @author houguangqiang
 * @date 2017-11-22
 * @since 1.0
 */
public class XGeneratorTest {

    @Test
    public void run() throws Exception {
        new XGenerator(){
            @Override
            protected void configureJdbcConnection(XJdbcConnection jdbcConnection) {
                jdbcConnection.setConnectionURL("jdbc:mysql://114.215.68.26:3306/tms_dev");
                jdbcConnection.setDriverClass("com.mysql.jdbc.Driver");
                jdbcConnection.setUserId("root");
                jdbcConnection.setPassword("haoren123A!");
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
                        table.setDomainObjectNameSuffix("Model");
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