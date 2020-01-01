package com.cgling.mybatis.example.mapper;

import com.cgling.mybatis.example.model.UserInfo;
import org.apache.ibatis.annotations.*;
import org.apache.ibatis.type.JdbcType;
import org.mybatis.dynamic.sql.BasicColumn;
import org.mybatis.dynamic.sql.delete.DeleteDSLCompleter;
import org.mybatis.dynamic.sql.delete.render.DeleteStatementProvider;
import org.mybatis.dynamic.sql.insert.render.InsertStatementProvider;
import org.mybatis.dynamic.sql.insert.render.MultiRowInsertStatementProvider;
import org.mybatis.dynamic.sql.select.CountDSLCompleter;
import org.mybatis.dynamic.sql.select.SelectDSLCompleter;
import org.mybatis.dynamic.sql.select.render.SelectStatementProvider;
import org.mybatis.dynamic.sql.update.UpdateDSL;
import org.mybatis.dynamic.sql.update.UpdateDSLCompleter;
import org.mybatis.dynamic.sql.update.UpdateModel;
import org.mybatis.dynamic.sql.update.render.UpdateStatementProvider;
import org.mybatis.dynamic.sql.util.SqlProviderAdapter;
import org.mybatis.dynamic.sql.util.mybatis3.MyBatis3Utils;

import javax.annotation.Generated;
import java.util.Collection;
import java.util.List;
import java.util.Optional;

import static com.cgling.mybatis.example.mapper.UserInfoDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.isEqualTo;

