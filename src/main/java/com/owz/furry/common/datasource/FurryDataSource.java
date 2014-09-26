/*
* Copyright (c) 2014 Qunar.com. All Rights Reserved.
*/
package com.owz.furry.common.datasource;

import org.springframework.jdbc.datasource.lookup.AbstractRoutingDataSource;

import java.sql.SQLFeatureNotSupportedException;
import java.util.logging.Logger;

/**
 * @author kongtong.ouyang created on 2014/9/26, 14:23
 * @version $Id$
 */
public class FurryDataSource extends AbstractRoutingDataSource {


    private static final ThreadLocal DATA_SOURCE_KEYS = new InheritableThreadLocal();

    public static void setDataSourceKey(String dataSource) {
        DATA_SOURCE_KEYS.set(dataSource);
    }

    @Override
    protected Object determineCurrentLookupKey() {
        return DATA_SOURCE_KEYS.get();
    }

    @Override
    public Logger getParentLogger() throws SQLFeatureNotSupportedException {
        return null;
    }
}
