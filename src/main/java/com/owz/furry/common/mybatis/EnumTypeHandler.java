/*
* Copyright (c) 2014 Qunar.com. All Rights Reserved.
*/
package com.owz.furry.common.mybatis;

import org.apache.ibatis.type.BaseTypeHandler;
import org.apache.ibatis.type.JdbcType;

import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;

/**
 * @author kongtong.ouyang created on 2014/8/13, 14:31
 * @version $Id$
 */
public class EnumTypeHandler extends BaseTypeHandler<EnumTrait> {

    private int jdbcType;

    private Map<Integer, EnumTrait> map = new HashMap<Integer, EnumTrait>();

    public EnumTypeHandler() {
        if (this.getClass().isAnnotationPresent(EnumType.class)) {
            EnumType enumType = this.getClass().getAnnotation(EnumType.class);
            this.jdbcType = enumType.jdbcType();
            Class<EnumTrait> clazz = enumType.enumClass();
            for (EnumTrait enumTrait : clazz.getEnumConstants()) {
                int value = enumTrait.getCode();
                map.put(value, enumTrait);
            }
        } else {
            throw new RuntimeException("");
        }
    }

    @Override
    public void setNonNullParameter(PreparedStatement ps, int i, EnumTrait parameter, JdbcType jdbcType) throws SQLException {
        ps.setInt(i, parameter.getCode());
    }

    @Override
    public EnumTrait getNullableResult(ResultSet rs, String columnName) throws SQLException {
        int value = rs.getInt(columnName);
        return map.get(value);
    }

    @Override
    public EnumTrait getNullableResult(ResultSet rs, int columnIndex) throws SQLException {
        int value = rs.getInt(columnIndex);
        return map.get(value);
    }

    @Override
    public EnumTrait getNullableResult(CallableStatement cs, int columnIndex) throws SQLException {
        int value = cs.getInt(columnIndex);
        return map.get(value);
    }
}
