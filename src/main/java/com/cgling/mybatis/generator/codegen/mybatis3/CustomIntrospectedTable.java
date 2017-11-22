package com.cgling.mybatis.generator.codegen.mybatis3;

import com.cgling.mybatis.generator.codegen.mybatis3.xmlmapper.CustomXMLMapperGenerator;
import org.mybatis.generator.api.FullyQualifiedTable;
import org.mybatis.generator.api.GeneratedXmlFile;
import org.mybatis.generator.api.ProgressCallback;
import org.mybatis.generator.api.dom.xml.Document;
import org.mybatis.generator.codegen.AbstractJavaClientGenerator;
import org.mybatis.generator.codegen.AbstractJavaGenerator;
import org.mybatis.generator.codegen.mybatis3.IntrospectedTableMyBatis3Impl;
import org.mybatis.generator.codegen.mybatis3.model.SimpleModelGenerator;
import org.mybatis.generator.config.TableConfiguration;
import org.mybatis.generator.internal.util.JavaBeansUtil;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

/**
 * @author houguangqiang
 * @date 2017-11-21
 * @since 1.0
 */
public class CustomIntrospectedTable extends IntrospectedTableMyBatis3Impl {

    @Override
    protected void calculateJavaModelGenerators(List<String> warnings, ProgressCallback progressCallback) {
        AbstractJavaGenerator javaGenerator = new SimpleModelGenerator();
        initializeAbstractGenerator(javaGenerator, warnings,
                progressCallback);
        javaModelGenerators.add(javaGenerator);
    }

    @Override
    public void setTableConfiguration(TableConfiguration tableConfiguration) {

        String domainObjectName = tableConfiguration.getDomainObjectName();
        if(domainObjectName == null){
            FullyQualifiedTable fullyQualifiedTable = this.getFullyQualifiedTable();
            String tableName = fullyQualifiedTable.getFullyQualifiedTableNameAtRuntime();
            String ignoreTableNamePrefix = tableConfiguration.getProperty("ignoreTableNamePrefix");
            if(ignoreTableNamePrefix != null){
                String[] prefixs = ignoreTableNamePrefix.split(",");
                for(String prefix:prefixs){
                    if(tableName.startsWith(prefix)){
                        tableName = tableName.replaceFirst(prefix, "");
                        break;
                    }
                }
            }
            domainObjectName = JavaBeansUtil.getCamelCaseString(tableName, true);
        }
        String domainObjectNameSuffix = tableConfiguration.getProperty("domainObjectNameSuffix");
        if(domainObjectNameSuffix != null){
            domainObjectName = domainObjectName+domainObjectNameSuffix;
        }

        try {
            Field field = fullyQualifiedTable.getClass().getDeclaredField("domainObjectName");
            field.setAccessible(true);
            field.set(fullyQualifiedTable, domainObjectName);
        } catch (Exception e) {
            // noting to do
        }
        super.setTableConfiguration(tableConfiguration);
    }

    @Override
    protected void calculateXmlAttributes() {
        super.calculateXmlAttributes();
        setBaseColumnListId("BaseColumn");
    }

    @Override
    protected void calculateXmlMapperGenerator(AbstractJavaClientGenerator javaClientGenerator, List<String> warnings, ProgressCallback progressCallback) {
        xmlMapperGenerator = new CustomXMLMapperGenerator();
        initializeAbstractGenerator(xmlMapperGenerator, warnings, progressCallback);
    }

    @Override
    public boolean hasBLOBColumns() {
        return false;
    }

    @Override
    public List<GeneratedXmlFile> getGeneratedXmlFiles() {
        List<GeneratedXmlFile> answer = new ArrayList<GeneratedXmlFile>();

        if (xmlMapperGenerator != null) {
            Document document = xmlMapperGenerator.getDocument();
            GeneratedXmlFile gxf = new GeneratedXmlFile(document,
                    getMyBatis3XmlMapperFileName(), getMyBatis3XmlMapperPackage(),
                    context.getSqlMapGeneratorConfiguration().getTargetProject(),
                    false, context.getXmlFormatter());
            if (context.getPlugins().sqlMapGenerated(gxf, this)) {
                answer.add(gxf);
            }
        }

        return answer;
    }
}
