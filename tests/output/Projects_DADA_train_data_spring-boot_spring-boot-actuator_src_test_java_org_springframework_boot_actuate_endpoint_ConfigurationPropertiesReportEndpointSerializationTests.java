<METHOD_START> @ Before public void void ( ) { this . org.springframework.boot.actuate.endpoint.AnnotationConfigApplicationContext = new AnnotationConfigApplicationContext ( ) ; }  <METHOD_END>
<METHOD_START> @ After public void void ( ) { if ( this . org.springframework.boot.actuate.endpoint.AnnotationConfigApplicationContext != null ) { this . org.springframework.boot.actuate.endpoint.AnnotationConfigApplicationContext . close ( ) ; } }  <METHOD_END>
<METHOD_START> @ Test @ java.lang.SuppressWarnings ( STRING ) public void void ( ) java.lang.Exception { this . org.springframework.boot.actuate.endpoint.AnnotationConfigApplicationContext . register ( org.springframework.boot.actuate.endpoint.ConfigurationPropertiesReportEndpointSerializationTests.FooConfig .class ) ; EnvironmentTestUtils . addEnvironment ( this . org.springframework.boot.actuate.endpoint.AnnotationConfigApplicationContext , STRING ) ; this . org.springframework.boot.actuate.endpoint.AnnotationConfigApplicationContext . refresh ( ) ; ConfigurationPropertiesReportEndpoint org.springframework.boot.actuate.endpoint.ConfigurationPropertiesReportEndpoint = this . org.springframework.boot.actuate.endpoint.AnnotationConfigApplicationContext . getBean ( ConfigurationPropertiesReportEndpoint .class ) ; java.util.Map<java.lang.String,java.lang.Object> < java.lang.String , java.lang.Object > java.util.Map<java.lang.String,java.lang.Object> = org.springframework.boot.actuate.endpoint.ConfigurationPropertiesReportEndpoint . invoke ( ) ; java.util.Map<java.lang.String,java.lang.Object> < java.lang.String , java.lang.Object > java.util.Map<java.lang.String,java.lang.Object> = ( java.util.Map<java.lang.String,java.lang.Object> < java.lang.String , java.lang.Object > ) java.util.Map<java.lang.String,java.lang.Object> . java.lang.Object ( STRING ) ; assertThat ( java.util.Map<java.lang.String,java.lang.Object> ) . isNotNull ( ) ; assertThat ( java.util.Map<java.lang.String,java.lang.Object> . java.lang.Object ( STRING ) ) . isEqualTo ( STRING ) ; java.util.Map<java.lang.String,java.lang.Object> < java.lang.String , java.lang.Object > java.util.Map<java.lang.String,java.lang.Object> = ( java.util.Map<java.lang.String,java.lang.Object> < java.lang.String , java.lang.Object > ) java.util.Map<java.lang.String,java.lang.Object> . java.lang.Object ( STRING ) ; assertThat ( java.util.Map<java.lang.String,java.lang.Object> ) . isNotNull ( ) ; assertThat ( java.util.Map<java.lang.String,java.lang.Object> ) . hasSize ( NUMBER ) ; assertThat ( java.util.Map<java.lang.String,java.lang.Object> . java.lang.Object ( STRING ) ) . isEqualTo ( STRING ) ; }  <METHOD_END>
<METHOD_START> @ Test @ java.lang.SuppressWarnings ( STRING ) public void void ( ) java.lang.Exception { this . org.springframework.boot.actuate.endpoint.AnnotationConfigApplicationContext . register ( org.springframework.boot.actuate.endpoint.ConfigurationPropertiesReportEndpointSerializationTests.FooConfig .class ) ; EnvironmentTestUtils . addEnvironment ( this . org.springframework.boot.actuate.endpoint.AnnotationConfigApplicationContext , STRING ) ; this . org.springframework.boot.actuate.endpoint.AnnotationConfigApplicationContext . refresh ( ) ; ConfigurationPropertiesReportEndpoint org.springframework.boot.actuate.endpoint.ConfigurationPropertiesReportEndpoint = this . org.springframework.boot.actuate.endpoint.AnnotationConfigApplicationContext . getBean ( ConfigurationPropertiesReportEndpoint .class ) ; java.util.Map<java.lang.String,java.lang.Object> < java.lang.String , java.lang.Object > java.util.Map<java.lang.String,java.lang.Object> = org.springframework.boot.actuate.endpoint.ConfigurationPropertiesReportEndpoint . invoke ( ) ; java.util.Map<java.lang.String,java.lang.Object> < java.lang.String , java.lang.Object > java.util.Map<java.lang.String,java.lang.Object> = ( java.util.Map<java.lang.String,java.lang.Object> < java.lang.String , java.lang.Object > ) java.util.Map<java.lang.String,java.lang.Object> . java.lang.Object ( STRING ) ; assertThat ( java.util.Map<java.lang.String,java.lang.Object> ) . isNotNull ( ) ; java.util.Map<java.lang.String,java.lang.Object> < java.lang.String , java.lang.Object > java.util.Map<java.lang.String,java.lang.Object> = ( java.util.Map<java.lang.String,java.lang.Object> < java.lang.String , java.lang.Object > ) java.util.Map<java.lang.String,java.lang.Object> . java.lang.Object ( STRING ) ; assertThat ( java.util.Map<java.lang.String,java.lang.Object> ) . isNotNull ( ) ; assertThat ( java.util.Map<java.lang.String,java.lang.Object> ) . hasSize ( NUMBER ) ; assertThat ( ( ( java.util.Map<java.lang.String,java.lang.Object> < java.lang.String , java.lang.Object > ) java.util.Map<java.lang.String,java.lang.Object> . java.lang.Object ( STRING ) ) . java.lang.Object ( STRING ) ) . isEqualTo ( STRING ) ; }  <METHOD_END>
<METHOD_START> @ Test @ java.lang.SuppressWarnings ( STRING ) public void void ( ) java.lang.Exception { this . org.springframework.boot.actuate.endpoint.AnnotationConfigApplicationContext . register ( org.springframework.boot.actuate.endpoint.ConfigurationPropertiesReportEndpointSerializationTests.CycleConfig .class ) ; EnvironmentTestUtils . addEnvironment ( this . org.springframework.boot.actuate.endpoint.AnnotationConfigApplicationContext , STRING ) ; this . org.springframework.boot.actuate.endpoint.AnnotationConfigApplicationContext . refresh ( ) ; ConfigurationPropertiesReportEndpoint org.springframework.boot.actuate.endpoint.ConfigurationPropertiesReportEndpoint = this . org.springframework.boot.actuate.endpoint.AnnotationConfigApplicationContext . getBean ( ConfigurationPropertiesReportEndpoint .class ) ; java.util.Map<java.lang.String,java.lang.Object> < java.lang.String , java.lang.Object > java.util.Map<java.lang.String,java.lang.Object> = org.springframework.boot.actuate.endpoint.ConfigurationPropertiesReportEndpoint . invoke ( ) ; java.util.Map<java.lang.String,java.lang.Object> < java.lang.String , java.lang.Object > java.util.Map<java.lang.String,java.lang.Object> = ( java.util.Map<java.lang.String,java.lang.Object> < java.lang.String , java.lang.Object > ) java.util.Map<java.lang.String,java.lang.Object> . java.lang.Object ( STRING ) ; assertThat ( java.util.Map<java.lang.String,java.lang.Object> ) . isNotNull ( ) ; assertThat ( java.util.Map<java.lang.String,java.lang.Object> . java.lang.Object ( STRING ) ) . isEqualTo ( STRING ) ; java.util.Map<java.lang.String,java.lang.Object> < java.lang.String , java.lang.Object > java.util.Map<java.lang.String,java.lang.Object> = ( java.util.Map<java.lang.String,java.lang.Object> < java.lang.String , java.lang.Object > ) java.util.Map<java.lang.String,java.lang.Object> . java.lang.Object ( STRING ) ; assertThat ( java.util.Map<java.lang.String,java.lang.Object> ) . isNotNull ( ) ; assertThat ( java.util.Map<java.lang.String,java.lang.Object> ) . hasSize ( NUMBER ) ; assertThat ( java.util.Map<java.lang.String,java.lang.Object> . java.lang.Object ( STRING ) ) . isEqualTo ( STRING ) ; }  <METHOD_END>
<METHOD_START> @ Test @ java.lang.SuppressWarnings ( STRING ) public void void ( ) java.lang.Exception { this . org.springframework.boot.actuate.endpoint.AnnotationConfigApplicationContext . register ( org.springframework.boot.actuate.endpoint.ConfigurationPropertiesReportEndpointSerializationTests.MapConfig .class ) ; EnvironmentTestUtils . addEnvironment ( this . org.springframework.boot.actuate.endpoint.AnnotationConfigApplicationContext , STRING ) ; this . org.springframework.boot.actuate.endpoint.AnnotationConfigApplicationContext . refresh ( ) ; ConfigurationPropertiesReportEndpoint org.springframework.boot.actuate.endpoint.ConfigurationPropertiesReportEndpoint = this . org.springframework.boot.actuate.endpoint.AnnotationConfigApplicationContext . getBean ( ConfigurationPropertiesReportEndpoint .class ) ; java.util.Map<java.lang.String,java.lang.Object> < java.lang.String , java.lang.Object > java.util.Map<java.lang.String,java.lang.Object> = org.springframework.boot.actuate.endpoint.ConfigurationPropertiesReportEndpoint . invoke ( ) ; java.util.Map<java.lang.String,java.lang.Object> < java.lang.String , java.lang.Object > java.util.Map<java.lang.String,java.lang.Object> = ( java.util.Map<java.lang.String,java.lang.Object> < java.lang.String , java.lang.Object > ) java.util.Map<java.lang.String,java.lang.Object> . java.lang.Object ( STRING ) ; assertThat ( java.util.Map<java.lang.String,java.lang.Object> ) . isNotNull ( ) ; assertThat ( java.util.Map<java.lang.String,java.lang.Object> . java.lang.Object ( STRING ) ) . isEqualTo ( STRING ) ; java.util.Map<java.lang.String,java.lang.Object> < java.lang.String , java.lang.Object > java.util.Map<java.lang.String,java.lang.Object> = ( java.util.Map<java.lang.String,java.lang.Object> < java.lang.String , java.lang.Object > ) java.util.Map<java.lang.String,java.lang.Object> . java.lang.Object ( STRING ) ; assertThat ( java.util.Map<java.lang.String,java.lang.Object> ) . isNotNull ( ) ; assertThat ( java.util.Map<java.lang.String,java.lang.Object> ) . hasSize ( NUMBER ) ; assertThat ( ( ( java.util.Map<java.lang.String,java.lang.Object> < java.lang.String , java.lang.Object > ) java.util.Map<java.lang.String,java.lang.Object> . java.lang.Object ( STRING ) ) . java.lang.Object ( STRING ) ) . isEqualTo ( STRING ) ; }  <METHOD_END>
<METHOD_START> @ Test @ java.lang.SuppressWarnings ( STRING ) public void void ( ) java.lang.Exception { this . org.springframework.boot.actuate.endpoint.AnnotationConfigApplicationContext . register ( org.springframework.boot.actuate.endpoint.ConfigurationPropertiesReportEndpointSerializationTests.MapConfig .class ) ; this . org.springframework.boot.actuate.endpoint.AnnotationConfigApplicationContext . refresh ( ) ; ConfigurationPropertiesReportEndpoint org.springframework.boot.actuate.endpoint.ConfigurationPropertiesReportEndpoint = this . org.springframework.boot.actuate.endpoint.AnnotationConfigApplicationContext . getBean ( ConfigurationPropertiesReportEndpoint .class ) ; java.util.Map<java.lang.String,java.lang.Object> < java.lang.String , java.lang.Object > java.util.Map<java.lang.String,java.lang.Object> = org.springframework.boot.actuate.endpoint.ConfigurationPropertiesReportEndpoint . invoke ( ) ; java.util.Map<java.lang.String,java.lang.Object> < java.lang.String , java.lang.Object > java.util.Map<java.lang.String,java.lang.Object> = ( java.util.Map<java.lang.String,java.lang.Object> < java.lang.String , java.lang.Object > ) java.util.Map<java.lang.String,java.lang.Object> . java.lang.Object ( STRING ) ; assertThat ( java.util.Map<java.lang.String,java.lang.Object> ) . isNotNull ( ) ; java.lang.System . java.io.PrintStream . void ( java.util.Map<java.lang.String,java.lang.Object> ) ; assertThat ( java.util.Map<java.lang.String,java.lang.Object> . java.lang.Object ( STRING ) ) . isEqualTo ( STRING ) ; java.util.Map<java.lang.String,java.lang.Object> < java.lang.String , java.lang.Object > java.util.Map<java.lang.String,java.lang.Object> = ( java.util.Map<java.lang.String,java.lang.Object> < java.lang.String , java.lang.Object > ) java.util.Map<java.lang.String,java.lang.Object> . java.lang.Object ( STRING ) ; assertThat ( java.util.Map<java.lang.String,java.lang.Object> ) . isNotNull ( ) ; assertThat ( java.util.Map<java.lang.String,java.lang.Object> ) . hasSize ( NUMBER ) ; assertThat ( java.util.Map<java.lang.String,java.lang.Object> ) . doesNotContainKey ( STRING ) ; }  <METHOD_END>
<METHOD_START> @ Test @ java.lang.SuppressWarnings ( STRING ) public void void ( ) java.lang.Exception { this . org.springframework.boot.actuate.endpoint.AnnotationConfigApplicationContext . register ( org.springframework.boot.actuate.endpoint.ConfigurationPropertiesReportEndpointSerializationTests.ListConfig .class ) ; EnvironmentTestUtils . addEnvironment ( this . org.springframework.boot.actuate.endpoint.AnnotationConfigApplicationContext , STRING ) ; this . org.springframework.boot.actuate.endpoint.AnnotationConfigApplicationContext . refresh ( ) ; ConfigurationPropertiesReportEndpoint org.springframework.boot.actuate.endpoint.ConfigurationPropertiesReportEndpoint = this . org.springframework.boot.actuate.endpoint.AnnotationConfigApplicationContext . getBean ( ConfigurationPropertiesReportEndpoint .class ) ; java.util.Map<java.lang.String,java.lang.Object> < java.lang.String , java.lang.Object > java.util.Map<java.lang.String,java.lang.Object> = org.springframework.boot.actuate.endpoint.ConfigurationPropertiesReportEndpoint . invoke ( ) ; java.util.Map<java.lang.String,java.lang.Object> < java.lang.String , java.lang.Object > java.util.Map<java.lang.String,java.lang.Object> = ( java.util.Map<java.lang.String,java.lang.Object> < java.lang.String , java.lang.Object > ) java.util.Map<java.lang.String,java.lang.Object> . java.lang.Object ( STRING ) ; assertThat ( java.util.Map<java.lang.String,java.lang.Object> ) . isNotNull ( ) ; assertThat ( java.util.Map<java.lang.String,java.lang.Object> . java.lang.Object ( STRING ) ) . isEqualTo ( STRING ) ; java.util.Map<java.lang.String,java.lang.Object> < java.lang.String , java.lang.Object > java.util.Map<java.lang.String,java.lang.Object> = ( java.util.Map<java.lang.String,java.lang.Object> < java.lang.String , java.lang.Object > ) java.util.Map<java.lang.String,java.lang.Object> . java.lang.Object ( STRING ) ; assertThat ( java.util.Map<java.lang.String,java.lang.Object> ) . isNotNull ( ) ; assertThat ( java.util.Map<java.lang.String,java.lang.Object> ) . hasSize ( NUMBER ) ; assertThat ( ( ( java.util.List<java.lang.String> < java.lang.String > ) java.util.Map<java.lang.String,java.lang.Object> . java.lang.Object ( STRING ) ) . java.lang.String ( NUMBER ) ) . isEqualTo ( STRING ) ; }  <METHOD_END>
<METHOD_START> @ Test @ java.lang.SuppressWarnings ( STRING ) public void void ( ) java.lang.Exception { this . org.springframework.boot.actuate.endpoint.AnnotationConfigApplicationContext . register ( org.springframework.boot.actuate.endpoint.ConfigurationPropertiesReportEndpointSerializationTests.AddressedConfig .class ) ; EnvironmentTestUtils . addEnvironment ( this . org.springframework.boot.actuate.endpoint.AnnotationConfigApplicationContext , STRING ) ; this . org.springframework.boot.actuate.endpoint.AnnotationConfigApplicationContext . refresh ( ) ; ConfigurationPropertiesReportEndpoint org.springframework.boot.actuate.endpoint.ConfigurationPropertiesReportEndpoint = this . org.springframework.boot.actuate.endpoint.AnnotationConfigApplicationContext . getBean ( ConfigurationPropertiesReportEndpoint .class ) ; java.util.Map<java.lang.String,java.lang.Object> < java.lang.String , java.lang.Object > java.util.Map<java.lang.String,java.lang.Object> = org.springframework.boot.actuate.endpoint.ConfigurationPropertiesReportEndpoint . invoke ( ) ; java.util.Map<java.lang.String,java.lang.Object> < java.lang.String , java.lang.Object > java.util.Map<java.lang.String,java.lang.Object> = ( java.util.Map<java.lang.String,java.lang.Object> < java.lang.String , java.lang.Object > ) java.util.Map<java.lang.String,java.lang.Object> . java.lang.Object ( STRING ) ; assertThat ( java.util.Map<java.lang.String,java.lang.Object> ) . isNotNull ( ) ; java.lang.System . java.io.PrintStream . void ( java.util.Map<java.lang.String,java.lang.Object> ) ; assertThat ( java.util.Map<java.lang.String,java.lang.Object> . java.lang.Object ( STRING ) ) . isEqualTo ( STRING ) ; java.util.Map<java.lang.String,java.lang.Object> < java.lang.String , java.lang.Object > java.util.Map<java.lang.String,java.lang.Object> = ( java.util.Map<java.lang.String,java.lang.Object> < java.lang.String , java.lang.Object > ) java.util.Map<java.lang.String,java.lang.Object> . java.lang.Object ( STRING ) ; assertThat ( java.util.Map<java.lang.String,java.lang.Object> ) . isNotNull ( ) ; assertThat ( java.util.Map<java.lang.String,java.lang.Object> ) . hasSize ( NUMBER ) ; assertThat ( java.util.Map<java.lang.String,java.lang.Object> . java.lang.Object ( STRING ) ) . isEqualTo ( STRING ) ; }  <METHOD_END>
<METHOD_START> @ Bean public org.springframework.boot.actuate.endpoint.ConfigurationPropertiesReportEndpoint org.springframework.boot.actuate.endpoint.ConfigurationPropertiesReportEndpoint ( ) { return new ConfigurationPropertiesReportEndpoint ( ) ; }  <METHOD_END>
<METHOD_START> @ Bean @ ConfigurationProperties ( prefix = STRING ) public org.springframework.boot.actuate.endpoint.ConfigurationPropertiesReportEndpointSerializationTests.Foo org.springframework.boot.actuate.endpoint.ConfigurationPropertiesReportEndpointSerializationTests.Foo ( ) { return new org.springframework.boot.actuate.endpoint.ConfigurationPropertiesReportEndpointSerializationTests.Foo ( ) ; }  <METHOD_END>
<METHOD_START> @ Bean @ ConfigurationProperties ( prefix = STRING ) public org.springframework.boot.actuate.endpoint.ConfigurationPropertiesReportEndpointSerializationTests.Cycle org.springframework.boot.actuate.endpoint.ConfigurationPropertiesReportEndpointSerializationTests.Cycle ( ) { return new org.springframework.boot.actuate.endpoint.ConfigurationPropertiesReportEndpointSerializationTests.Cycle ( ) ; }  <METHOD_END>
<METHOD_START> @ Bean @ ConfigurationProperties ( prefix = STRING ) public org.springframework.boot.actuate.endpoint.ConfigurationPropertiesReportEndpointSerializationTests.Cycle org.springframework.boot.actuate.endpoint.ConfigurationPropertiesReportEndpointSerializationTests.Cycle ( ) { return new org.springframework.boot.actuate.endpoint.ConfigurationPropertiesReportEndpointSerializationTests.Cycle ( ) ; }  <METHOD_END>
<METHOD_START> @ Bean @ ConfigurationProperties ( prefix = STRING ) public org.springframework.boot.actuate.endpoint.ConfigurationPropertiesReportEndpointSerializationTests.MapHolder org.springframework.boot.actuate.endpoint.ConfigurationPropertiesReportEndpointSerializationTests.MapHolder ( ) { return new org.springframework.boot.actuate.endpoint.ConfigurationPropertiesReportEndpointSerializationTests.MapHolder ( ) ; }  <METHOD_END>
<METHOD_START> @ Bean @ ConfigurationProperties ( prefix = STRING ) public org.springframework.boot.actuate.endpoint.ConfigurationPropertiesReportEndpointSerializationTests.ListHolder org.springframework.boot.actuate.endpoint.ConfigurationPropertiesReportEndpointSerializationTests.ListHolder ( ) { return new org.springframework.boot.actuate.endpoint.ConfigurationPropertiesReportEndpointSerializationTests.ListHolder ( ) ; }  <METHOD_END>
<METHOD_START> @ Bean @ ConfigurationProperties ( prefix = STRING ) public org.springframework.boot.actuate.endpoint.ConfigurationPropertiesReportEndpointSerializationTests.MapHolder org.springframework.boot.actuate.endpoint.ConfigurationPropertiesReportEndpointSerializationTests.MapHolder ( ) { return new org.springframework.boot.actuate.endpoint.ConfigurationPropertiesReportEndpointSerializationTests.MapHolder ( ) ; }  <METHOD_END>
<METHOD_START> @ Bean @ ConfigurationProperties ( prefix = STRING ) public org.springframework.boot.actuate.endpoint.ConfigurationPropertiesReportEndpointSerializationTests.Addressed org.springframework.boot.actuate.endpoint.ConfigurationPropertiesReportEndpointSerializationTests.Addressed ( ) { return new org.springframework.boot.actuate.endpoint.ConfigurationPropertiesReportEndpointSerializationTests.Addressed ( ) ; }  <METHOD_END>
<METHOD_START> public org.springframework.boot.actuate.endpoint.ConfigurationPropertiesReportEndpointSerializationTests.Foo.Bar org.springframework.boot.actuate.endpoint.ConfigurationPropertiesReportEndpointSerializationTests.Foo.Bar ( ) { return this . org.springframework.boot.actuate.endpoint.ConfigurationPropertiesReportEndpointSerializationTests.Foo.Bar ; }  <METHOD_END>
<METHOD_START> public void void ( org.springframework.boot.actuate.endpoint.ConfigurationPropertiesReportEndpointSerializationTests.Foo.Bar org.springframework.boot.actuate.endpoint.ConfigurationPropertiesReportEndpointSerializationTests.Foo.Bar ) { this . org.springframework.boot.actuate.endpoint.ConfigurationPropertiesReportEndpointSerializationTests.Foo.Bar = org.springframework.boot.actuate.endpoint.ConfigurationPropertiesReportEndpointSerializationTests.Foo.Bar ; }  <METHOD_END>
<METHOD_START> public java.lang.String java.lang.String ( ) { return this . java.lang.String ; }  <METHOD_END>
<METHOD_START> public void void ( java.lang.String java.lang.String ) { this . java.lang.String = java.lang.String ; }  <METHOD_END>
<METHOD_START> public java.lang.String java.lang.String ( ) { return STRING + this . java.lang.String ; }  <METHOD_END>
<METHOD_START> public java.lang.String java.lang.String ( ) { return this . java.lang.String ; }  <METHOD_END>
<METHOD_START> public void void ( java.lang.String java.lang.String ) { this . java.lang.String = java.lang.String ; }  <METHOD_END>
<METHOD_START> public void ( ) { this . org.springframework.boot.actuate.endpoint.ConfigurationPropertiesReportEndpointSerializationTests.Foo = this ; }  <METHOD_END>
<METHOD_START> public org.springframework.boot.actuate.endpoint.ConfigurationPropertiesReportEndpointSerializationTests.Foo org.springframework.boot.actuate.endpoint.ConfigurationPropertiesReportEndpointSerializationTests.Foo ( ) { return this . org.springframework.boot.actuate.endpoint.ConfigurationPropertiesReportEndpointSerializationTests.Foo ; }  <METHOD_END>
<METHOD_START> public void void ( org.springframework.boot.actuate.endpoint.ConfigurationPropertiesReportEndpointSerializationTests.Foo org.springframework.boot.actuate.endpoint.ConfigurationPropertiesReportEndpointSerializationTests.Foo ) { this . org.springframework.boot.actuate.endpoint.ConfigurationPropertiesReportEndpointSerializationTests.Foo = org.springframework.boot.actuate.endpoint.ConfigurationPropertiesReportEndpointSerializationTests.Foo ; }  <METHOD_END>
<METHOD_START> public java.util.Map<java.lang.String,java.lang.Object> < java.lang.String , java.lang.Object > java.util.Map<java.lang.String,java.lang.Object> ( ) { return this . java.util.Map<java.lang.String,java.lang.Object> ; }  <METHOD_END>
<METHOD_START> public void void ( java.util.Map<java.lang.String,java.lang.Object> < java.lang.String , java.lang.Object > java.util.Map<java.lang.String,java.lang.Object> ) { this . java.util.Map<java.lang.String,java.lang.Object> = java.util.Map<java.lang.String,java.lang.Object> ; }  <METHOD_END>
<METHOD_START> public java.util.List<java.lang.String> < java.lang.String > java.util.List<java.lang.String> ( ) { return this . java.util.List<java.lang.String> ; }  <METHOD_END>
<METHOD_START> public void void ( java.util.List<java.lang.String> < java.lang.String > java.util.List<java.lang.String> ) { this . java.util.List<java.lang.String> = java.util.List<java.lang.String> ; }  <METHOD_END>
<METHOD_START> public java.net.InetAddress java.net.InetAddress ( ) { return this . java.net.InetAddress ; }  <METHOD_END>
<METHOD_START> public void void ( java.net.InetAddress java.net.InetAddress ) { this . java.net.InetAddress = java.net.InetAddress ; }  <METHOD_END>
