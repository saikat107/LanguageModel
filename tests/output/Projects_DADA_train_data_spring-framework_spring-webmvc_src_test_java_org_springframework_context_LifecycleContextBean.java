<METHOD_START> @ java.lang.Override public void void ( BeanFactory org.springframework.context.BeanFactory ) { super. setBeanFactory ( org.springframework.context.BeanFactory ) ; if ( this . org.springframework.context.ApplicationContext != null ) throw new java.lang.RuntimeException ( STRING ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( ) { super. afterPropertiesSet ( ) ; if ( this . org.springframework.context.ApplicationContext == null ) throw new java.lang.RuntimeException ( STRING ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( ApplicationContext org.springframework.context.ApplicationContext ) throws org.springframework.context.BeansException { if ( this . owningFactory == null ) throw new java.lang.RuntimeException ( STRING ) ; this . org.springframework.context.ApplicationContext = org.springframework.context.ApplicationContext ; }  <METHOD_END>