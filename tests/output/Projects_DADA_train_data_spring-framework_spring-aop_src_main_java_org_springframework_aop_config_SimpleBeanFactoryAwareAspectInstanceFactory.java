<METHOD_START> public void void ( java.lang.String java.lang.String ) { this . java.lang.String = java.lang.String ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( BeanFactory org.springframework.aop.config.BeanFactory ) { this . org.springframework.aop.config.BeanFactory = org.springframework.aop.config.BeanFactory ; if ( ! StringUtils . hasText ( this . java.lang.String ) ) { throw new java.lang.IllegalArgumentException ( STRING ) ; } }  <METHOD_END>
<METHOD_START> @ java.lang.Override public java.lang.Object java.lang.Object ( ) { return this . org.springframework.aop.config.BeanFactory . getBean ( this . java.lang.String ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public java.lang.ClassLoader java.lang.ClassLoader ( ) { if ( this . org.springframework.aop.config.BeanFactory instanceof ConfigurableBeanFactory ) { return ( ( ConfigurableBeanFactory ) this . org.springframework.aop.config.BeanFactory ) . getBeanClassLoader ( ) ; } else { return ClassUtils . getDefaultClassLoader ( ) ; } }  <METHOD_END>
<METHOD_START> @ java.lang.Override public int int ( ) { if ( this . org.springframework.aop.config.BeanFactory . isSingleton ( this . java.lang.String ) && this . org.springframework.aop.config.BeanFactory . isTypeMatch ( this . java.lang.String , Ordered .class ) ) { return ( ( Ordered ) this . org.springframework.aop.config.BeanFactory . getBean ( this . java.lang.String ) ) . getOrder ( ) ; } return Ordered . LOWEST_PRECEDENCE ; }  <METHOD_END>
