<METHOD_START> @ Test public void void ( ) java.lang.Throwable { java.lang.NullPointerException java.lang.NullPointerException = new java.lang.NullPointerException ( STRING ) ; when ( org.springframework.data.mongodb.core.convert.DbRefResolverCallback . resolve ( org.springframework.data.mongodb.core.convert.MongoPersistentProperty ) ) . thenThrow ( java.lang.NullPointerException ) ; org.springframework.data.mongodb.core.convert.ExpectedException . expect ( LazyLoadingException .class ) ; org.springframework.data.mongodb.core.convert.ExpectedException . expectCause ( is ( equalTo ( java.lang.NullPointerException ) ) ) ; new LazyLoadingInterceptor ( org.springframework.data.mongodb.core.convert.MongoPersistentProperty , org.springframework.data.mongodb.core.convert.DBRef , new org.springframework.data.mongodb.core.convert.LazyLoadingInterceptorUnitTests.NullExceptionTranslator ( ) , org.springframework.data.mongodb.core.convert.DbRefResolverCallback ) . intercept ( null , LazyLoadingProxy .class . java.lang.reflect.Method ( STRING ) , null , null ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public org.springframework.data.mongodb.core.convert.DataAccessException org.springframework.data.mongodb.core.convert.DataAccessException ( java.lang.RuntimeException java.lang.RuntimeException ) { return null ; }  <METHOD_END>
