package com;

import javax.sql.DataSource;

import org.apache.ibatis.mapping.DatabaseIdProvider;
import org.apache.ibatis.plugin.Interceptor;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.mybatis.spring.boot.autoconfigure.MybatisProperties;
import org.mybatis.spring.boot.autoconfigure.SpringBootVFS;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Primary;
import org.springframework.core.io.DefaultResourceLoader;
import org.springframework.core.io.ResourceLoader;
import org.springframework.util.ObjectUtils;
import org.springframework.util.StringUtils;

@SpringBootApplication // 一个注解顶下面3个
//@SpringBootConfiguration
//@EnableAutoConfiguration//这里有了，其他controller就不用写了
//@ComponentScan

//指定mapper类的位置
@MapperScan(basePackages = "com.wordpython.dao")
public class ApplicationStart {

	public static void main(String[] args) {
		SpringApplication.run(ApplicationStart.class, args);
	}
	
	/*
	 * 好奇怪啊！
	 * 为什么把下面的注释的呢，是这样的，没加下面代码之前，报错Could not resolve type alias 'User'，
	 * 加了之后，报其他错误，注释掉后，重新运行，没有报任何错包括Could not resolve type alias 'User'
	 */
//	@Autowired
//	private MybatisProperties properties;
//	@Autowired
//	private ResourceLoader resourceLoader = new DefaultResourceLoader();
//	@Autowired(required = false)
//	private Interceptor[] interceptors;
//	@Autowired(required = false)
//	private DatabaseIdProvider databaseIdProvider;
//
//	@Bean(name = "masterSqlSessionFactory")
//	@Primary
//	public SqlSessionFactory sqlSessionFactory(@Qualifier("masterDataSource") DataSource dataSource) throws Exception {
//		SqlSessionFactoryBean factory = new SqlSessionFactoryBean();
//		factory.setDataSource(dataSource);
//		factory.setVfs(SpringBootVFS.class);
//		factory.setTypeAliasesPackage("com.wordpython.po");//mybatis.type-aliases-package还是扫描不到包，所以要添加这一句
//		if (StringUtils.hasText(this.properties.getConfigLocation())) {
//			factory.setConfigLocation(this.resourceLoader.getResource(this.properties.getConfigLocation()));
//		}
//		factory.setConfiguration(properties.getConfiguration());
//		if (!ObjectUtils.isEmpty(this.interceptors)) {
//			factory.setPlugins(this.interceptors);
//		}
//		if (this.databaseIdProvider != null) {
//			factory.setDatabaseIdProvider(this.databaseIdProvider);
//		}
//		if (StringUtils.hasLength(this.properties.getTypeAliasesPackage())) {
//			factory.setTypeAliasesPackage(this.properties.getTypeAliasesPackage());
//		}
//		if (StringUtils.hasLength(this.properties.getTypeHandlersPackage())) {
//			factory.setTypeHandlersPackage(this.properties.getTypeHandlersPackage());
//		}
//		if (!ObjectUtils.isEmpty(this.properties.resolveMapperLocations())) {
//			factory.setMapperLocations(this.properties.resolveMapperLocations());
//		}
//		return factory.getObject();
//	}
}
