<METHOD_START> public void ( LdapOperations org.springframework.boot.actuate.health.LdapOperations ) { Assert . notNull ( org.springframework.boot.actuate.health.LdapOperations , STRING ) ; this . org.springframework.boot.actuate.health.LdapOperations = org.springframework.boot.actuate.health.LdapOperations ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override protected void void ( Health . Health Health.Builder ) throws java.lang.Exception { java.lang.String java.lang.String = this . org.springframework.boot.actuate.health.LdapOperations . executeReadOnly ( org.springframework.boot.actuate.health.ContextExecutor<java.lang.String> ) ; Health.Builder . up ( ) . withDetail ( STRING , java.lang.String ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public java.lang.String java.lang.String ( javax.naming.directory.DirContext javax.naming.directory.DirContext ) throws javax.naming.NamingException { java.lang.Object java.lang.Object = javax.naming.directory.DirContext . java.util.Hashtable<?,?> ( ) . get ( STRING ) ; if ( java.lang.Object != null ) { return ( java.lang.String ) java.lang.Object ; } return null ; }  <METHOD_END>
