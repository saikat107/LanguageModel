<METHOD_START> @ Before public void void ( ) { ProxyFactory org.springframework.aop.support.ProxyFactory = new ProxyFactory ( new SerializablePerson ( ) ) ; org.springframework.aop.support.SerializableNopInterceptor = new SerializableNopInterceptor ( ) ; org.springframework.aop.support.NameMatchMethodPointcut = new NameMatchMethodPointcut ( ) ; org.springframework.aop.support.ProxyFactory . addAdvisor ( new DefaultPointcutAdvisor ( org.springframework.aop.support.NameMatchMethodPointcut , org.springframework.aop.support.SerializableNopInterceptor ) ) ; org.springframework.aop.support.Person = ( Person ) org.springframework.aop.support.ProxyFactory . getProxy ( ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { assertTrue ( org.springframework.aop.support.NameMatchMethodPointcut . isMatch ( STRING , STRING ) ) ; assertTrue ( org.springframework.aop.support.NameMatchMethodPointcut . isMatch ( STRING , STRING ) ) ; assertTrue ( org.springframework.aop.support.NameMatchMethodPointcut . isMatch ( STRING , STRING ) ) ; assertFalse ( org.springframework.aop.support.NameMatchMethodPointcut . isMatch ( STRING , STRING ) ) ; assertFalse ( org.springframework.aop.support.NameMatchMethodPointcut . isMatch ( STRING , STRING ) ) ; assertTrue ( org.springframework.aop.support.NameMatchMethodPointcut . isMatch ( STRING , STRING ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Throwable { assertEquals ( NUMBER , org.springframework.aop.support.SerializableNopInterceptor . getCount ( ) ) ; org.springframework.aop.support.Person . getName ( ) ; org.springframework.aop.support.Person . setName ( STRING ) ; org.springframework.aop.support.Person . echo ( null ) ; assertEquals ( NUMBER , org.springframework.aop.support.SerializableNopInterceptor . getCount ( ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Throwable { org.springframework.aop.support.NameMatchMethodPointcut . addMethodName ( STRING ) ; org.springframework.aop.support.NameMatchMethodPointcut . addMethodName ( STRING ) ; assertEquals ( NUMBER , org.springframework.aop.support.SerializableNopInterceptor . getCount ( ) ) ; org.springframework.aop.support.Person . getName ( ) ; org.springframework.aop.support.Person . getName ( ) ; assertEquals ( NUMBER , org.springframework.aop.support.SerializableNopInterceptor . getCount ( ) ) ; org.springframework.aop.support.Person . echo ( null ) ; assertEquals ( NUMBER , org.springframework.aop.support.SerializableNopInterceptor . getCount ( ) ) ; org.springframework.aop.support.Person . setName ( STRING ) ; assertEquals ( NUMBER , org.springframework.aop.support.SerializableNopInterceptor . getCount ( ) ) ; org.springframework.aop.support.Person . setAge ( NUMBER ) ; assertEquals ( NUMBER , org.springframework.aop.support.Person . getAge ( ) ) ; assertEquals ( NUMBER , org.springframework.aop.support.SerializableNopInterceptor . getCount ( ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Throwable { org.springframework.aop.support.NameMatchMethodPointcut . setMappedNames ( new java.lang.String [] { STRING , STRING } ) ; assertEquals ( NUMBER , org.springframework.aop.support.SerializableNopInterceptor . getCount ( ) ) ; org.springframework.aop.support.Person . getName ( ) ; org.springframework.aop.support.Person . setName ( STRING ) ; assertEquals ( NUMBER , org.springframework.aop.support.SerializableNopInterceptor . getCount ( ) ) ; org.springframework.aop.support.Person . echo ( null ) ; assertEquals ( NUMBER , org.springframework.aop.support.SerializableNopInterceptor . getCount ( ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Throwable { void ( ) ; Person org.springframework.aop.support.Person = ( Person ) SerializationTestUtils . serializeAndDeserialize ( org.springframework.aop.support.Person ) ; NopInterceptor org.springframework.aop.support.NopInterceptor = ( NopInterceptor ) ( ( Advised ) org.springframework.aop.support.Person ) . getAdvisors ( ) [ NUMBER ] . getAdvice ( ) ; org.springframework.aop.support.Person . getName ( ) ; assertEquals ( NUMBER , org.springframework.aop.support.NopInterceptor . getCount ( ) ) ; org.springframework.aop.support.Person . echo ( null ) ; assertEquals ( NUMBER , org.springframework.aop.support.NopInterceptor . getCount ( ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { NameMatchMethodPointcut org.springframework.aop.support.NameMatchMethodPointcut = new NameMatchMethodPointcut ( ) ; NameMatchMethodPointcut org.springframework.aop.support.NameMatchMethodPointcut = new NameMatchMethodPointcut ( ) ; java.lang.String java.lang.String = STRING ; assertEquals ( org.springframework.aop.support.NameMatchMethodPointcut , org.springframework.aop.support.NameMatchMethodPointcut ) ; assertEquals ( org.springframework.aop.support.NameMatchMethodPointcut . hashCode ( ) , org.springframework.aop.support.NameMatchMethodPointcut . hashCode ( ) ) ; org.springframework.aop.support.NameMatchMethodPointcut . setMappedName ( java.lang.String ) ; assertFalse ( org.springframework.aop.support.NameMatchMethodPointcut . equals ( org.springframework.aop.support.NameMatchMethodPointcut ) ) ; assertTrue ( org.springframework.aop.support.NameMatchMethodPointcut . hashCode ( ) != org.springframework.aop.support.NameMatchMethodPointcut . hashCode ( ) ) ; org.springframework.aop.support.NameMatchMethodPointcut . setMappedName ( java.lang.String ) ; assertEquals ( org.springframework.aop.support.NameMatchMethodPointcut , org.springframework.aop.support.NameMatchMethodPointcut ) ; assertEquals ( org.springframework.aop.support.NameMatchMethodPointcut . hashCode ( ) , org.springframework.aop.support.NameMatchMethodPointcut . hashCode ( ) ) ; }  <METHOD_END>
