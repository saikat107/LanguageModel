<METHOD_START> @ Test ( expected = java.lang.IllegalArgumentException .class ) public void void ( ) { ClassPathXmlApplicationContext org.springframework.aop.framework.autoproxy.ClassPathXmlApplicationContext = new ClassPathXmlApplicationContext ( java.lang.Class<? extends org.springframework.aop.framework.autoproxy.BeanNameAutoProxyCreatorInitTests> ( ) . java.lang.String ( ) + STRING , java.lang.Class<? extends org.springframework.aop.framework.autoproxy.BeanNameAutoProxyCreatorInitTests> ( ) ) ; TestBean org.springframework.aop.framework.autoproxy.TestBean = ( TestBean ) org.springframework.aop.framework.autoproxy.ClassPathXmlApplicationContext . getBean ( STRING ) ; org.springframework.aop.framework.autoproxy.TestBean . setName ( STRING ) ; assertEquals ( STRING , org.springframework.aop.framework.autoproxy.TestBean . getName ( ) ) ; org.springframework.aop.framework.autoproxy.TestBean . setName ( null ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( java.lang.reflect.Method java.lang.reflect.Method , java.lang.Object [] java.lang.Object[] , java.lang.Object java.lang.Object ) throws java.lang.Throwable { void ( java.lang.Object[] ) ; }  <METHOD_END>
<METHOD_START> private void void ( java.lang.Object [] java.lang.Object[] ) { for ( int int = NUMBER ; int < java.lang.Object[] . int ; int ++ ) { if ( java.lang.Object[] [ int ] == null ) { throw new java.lang.IllegalArgumentException ( STRING + int ) ; } } }  <METHOD_END>