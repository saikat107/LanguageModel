<METHOD_START> @ java.lang.Override public < T extends org.springframework.web.bind.support.ConstraintValidator<?,?> < ? , ? > > T T ( java.lang.Class<T> < T > java.lang.Class<T> ) { return org.springframework.web.bind.support.WebApplicationContext ( ) . getAutowireCapableBeanFactory ( ) . createBean ( java.lang.Class<T> ) ; }  <METHOD_END>
<METHOD_START> public void void ( ConstraintValidator < ? , ? > org.springframework.web.bind.support.ConstraintValidator<?,?> ) { org.springframework.web.bind.support.WebApplicationContext ( ) . getAutowireCapableBeanFactory ( ) . destroyBean ( org.springframework.web.bind.support.ConstraintValidator<,> ) ; }  <METHOD_END>
<METHOD_START> protected org.springframework.web.bind.support.WebApplicationContext org.springframework.web.bind.support.WebApplicationContext ( ) { WebApplicationContext org.springframework.web.bind.support.WebApplicationContext = ContextLoader . getCurrentWebApplicationContext ( ) ; if ( org.springframework.web.bind.support.WebApplicationContext == null ) { throw new java.lang.IllegalStateException ( STRING + STRING ) ; } return org.springframework.web.bind.support.WebApplicationContext ; }  <METHOD_END>