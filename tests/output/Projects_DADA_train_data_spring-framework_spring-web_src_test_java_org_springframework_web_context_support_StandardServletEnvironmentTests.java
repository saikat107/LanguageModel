<METHOD_START> @ Test public void void ( ) java.lang.Exception { SimpleNamingContextBuilder . emptyActivatedContextBuilder ( ) ; ConfigurableEnvironment org.springframework.web.context.support.ConfigurableEnvironment = new StandardServletEnvironment ( ) ; MutablePropertySources org.springframework.web.context.support.MutablePropertySources = org.springframework.web.context.support.ConfigurableEnvironment . getPropertySources ( ) ; assertThat ( org.springframework.web.context.support.MutablePropertySources . precedenceOf ( PropertySource . named ( StandardServletEnvironment . SERVLET_CONFIG_PROPERTY_SOURCE_NAME ) ) , equalTo ( NUMBER ) ) ; assertThat ( org.springframework.web.context.support.MutablePropertySources . precedenceOf ( PropertySource . named ( StandardServletEnvironment . SERVLET_CONTEXT_PROPERTY_SOURCE_NAME ) ) , equalTo ( NUMBER ) ) ; assertThat ( org.springframework.web.context.support.MutablePropertySources . precedenceOf ( PropertySource . named ( StandardServletEnvironment . JNDI_PROPERTY_SOURCE_NAME ) ) , equalTo ( NUMBER ) ) ; assertThat ( org.springframework.web.context.support.MutablePropertySources . precedenceOf ( PropertySource . named ( StandardEnvironment . SYSTEM_PROPERTIES_PROPERTY_SOURCE_NAME ) ) , equalTo ( NUMBER ) ) ; assertThat ( org.springframework.web.context.support.MutablePropertySources . precedenceOf ( PropertySource . named ( StandardEnvironment . SYSTEM_ENVIRONMENT_PROPERTY_SOURCE_NAME ) ) , equalTo ( NUMBER ) ) ; assertThat ( org.springframework.web.context.support.MutablePropertySources . size ( ) , is ( NUMBER ) ) ; }  <METHOD_END>
