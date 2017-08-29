<METHOD_START> @ Before public void void ( ) javax.management.MalformedObjectNameException { this . javax.management.MBeanServer = java.lang.management.ManagementFactory . javax.management.MBeanServer ( ) ; }  <METHOD_END>
<METHOD_START> @ After public void void ( ) { if ( this . org.springframework.boot.admin.ConfigurableApplicationContext != null ) { this . org.springframework.boot.admin.ConfigurableApplicationContext . close ( ) ; } }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { final javax.management.ObjectName javax.management.ObjectName = javax.management.ObjectName ( java.lang.String ) ; SpringApplication org.springframework.boot.admin.SpringApplication = new SpringApplication ( org.springframework.boot.admin.SpringApplicationAdminMXBeanRegistrarTests.Config .class ) ; org.springframework.boot.admin.SpringApplication . setWebApplicationType ( WebApplicationType . NONE ) ; org.springframework.boot.admin.SpringApplication . addListeners ( new ApplicationListener < ContextRefreshedEvent > ( ) { @ java.lang.Override public void void ( ContextRefreshedEvent org.springframework.boot.admin.ContextRefreshedEvent ) { try { assertThat ( java.lang.Boolean ( javax.management.ObjectName ) ) . isFalse ( ) ; } catch ( java.lang.Exception java.lang.Exception ) { throw new java.lang.IllegalStateException ( STRING , java.lang.Exception ) ; } } } ) ; this . org.springframework.boot.admin.ConfigurableApplicationContext = org.springframework.boot.admin.SpringApplication . run ( ) ; assertThat ( java.lang.Boolean ( javax.management.ObjectName ) ) . isTrue ( ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( ContextRefreshedEvent org.springframework.boot.admin.ContextRefreshedEvent ) { try { assertThat ( java.lang.Boolean ( javax.management.ObjectName ) ) . isFalse ( ) ; } catch ( java.lang.Exception java.lang.Exception ) { throw new java.lang.IllegalStateException ( STRING , java.lang.Exception ) ; } }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) javax.management.MalformedObjectNameException { SpringApplicationAdminMXBeanRegistrar org.springframework.boot.admin.SpringApplicationAdminMXBeanRegistrar = new SpringApplicationAdminMXBeanRegistrar ( java.lang.String ) ; ConfigurableApplicationContext org.springframework.boot.admin.ConfigurableApplicationContext = mock ( ConfigurableApplicationContext .class ) ; org.springframework.boot.admin.SpringApplicationAdminMXBeanRegistrar . setApplicationContext ( org.springframework.boot.admin.ConfigurableApplicationContext ) ; org.springframework.boot.admin.SpringApplicationAdminMXBeanRegistrar . onApplicationEvent ( new ApplicationReadyEvent ( new SpringApplication ( ) , null , mock ( ConfigurableApplicationContext .class ) ) ) ; assertThat ( boolean ( org.springframework.boot.admin.SpringApplicationAdminMXBeanRegistrar ) ) . isFalse ( ) ; org.springframework.boot.admin.SpringApplicationAdminMXBeanRegistrar . onApplicationEvent ( new ApplicationReadyEvent ( new SpringApplication ( ) , null , org.springframework.boot.admin.ConfigurableApplicationContext ) ) ; assertThat ( boolean ( org.springframework.boot.admin.SpringApplicationAdminMXBeanRegistrar ) ) . isTrue ( ) ; }  <METHOD_END>
<METHOD_START> private boolean boolean ( SpringApplicationAdminMXBeanRegistrar org.springframework.boot.admin.SpringApplicationAdminMXBeanRegistrar ) { return ( java.lang.Boolean ) ReflectionTestUtils . getField ( org.springframework.boot.admin.SpringApplicationAdminMXBeanRegistrar , STRING ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { final javax.management.ObjectName javax.management.ObjectName = javax.management.ObjectName ( java.lang.String ) ; SpringApplication org.springframework.boot.admin.SpringApplication = new SpringApplication ( org.springframework.boot.admin.SpringApplicationAdminMXBeanRegistrarTests.Config .class ) ; org.springframework.boot.admin.SpringApplication . setWebApplicationType ( WebApplicationType . NONE ) ; this . org.springframework.boot.admin.ConfigurableApplicationContext = org.springframework.boot.admin.SpringApplication . run ( STRING ) ; assertThat ( java.lang.Boolean ( javax.management.ObjectName ) ) . isTrue ( ) ; assertThat ( java.lang.Boolean ( javax.management.ObjectName ) ) . isFalse ( ) ; assertThat ( java.lang.String ( javax.management.ObjectName , STRING ) ) . isEqualTo ( STRING ) ; assertThat ( java.lang.String ( javax.management.ObjectName , STRING ) ) . isNull ( ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) javax.management.InstanceNotFoundException { final javax.management.ObjectName javax.management.ObjectName = javax.management.ObjectName ( java.lang.String ) ; SpringApplication org.springframework.boot.admin.SpringApplication = new SpringApplication ( org.springframework.boot.admin.SpringApplicationAdminMXBeanRegistrarTests.Config .class ) ; org.springframework.boot.admin.SpringApplication . setWebApplicationType ( WebApplicationType . NONE ) ; this . org.springframework.boot.admin.ConfigurableApplicationContext = org.springframework.boot.admin.SpringApplication . run ( ) ; assertThat ( this . org.springframework.boot.admin.ConfigurableApplicationContext . isRunning ( ) ) . isTrue ( ) ; void ( javax.management.ObjectName ) ; assertThat ( this . org.springframework.boot.admin.ConfigurableApplicationContext . isRunning ( ) ) . isFalse ( ) ; this . org.springframework.boot.admin.ExpectedException . expect ( javax.management.InstanceNotFoundException .class ) ; this . javax.management.MBeanServer . javax.management.ObjectInstance ( javax.management.ObjectName ) ; }  <METHOD_END>
<METHOD_START> private java.lang.Boolean java.lang.Boolean ( javax.management.ObjectName javax.management.ObjectName ) { return java.lang.Boolean ( javax.management.ObjectName , java.lang.Boolean .class , STRING ) ; }  <METHOD_END>
<METHOD_START> private java.lang.Boolean java.lang.Boolean ( javax.management.ObjectName javax.management.ObjectName ) { return java.lang.Boolean ( javax.management.ObjectName , java.lang.Boolean .class , STRING ) ; }  <METHOD_END>
<METHOD_START> private java.lang.String java.lang.String ( javax.management.ObjectName javax.management.ObjectName , java.lang.String java.lang.String ) { try { return ( java.lang.String ) this . javax.management.MBeanServer . java.lang.Object ( javax.management.ObjectName , STRING , new java.lang.Object [] { java.lang.String } , new java.lang.String [] { java.lang.String .class . java.lang.String ( ) } ) ; } catch ( java.lang.Exception java.lang.Exception ) { throw new java.lang.IllegalStateException ( java.lang.Exception . java.lang.String ( ) , java.lang.Exception ) ; } }  <METHOD_END>
<METHOD_START> private < T > T T ( javax.management.ObjectName javax.management.ObjectName , java.lang.Class<T> < T > java.lang.Class<T> , java.lang.String java.lang.String ) { try { java.lang.Object java.lang.Object = this . javax.management.MBeanServer . java.lang.Object ( javax.management.ObjectName , java.lang.String ) ; assertThat ( java.lang.Object == null || java.lang.Class<T> . boolean ( java.lang.Object ) ) . isTrue ( ) ; return java.lang.Class<T> . T ( java.lang.Object ) ; } catch ( java.lang.Exception java.lang.Exception ) { throw new java.lang.IllegalStateException ( java.lang.Exception . java.lang.String ( ) , java.lang.Exception ) ; } }  <METHOD_END>
<METHOD_START> private void void ( javax.management.ObjectName javax.management.ObjectName ) { try { this . javax.management.MBeanServer . java.lang.Object ( javax.management.ObjectName , STRING , null , null ) ; } catch ( java.lang.Exception java.lang.Exception ) { throw new java.lang.IllegalStateException ( java.lang.Exception . java.lang.String ( ) , java.lang.Exception ) ; } }  <METHOD_END>
<METHOD_START> private javax.management.ObjectName javax.management.ObjectName ( java.lang.String java.lang.String ) { try { return new javax.management.ObjectName ( java.lang.String ) ; } catch ( javax.management.MalformedObjectNameException javax.management.MalformedObjectNameException ) { throw new java.lang.IllegalStateException ( STRING + java.lang.String , javax.management.MalformedObjectNameException ) ; } }  <METHOD_END>
<METHOD_START> @ Bean public org.springframework.boot.admin.SpringApplicationAdminMXBeanRegistrar org.springframework.boot.admin.SpringApplicationAdminMXBeanRegistrar ( ) javax.management.MalformedObjectNameException { return new SpringApplicationAdminMXBeanRegistrar ( java.lang.String ) ; }  <METHOD_END>