<METHOD_START> @ Test ( expected = java.lang.IllegalArgumentException .class ) public void void ( ) { org.springframework.data.projection.ProjectionFactory . createProjection ( null ) ; }  <METHOD_END>
<METHOD_START> @ Test ( expected = java.lang.IllegalArgumentException .class ) public void void ( ) { org.springframework.data.projection.ProjectionFactory . createProjection ( null , new java.lang.Object ( ) ) ; }  <METHOD_END>
<METHOD_START> @ Test ( expected = java.lang.IllegalArgumentException .class ) public void void ( ) { org.springframework.data.projection.ProjectionFactory . getInputProperties ( null ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { assertThat ( org.springframework.data.projection.ProjectionFactory . createProjection ( org.springframework.data.projection.ProxyProjectionFactoryUnitTests.CustomerExcerpt .class , null ) ) . isNull ( ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { org.springframework.data.projection.ProxyProjectionFactoryUnitTests.Customer org.springframework.data.projection.ProxyProjectionFactoryUnitTests.Customer = new org.springframework.data.projection.ProxyProjectionFactoryUnitTests.Customer ( ) ; org.springframework.data.projection.ProxyProjectionFactoryUnitTests.Customer . java.lang.String = STRING ; org.springframework.data.projection.ProxyProjectionFactoryUnitTests.Customer . java.lang.String = STRING ; org.springframework.data.projection.ProxyProjectionFactoryUnitTests.Customer . org.springframework.data.projection.ProxyProjectionFactoryUnitTests.Address = new org.springframework.data.projection.ProxyProjectionFactoryUnitTests.Address ( ) ; org.springframework.data.projection.ProxyProjectionFactoryUnitTests.Customer . org.springframework.data.projection.ProxyProjectionFactoryUnitTests.Address . java.lang.String = STRING ; org.springframework.data.projection.ProxyProjectionFactoryUnitTests.Customer . org.springframework.data.projection.ProxyProjectionFactoryUnitTests.Address . java.lang.String = STRING ; org.springframework.data.projection.ProxyProjectionFactoryUnitTests.CustomerExcerpt org.springframework.data.projection.ProxyProjectionFactoryUnitTests.CustomerExcerpt = org.springframework.data.projection.ProjectionFactory . createProjection ( org.springframework.data.projection.ProxyProjectionFactoryUnitTests.CustomerExcerpt .class , org.springframework.data.projection.ProxyProjectionFactoryUnitTests.Customer ) ; assertThat ( org.springframework.data.projection.ProxyProjectionFactoryUnitTests.CustomerExcerpt . java.lang.String ( ) ) . isEqualTo ( STRING ) ; assertThat ( org.springframework.data.projection.ProxyProjectionFactoryUnitTests.CustomerExcerpt . org.springframework.data.projection.ProxyProjectionFactoryUnitTests.AddressExcerpt ( ) . java.lang.String ( ) ) . isEqualTo ( STRING ) ; }  <METHOD_END>
<METHOD_START> @ Test @ java.lang.SuppressWarnings ( STRING ) public void void ( ) { org.springframework.data.projection.ProxyProjectionFactoryUnitTests.CustomerExcerpt org.springframework.data.projection.ProxyProjectionFactoryUnitTests.CustomerExcerpt = org.springframework.data.projection.ProjectionFactory . createProjection ( org.springframework.data.projection.ProxyProjectionFactoryUnitTests.CustomerExcerpt .class ) ; assertThat ( org.springframework.data.projection.ProxyProjectionFactoryUnitTests.CustomerExcerpt ) . isInstanceOf ( TargetClassAware .class ) ; assertThat ( ( ( TargetClassAware ) org.springframework.data.projection.ProxyProjectionFactoryUnitTests.CustomerExcerpt ) . getTargetClass ( ) ) . isEqualTo ( java.util.HashMap .class ) ; }  <METHOD_END>
<METHOD_START> @ Test ( expected = java.lang.IllegalArgumentException .class ) public void void ( ) { org.springframework.data.projection.ProjectionFactory . createProjection ( java.lang.Object .class , new java.lang.Object ( ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { java.util.HashMap<java.lang.String,java.lang.Object> < java.lang.String , java.lang.Object > java.util.HashMap<java.lang.String,java.lang.Object> = new java.util.HashMap<java.lang.String,java.lang.Object> <> ( ) ; java.util.HashMap<java.lang.String,java.lang.Object> . java.lang.Object ( STRING , STRING ) ; java.util.HashMap<java.lang.String,java.lang.Object> . java.lang.Object ( STRING , STRING ) ; java.util.Map<java.lang.String,java.lang.Object> < java.lang.String , java.lang.Object > java.util.Map<java.lang.String,java.lang.Object> = new java.util.HashMap<java.lang.String,java.lang.Object> <> ( ) ; java.util.Map<java.lang.String,java.lang.Object> . java.lang.Object ( STRING , STRING ) ; java.util.Map<java.lang.String,java.lang.Object> . java.lang.Object ( STRING , STRING ) ; java.util.Map<java.lang.String,java.lang.Object> . java.lang.Object ( STRING , java.util.HashMap<java.lang.String,java.lang.Object> ) ; org.springframework.data.projection.ProxyProjectionFactoryUnitTests.CustomerExcerpt org.springframework.data.projection.ProxyProjectionFactoryUnitTests.CustomerExcerpt = org.springframework.data.projection.ProjectionFactory . createProjection ( org.springframework.data.projection.ProxyProjectionFactoryUnitTests.CustomerExcerpt .class , java.util.Map<java.lang.String,java.lang.Object> ) ; assertThat ( org.springframework.data.projection.ProxyProjectionFactoryUnitTests.CustomerExcerpt . java.lang.String ( ) ) . isEqualTo ( STRING ) ; org.springframework.data.projection.ProxyProjectionFactoryUnitTests.AddressExcerpt org.springframework.data.projection.ProxyProjectionFactoryUnitTests.AddressExcerpt = org.springframework.data.projection.ProxyProjectionFactoryUnitTests.CustomerExcerpt . org.springframework.data.projection.ProxyProjectionFactoryUnitTests.AddressExcerpt ( ) ; assertThat ( org.springframework.data.projection.ProxyProjectionFactoryUnitTests.AddressExcerpt ) . isNotNull ( ) ; assertThat ( org.springframework.data.projection.ProxyProjectionFactoryUnitTests.AddressExcerpt . java.lang.String ( ) ) . isEqualTo ( STRING ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { org.springframework.data.projection.ProxyProjectionFactoryUnitTests.CustomerProxy org.springframework.data.projection.ProxyProjectionFactoryUnitTests.CustomerProxy = org.springframework.data.projection.ProjectionFactory . createProjection ( org.springframework.data.projection.ProxyProjectionFactoryUnitTests.CustomerProxy .class ) ; assertThat ( org.springframework.data.projection.ProxyProjectionFactoryUnitTests.CustomerProxy ) . isNotNull ( ) ; org.springframework.data.projection.ProxyProjectionFactoryUnitTests.CustomerProxy . void ( STRING ) ; assertThat ( org.springframework.data.projection.ProxyProjectionFactoryUnitTests.CustomerProxy . java.lang.String ( ) ) . isEqualTo ( STRING ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { ProjectionInformation org.springframework.data.projection.ProjectionInformation = org.springframework.data.projection.ProjectionFactory . getProjectionInformation ( org.springframework.data.projection.ProxyProjectionFactoryUnitTests.CustomerExcerpt .class ) ; java.util.List<java.beans.PropertyDescriptor> < java.beans.PropertyDescriptor > java.util.List<java.beans.PropertyDescriptor> = org.springframework.data.projection.ProjectionInformation . getInputProperties ( ) ; assertThat ( java.util.List<java.beans.PropertyDescriptor> ) . hasSize ( NUMBER ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { org.springframework.data.projection.ProxyProjectionFactoryUnitTests.CustomerExcerpt org.springframework.data.projection.ProxyProjectionFactoryUnitTests.CustomerExcerpt = org.springframework.data.projection.ProjectionFactory . createProjection ( org.springframework.data.projection.ProxyProjectionFactoryUnitTests.CustomerExcerpt .class ) ; Advised org.springframework.data.projection.Advised = ( Advised ) ReflectionTestUtils . getField ( java.lang.reflect.Proxy . java.lang.reflect.InvocationHandler ( org.springframework.data.projection.ProxyProjectionFactoryUnitTests.CustomerExcerpt ) , STRING ) ; Advisor [] org.springframework.data.projection.Advisor[] = org.springframework.data.projection.Advised . getAdvisors ( ) ; assertThat ( advisors . length ) . isGreaterThan ( NUMBER ) ; assertThat ( org.springframework.data.projection.Advisor[] [ NUMBER ] . getAdvice ( ) ) . isInstanceOf ( DefaultMethodInvokingMethodInterceptor .class ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { org.springframework.data.projection.ProxyProjectionFactoryUnitTests.CustomerExcerpt org.springframework.data.projection.ProxyProjectionFactoryUnitTests.CustomerExcerpt = org.springframework.data.projection.ProjectionFactory . createProjection ( org.springframework.data.projection.ProxyProjectionFactoryUnitTests.CustomerExcerpt .class ) ; assertThat ( org.springframework.data.projection.ProxyProjectionFactoryUnitTests.CustomerExcerpt ) . isInstanceOf ( TargetAware .class ) ; assertThat ( ( ( TargetAware ) org.springframework.data.projection.ProxyProjectionFactoryUnitTests.CustomerExcerpt ) . getTarget ( ) ) . isInstanceOf ( java.util.Map .class ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { org.springframework.data.projection.ProxyProjectionFactoryUnitTests.Customer org.springframework.data.projection.ProxyProjectionFactoryUnitTests.Customer = new org.springframework.data.projection.ProxyProjectionFactoryUnitTests.Customer ( ) ; org.springframework.data.projection.ProxyProjectionFactoryUnitTests.Customer . byte[] = STRING . byte[] ( ) ; org.springframework.data.projection.ProxyProjectionFactoryUnitTests.CustomerExcerpt org.springframework.data.projection.ProxyProjectionFactoryUnitTests.CustomerExcerpt = org.springframework.data.projection.ProjectionFactory . createProjection ( org.springframework.data.projection.ProxyProjectionFactoryUnitTests.CustomerExcerpt .class , org.springframework.data.projection.ProxyProjectionFactoryUnitTests.Customer ) ; assertThat ( org.springframework.data.projection.ProxyProjectionFactoryUnitTests.CustomerExcerpt . byte[] ( ) ) . isEqualTo ( org.springframework.data.projection.ProxyProjectionFactoryUnitTests.Customer . byte[] ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { org.springframework.data.projection.ProxyProjectionFactoryUnitTests.Address org.springframework.data.projection.ProxyProjectionFactoryUnitTests.Address = new org.springframework.data.projection.ProxyProjectionFactoryUnitTests.Address ( ) ; org.springframework.data.projection.ProxyProjectionFactoryUnitTests.Address . java.lang.String = STRING ; org.springframework.data.projection.ProxyProjectionFactoryUnitTests.Address . java.lang.String = STRING ; org.springframework.data.projection.ProxyProjectionFactoryUnitTests.Customer org.springframework.data.projection.ProxyProjectionFactoryUnitTests.Customer = new org.springframework.data.projection.ProxyProjectionFactoryUnitTests.Customer ( ) ; org.springframework.data.projection.ProxyProjectionFactoryUnitTests.Customer . org.springframework.data.projection.ProxyProjectionFactoryUnitTests.Address[] = new org.springframework.data.projection.ProxyProjectionFactoryUnitTests.Address [] { org.springframework.data.projection.ProxyProjectionFactoryUnitTests.Address } ; org.springframework.data.projection.ProxyProjectionFactoryUnitTests.CustomerExcerpt org.springframework.data.projection.ProxyProjectionFactoryUnitTests.CustomerExcerpt = org.springframework.data.projection.ProjectionFactory . createProjection ( org.springframework.data.projection.ProxyProjectionFactoryUnitTests.CustomerExcerpt .class , org.springframework.data.projection.ProxyProjectionFactoryUnitTests.Customer ) ; assertThat ( org.springframework.data.projection.ProxyProjectionFactoryUnitTests.CustomerExcerpt . org.springframework.data.projection.ProxyProjectionFactoryUnitTests.AddressExcerpt[] ( ) ) . hasSize ( NUMBER ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { org.springframework.data.projection.ProxyProjectionFactoryUnitTests.Customer org.springframework.data.projection.ProxyProjectionFactoryUnitTests.Customer = new org.springframework.data.projection.ProxyProjectionFactoryUnitTests.Customer ( ) ; org.springframework.data.projection.ProxyProjectionFactoryUnitTests.Customer . java.lang.Long = NUMBER ; org.springframework.data.projection.ProxyProjectionFactoryUnitTests.CustomerExcerpt org.springframework.data.projection.ProxyProjectionFactoryUnitTests.CustomerExcerpt = org.springframework.data.projection.ProjectionFactory . createProjection ( org.springframework.data.projection.ProxyProjectionFactoryUnitTests.CustomerExcerpt .class , org.springframework.data.projection.ProxyProjectionFactoryUnitTests.Customer ) ; assertThat ( org.springframework.data.projection.ProxyProjectionFactoryUnitTests.CustomerExcerpt . java.lang.String ( ) ) . isEqualTo ( org.springframework.data.projection.ProxyProjectionFactoryUnitTests.Customer . java.lang.Long . java.lang.String ( ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { ProjectionInformation org.springframework.data.projection.ProjectionInformation = org.springframework.data.projection.ProjectionFactory . getProjectionInformation ( org.springframework.data.projection.ProxyProjectionFactoryUnitTests.CustomerExcerpt .class ) ; assertThat ( org.springframework.data.projection.ProjectionInformation . getType ( ) ) . isEqualTo ( org.springframework.data.projection.ProxyProjectionFactoryUnitTests.CustomerExcerpt .class ) ; assertThat ( org.springframework.data.projection.ProjectionInformation . isClosed ( ) ) . isTrue ( ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { org.springframework.data.projection.ProxyProjectionFactoryUnitTests.Customer org.springframework.data.projection.ProxyProjectionFactoryUnitTests.Customer = new org.springframework.data.projection.ProxyProjectionFactoryUnitTests.Customer ( ) ; org.springframework.data.projection.ProxyProjectionFactoryUnitTests.Customer . java.util.Map<java.lang.String,java.lang.Object> = java.util.Collections . java.util.Map<java.lang.String,java.lang.Object> ( STRING , null ) ; java.util.Map<java.lang.String,java.lang.Object> < java.lang.String , java.lang.Object > java.util.Map<java.lang.String,java.lang.Object> = org.springframework.data.projection.ProjectionFactory . createProjection ( org.springframework.data.projection.ProxyProjectionFactoryUnitTests.CustomerExcerpt .class , org.springframework.data.projection.ProxyProjectionFactoryUnitTests.Customer ) . getData ( ) ; assertThat ( java.util.Map<java.lang.String,java.lang.Object> ) . isNotNull ( ) ; assertThat ( java.util.Map<java.lang.String,java.lang.Object> . boolean ( STRING ) ) . isTrue ( ) ; assertThat ( java.util.Map<java.lang.String,java.lang.Object> . java.lang.Object ( STRING ) ) . isNull ( ) ; }  <METHOD_END>
<METHOD_START> java.lang.String java.lang.String ( )  <METHOD_END>
<METHOD_START> java.lang.String java.lang.String ( )  <METHOD_END>
<METHOD_START> org.springframework.data.projection.ProxyProjectionFactoryUnitTests.AddressExcerpt org.springframework.data.projection.ProxyProjectionFactoryUnitTests.AddressExcerpt ( )  <METHOD_END>
<METHOD_START> org.springframework.data.projection.ProxyProjectionFactoryUnitTests.AddressExcerpt [] org.springframework.data.projection.ProxyProjectionFactoryUnitTests.AddressExcerpt[] ( )  <METHOD_END>
<METHOD_START> byte [] byte[] ( )  <METHOD_END>
<METHOD_START> java.util.Map<java.lang.String,java.lang.Object> < java.lang.String , java.lang.Object > java.util.Map<java.lang.String,java.lang.Object> ( )  <METHOD_END>
<METHOD_START> java.lang.String java.lang.String ( )  <METHOD_END>
<METHOD_START> java.lang.String java.lang.String ( )  <METHOD_END>
<METHOD_START> void void ( java.lang.String java.lang.String );  <METHOD_END>
