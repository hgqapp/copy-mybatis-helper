package com.cgling.mybatis.generator.codegen.mybatis3;

import org.mybatis.generator.api.XmlFormatter;
import org.mybatis.generator.api.dom.OutputUtilities;
import org.mybatis.generator.api.dom.xml.*;
import org.mybatis.generator.config.Context;

import java.util.List;

/**
 * 自定义xml格式器
 *
 * @author houguangqiang
 * @date 2017-07-21
 * @since 1.0
 */
public class CustomXmlFormatter implements XmlFormatter {

    private Context context;

    @Override
    public void setContext(Context context) {
        this.context = context;
    }

    @Override
    public String getFormattedContent(Document document) {
        String publicId = document.getPublicId();
        String systemId = document.getSystemId();
        XmlElement rootElement = document.getRootElement();
        StringBuilder sb = new StringBuilder();

        sb.append("<?xml version=\"1.0\" encoding=\"UTF-8\" ?>"); //$NON-NLS-1$

        if (publicId != null && systemId != null) {
            OutputUtilities.newLine(sb);
            sb.append("<!DOCTYPE "); //$NON-NLS-1$
            sb.append(rootElement.getName());
            sb.append(" PUBLIC \""); //$NON-NLS-1$
            sb.append(publicId);
            sb.append("\" \""); //$NON-NLS-1$
            sb.append(systemId);
            sb.append("\" >"); //$NON-NLS-1$
        }

        OutputUtilities.newLine(sb);
        sb.append(getFormattedContent(rootElement, 0));

        return sb.toString();
    }

    private String getFormattedContent(XmlElement parent, int indentLevel){
        String name = parent.getName();
        List<Attribute> attributes = parent.getAttributes();
        List<Element> elements = parent.getElements();
        StringBuilder sb = new StringBuilder();
        if (indentLevel == 2) {
            OutputUtilities.newLine(sb);
        }

        OutputUtilities.xmlIndent(sb, indentLevel);
        sb.append('<');
        sb.append(name);

        for (Attribute att : attributes) {
            sb.append(' ');
            sb.append(att.getFormattedContent());
        }

        if (!elements.isEmpty()) {
            sb.append(" >"); //$NON-NLS-1$
            for (Element element : elements) {
                OutputUtilities.newLine(sb);
                if (element instanceof XmlElement) {
                    if (((XmlElement) element).getName().equals("include")) {
                        sb.append(getFormattedContent((XmlElement)element,indentLevel + 4));
                    } else {
                        sb.append(getFormattedContent((XmlElement)element,indentLevel + 2));
                    }
                } else if (element instanceof TextElement){
                    sb.append(getFormattedContent((TextElement)element, indentLevel + 2));
                }
            }
            OutputUtilities.newLine(sb);
            OutputUtilities.xmlIndent(sb, indentLevel);
            sb.append("</"); //$NON-NLS-1$
            sb.append(name);
            sb.append('>');

        } else {
            sb.append(" />"); //$NON-NLS-1$
        }

        return sb.toString();
    }

    private String getFormattedContent(TextElement parent, int indentLevel){
        String content = parent.getContent();
        StringBuilder sb = new StringBuilder();
        OutputUtilities.xmlIndent(sb, indentLevel);
        sb.append(content);
        return sb.toString();
    }

}
