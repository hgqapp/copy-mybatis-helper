package com.cgling.mybatis.example.service;

import com.cgling.mybatis.example.mapper.UserInfoMapper;
import com.cgling.mybatis.example.model.UserInfo;
import org.mybatis.dynamic.sql.render.RenderingStrategies;
import org.mybatis.dynamic.sql.select.render.SelectStatementProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

import static com.cgling.mybatis.example.mapper.UserInfoDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.*;
import static org.mybatis.dynamic.sql.select.SelectDSL.select;

/**
 * @author hougg
 * @version 1.0.0
 * @since 2019/12/26 13:25
 */
@Service
public class UserInfoService {

    @Autowired
    private UserInfoMapper userInfoMapper;

    public void create() {
        SelectStatementProvider selectStatement = select(username, email)
                .from(userInfo)
                .where(password, isEqualTo("animalName_").when(Objects::nonNull))
                .and(email, isEqualToWhenPresent("bodyWeight_").when(Objects::nonNull))
                .and(username, isEqualToWhenPresent("brainWeight_").when(Objects::nonNull))
                .build()
                .render(RenderingStrategies.MYBATIS3);
        List<UserInfo> userInfos = userInfoMapper.selectMany(selectStatement);
        userInfoMapper.select(s -> s.where(alias, isNull()));

    }
}
