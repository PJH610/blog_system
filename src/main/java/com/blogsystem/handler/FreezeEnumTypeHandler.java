package com.blogsystem.handler;

import com.blogsystem.enums.FreezeEnum;
import org.apache.ibatis.type.JdbcType;
import org.apache.ibatis.type.TypeHandler;

import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Created by SX-503 on 2018/11/5.
 */public class FreezeEnumTypeHandler implements TypeHandler<FreezeEnum> {


    @Override
    public void setParameter(PreparedStatement ps, int i, FreezeEnum parameter, JdbcType jdbcType) throws SQLException {
        if (parameter != null) ps.setInt(i, parameter.getValue());
    }

    @Override
    public FreezeEnum getResult(ResultSet rs, String columnName) throws SQLException {
        return FreezeEnum.valueOf(rs.getInt(columnName));
    }

    @Override
    public FreezeEnum getResult(ResultSet rs, int columnIndex) throws SQLException {
        return FreezeEnum.valueOf(rs.getInt(columnIndex));
    }

    @Override
    public FreezeEnum getResult(CallableStatement cs, int columnIndex) throws SQLException {
        return FreezeEnum.valueOf(cs.getInt(columnIndex));
    }
}

