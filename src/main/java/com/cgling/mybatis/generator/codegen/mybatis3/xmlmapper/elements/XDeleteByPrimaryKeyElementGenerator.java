package com.cgling.mybatis.generator.codegen.mybatis3.xmlmapper.elements;

import org.mybatis.generator.api.IntrospectedColumn;
import org.mybatis.generator.api.dom.xml.Attribute;
import org.mybatis.generator.api.dom.xml.TextElement;
import org.mybatis.generator.api.dom.xml.XmlElement;
import org.mybatis.generator.codegen.mybatis3.MyBatis3FormattingUtilities;
import org.mybatis.generator.codegen.mybatis3.xmlmapper.elements.DeleteByPrimaryKeyElementGenerator;

/**
 * DeleteByPrimaryKey优化：
 * <ol>
 *     <li>关键字大写;
 *     <li>移除delete标签的parameterType属性
 * </ol>
 *
 * @author houguangqiang
 * @date 2017-11-21
 * @since 1.0
 */
public class XDeleteByPrimaryKeyElementGenerator extends DeleteByPrimaryKeyElementGenerator {

    public XDeleteByPrimaryKeyElementGenerator(boolean isSimple) {
        super(isSimple);
    }

    @Override
    public void addElements(XmlElement parentElement) {
        XmlElement answer = new XmlElement("delete"); //$NON-NLS-1$

        answer.addAttribute(new Attribute(
                "id", introspectedTable.getDeleteByPrimaryKeyStatementId())); //$NON-NLS-1$

        context.getCommentGenerator().addComment(answer);

        StringBuilder sb = new StringBuilder();
        sb.append("DELETE FROM "); //$NON-NLS-1$
        sb.append(introspectedTable.getFullyQualifiedTableNameAtRuntime());
        answer.addElement(new TextElement(sb.toString()));

        boolean and = false;
        for (IntrospectedColumn introspectedColumn : introspectedTable
                .getPrimaryKeyColumns()) {
            sb.setLength(0);
            if (and) {
                sb.append("  AND "); //$NON-NLS-1$
            } else {
                sb.append("WHERE "); //$NON-NLS-1$
                and = true;
            }

            sb.append(MyBatis3FormattingUtilities
                    .getEscapedColumnName(introspectedColumn));
            sb.append(" = "); //$NON-NLS-1$
            sb.append(MyBatis3FormattingUtilities
                    .getParameterClause(introspectedColumn));
            answer.addElement(new TextElement(sb.toString()));
        }

        if (context.getPlugins()
                .sqlMapDeleteByPrimaryKeyElementGenerated(answer,
                        introspectedTable)) {
            parentElement.addElement(answer);
        }
    }
}
