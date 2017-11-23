package com.cgling.mybatis.generator.config;

import java.util.ArrayList;
import java.util.List;

/**
 * @author houguangqiang
 * @date 2017-11-21
 * @since 1.0
 */
public class XTable extends XProperty {

    private String tableName;
    private String catalog;
    private String schema;
    private String domainObjectName;
    private String alias;
    private String mapperName;
    private String sqlProviderName;
    private boolean enableInsert;
    private boolean enableSelectByPrimaryKey;
    private boolean enableSelectByExample;
    private boolean enableUpdateByPrimaryKey;
    private boolean enableDeleteByPrimaryKey;
    private boolean enableDeleteByExample;
    private boolean enableCountByExample;
    private boolean enableUpdateByExample;
    private String selectByPrimaryKeyQueryId;
    private String selectByExampleQueryId;
    private String modelType;
    private boolean escapeWildcards;
    private boolean delimitIdentifiers;
    private boolean delimitAllColumns;

    private XGeneratedKey generatedKey;
    private List<XIgnoreColumn> ignoreColumns;
    private List<XColumnOverride> columnOverrides;
    private XColumnRenamingRule columnRenamingRule;

    private Boolean constructorBased;
    private Boolean ignoreQualifiersAtRuntime;
    private Boolean immutable;
    private Boolean modelOnly;
    private String rootClass;
    private String rootInterface;
    private String runtimeCatalog;
    private String runtimeSchema;
    private String runtimeTableName;
    private String selectAllOrderByClause;
    private Boolean trimStrings;
    private Boolean useActualColumnNames;
    private Boolean useColumnIndexes;
    private Boolean useCompoundPropertyNames;
    private String ignoreTableNamePrefix;
    private String domainObjectNameSuffix;

    public XTable() {
        enableInsert = true;
        enableSelectByPrimaryKey = true;
        enableSelectByExample = true;
        enableUpdateByPrimaryKey = true;
        enableUpdateByExample = true;
        enableDeleteByPrimaryKey = true;
        enableDeleteByExample = true;
        enableCountByExample = true;
    }

    public String getCatalog() {
        return catalog;
    }

    public void setCatalog(String catalog) {
        this.catalog = catalog;
    }

    public String getSchema() {
        return schema;
    }

    public void setSchema(String schema) {
        this.schema = schema;
    }

    public String getTableName() {
        return tableName;
    }

    public void setTableName(String tableName) {
        this.tableName = tableName;
    }

    public String getDomainObjectName() {
        return domainObjectName;
    }

    public void setDomainObjectName(String domainObjectName) {
        this.domainObjectName = domainObjectName;
    }

    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    public XGeneratedKey getGeneratedKey() {
        return generatedKey;
    }

    public void setGeneratedKey(XGeneratedKey generatedKey) {
        this.generatedKey = generatedKey;
    }

    public List<XIgnoreColumn> getIgnoreColumns() {
        return ignoreColumns;
    }

    public void setIgnoreColumns(List<XIgnoreColumn> ignoreColumns) {
        this.ignoreColumns = ignoreColumns;
    }

    public List<XColumnOverride> getColumnOverrides() {
        return columnOverrides;
    }

    public void setColumnOverrides(List<XColumnOverride> columnOverrides) {
        this.columnOverrides = columnOverrides;
    }

    public XColumnRenamingRule getColumnRenamingRule() {
        return columnRenamingRule;
    }

    public void setColumnRenamingRule(XColumnRenamingRule columnRenamingRule) {
        this.columnRenamingRule = columnRenamingRule;
    }

    public String getMapperName() {
        return mapperName;
    }

    public void setMapperName(String mapperName) {
        this.mapperName = mapperName;
    }

    public String getSqlProviderName() {
        return sqlProviderName;
    }

    public void setSqlProviderName(String sqlProviderName) {
        this.sqlProviderName = sqlProviderName;
    }

    public boolean getEnableInsert() {
        return enableInsert;
    }

    public void setEnableInsert(boolean enableInsert) {
        this.enableInsert = enableInsert;
    }

    public boolean getEnableSelectByPrimaryKey() {
        return enableSelectByPrimaryKey;
    }

