<METHOD_START> public void ( java.lang.String java.lang.String )			throws javax.management.MalformedObjectNameException { this . javax.management.ObjectName = new javax.management.ObjectName ( java.lang.String ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( ApplicationContext org.springframework.boot.admin.ApplicationContext )			throws org.springframework.boot.admin.BeansException { Assert . state ( org.springframework.boot.admin.ApplicationContext instanceof ConfigurableApplicationContext , STRING ) ; this . org.springframework.boot.admin.ConfigurableApplicationContext = ( ConfigurableApplicationContext ) org.springframework.boot.admin.ApplicationContext ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( Environment org.springframework.boot.admin.Environment ) { this . org.springframework.boot.admin.Environment = org.springframework.boot.admin.Environment ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( ApplicationReadyEvent org.springframework.boot.admin.ApplicationReadyEvent ) { if ( this . org.springframework.boot.admin.ConfigurableApplicationContext . equals ( org.springframework.boot.admin.ApplicationReadyEvent . getApplicationContext ( ) ) ) { this . boolean = true ; } }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( ) java.lang.Exception { javax.management.MBeanServer javax.management.MBeanServer = java.lang.management.ManagementFactory . javax.management.MBeanServer ( ) ; javax.management.MBeanServer . javax.management.ObjectInstance ( new org.springframework.boot.admin.SpringApplicationAdminMXBeanRegistrar.SpringApplicationAdmin ( ) , this . javax.management.ObjectName ) ; if ( org.springframework.boot.admin.Log . isDebugEnabled ( ) ) { org.springframework.boot.admin.Log . debug ( STRING + this . javax.management.ObjectName + STRING ) ; } }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( ) java.lang.Exception { java.lang.management.ManagementFactory . javax.management.MBeanServer ( ) . void ( this . javax.management.ObjectName ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public boolean boolean ( ) { return org.springframework.boot.admin.SpringApplicationAdminMXBeanRegistrar .this . boolean ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public boolean boolean ( ) { return ( org.springframework.boot.admin.SpringApplicationAdminMXBeanRegistrar .this . org.springframework.boot.admin.ConfigurableApplicationContext != null && org.springframework.boot.admin.SpringApplicationAdminMXBeanRegistrar .this . org.springframework.boot.admin.ConfigurableApplicationContext instanceof ServletWebServerApplicationContext ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public java.lang.String java.lang.String ( java.lang.String java.lang.String ) { return org.springframework.boot.admin.SpringApplicationAdminMXBeanRegistrar .this . org.springframework.boot.admin.Environment . getProperty ( java.lang.String ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( ) { org.springframework.boot.admin.Log . info ( STRING ) ; org.springframework.boot.admin.SpringApplicationAdminMXBeanRegistrar .this . org.springframework.boot.admin.ConfigurableApplicationContext . close ( ) ; }  <METHOD_END>