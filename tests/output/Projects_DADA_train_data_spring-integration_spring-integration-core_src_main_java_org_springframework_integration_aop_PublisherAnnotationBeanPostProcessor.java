<METHOD_START> public void void ( java.lang.String java.lang.String ) { this . java.lang.String = java.lang.String ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( BeanFactory org.springframework.integration.aop.BeanFactory ) { this . org.springframework.integration.aop.BeanFactory = org.springframework.integration.aop.BeanFactory ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( java.lang.ClassLoader java.lang.ClassLoader ) { this . java.lang.ClassLoader = java.lang.ClassLoader ; }  <METHOD_END>
<METHOD_START> public void void ( int int ) { this . int = int ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public int int ( ) { return this . int ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( ) { this . org.springframework.integration.aop.PublisherAnnotationAdvisor = new PublisherAnnotationAdvisor ( ) ; this . org.springframework.integration.aop.PublisherAnnotationAdvisor . setBeanFactory ( this . org.springframework.integration.aop.BeanFactory ) ; this . org.springframework.integration.aop.PublisherAnnotationAdvisor . setDefaultChannelName ( this . java.lang.String ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public java.lang.Object java.lang.Object ( java.lang.Object java.lang.Object , java.lang.String java.lang.String ) throws org.springframework.integration.aop.BeansException { return java.lang.Object ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public java.lang.Object java.lang.Object ( java.lang.Object java.lang.Object , java.lang.String java.lang.String ) throws org.springframework.integration.aop.BeansException { java.lang.Class<?> < ? > java.lang.Class<?> = AopUtils . getTargetClass ( java.lang.Object ) ; if ( java.lang.Class<> == null ) { return java.lang.Object ; } if ( AopUtils . canApply ( this . org.springframework.integration.aop.PublisherAnnotationAdvisor , java.lang.Class<> ) ) { if ( java.lang.Object instanceof Advised ) { ( ( Advised ) java.lang.Object ) . addAdvisor ( this . org.springframework.integration.aop.PublisherAnnotationAdvisor ) ; return java.lang.Object ; } else { ProxyFactory org.springframework.integration.aop.ProxyFactory = new ProxyFactory ( java.lang.Object ) ; org.springframework.integration.aop.ProxyFactory . copyFrom ( this ) ; org.springframework.integration.aop.ProxyFactory . addAdvisor ( this . org.springframework.integration.aop.PublisherAnnotationAdvisor ) ; return org.springframework.integration.aop.ProxyFactory . getProxy ( this . java.lang.ClassLoader ) ; } } else { return java.lang.Object ; } }  <METHOD_END>