    public void setEnableSelectByPrimaryKey(boolean enableSelectByPrimaryKey) {
        this.enableSelectByPrimaryKey = enableSelectByPrimaryKey;
    }

    public boolean getEnableSelectByExample() {
        return enableSelectByExample;
    }

    public void setEnableSelectByExample(boolean enableSelectByExample) {
        this.enableSelectByExample = enableSelectByExample;
    }

    public boolean getEnableUpdateByPrimaryKey() {
        return enableUpdateByPrimaryKey;
    }

    public void setEnableUpdateByPrimaryKey(boolean enableUpdateByPrimaryKey) {
        this.enableUpdateByPrimaryKey = enableUpdateByPrimaryKey;
    }

    public boolean getEnableDeleteByPrimaryKey() {
        return enableDeleteByPrimaryKey;
    }

    public void setEnableDeleteByPrimaryKey(boolean enableDeleteByPrimaryKey) {
        this.enableDeleteByPrimaryKey = enableDeleteByPrimaryKey;
    }

    public boolean getEnableDeleteByExample() {
        return enableDeleteByExample;
    }

    public void setEnableDeleteByExample(boolean enableDeleteByExample) {
        this.enableDeleteByExample = enableDeleteByExample;
    }

    public boolean getEnableCountByExample() {
        return enableCountByExample;
    }

    public void setEnableCountByExample(boolean enableCountByExample) {
        this.enableCountByExample = enableCountByExample;
    }

    public boolean getEnableUpdateByExample() {
        return enableUpdateByExample;
    }

    public void setEnableUpdateByExample(boolean enableUpdateByExample) {
        this.enableUpdateByExample = enableUpdateByExample;
    }

    public String getSelectByPrimaryKeyQueryId() {
        return selectByPrimaryKeyQueryId;
    }

    public void setSelectByPrimaryKeyQueryId(String selectByPrimaryKeyQueryId) {
        this.selectByPrimaryKeyQueryId = selectByPrimaryKeyQueryId;
    }

    public String getSelectByExampleQueryId() {
        return selectByExampleQueryId;
    }

    public void setSelectByExampleQueryId(String selectByExampleQueryId) {
        this.selectByExampleQueryId = selectByExampleQueryId;
    }

    public String getModelType() {
        return modelType;
    }

    public void setModelType(String modelType) {
        this.modelType = modelType;
    }

    public boolean getEscapeWildcards() {
        return escapeWildcards;
    }

    public void setEscapeWildcards(boolean escapeWildcards) {
        this.escapeWildcards = escapeWildcards;
    }

    public boolean getDelimitIdentifiers() {
        return delimitIdentifiers;
    }

    public void setDelimitIdentifiers(boolean delimitIdentifiers) {
        this.delimitIdentifiers = delimitIdentifiers;
    }

    public boolean getDelimitAllColumns() {
        return delimitAllColumns;
    }

    public void setDelimitAllColumns(boolean delimitAllColumns) {
        this.delimitAllColumns = delimitAllColumns;
    }

    public boolean getConstructorBased() {
        return constructorBased;
    }

    public void setConstructorBased(Boolean constructorBased) {
        put("constructorBased", constructorBased);
        this.constructorBased = constructorBased;
    }

    public Boolean getIgnoreQualifiersAtRuntime() {
        return ignoreQualifiersAtRuntime;
    }

    public void setIgnoreQualifiersAtRuntime(Boolean ignoreQualifiersAtRuntime) {
        put("ignoreQualifiersAtRuntime", ignoreQualifiersAtRuntime);
        this.ignoreQualifiersAtRuntime = ignoreQualifiersAtRuntime;
    }

    public Boolean getImmutable() {
        return immutable;
    }

    public void setImmutable(Boolean immutable) {
        put("immutable", immutable);
        this.immutable = immutable;
    }

    public Boolean getModelOnly() {
        return modelOnly;
    }

    public void setModelOnly(Boolean modelOnly) {
        put("modelOnly", modelOnly);
        this.modelOnly = modelOnly;
    }

    public String getRootClass() {
        return rootClass;
    }

    public void setRootClass(String rootClass) {
        put("rootClass", rootClass);
        this.rootClass = rootClass;
    }

    public String getRootInterface() {
        return rootInterface;
    }

