package com.cgling.mybatis.generator.codegen.mybatis3;

import org.mybatis.generator.api.dom.java.FullyQualifiedJavaType;
import org.mybatis.generator.internal.types.JavaTypeResolverDefaultImpl;

import java.sql.Types;

/**
 * 自定义数据库类型和java类型的映射；  <br/>
 * <pre>
 * (JDBC)   ->  (Java)
 * SMALLINT ->  Integer
 * TINYINT  ->  Integer
 * </pre>
 * @author houguangqiang
 * @since 1.0
 * @date 2017-07-21
 */
public class CustomJavaTypeResolver extends JavaTypeResolverDefaultImpl {

    public CustomJavaTypeResolver(){
        typeMap.put(Types.SMALLINT, new JdbcTypeInformation("SMALLINT", //$NON-NLS-1$
                new FullyQualifiedJavaType(Integer.class.getName())));
        typeMap.put(Types.TINYINT, new JdbcTypeInformation("TINYINT", //$NON-NLS-1$
                new FullyQualifiedJavaType(Integer.class.getName())));
    }
}
