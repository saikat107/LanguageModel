<METHOD_START> @ java.lang.Override public void void ( BeanFactory org.springframework.aop.framework.autoproxy.BeanFactory ) { this . org.springframework.aop.framework.autoproxy.ConfigurableListableBeanFactory = ( org.springframework.aop.framework.autoproxy.BeanFactory instanceof ConfigurableListableBeanFactory ? ( ConfigurableListableBeanFactory ) org.springframework.aop.framework.autoproxy.BeanFactory : null ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override protected org.springframework.aop.framework.autoproxy.ProxyFactory org.springframework.aop.framework.autoproxy.ProxyFactory ( java.lang.Object java.lang.Object , java.lang.String java.lang.String ) { if ( this . org.springframework.aop.framework.autoproxy.ConfigurableListableBeanFactory != null ) { AutoProxyUtils . exposeTargetClass ( this . org.springframework.aop.framework.autoproxy.ConfigurableListableBeanFactory , java.lang.String , java.lang.Object . java.lang.Class<? extends java.lang.Object> ( ) ) ; } ProxyFactory org.springframework.aop.framework.autoproxy.ProxyFactory = super. prepareProxyFactory ( java.lang.Object , java.lang.String ) ; if ( ! org.springframework.aop.framework.autoproxy.ProxyFactory . isProxyTargetClass ( ) && this . org.springframework.aop.framework.autoproxy.ConfigurableListableBeanFactory != null && AutoProxyUtils . shouldProxyTargetClass ( this . org.springframework.aop.framework.autoproxy.ConfigurableListableBeanFactory , java.lang.String ) ) { org.springframework.aop.framework.autoproxy.ProxyFactory . setProxyTargetClass ( true ) ; } return org.springframework.aop.framework.autoproxy.ProxyFactory ; }  <METHOD_END>