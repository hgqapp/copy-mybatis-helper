package com.cgling.mybatis.generator.api;

import com.cgling.mybatis.generator.config.*;
import org.mybatis.generator.api.MyBatisGenerator;
import org.mybatis.generator.config.*;
import org.mybatis.generator.internal.DefaultShellCallback;
import org.mybatis.generator.internal.ObjectFactory;

import java.util.ArrayList;
import java.util.List;

/**
 * @author houguangqiang
 * @date 2017-11-21
 * @since 1.0
 */
public abstract class XGenerator {

    protected String JAVA_FILE_ENCODING = "UTF-8";
    protected String DEFAULT_CONTEXT_ID = "context";
    protected String DEFAULT_MODEL_TYPE = "flat";
    protected String TARGET_RUNTIME = "com.cgling.mybatis.generator.codegen.mybatis3.CustomIntrospectedTable";
    protected String XML_FORMATTER = "com.cgling.mybatis.generator.codegen.mybatis3.CustomXmlFormatter";
    protected String JAVA_FORMATTER = "org.mybatis.generator.api.dom.DefaultJavaFormatter";
    protected String COMMENT_GENERATOR_TYPE = "com.cgling.mybatis.generator.codegen.mybatis3.CustomCommentGenerator";
    protected String JAVA_TYPE_RESOLVER_TYPE = "com.cgling.mybatis.generator.codegen.mybatis3.CustomJavaTypeResolver";
    protected String DEFAULT_PLUGIN_TYPE = "com.cgling.mybatis.generator.codegen.mybatis3.CustomPlugin";

    protected abstract void configureJdbcConnection(XJdbcConnection jdbcConnection);
    protected abstract void configureSqlMapGenerator(XSqlMapGenerator sqlMapGenerator);
    protected abstract void configureJavaClientGenerator(XJavaClientGenerator javaClientGenerator);
    protected abstract void configureJavaModelGenerator(XJavaModelGenerator javaModelGenerator);
    protected abstract void configureTables(List<XTable> tables);

    protected void configureClasspathEntry(List<XClassPathEntry> classpathEntries){ }
    protected void configurePlugins(List<XPlugin> plugins){
        plugins.add(new XPlugin.Builder(){
            @Override
            protected void configurePlugin(XPlugin plugin) {
                plugin.setType(DEFAULT_PLUGIN_TYPE);
            }
        }.build());
    }
    protected XJavaTypeResolver configureJavaTypeResolver(XJavaTypeResolver javaTypeResolver){
        javaTypeResolver.setType(JAVA_TYPE_RESOLVER_TYPE);
        return javaTypeResolver;
    }

    protected XCommentGenerator configureCommentGenerator(XCommentGenerator commentGenerator){
        commentGenerator.setType(COMMENT_GENERATOR_TYPE);
        commentGenerator.setAddRemarkComments(true);
        return commentGenerator;
    }

    protected void configureContext(XContext context){
        context.setId(DEFAULT_CONTEXT_ID);
        context.setDefaultModelType(DEFAULT_MODEL_TYPE);
        context.setTargetRuntime(TARGET_RUNTIME);
        context.setJavaFileEncoding(JAVA_FILE_ENCODING);
        context.setJavaFormatter(JAVA_FORMATTER);
        context.setXmlFormatter(XML_FORMATTER);
    }

    public Configuration build(){
        Configuration configuration = new Configuration();
        parseClassPathEntry(configuration);
        Context context = parseContext(configuration);
        parseCommentGenerator(context);
        parseJavaTypeResolver(context);
        parseJdbcConnection(context);
        parseJavaModelGenerator(context);
        parseJavaClientGenerator(context);
        parseSqlMapGenerator(context);
        parsePlugins(context);
        parseTables(context);
        return configuration;
    }

