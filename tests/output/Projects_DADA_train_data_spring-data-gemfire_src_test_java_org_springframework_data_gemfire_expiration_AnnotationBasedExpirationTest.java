<METHOD_START> protected void void ( ExpirationAttributes org.springframework.data.gemfire.expiration.ExpirationAttributes , int int , ExpirationAction org.springframework.data.gemfire.expiration.ExpirationAction ) { assertThat ( org.springframework.data.gemfire.expiration.ExpirationAttributes , is ( not ( nullValue ( ) ) ) ) ; assertThat ( org.springframework.data.gemfire.expiration.ExpirationAttributes . getTimeout ( ) , is ( equalTo ( int ) ) ) ; assertThat ( org.springframework.data.gemfire.expiration.ExpirationAttributes . getAction ( ) , is ( equalTo ( org.springframework.data.gemfire.expiration.ExpirationAction ) ) ) ; }  <METHOD_END>
<METHOD_START> protected void void ( ExpirationMetaData org.springframework.data.gemfire.expiration.ExpirationMetaData , int int , ExpirationActionType org.springframework.data.gemfire.expiration.ExpirationActionType ) { assertThat ( org.springframework.data.gemfire.expiration.ExpirationMetaData , is ( not ( nullValue ( ) ) ) ) ; assertThat ( org.springframework.data.gemfire.expiration.ExpirationMetaData . timeout ( ) , is ( equalTo ( int ) ) ) ; assertThat ( org.springframework.data.gemfire.expiration.ExpirationMetaData . action ( ) , is ( equalTo ( org.springframework.data.gemfire.expiration.ExpirationActionType ) ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { AnnotationBasedExpiration org.springframework.data.gemfire.expiration.AnnotationBasedExpiration = new AnnotationBasedExpiration ( ) ; assertThat ( org.springframework.data.gemfire.expiration.AnnotationBasedExpiration . getDefaultExpirationAttributes ( ) , is ( nullValue ( ) ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { AnnotationBasedExpiration org.springframework.data.gemfire.expiration.AnnotationBasedExpiration = new AnnotationBasedExpiration ( ExpirationAttributes . DEFAULT ) ; assertThat ( org.springframework.data.gemfire.expiration.AnnotationBasedExpiration . getDefaultExpirationAttributes ( ) , is ( equalTo ( ExpirationAttributes . DEFAULT ) ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { Region . Region Region.Entry = mock ( Region . Region .class , STRING ) ; AnnotationBasedExpiration org.springframework.data.gemfire.expiration.AnnotationBasedExpiration = AnnotationBasedExpiration . forIdleTimeout ( ) ; when ( Region.Entry . getValue ( ) ) . thenReturn ( new org.springframework.data.gemfire.expiration.AnnotationBasedExpirationTest.RegionEntryValueWithTimeToLiveIdleTimeoutExpiration ( ) ) ; void ( org.springframework.data.gemfire.expiration.AnnotationBasedExpiration . getExpiry ( Region.Entry ) , NUMBER , ExpirationAction . LOCAL_INVALIDATE ) ; when ( Region.Entry . getValue ( ) ) . thenReturn ( new org.springframework.data.gemfire.expiration.AnnotationBasedExpirationTest.RegionEntryValueWithTimeToLiveGenericExpiration ( ) ) ; void ( org.springframework.data.gemfire.expiration.AnnotationBasedExpiration . getExpiry ( Region.Entry ) , NUMBER , ExpirationAction . INVALIDATE ) ; when ( Region.Entry . getValue ( ) ) . thenReturn ( new org.springframework.data.gemfire.expiration.AnnotationBasedExpirationTest.RegionEntryValueWithNoExpiration ( ) ) ; assertThat ( org.springframework.data.gemfire.expiration.AnnotationBasedExpiration . getExpiry ( Region.Entry ) , is ( nullValue ( ) ) ) ; verify ( Region.Entry , atLeast ( NUMBER ) ) . getValue ( ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { Region . Region Region.Entry = mock ( Region . Region .class , STRING ) ; ExpirationAttributes org.springframework.data.gemfire.expiration.ExpirationAttributes = new ExpirationAttributes ( NUMBER , ExpirationAction . DESTROY ) ; AnnotationBasedExpiration org.springframework.data.gemfire.expiration.AnnotationBasedExpiration = AnnotationBasedExpiration . forIdleTimeout ( org.springframework.data.gemfire.expiration.ExpirationAttributes ) ; when ( Region.Entry . getValue ( ) ) . thenReturn ( new org.springframework.data.gemfire.expiration.AnnotationBasedExpirationTest.RegionEntryValueWithTimeToLiveIdleTimeoutExpiration ( ) ) ; void ( org.springframework.data.gemfire.expiration.AnnotationBasedExpiration . getExpiry ( Region.Entry ) , NUMBER , ExpirationAction . LOCAL_INVALIDATE ) ; when ( Region.Entry . getValue ( ) ) . thenReturn ( new org.springframework.data.gemfire.expiration.AnnotationBasedExpirationTest.RegionEntryValueWithTimeToLiveGenericExpiration ( ) ) ; void ( org.springframework.data.gemfire.expiration.AnnotationBasedExpiration . getExpiry ( Region.Entry ) , NUMBER , ExpirationAction . INVALIDATE ) ; when ( Region.Entry . getValue ( ) ) . thenReturn ( new org.springframework.data.gemfire.expiration.AnnotationBasedExpirationTest.RegionEntryValueWithNoExpiration ( ) ) ; assertThat ( org.springframework.data.gemfire.expiration.AnnotationBasedExpiration . getExpiry ( Region.Entry ) , is ( equalTo ( org.springframework.data.gemfire.expiration.ExpirationAttributes ) ) ) ; verify ( Region.Entry , atLeast ( NUMBER ) ) . getValue ( ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { Region . Region Region.Entry = mock ( Region . Region .class , STRING ) ; AnnotationBasedExpiration org.springframework.data.gemfire.expiration.AnnotationBasedExpiration = AnnotationBasedExpiration . forTimeToLive ( ) ; when ( Region.Entry . getValue ( ) ) . thenReturn ( new org.springframework.data.gemfire.expiration.AnnotationBasedExpirationTest.RegionEntryValueWithTimeToLiveIdleTimeoutExpiration ( ) ) ; void ( org.springframework.data.gemfire.expiration.AnnotationBasedExpiration . getExpiry ( Region.Entry ) , NUMBER , ExpirationAction . LOCAL_DESTROY ) ; when ( Region.Entry . getValue ( ) ) . thenReturn ( new org.springframework.data.gemfire.expiration.AnnotationBasedExpirationTest.RegionEntryValueWithIdleTimeoutGenericExpiration ( ) ) ; void ( org.springframework.data.gemfire.expiration.AnnotationBasedExpiration . getExpiry ( Region.Entry ) , NUMBER , ExpirationAction . INVALIDATE ) ; when ( Region.Entry . getValue ( ) ) . thenReturn ( new org.springframework.data.gemfire.expiration.AnnotationBasedExpirationTest.RegionEntryValueWithNoExpiration ( ) ) ; assertThat ( org.springframework.data.gemfire.expiration.AnnotationBasedExpiration . getExpiry ( Region.Entry ) , is ( nullValue ( ) ) ) ; verify ( Region.Entry , atLeast ( NUMBER ) ) . getValue ( ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { Region . Region Region.Entry = mock ( Region . Region .class , STRING ) ; ExpirationAttributes org.springframework.data.gemfire.expiration.ExpirationAttributes = new ExpirationAttributes ( NUMBER , ExpirationAction . DESTROY ) ; AnnotationBasedExpiration org.springframework.data.gemfire.expiration.AnnotationBasedExpiration = AnnotationBasedExpiration . forTimeToLive ( org.springframework.data.gemfire.expiration.ExpirationAttributes ) ; when ( Region.Entry . getValue ( ) ) . thenReturn ( new org.springframework.data.gemfire.expiration.AnnotationBasedExpirationTest.RegionEntryValueWithTimeToLiveIdleTimeoutExpiration ( ) ) ; void ( org.springframework.data.gemfire.expiration.AnnotationBasedExpiration . getExpiry ( Region.Entry ) , NUMBER , ExpirationAction . LOCAL_DESTROY ) ; when ( Region.Entry . getValue ( ) ) . thenReturn ( new org.springframework.data.gemfire.expiration.AnnotationBasedExpirationTest.RegionEntryValueWithIdleTimeoutGenericExpiration ( ) ) ; void ( org.springframework.data.gemfire.expiration.AnnotationBasedExpiration . getExpiry ( Region.Entry ) , NUMBER , ExpirationAction . INVALIDATE ) ; when ( Region.Entry . getValue ( ) ) . thenReturn ( new org.springframework.data.gemfire.expiration.AnnotationBasedExpirationTest.RegionEntryValueWithNoExpiration ( ) ) ; assertThat ( org.springframework.data.gemfire.expiration.AnnotationBasedExpiration . getExpiry ( Region.Entry ) , is ( equalTo ( org.springframework.data.gemfire.expiration.ExpirationAttributes ) ) ) ; verify ( Region.Entry , atLeast ( NUMBER ) ) . getValue ( ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { final StandardEvaluationContext org.springframework.data.gemfire.expiration.StandardEvaluationContext = mock ( StandardEvaluationContext .class , STRING ) ; ConversionService org.springframework.data.gemfire.expiration.ConversionService = mock ( ConversionService .class , STRING ) ; final ConfigurableBeanFactory org.springframework.data.gemfire.expiration.ConfigurableBeanFactory = mock ( ConfigurableBeanFactory .class , STRING ) ; when ( org.springframework.data.gemfire.expiration.ConfigurableBeanFactory . getConversionService ( ) ) . thenReturn ( org.springframework.data.gemfire.expiration.ConversionService ) ; when ( org.springframework.data.gemfire.expiration.ConfigurableBeanFactory . getBeanClassLoader ( ) ) . thenReturn ( java.lang.Thread . java.lang.Thread ( ) . java.lang.ClassLoader ( ) ) ; doAnswer ( new Answer < java.lang.Void > ( ) { @ java.lang.Override public java.lang.Void java.lang.Void ( final InvocationOnMock org.springframework.data.gemfire.expiration.InvocationOnMock ) throws java.lang.Throwable { BeanResolver org.springframework.data.gemfire.expiration.BeanResolver = org.springframework.data.gemfire.expiration.InvocationOnMock . getArgument ( NUMBER ) ; assertThat ( org.springframework.data.gemfire.expiration.BeanResolver , is ( instanceOf ( BeanFactoryResolver .class ) ) ) ; assertThat ( TestUtils .< ConfigurableBeanFactory > readField ( STRING , org.springframework.data.gemfire.expiration.BeanResolver ) , is ( equalTo ( org.springframework.data.gemfire.expiration.ConfigurableBeanFactory ) ) ) ; return null ; } } ) . when ( org.springframework.data.gemfire.expiration.StandardEvaluationContext ) . setBeanResolver ( Matchers . any ( BeanResolver .class ) ) ; AnnotationBasedExpiration < java.lang.Object , java.lang.Object > org.springframework.data.gemfire.expiration.AnnotationBasedExpiration<java.lang.Object,java.lang.Object> = new AnnotationBasedExpiration < java.lang.Object , java.lang.Object > ( ) { @ java.lang.Override org.springframework.data.gemfire.expiration.StandardEvaluationContext org.springframework.data.gemfire.expiration.StandardEvaluationContext ( ) { return org.springframework.data.gemfire.expiration.StandardEvaluationContext ; } } ; org.springframework.data.gemfire.expiration.AnnotationBasedExpiration<java.lang.Object,java.lang.Object> . setBeanFactory ( org.springframework.data.gemfire.expiration.ConfigurableBeanFactory ) ; assertSame ( org.springframework.data.gemfire.expiration.ConfigurableBeanFactory , org.springframework.data.gemfire.expiration.AnnotationBasedExpiration<java.lang.Object,java.lang.Object> . getBeanFactory ( ) ) ; verify ( org.springframework.data.gemfire.expiration.StandardEvaluationContext , times ( NUMBER ) ) . addPropertyAccessor ( Matchers . any ( PropertyAccessor .class ) ) ; verify ( org.springframework.data.gemfire.expiration.StandardEvaluationContext , times ( NUMBER ) ) . setTypeConverter ( Matchers . any ( TypeConverter .class ) ) ; verify ( org.springframework.data.gemfire.expiration.StandardEvaluationContext , times ( NUMBER ) ) . setTypeLocator ( Matchers . any ( TypeLocator .class ) ) ; verify ( org.springframework.data.gemfire.expiration.StandardEvaluationContext , times ( NUMBER ) ) . setBeanResolver ( Matchers . any ( BeanResolver .class ) ) ; verify ( org.springframework.data.gemfire.expiration.ConfigurableBeanFactory , times ( NUMBER ) ) . getConversionService ( ) ; verify ( org.springframework.data.gemfire.expiration.ConfigurableBeanFactory , times ( NUMBER ) ) . getBeanClassLoader ( ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public java.lang.Void java.lang.Void ( final InvocationOnMock org.springframework.data.gemfire.expiration.InvocationOnMock ) throws java.lang.Throwable { BeanResolver org.springframework.data.gemfire.expiration.BeanResolver = org.springframework.data.gemfire.expiration.InvocationOnMock . getArgument ( NUMBER ) ; assertThat ( org.springframework.data.gemfire.expiration.BeanResolver , is ( instanceOf ( BeanFactoryResolver .class ) ) ) ; assertThat ( TestUtils .< ConfigurableBeanFactory > readField ( STRING , org.springframework.data.gemfire.expiration.BeanResolver ) , is ( equalTo ( org.springframework.data.gemfire.expiration.ConfigurableBeanFactory ) ) ) ; return null ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override org.springframework.data.gemfire.expiration.StandardEvaluationContext org.springframework.data.gemfire.expiration.StandardEvaluationContext ( ) { return org.springframework.data.gemfire.expiration.StandardEvaluationContext ; }  <METHOD_END>
<METHOD_START> @ Test ( expected = java.lang.IllegalStateException .class ) public void void ( ) { new AnnotationBasedExpiration < java.lang.Object , java.lang.Object > ( ) . getBeanFactory ( ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { ExpirationAttributes org.springframework.data.gemfire.expiration.ExpirationAttributes = new ExpirationAttributes ( NUMBER , ExpirationAction . INVALIDATE ) ; AnnotationBasedExpiration org.springframework.data.gemfire.expiration.AnnotationBasedExpiration = new AnnotationBasedExpiration ( ) ; org.springframework.data.gemfire.expiration.AnnotationBasedExpiration . setDefaultExpirationAttributes ( org.springframework.data.gemfire.expiration.ExpirationAttributes ) ; assertThat ( org.springframework.data.gemfire.expiration.AnnotationBasedExpiration . getDefaultExpirationAttributes ( ) , is ( equalTo ( org.springframework.data.gemfire.expiration.ExpirationAttributes ) ) ) ; org.springframework.data.gemfire.expiration.AnnotationBasedExpiration . setDefaultExpirationAttributes ( null ) ; assertThat ( org.springframework.data.gemfire.expiration.AnnotationBasedExpiration . getDefaultExpirationAttributes ( ) , is ( nullValue ( ) ) ) ; org.springframework.data.gemfire.expiration.AnnotationBasedExpiration . setDefaultExpirationAttributes ( ExpirationAttributes . DEFAULT ) ; assertThat ( org.springframework.data.gemfire.expiration.AnnotationBasedExpiration . getDefaultExpirationAttributes ( ) , is ( equalTo ( ExpirationAttributes . DEFAULT ) ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { final ExpirationAttributes org.springframework.data.gemfire.expiration.ExpirationAttributes = new ExpirationAttributes ( NUMBER , ExpirationAction . LOCAL_DESTROY ) ; final Region . Region Region.Entry = mock ( Region . Region .class , STRING ) ; AnnotationBasedExpiration org.springframework.data.gemfire.expiration.AnnotationBasedExpiration = new AnnotationBasedExpiration ( ) { @ java.lang.Override protected org.springframework.data.gemfire.expiration.ExpirationMetaData org.springframework.data.gemfire.expiration.ExpirationMetaData ( Region . Region Region.Entry ) { assertThat ( Region.Entry , is ( sameInstance ( Region.Entry ) ) ) ; return ExpirationMetaData . from ( org.springframework.data.gemfire.expiration.ExpirationAttributes ) ; } @ java.lang.Override protected org.springframework.data.gemfire.expiration.ExpirationAttributes org.springframework.data.gemfire.expiration.ExpirationAttributes ( ExpirationMetaData org.springframework.data.gemfire.expiration.ExpirationMetaData ) { assertThat ( org.springframework.data.gemfire.expiration.ExpirationMetaData . timeout ( ) , is ( equalTo ( org.springframework.data.gemfire.expiration.ExpirationAttributes . getTimeout ( ) ) ) ) ; assertThat ( org.springframework.data.gemfire.expiration.ExpirationMetaData . expirationAction ( ) , is ( equalTo ( org.springframework.data.gemfire.expiration.ExpirationAttributes . getAction ( ) ) ) ) ; return org.springframework.data.gemfire.expiration.ExpirationAttributes ; } } ; assertThat ( org.springframework.data.gemfire.expiration.AnnotationBasedExpiration . getExpiry ( Region.Entry ) , is ( equalTo ( org.springframework.data.gemfire.expiration.ExpirationAttributes ) ) ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override protected org.springframework.data.gemfire.expiration.ExpirationMetaData org.springframework.data.gemfire.expiration.ExpirationMetaData ( Region . Region Region.Entry ) { assertThat ( Region.Entry , is ( sameInstance ( Region.Entry ) ) ) ; return ExpirationMetaData . from ( org.springframework.data.gemfire.expiration.ExpirationAttributes ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override protected org.springframework.data.gemfire.expiration.ExpirationAttributes org.springframework.data.gemfire.expiration.ExpirationAttributes ( ExpirationMetaData org.springframework.data.gemfire.expiration.ExpirationMetaData ) { assertThat ( org.springframework.data.gemfire.expiration.ExpirationMetaData . timeout ( ) , is ( equalTo ( org.springframework.data.gemfire.expiration.ExpirationAttributes . getTimeout ( ) ) ) ) ; assertThat ( org.springframework.data.gemfire.expiration.ExpirationMetaData . expirationAction ( ) , is ( equalTo ( org.springframework.data.gemfire.expiration.ExpirationAttributes . getAction ( ) ) ) ) ; return org.springframework.data.gemfire.expiration.ExpirationAttributes ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { Region . Region Region.Entry = mock ( Region . Region .class , STRING ) ; when ( Region.Entry . getValue ( ) ) . thenReturn ( new org.springframework.data.gemfire.expiration.AnnotationBasedExpirationTest.RegionEntryValueWithGenericExpiration ( ) ) ; assertThat ( org.springframework.data.gemfire.expiration.AnnotationBasedExpiration . isExpirationConfigured ( Region.Entry ) , is ( true ) ) ; when ( Region.Entry . getValue ( ) ) . thenReturn ( new org.springframework.data.gemfire.expiration.AnnotationBasedExpirationTest.RegionEntryValueWithTimeToLiveIdleTimeoutGenericExpiration ( ) ) ; assertThat ( org.springframework.data.gemfire.expiration.AnnotationBasedExpiration . isExpirationConfigured ( Region.Entry ) , is ( true ) ) ; verify ( Region.Entry , times ( NUMBER ) ) . getValue ( ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { Region . Region Region.Entry = mock ( Region . Region .class , STRING ) ; when ( Region.Entry . getValue ( ) ) . thenReturn ( new org.springframework.data.gemfire.expiration.AnnotationBasedExpirationTest.RegionEntryValueWithTimeToLiveIdleTimeoutExpiration ( ) ) ; assertThat ( org.springframework.data.gemfire.expiration.AnnotationBasedExpiration . isExpirationConfigured ( Region.Entry ) , is ( false ) ) ; when ( Region.Entry . getValue ( ) ) . thenReturn ( new org.springframework.data.gemfire.expiration.AnnotationBasedExpirationTest.RegionEntryValueWithNoExpiration ( ) ) ; assertThat ( org.springframework.data.gemfire.expiration.AnnotationBasedExpiration . isExpirationConfigured ( Region.Entry ) , is ( false ) ) ; verify ( Region.Entry , times ( NUMBER ) ) . getValue ( ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { Region . Region Region.Entry = mock ( Region . Region .class , STRING ) ; when ( Region.Entry . getValue ( ) ) . thenReturn ( new org.springframework.data.gemfire.expiration.AnnotationBasedExpirationTest.RegionEntryValueWithIdleTimeoutExpiration ( ) ) ; assertThat ( org.springframework.data.gemfire.expiration.AnnotationBasedExpiration . isIdleTimeoutConfigured ( Region.Entry ) , is ( true ) ) ; when ( Region.Entry . getValue ( ) ) . thenReturn ( new org.springframework.data.gemfire.expiration.AnnotationBasedExpirationTest.RegionEntryValueWithTimeToLiveIdleTimeoutGenericExpiration ( ) ) ; assertThat ( org.springframework.data.gemfire.expiration.AnnotationBasedExpiration . isIdleTimeoutConfigured ( Region.Entry ) , is ( true ) ) ; verify ( Region.Entry , times ( NUMBER ) ) . getValue ( ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { Region . Region Region.Entry = mock ( Region . Region .class , STRING ) ; when ( Region.Entry . getValue ( ) ) . thenReturn ( new org.springframework.data.gemfire.expiration.AnnotationBasedExpirationTest.RegionEntryValueWithTimeToLiveGenericExpiration ( ) ) ; assertThat ( org.springframework.data.gemfire.expiration.AnnotationBasedExpiration . isIdleTimeoutConfigured ( Region.Entry ) , is ( false ) ) ; when ( Region.Entry . getValue ( ) ) . thenReturn ( new org.springframework.data.gemfire.expiration.AnnotationBasedExpirationTest.RegionEntryValueWithNoExpiration ( ) ) ; assertThat ( org.springframework.data.gemfire.expiration.AnnotationBasedExpiration . isIdleTimeoutConfigured ( Region.Entry ) , is ( false ) ) ; verify ( Region.Entry , times ( NUMBER ) ) . getValue ( ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { Region . Region Region.Entry = mock ( Region . Region .class , STRING ) ; when ( Region.Entry . getValue ( ) ) . thenReturn ( new org.springframework.data.gemfire.expiration.AnnotationBasedExpirationTest.RegionEntryValueWithTimeToLiveExpiration ( ) ) ; assertThat ( org.springframework.data.gemfire.expiration.AnnotationBasedExpiration . isTimeToLiveConfigured ( Region.Entry ) , is ( true ) ) ; when ( Region.Entry . getValue ( ) ) . thenReturn ( new org.springframework.data.gemfire.expiration.AnnotationBasedExpirationTest.RegionEntryValueWithTimeToLiveIdleTimeoutGenericExpiration ( ) ) ; assertThat ( org.springframework.data.gemfire.expiration.AnnotationBasedExpiration . isTimeToLiveConfigured ( Region.Entry ) , is ( true ) ) ; verify ( Region.Entry , times ( NUMBER ) ) . getValue ( ) ; }  <METHOD_END>
<METHOD_START> public void void ( ) { Region . Region Region.Entry = mock ( Region . Region .class , STRING ) ; when ( Region.Entry . getValue ( ) ) . thenReturn ( new org.springframework.data.gemfire.expiration.AnnotationBasedExpirationTest.RegionEntryValueWithIdleTimeoutGenericExpiration ( ) ) ; assertThat ( org.springframework.data.gemfire.expiration.AnnotationBasedExpiration . isTimeToLiveConfigured ( Region.Entry ) , is ( false ) ) ; when ( Region.Entry . getValue ( ) ) . thenReturn ( new org.springframework.data.gemfire.expiration.AnnotationBasedExpirationTest.RegionEntryValueWithNoExpiration ( ) ) ; assertThat ( org.springframework.data.gemfire.expiration.AnnotationBasedExpiration . isTimeToLiveConfigured ( Region.Entry ) , is ( false ) ) ; verify ( Region.Entry , times ( NUMBER ) ) . getValue ( ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { Region . Region Region.Entry = mock ( Region . Region .class , STRING ) ; when ( Region.Entry . getValue ( ) ) . thenReturn ( new org.springframework.data.gemfire.expiration.AnnotationBasedExpirationTest.RegionEntryValueWithGenericExpiration ( ) ) ; assertThat ( org.springframework.data.gemfire.expiration.AnnotationBasedExpiration . getExpiration ( Region.Entry ) , isA ( Expiration .class ) ) ; when ( Region.Entry . getValue ( ) ) . thenReturn ( new org.springframework.data.gemfire.expiration.AnnotationBasedExpirationTest.RegionEntryValueWithTimeToLiveIdleTimeoutGenericExpiration ( ) ) ; assertThat ( org.springframework.data.gemfire.expiration.AnnotationBasedExpiration . getExpiration ( Region.Entry ) , isA ( Expiration .class ) ) ; verify ( Region.Entry , times ( NUMBER ) ) . getValue ( ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { Region . Region Region.Entry = mock ( Region . Region .class , STRING ) ; when ( Region.Entry . getValue ( ) ) . thenReturn ( new org.springframework.data.gemfire.expiration.AnnotationBasedExpirationTest.RegionEntryValueWithTimeToLiveIdleTimeoutExpiration ( ) ) ; assertThat ( org.springframework.data.gemfire.expiration.AnnotationBasedExpiration . getExpiration ( Region.Entry ) , is ( nullValue ( ) ) ) ; when ( Region.Entry . getValue ( ) ) . thenReturn ( new org.springframework.data.gemfire.expiration.AnnotationBasedExpirationTest.RegionEntryValueWithNoExpiration ( ) ) ; assertThat ( org.springframework.data.gemfire.expiration.AnnotationBasedExpiration . getExpiration ( Region.Entry ) , is ( nullValue ( ) ) ) ; verify ( Region.Entry , times ( NUMBER ) ) . getValue ( ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { Region . Region Region.Entry = mock ( Region . Region .class , STRING ) ; when ( Region.Entry . getValue ( ) ) . thenReturn ( new org.springframework.data.gemfire.expiration.AnnotationBasedExpirationTest.RegionEntryValueWithIdleTimeoutExpiration ( ) ) ; assertThat ( org.springframework.data.gemfire.expiration.AnnotationBasedExpiration . getIdleTimeout ( Region.Entry ) , isA ( IdleTimeoutExpiration .class ) ) ; when ( Region.Entry . getValue ( ) ) . thenReturn ( new org.springframework.data.gemfire.expiration.AnnotationBasedExpirationTest.RegionEntryValueWithTimeToLiveIdleTimeoutGenericExpiration ( ) ) ; assertThat ( org.springframework.data.gemfire.expiration.AnnotationBasedExpiration . getIdleTimeout ( Region.Entry ) , isA ( IdleTimeoutExpiration .class ) ) ; verify ( Region.Entry , times ( NUMBER ) ) . getValue ( ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { Region . Region Region.Entry = mock ( Region . Region .class , STRING ) ; when ( Region.Entry . getValue ( ) ) . thenReturn ( new org.springframework.data.gemfire.expiration.AnnotationBasedExpirationTest.RegionEntryValueWithTimeToLiveGenericExpiration ( ) ) ; assertThat ( org.springframework.data.gemfire.expiration.AnnotationBasedExpiration . getIdleTimeout ( Region.Entry ) , is ( nullValue ( ) ) ) ; when ( Region.Entry . getValue ( ) ) . thenReturn ( new org.springframework.data.gemfire.expiration.AnnotationBasedExpirationTest.RegionEntryValueWithNoExpiration ( ) ) ; assertThat ( org.springframework.data.gemfire.expiration.AnnotationBasedExpiration . getIdleTimeout ( Region.Entry ) , is ( nullValue ( ) ) ) ; verify ( Region.Entry , times ( NUMBER ) ) . getValue ( ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { Region . Region Region.Entry = mock ( Region . Region .class , STRING ) ; when ( Region.Entry . getValue ( ) ) . thenReturn ( new org.springframework.data.gemfire.expiration.AnnotationBasedExpirationTest.RegionEntryValueWithTimeToLiveExpiration ( ) ) ; assertThat ( org.springframework.data.gemfire.expiration.AnnotationBasedExpiration . getTimeToLive ( Region.Entry ) , isA ( TimeToLiveExpiration .class ) ) ; when ( Region.Entry . getValue ( ) ) . thenReturn ( new org.springframework.data.gemfire.expiration.AnnotationBasedExpirationTest.RegionEntryValueWithTimeToLiveIdleTimeoutGenericExpiration ( ) ) ; assertThat ( org.springframework.data.gemfire.expiration.AnnotationBasedExpiration . getTimeToLive ( Region.Entry ) , isA ( TimeToLiveExpiration .class ) ) ; verify ( Region.Entry , times ( NUMBER ) ) . getValue ( ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { Region . Region Region.Entry = mock ( Region . Region .class , STRING ) ; when ( Region.Entry . getValue ( ) ) . thenReturn ( new org.springframework.data.gemfire.expiration.AnnotationBasedExpirationTest.RegionEntryValueWithIdleTimeoutGenericExpiration ( ) ) ; assertThat ( org.springframework.data.gemfire.expiration.AnnotationBasedExpiration . getTimeToLive ( Region.Entry ) , is ( nullValue ( ) ) ) ; when ( Region.Entry . getValue ( ) ) . thenReturn ( new org.springframework.data.gemfire.expiration.AnnotationBasedExpirationTest.RegionEntryValueWithNoExpiration ( ) ) ; assertThat ( org.springframework.data.gemfire.expiration.AnnotationBasedExpiration . getTimeToLive ( Region.Entry ) , is ( nullValue ( ) ) ) ; verify ( Region.Entry , times ( NUMBER ) ) . getValue ( ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { ExpirationMetaData org.springframework.data.gemfire.expiration.ExpirationMetaData = ExpirationMetaData . from ( org.springframework.data.gemfire.expiration.AnnotationBasedExpirationTest.RegionEntryValueWithGenericExpiration .class . A ( Expiration .class ) ) ; void ( org.springframework.data.gemfire.expiration.ExpirationMetaData , NUMBER , ExpirationActionType . INVALIDATE ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { ExpirationMetaData org.springframework.data.gemfire.expiration.ExpirationMetaData = ExpirationMetaData . from ( org.springframework.data.gemfire.expiration.AnnotationBasedExpirationTest.RegionEntryValueWithIdleTimeoutExpiration .class . A ( IdleTimeoutExpiration .class ) ) ; void ( org.springframework.data.gemfire.expiration.ExpirationMetaData , NUMBER , ExpirationActionType . LOCAL_INVALIDATE ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { ExpirationMetaData org.springframework.data.gemfire.expiration.ExpirationMetaData = ExpirationMetaData . from ( org.springframework.data.gemfire.expiration.AnnotationBasedExpirationTest.RegionEntryValueWithTimeToLiveExpiration .class . A ( TimeToLiveExpiration .class ) ) ; void ( org.springframework.data.gemfire.expiration.ExpirationMetaData , NUMBER , ExpirationActionType . LOCAL_DESTROY ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { ExpirationMetaData org.springframework.data.gemfire.expiration.ExpirationMetaData = new ExpirationMetaData ( NUMBER , ExpirationActionType . DESTROY ) ; void ( org.springframework.data.gemfire.expiration.ExpirationMetaData . toExpirationAttributes ( ) , org.springframework.data.gemfire.expiration.ExpirationMetaData . timeout ( ) , org.springframework.data.gemfire.expiration.ExpirationMetaData . expirationAction ( ) ) ; }  <METHOD_END>
