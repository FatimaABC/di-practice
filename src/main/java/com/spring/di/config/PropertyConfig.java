package com.spring.di.config;

import com.spring.di.examplebeans.FakeDataSource;
import com.spring.di.examplebeans.FakeJmsSource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

@Configuration
@PropertySource({"classpath:datasource.properties", "classpath:jms.properties"})
public class PropertyConfig {

    @Value("${chanel.user}")
    String user;

    @Value("${chanel.password}")
    String password;

    @Value("${chanel.dburl}")
    String url;

    @Value("${chanel.jms.user}")
    String jmsUser;

    @Value("${chanel.jms.password}")
    String jmsPassword;

    @Value("${chanel.jms.dburl}")
    String jmsUrl;
    @Bean
    public FakeDataSource fakeDataSource() {
        FakeDataSource fakeDataSource = new FakeDataSource();
        fakeDataSource.setUser(user);
        fakeDataSource.setPassword(password);
        fakeDataSource.setUrl(url);
        return fakeDataSource;
    }

    @Bean
    public FakeJmsSource fakeJmsSource() {
        FakeJmsSource fakeJmsSource = new FakeJmsSource();
        fakeJmsSource.setUser(jmsUser);
        fakeJmsSource.setPassword(jmsPassword);
        fakeJmsSource.setUrl(jmsUrl);
        return fakeJmsSource;
    }

    @Bean
    public static PropertySourcesPlaceholderConfigurer properties() {
        PropertySourcesPlaceholderConfigurer propertySourcesPlaceholderConfigurer = new PropertySourcesPlaceholderConfigurer();
        return propertySourcesPlaceholderConfigurer;
    }
}