    private List<TableConfiguration> parseTables(Context context) {
        List<XTable> tables = new ArrayList<>();
        configureTables(tables);
        List<TableConfiguration> tableConfigurations = new ArrayList<>(tables.size());
        tables.forEach(v -> {
            final TableConfiguration tableConfiguration = new TableConfiguration(context);
            tableConfiguration.setTableName(v.getTableName());
            tableConfiguration.setSchema(v.getSchema());
            tableConfiguration.setCatalog(v.getCatalog());
            tableConfiguration.setAlias(v.getAlias());
            tableConfiguration.setDomainObjectName(v.getDomainObjectName());
            tableConfiguration.setMapperName(v.getMapperName());
            tableConfiguration.setSqlProviderName(v.getSqlProviderName());
            tableConfiguration.setInsertStatementEnabled(v.getEnableInsert());
            tableConfiguration.setSelectByPrimaryKeyStatementEnabled(v.getEnableSelectByPrimaryKey());
            tableConfiguration.setSelectByExampleStatementEnabled(v.getEnableSelectByExample());
            tableConfiguration.setUpdateByPrimaryKeyStatementEnabled(v.getEnableUpdateByPrimaryKey());
            tableConfiguration.setDeleteByPrimaryKeyStatementEnabled(v.getEnableDeleteByPrimaryKey());
            tableConfiguration.setDeleteByExampleStatementEnabled(v.getEnableDeleteByExample());
            tableConfiguration.setCountByExampleStatementEnabled(v.getEnableCountByExample());
            tableConfiguration.setUpdateByExampleStatementEnabled(v.getEnableUpdateByExample());
            tableConfiguration.setSelectByPrimaryKeyQueryId(v.getSelectByPrimaryKeyQueryId());
            tableConfiguration.setSelectByExampleQueryId(v.getSelectByExampleQueryId());
            String modelType = v.getModelType();
            if (modelType == null) {
                modelType = context.getDefaultModelType().getModelType();
            }
            tableConfiguration.setConfiguredModelType(modelType);
            tableConfiguration.setWildcardEscapingEnabled(v.getEscapeWildcards());
            tableConfiguration.setDelimitIdentifiers(v.getDelimitIdentifiers());
            tableConfiguration.setAllColumnDelimitingEnabled(v.getDelimitAllColumns());
            XGeneratedKey generatedKey = v.getGeneratedKey();
            if (generatedKey != null) {
                tableConfiguration.setGeneratedKey(new GeneratedKey(generatedKey.getColumn(), generatedKey.getSqlStatement(), generatedKey.getIdentity(), generatedKey.getType()));
            }
            XColumnRenamingRule columnRenamingRule = v.getColumnRenamingRule();
            if (columnRenamingRule != null) {
                ColumnRenamingRule renamingRule = new ColumnRenamingRule();
                renamingRule.setSearchString(columnRenamingRule.getSearchString());
                renamingRule.setReplaceString(columnRenamingRule.getReplaceString());
                tableConfiguration.setColumnRenamingRule(renamingRule);
            }
            List<XIgnoreColumn> ignoreColumns = v.getIgnoreColumns();
            if (!ignoreColumns.isEmpty()) {
                ignoreColumns.forEach(i -> {
                    IgnoredColumn ignoredColumn = new IgnoredColumn(i.getColumn());
                    ignoredColumn.setColumnNameDelimited(i.getDelimitedColumnName());
                    tableConfiguration.addIgnoredColumn(ignoredColumn);
                });
            }
            List<XColumnOverride> columnOverrides = v.getColumnOverrides();
            if (!columnOverrides.isEmpty()) {
                columnOverrides.forEach(i -> {
                    ColumnOverride columnOverride = new ColumnOverride(i.getColumn());
                    columnOverride.setJavaProperty(i.getProperty());
                    columnOverride.setColumnNameDelimited(i.getDelimitedColumnName());
                    columnOverride.setJdbcType(i.getJdbcType());
                    columnOverride.setJavaType(i.getJavaType());
                    columnOverride.setTypeHandler(i.getTypeHandler());
                    columnOverride.setGeneratedAlways(i.getGeneratedAlways());
                    parseProperty(columnOverride, i);
                    tableConfiguration.addColumnOverride(columnOverride);
                });
            }
            parseProperty(tableConfiguration, v);
            context.addTableConfiguration(tableConfiguration);
        });
        return tableConfigurations;
    }


    private List<PluginConfiguration> parsePlugins(Context context) {
        List<XPlugin> plugins = new ArrayList<>();
        configurePlugins(plugins);
        List<PluginConfiguration> pluginConfigurations = new ArrayList<>(plugins.size());
        plugins.forEach(v -> {
            PluginConfiguration pluginConfiguration = new PluginConfiguration();
            pluginConfiguration.setConfigurationType(v.getType());
            parseProperty(pluginConfiguration, v);
            context.addPluginConfiguration(pluginConfiguration);
        });
        return pluginConfigurations;
    }

    private JavaTypeResolverConfiguration parseJavaTypeResolver(Context context) {
        XJavaTypeResolver javaTypeResolver = new XJavaTypeResolver();
        javaTypeResolver = configureJavaTypeResolver(javaTypeResolver);
        if (javaTypeResolver == null) {
            return null;
        }
        JavaTypeResolverConfiguration javaTypeResolverConfiguration = new JavaTypeResolverConfiguration();
        javaTypeResolverConfiguration.setConfigurationType(javaTypeResolver.getType());
        parseProperty(javaTypeResolverConfiguration, javaTypeResolver);
        context.setJavaTypeResolverConfiguration(javaTypeResolverConfiguration);
        return javaTypeResolverConfiguration;
    }

    private CommentGeneratorConfiguration parseCommentGenerator(Context context) {
        XCommentGenerator commentGenerator = new XCommentGenerator();
        commentGenerator = configureCommentGenerator(commentGenerator);
        if (commentGenerator == null) {
            return null;
        }
        CommentGeneratorConfiguration commentGeneratorConfiguration = new CommentGeneratorConfiguration();
        commentGeneratorConfiguration.setConfigurationType(commentGenerator.getType());
        parseProperty(commentGeneratorConfiguration, commentGenerator);
        context.setCommentGeneratorConfiguration(commentGeneratorConfiguration);
        return commentGeneratorConfiguration;
    }

