package com.sda.java18.builder.java9;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.JDBCType;
import java.sql.SQLException;
import java.sql.ShardingKey;

// real world example
public class Main {

    public static void main(String[] args) throws SQLException {
/*
        DataSource ds = new MyDataSource();
        ShardingKey superShardingKey = ds.createShardingKeyBuilder()
                .subkey("EASTERN_REGION", JDBCType.VARCHAR)
                .build();
        ShardingKey shardingKey = ds.createShardingKeyBuilder()
                .subkey("PITTSBURGH_BRANCH", JDBCType.VARCHAR)
                .build();
        Connection con = ds.createConnectionBuilder()
                .user("rafa")
                .password("tennis")
                .shardingKey(shardingKey)
                .superShardingKey(superShardingKey)
                .build();
            */
    }
}
