<METHOD_START> @ java.lang.Override public java.lang.Object java.lang.Object ( java.lang.Object java.lang.Object , java.lang.String java.lang.String ) throws org.springframework.data.gemfire.test.BeansException { if ( java.lang.Object instanceof CacheFactoryBean ) { java.lang.String java.lang.String = java.lang.Object . java.lang.Class<? extends java.lang.Object> ( ) . java.lang.String ( ) ; java.lang.Object = ( java.lang.Object instanceof ClientCacheFactoryBean ? new MockClientCacheFactoryBean ( ( ClientCacheFactoryBean ) java.lang.Object ) : new MockCacheFactoryBean ( ( CacheFactoryBean ) java.lang.Object ) ) ; org.springframework.data.gemfire.test.Log . info ( java.lang.String . java.lang.String ( STRING , java.lang.String , java.lang.String , java.lang.Object . java.lang.Class<? extends java.lang.Object> ( ) . java.lang.String ( ) ) ) ; } else if ( java.lang.Object instanceof CacheServerFactoryBean ) { ( ( CacheServerFactoryBean ) java.lang.Object ) . setCache ( new StubCache ( ) ) ; } return java.lang.Object ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public java.lang.Object java.lang.Object ( java.lang.Object java.lang.Object , java.lang.String java.lang.String ) throws org.springframework.data.gemfire.test.BeansException { return java.lang.Object ; }  <METHOD_END>