    public void setRootInterface(String rootInterface) {
        put("rootInterface", rootInterface);
        this.rootInterface = rootInterface;
    }

    public String getRuntimeCatalog() {
        return runtimeCatalog;
    }

    public void setRuntimeCatalog(String runtimeCatalog) {
        put("runtimeCatalog", runtimeCatalog);
        this.runtimeCatalog = runtimeCatalog;
    }

    public String getRuntimeSchema() {
        return runtimeSchema;
    }

    public void setRuntimeSchema(String runtimeSchema) {
        put("runtimeSchema", runtimeSchema);
        this.runtimeSchema = runtimeSchema;
    }

    public String getRuntimeTableName() {
        return runtimeTableName;
    }

    public void setRuntimeTableName(String runtimeTableName) {
        put("runtimeTableName", runtimeTableName);
        this.runtimeTableName = runtimeTableName;
    }

    public String getSelectAllOrderByClause() {
        return selectAllOrderByClause;
    }

    public void setSelectAllOrderByClause(String selectAllOrderByClause) {
        put("selectAllOrderByClause", selectAllOrderByClause);
        this.selectAllOrderByClause = selectAllOrderByClause;
    }

    public Boolean getTrimStrings() {
        return trimStrings;
    }

    public void setTrimStrings(Boolean trimStrings) {
        put("trimStrings", trimStrings);
        this.trimStrings = trimStrings;
    }

    public Boolean getUseActualColumnNames() {
        return useActualColumnNames;
    }

    public void setUseActualColumnNames(Boolean useActualColumnNames) {
        put("useActualColumnNames", useActualColumnNames);
        this.useActualColumnNames = useActualColumnNames;
    }

    public Boolean getUseColumnIndexes() {
        return useColumnIndexes;
    }

    public void setUseColumnIndexes(Boolean useColumnIndexes) {
        put("useColumnIndexes", useColumnIndexes);
        this.useColumnIndexes = useColumnIndexes;
    }

    public Boolean getUseCompoundPropertyNames() {
        return useCompoundPropertyNames;
    }

    public void setUseCompoundPropertyNames(Boolean useCompoundPropertyNames) {
        put("useCompoundPropertyNames", useCompoundPropertyNames);
        this.useCompoundPropertyNames = useCompoundPropertyNames;
    }

    public String getIgnoreTableNamePrefix() {
        return ignoreTableNamePrefix;
    }

    public void setIgnoreTableNamePrefix(String ignoreTableNamePrefix) {
        put("ignoreTableNamePrefix", ignoreTableNamePrefix);
        this.ignoreTableNamePrefix = ignoreTableNamePrefix;
    }

    public String getDomainObjectNameSuffix() {
        return domainObjectNameSuffix;
    }

    public void setDomainObjectNameSuffix(String domainObjectNameSuffix) {
        put("domainObjectNameSuffix", domainObjectNameSuffix);
        this.domainObjectNameSuffix = domainObjectNameSuffix;
    }
    public abstract static class Builder{

        protected abstract void configureTable(XTable table);
        protected abstract XGeneratedKey configureGeneratedKey(XGeneratedKey generatedKey);

        protected void configureIgnoreColumns(List<XIgnoreColumn> ignoreColumns) {
        }
        protected void configureColumnOverrides(List<XColumnOverride> columnOverrides) {
        }
        protected XColumnRenamingRule configureColumnRenamingRule(XColumnRenamingRule columnRenamingRule) {
            return null;
        }

        public XTable build(){
            XTable table = new XTable();
            XGeneratedKey generatedKey = new XGeneratedKey();
            XColumnRenamingRule columnRenamingRule = new XColumnRenamingRule();
            configureTable(table);
            table.setGeneratedKey(configureGeneratedKey(generatedKey));
            table.setColumnRenamingRule(configureColumnRenamingRule(columnRenamingRule));

            List<XIgnoreColumn> ignoreColumns = new ArrayList<>();
            List<XColumnOverride> columnOverrides = new ArrayList<>();
            configureIgnoreColumns(ignoreColumns);
            configureColumnOverrides(columnOverrides);
            table.setIgnoreColumns(ignoreColumns);
            table.setColumnOverrides(columnOverrides);
            return table;
        }

    }
}