    private SqlMapGeneratorConfiguration parseSqlMapGenerator(Context context) {
        XSqlMapGenerator sqlMapGenerator = new XSqlMapGenerator();
        configureSqlMapGenerator(sqlMapGenerator);
        SqlMapGeneratorConfiguration sqlMapGeneratorConfiguration = new SqlMapGeneratorConfiguration();
        sqlMapGeneratorConfiguration.setTargetProject(sqlMapGenerator.getTargetProject());
        sqlMapGeneratorConfiguration.setTargetPackage(sqlMapGenerator.getTargetPackage());
        parseProperty(sqlMapGeneratorConfiguration, sqlMapGenerator);
        context.setSqlMapGeneratorConfiguration(sqlMapGeneratorConfiguration);
        return sqlMapGeneratorConfiguration;
    }

    private JavaClientGeneratorConfiguration parseJavaClientGenerator(Context context) {
        XJavaClientGenerator javaClientGenerator = new XJavaClientGenerator();
        configureJavaClientGenerator(javaClientGenerator);
        JavaClientGeneratorConfiguration javaClientGeneratorConfiguration = new JavaClientGeneratorConfiguration();
        javaClientGeneratorConfiguration.setTargetProject(javaClientGenerator.getTargetProject());
        javaClientGeneratorConfiguration.setTargetPackage(javaClientGenerator.getTargetPackage());
        javaClientGeneratorConfiguration.setConfigurationType(javaClientGenerator.getType());
        javaClientGeneratorConfiguration.setImplementationPackage(javaClientGenerator.getImplementationPackage());
        parseProperty(context, javaClientGenerator);
        context.setJavaClientGeneratorConfiguration(javaClientGeneratorConfiguration);
        return javaClientGeneratorConfiguration;
    }

    private JavaModelGeneratorConfiguration parseJavaModelGenerator(Context context) {
        XJavaModelGenerator javaModelGenerator = new XJavaModelGenerator();
        configureJavaModelGenerator(javaModelGenerator);
        JavaModelGeneratorConfiguration javaModelGeneratorConfiguration = new JavaModelGeneratorConfiguration();
        javaModelGeneratorConfiguration.setTargetPackage(javaModelGenerator.getTargetPackage());
        javaModelGeneratorConfiguration.setTargetProject(javaModelGenerator.getTargetProject());
        parseProperty(context, javaModelGenerator);
        context.setJavaModelGeneratorConfiguration(javaModelGeneratorConfiguration);
        return javaModelGeneratorConfiguration;
    }

    private JDBCConnectionConfiguration parseJdbcConnection(Context context) {
        XJdbcConnection jdbcConnection = new XJdbcConnection();
        configureJdbcConnection(jdbcConnection);
        JDBCConnectionConfiguration jdbcConnectionConfiguration = new JDBCConnectionConfiguration();
        jdbcConnectionConfiguration.setConnectionURL(jdbcConnection.getConnectionURL());
        jdbcConnectionConfiguration.setDriverClass(jdbcConnection.getDriverClass());
        jdbcConnectionConfiguration.setUserId(jdbcConnection.getUserId());
        jdbcConnectionConfiguration.setPassword(jdbcConnection.getPassword());
        parseProperty(jdbcConnectionConfiguration, jdbcConnection);
        context.setJdbcConnectionConfiguration(jdbcConnectionConfiguration);
        return jdbcConnectionConfiguration;
    }

    private List<XClassPathEntry> parseClassPathEntry(Configuration configuration){
        List<XClassPathEntry> classPathEntries = new ArrayList<>();
        configureClasspathEntry(classPathEntries);
        classPathEntries.forEach(v -> {
            configuration.addClasspathEntry(v.getLocation());
        });
        return classPathEntries;
    }

    private Context parseContext(Configuration configuration) {
        XContext xcontext = new XContext();
        configureContext(xcontext);
        String defaultModelType = xcontext.getDefaultModelType();
        ModelType mt = defaultModelType == null ? null : ModelType
                .getModelType(defaultModelType);
        Context context = new Context(mt);
        context.setId(xcontext.getId());
        context.setTargetRuntime(xcontext.getTargetRuntime());
        context.setIntrospectedColumnImpl(xcontext.getIntrospectedColumnImpl());
        parseProperty(context, xcontext);
        configuration.addContext(context);
        return context;
    }

    private static void parseProperty(PropertyHolder propertyHolder, XProperty gProperty) {
        gProperty.getProperties().forEach(propertyHolder::addProperty);
    }

    public void run(){
        try {
            ObjectFactory.addResourceClassLoader(XGenerator.class.getClassLoader());
            List<String> warnings = new ArrayList<>();
            Configuration configuration = build();
            DefaultShellCallback callback = new DefaultShellCallback(false);
            MyBatisGenerator myBatisGenerator = new MyBatisGenerator(configuration, callback, warnings);
            myBatisGenerator.generate(null);
            for (String warning : warnings) {
                System.err.println("警告：" + warning);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
