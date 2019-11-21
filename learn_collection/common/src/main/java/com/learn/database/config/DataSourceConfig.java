package com.learn.database.config;

import com.alibaba.druid.filter.Filter;
import com.alibaba.druid.filter.stat.StatFilter;
import com.alibaba.druid.pool.DruidDataSource;
import com.alibaba.druid.wall.WallConfig;
import com.alibaba.druid.wall.WallFilter;
import com.learn.util.PropertiesUtil;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.util.StringUtils;

import javax.sql.DataSource;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;
/**
 *数据源init
 * @ClassName DataSourceConfig
 * @Description: TODO 
 * @Author zaft_x
 * @Date 2019/11/20 0020
 * @Version V1.0
**/
@Configuration
public class DataSourceConfig {


	/**
	 *
	 * @Description: TODO 
	 * @Author zaft_x
	 * @param
	 * @return 
	 * @Date 2019/11/21 0021
	 * @Version V1.0
	**/
	@Bean("dataSource")
	public DataSource dataSourceMajor() {
		DruidDataSource datasource = new DruidDataSource();
		datasource.configFromPropety(getDataSourceProps(""));//多数据源
		datasource.setMaxWait(60000);
		List<Filter> filters = new ArrayList<>();
		//filters.add(statFilter());
		filters.add(wallFilter());
		datasource.setProxyFilters(filters);
		datasource.setDefaultReadOnly(true); //主数据只支持查询业务
		return datasource;
	}

	private StatFilter statFilter() {
		StatFilter statFilter = new StatFilter();
		statFilter.setLogSlowSql(false);
		statFilter.setMergeSql(false);
		statFilter.setSlowSqlMillis(2000);

		return statFilter;
	}

	private WallFilter wallFilter() {
		WallFilter wallFilter = new WallFilter();

		// 允许执行多条SQL
		WallConfig config = new WallConfig();
		config.setMultiStatementAllow(true);
		wallFilter.setConfig(config);

		return wallFilter;
	}
	
	public static Properties getDataSourceProps(String prefix){

		boolean blank = StringUtils.isEmpty(prefix)?true:false;
		Properties properties = new Properties();
		String[] keys = {
				"druid.filters",
				"druid.maxActive",
				"druid.initialSize",
				"druid.maxWaitThreadCount",
				"druid.minIdle",
				"druid.timeBetweenEvictionRunsMillis",
				"druid.minEvictableIdleTimeMillis",
				"druid.validationQuery",
				"druid.testWhileIdle",
				"druid.testOnBorrow",
				"druid.poolPreparedStatements",
				"druid.removeAbandoned",
				"druid.removeAbandonedTimeout",
				"druid.logAbandoned",
				"druid.killWhenSocketReadTimeout",
				"druid.driverClassName=",
				"druid.key",
				"druid.url",
				"druid.username",
				"druid.password"
		};
		for (String key : keys) {
			String value = PropertiesUtil.getString((blank?prefix:prefix+".")+key);
			if(value != null) properties.put(key, value);
		}
		return properties;
	}
}
