<METHOD_START> public void ( ConfigurableBeanFactory org.springframework.aop.scope.ConfigurableBeanFactory , java.lang.String java.lang.String ) { Assert . notNull ( org.springframework.aop.scope.ConfigurableBeanFactory , STRING ) ; Assert . hasText ( java.lang.String , STRING ) ; this . org.springframework.aop.scope.ConfigurableBeanFactory = org.springframework.aop.scope.ConfigurableBeanFactory ; this . java.lang.String = java.lang.String ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public java.lang.Object java.lang.Object ( ) { return this . org.springframework.aop.scope.ConfigurableBeanFactory . getBean ( this . java.lang.String ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( ) { this . org.springframework.aop.scope.ConfigurableBeanFactory . destroyScopedBean ( this . java.lang.String ) ; }  <METHOD_END>