@Mapper
public interface UserInfoMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-26T13:05:17.222+08:00", comments="Source Table: user_info")
    BasicColumn[] selectList = BasicColumn.columnList(userId, username, password, alias, mobile, email, duty, wxUserId, internal, defaultGroupId, status, createTime, attemptTime, attemptIp, isDelete, isSolute, solutePeriod);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-26T13:05:17.193+08:00", comments="Source Table: user_info")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-26T13:05:17.197+08:00", comments="Source Table: user_info")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-26T13:05:17.198+08:00", comments="Source Table: user_info")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<UserInfo> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-26T13:05:17.2+08:00", comments="Source Table: user_info")
    @InsertProvider(type=SqlProviderAdapter.class, method="insertMultiple")
    int insertMultiple(MultiRowInsertStatementProvider<UserInfo> multipleInsertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-26T13:05:17.201+08:00", comments="Source Table: user_info")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("UserInfoResult")
    Optional<UserInfo> selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-26T13:05:17.202+08:00", comments="Source Table: user_info")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="UserInfoResult", value = {
        @Result(column="user_id", property="userId", jdbcType=JdbcType.BIGINT, id=true),
        @Result(column="username", property="username", jdbcType=JdbcType.VARCHAR),
        @Result(column="password", property="password", jdbcType=JdbcType.CHAR),
        @Result(column="alias", property="alias", jdbcType=JdbcType.VARCHAR),
        @Result(column="mobile", property="mobile", jdbcType=JdbcType.VARCHAR),
        @Result(column="email", property="email", jdbcType=JdbcType.VARCHAR),
        @Result(column="duty", property="duty", jdbcType=JdbcType.VARCHAR),
        @Result(column="wx_user_id", property="wxUserId", jdbcType=JdbcType.VARCHAR),
        @Result(column="internal", property="internal", jdbcType=JdbcType.TINYINT),
        @Result(column="default_group_id", property="defaultGroupId", jdbcType=JdbcType.BIGINT),
        @Result(column="status", property="status", jdbcType=JdbcType.TINYINT),
        @Result(column="create_time", property="createTime", jdbcType=JdbcType.BIGINT),
        @Result(column="attempt_time", property="attemptTime", jdbcType=JdbcType.BIGINT),
        @Result(column="attempt_ip", property="attemptIp", jdbcType=JdbcType.VARCHAR),
        @Result(column="is_delete", property="isDelete", jdbcType=JdbcType.TINYINT),
        @Result(column="is_solute", property="isSolute", jdbcType=JdbcType.TINYINT),
        @Result(column="solute_period", property="solutePeriod", jdbcType=JdbcType.TINYINT)
    })
    List<UserInfo> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-26T13:05:17.206+08:00", comments="Source Table: user_info")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-26T13:05:17.207+08:00", comments="Source Table: user_info")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, userInfo, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-26T13:05:17.208+08:00", comments="Source Table: user_info")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, userInfo, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-26T13:05:17.208+08:00", comments="Source Table: user_info")
    default int deleteByPrimaryKey(Long userId_) {
        return delete(c -> 
            c.where(userId, isEqualTo(userId_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-26T13:05:17.209+08:00", comments="Source Table: user_info")
    default int insert(UserInfo record) {
        return MyBatis3Utils.insert(this::insert, record, userInfo, c ->
            c.map(userId).toProperty("userId")
            .map(username).toProperty("username")
            .map(password).toProperty("password")
            .map(alias).toProperty("alias")
            .map(mobile).toProperty("mobile")
            .map(email).toProperty("email")
            .map(duty).toProperty("duty")
            .map(wxUserId).toProperty("wxUserId")
            .map(internal).toProperty("internal")
            .map(defaultGroupId).toProperty("defaultGroupId")
            .map(status).toProperty("status")
            .map(createTime).toProperty("createTime")
            .map(attemptTime).toProperty("attemptTime")
            .map(attemptIp).toProperty("attemptIp")
            .map(isDelete).toProperty("isDelete")
            .map(isSolute).toProperty("isSolute")
            .map(solutePeriod).toProperty("solutePeriod")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-26T13:05:17.215+08:00", comments="Source Table: user_info")
    default int insertMultiple(Collection<UserInfo> records) {
        return MyBatis3Utils.insertMultiple(this::insertMultiple, records, userInfo, c ->
            c.map(userId).toProperty("userId")
            .map(username).toProperty("username")
            .map(password).toProperty("password")
            .map(alias).toProperty("alias")
            .map(mobile).toProperty("mobile")
            .map(email).toProperty("email")
            .map(duty).toProperty("duty")
            .map(wxUserId).toProperty("wxUserId")
            .map(internal).toProperty("internal")
            .map(defaultGroupId).toProperty("defaultGroupId")
            .map(status).toProperty("status")
            .map(createTime).toProperty("createTime")
            .map(attemptTime).toProperty("attemptTime")
            .map(attemptIp).toProperty("attemptIp")
            .map(isDelete).toProperty("isDelete")
            .map(isSolute).toProperty("isSolute")
            .map(solutePeriod).toProperty("solutePeriod")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-26T13:05:17.216+08:00", comments="Source Table: user_info")
    default int insertSelective(UserInfo record) {
        return MyBatis3Utils.insert(this::insert, record, userInfo, c ->
            c.map(userId).toPropertyWhenPresent("userId", record::getUserId)
            .map(username).toPropertyWhenPresent("username", record::getUsername)
            .map(password).toPropertyWhenPresent("password", record::getPassword)
            .map(alias).toPropertyWhenPresent("alias", record::getAlias)
            .map(mobile).toPropertyWhenPresent("mobile", record::getMobile)
            .map(email).toPropertyWhenPresent("email", record::getEmail)
            .map(duty).toPropertyWhenPresent("duty", record::getDuty)
            .map(wxUserId).toPropertyWhenPresent("wxUserId", record::getWxUserId)
            .map(internal).toPropertyWhenPresent("internal", record::getInternal)
            .map(defaultGroupId).toPropertyWhenPresent("defaultGroupId", record::getDefaultGroupId)
            .map(status).toPropertyWhenPresent("status", record::getStatus)
            .map(createTime).toPropertyWhenPresent("createTime", record::getCreateTime)
            .map(attemptTime).toPropertyWhenPresent("attemptTime", record::getAttemptTime)
            .map(attemptIp).toPropertyWhenPresent("attemptIp", record::getAttemptIp)
            .map(isDelete).toPropertyWhenPresent("isDelete", record::getIsDelete)
            .map(isSolute).toPropertyWhenPresent("isSolute", record::getIsSolute)
            .map(solutePeriod).toPropertyWhenPresent("solutePeriod", record::getSolutePeriod)
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-26T13:05:17.225+08:00", comments="Source Table: user_info")
    default Optional<UserInfo> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, userInfo, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-26T13:05:17.226+08:00", comments="Source Table: user_info")
    default List<UserInfo> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, userInfo, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-26T13:05:17.227+08:00", comments="Source Table: user_info")
    default List<UserInfo> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, userInfo, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-26T13:05:17.228+08:00", comments="Source Table: user_info")
    default Optional<UserInfo> selectByPrimaryKey(Long userId_) {
        return selectOne(c ->
            c.where(userId, isEqualTo(userId_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-26T13:05:17.229+08:00", comments="Source Table: user_info")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, userInfo, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-26T13:05:17.23+08:00", comments="Source Table: user_info")
    static UpdateDSL<UpdateModel> updateAllColumns(UserInfo record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(userId).equalTo(record::getUserId)
                .set(username).equalTo(record::getUsername)
                .set(password).equalTo(record::getPassword)
                .set(alias).equalTo(record::getAlias)
                .set(mobile).equalTo(record::getMobile)
                .set(email).equalTo(record::getEmail)
                .set(duty).equalTo(record::getDuty)
                .set(wxUserId).equalTo(record::getWxUserId)
                .set(internal).equalTo(record::getInternal)
                .set(defaultGroupId).equalTo(record::getDefaultGroupId)
                .set(status).equalTo(record::getStatus)
                .set(createTime).equalTo(record::getCreateTime)
                .set(attemptTime).equalTo(record::getAttemptTime)
                .set(attemptIp).equalTo(record::getAttemptIp)
                .set(isDelete).equalTo(record::getIsDelete)
                .set(isSolute).equalTo(record::getIsSolute)
                .set(solutePeriod).equalTo(record::getSolutePeriod);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-26T13:05:17.231+08:00", comments="Source Table: user_info")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(UserInfo record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(userId).equalToWhenPresent(record::getUserId)
                .set(username).equalToWhenPresent(record::getUsername)
                .set(password).equalToWhenPresent(record::getPassword)
                .set(alias).equalToWhenPresent(record::getAlias)
                .set(mobile).equalToWhenPresent(record::getMobile)
                .set(email).equalToWhenPresent(record::getEmail)
                .set(duty).equalToWhenPresent(record::getDuty)
                .set(wxUserId).equalToWhenPresent(record::getWxUserId)
                .set(internal).equalToWhenPresent(record::getInternal)
                .set(defaultGroupId).equalToWhenPresent(record::getDefaultGroupId)
                .set(status).equalToWhenPresent(record::getStatus)
                .set(createTime).equalToWhenPresent(record::getCreateTime)
                .set(attemptTime).equalToWhenPresent(record::getAttemptTime)
                .set(attemptIp).equalToWhenPresent(record::getAttemptIp)
                .set(isDelete).equalToWhenPresent(record::getIsDelete)
                .set(isSolute).equalToWhenPresent(record::getIsSolute)
                .set(solutePeriod).equalToWhenPresent(record::getSolutePeriod);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-26T13:05:17.232+08:00", comments="Source Table: user_info")
    default int updateByPrimaryKey(UserInfo record) {
        return update(c ->
            c.set(username).equalTo(record::getUsername)
            .set(password).equalTo(record::getPassword)
            .set(alias).equalTo(record::getAlias)
            .set(mobile).equalTo(record::getMobile)
            .set(email).equalTo(record::getEmail)
            .set(duty).equalTo(record::getDuty)
            .set(wxUserId).equalTo(record::getWxUserId)
            .set(internal).equalTo(record::getInternal)
            .set(defaultGroupId).equalTo(record::getDefaultGroupId)
            .set(status).equalTo(record::getStatus)
            .set(createTime).equalTo(record::getCreateTime)
            .set(attemptTime).equalTo(record::getAttemptTime)
            .set(attemptIp).equalTo(record::getAttemptIp)
            .set(isDelete).equalTo(record::getIsDelete)
            .set(isSolute).equalTo(record::getIsSolute)
            .set(solutePeriod).equalTo(record::getSolutePeriod)
            .where(userId, isEqualTo(record::getUserId))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-26T13:05:17.233+08:00", comments="Source Table: user_info")
    default int updateByPrimaryKeySelective(UserInfo record) {
        return update(c ->
            c.set(username).equalToWhenPresent(record::getUsername)
            .set(password).equalToWhenPresent(record::getPassword)
            .set(alias).equalToWhenPresent(record::getAlias)
            .set(mobile).equalToWhenPresent(record::getMobile)
            .set(email).equalToWhenPresent(record::getEmail)
            .set(duty).equalToWhenPresent(record::getDuty)
            .set(wxUserId).equalToWhenPresent(record::getWxUserId)
            .set(internal).equalToWhenPresent(record::getInternal)
            .set(defaultGroupId).equalToWhenPresent(record::getDefaultGroupId)
            .set(status).equalToWhenPresent(record::getStatus)
            .set(createTime).equalToWhenPresent(record::getCreateTime)
            .set(attemptTime).equalToWhenPresent(record::getAttemptTime)
            .set(attemptIp).equalToWhenPresent(record::getAttemptIp)
            .set(isDelete).equalToWhenPresent(record::getIsDelete)
            .set(isSolute).equalToWhenPresent(record::getIsSolute)
            .set(solutePeriod).equalToWhenPresent(record::getSolutePeriod)
            .where(userId, isEqualTo(record::getUserId))
        );
    }
}