package io.csra.wily.starter.config;

import io.csra.wily.database.JooqDatabaseConfiguration;
import org.jooq.SQLDialect;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

// @Configuration
// @PropertySource(value = { DatabaseConfig.PROPERTY_SOURCE_1 })
public class DatabaseConfig extends JooqDatabaseConfiguration {

	public static final String PROPERTY_SOURCE_1 = "classpath:database.properties";

	@Value(value = "${spring.datasource.dbType}")
	private String dbType;

	@Override
	public SQLDialect getSQLDialect() {
		if("postgres".equalsIgnoreCase(dbType)) {
			return SQLDialect.POSTGRES_9_5;
		}

		throw new RuntimeException("Database Not Supported");
	}

}
