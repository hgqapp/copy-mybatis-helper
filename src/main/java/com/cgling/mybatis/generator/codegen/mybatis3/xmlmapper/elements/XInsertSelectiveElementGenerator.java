package com.cgling.mybatis.generator.codegen.mybatis3.xmlmapper.elements;

import org.mybatis.generator.api.dom.xml.XmlElement;
import org.mybatis.generator.codegen.mybatis3.xmlmapper.elements.InsertSelectiveElementGenerator;

/**
 * InsertSelective优化：
 * <ol>
 *     <li>关键字大写;
 *     <li>移除insert标签的parameterType属性
 *     <li>移除insert标签的keyColumn属性
 * </ol>
 *
 * @author houguangqiang
 * @date 2017-11-21
 * @since 1.0
 */
public class XInsertSelectiveElementGenerator extends InsertSelectiveElementGenerator {

    @Override
    public void addElements(XmlElement parentElement) {
//        XmlElement answer = new XmlElement("insert"); //$NON-NLS-1$
//
//        answer.addAttribute(new Attribute(
//                "id", introspectedTable.getInsertSelectiveStatementId())); //$NON-NLS-1$
//
//        context.getCommentGenerator().addComment(answer);
//
//        GeneratedKey gk = introspectedTable.getGeneratedKey();
//        if (gk != null) {
//            IntrospectedColumn introspectedColumn = introspectedTable
//                    .getColumn(gk.getColumn());
//            // if the column is null, then it's a configuration error. The
//            // warning has already been reported
//            if (introspectedColumn != null) {
//                if (gk.isJdbcStandard()) {
//                    answer.addAttribute(new Attribute("useGeneratedKeys", "true")); //$NON-NLS-1$ //$NON-NLS-2$
//                    answer.addAttribute(new Attribute("keyProperty", introspectedColumn.getJavaProperty())); //$NON-NLS-1$
//                } else {
//                    answer.addElement(getSelectKey(introspectedColumn, gk));
//                }
//            }
//        }
//
//        StringBuilder sb = new StringBuilder();
//
//        sb.append("INSERT INTO "); //$NON-NLS-1$
//        sb.append(introspectedTable.getFullyQualifiedTableNameAtRuntime());
//        answer.addElement(new TextElement(sb.toString()));
//
//        XmlElement insertTrimElement = new XmlElement("trim"); //$NON-NLS-1$
//        insertTrimElement.addAttribute(new Attribute("prefix", "(")); //$NON-NLS-1$ //$NON-NLS-2$
//        insertTrimElement.addAttribute(new Attribute("suffix", ")")); //$NON-NLS-1$ //$NON-NLS-2$
//        insertTrimElement.addAttribute(new Attribute("suffixOverrides", ",")); //$NON-NLS-1$ //$NON-NLS-2$
//        answer.addElement(insertTrimElement);
//
//        XmlElement valuesTrimElement = new XmlElement("trim"); //$NON-NLS-1$
//        valuesTrimElement.addAttribute(new Attribute("prefix", "values (")); //$NON-NLS-1$ //$NON-NLS-2$
//        valuesTrimElement.addAttribute(new Attribute("suffix", ")")); //$NON-NLS-1$ //$NON-NLS-2$
//        valuesTrimElement.addAttribute(new Attribute("suffixOverrides", ",")); //$NON-NLS-1$ //$NON-NLS-2$
//        answer.addElement(valuesTrimElement);
//
//        for (IntrospectedColumn introspectedColumn : introspectedTable
//                .getAllColumns()) {
//            if (introspectedColumn.isIdentity()) {
//                // cannot set values on identity fields
//                continue;
//            }
//
//            if (introspectedColumn.isSequenceColumn()
//                    || introspectedColumn.getFullyQualifiedJavaType().isPrimitive()) {
//                // if it is a sequence column, it is not optional
//                // This is required for MyBatis3 because MyBatis3 parses
//                // and calculates the SQL before executing the selectKey
//
//                // if it is primitive, we cannot do a null check
//                sb.setLength(0);
//                sb.append(MyBatis3FormattingUtilities
//                        .getEscapedColumnName(introspectedColumn));
//                sb.append(',');
//                insertTrimElement.addElement(new TextElement(sb.toString()));
//
//                sb.setLength(0);
//                sb.append(MyBatis3FormattingUtilities
//                        .getParameterClause(introspectedColumn));
//                sb.append(',');
//                valuesTrimElement.addElement(new TextElement(sb.toString()));
//
//                continue;
//            }
//
//            XmlElement insertNotNullElement = new XmlElement("if"); //$NON-NLS-1$
//            sb.setLength(0);
//            sb.append(introspectedColumn.getJavaProperty());
//            sb.append(" != null"); //$NON-NLS-1$
//            insertNotNullElement.addAttribute(new Attribute(
//                    "test", sb.toString())); //$NON-NLS-1$
//
//            sb.setLength(0);
//            sb.append(MyBatis3FormattingUtilities
//                    .getEscapedColumnName(introspectedColumn));
//            sb.append(',');
//            insertNotNullElement.addElement(new TextElement(sb.toString()));
//            insertTrimElement.addElement(insertNotNullElement);
//
//            XmlElement valuesNotNullElement = new XmlElement("if"); //$NON-NLS-1$
//            sb.setLength(0);
//            sb.append(introspectedColumn.getJavaProperty());
//            sb.append(" != null"); //$NON-NLS-1$
//            valuesNotNullElement.addAttribute(new Attribute(
//                    "test", sb.toString())); //$NON-NLS-1$
//
//            sb.setLength(0);
//            sb.append(MyBatis3FormattingUtilities
//                    .getParameterClause(introspectedColumn));
//            sb.append(',');
//            valuesNotNullElement.addElement(new TextElement(sb.toString()));
//            valuesTrimElement.addElement(valuesNotNullElement);
//        }
//
//        if (context.getPlugins().sqlMapInsertSelectiveElementGenerated(
//                answer, introspectedTable)) {
//            parentElement.addElement(answer);
//        }
    }
}
