<METHOD_START> public static org.springframework.context.annotation4.TestBean org.springframework.context.annotation4.TestBean ( ) { return null ; }  <METHOD_END>
<METHOD_START> @ Bean @ Qualifier ( STRING ) public org.springframework.context.annotation4.TestBean org.springframework.context.annotation4.TestBean ( ) { return new TestBean ( STRING ) ; }  <METHOD_END>
<METHOD_START> public org.springframework.context.annotation4.TestBean org.springframework.context.annotation4.TestBean ( boolean boolean ) { return new TestBean ( STRING ) ; }  <METHOD_END>
<METHOD_START> @ Bean @ BeanAge ( NUMBER ) protected org.springframework.context.annotation4.TestBean org.springframework.context.annotation4.TestBean ( @ Qualifier ( STRING ) TestBean org.springframework.context.annotation4.TestBean , @ Value ( STRING ) java.lang.String java.lang.String ) { TestBean org.springframework.context.annotation4.TestBean = new TestBean ( STRING , NUMBER ) ; org.springframework.context.annotation4.TestBean . setSpouse ( org.springframework.context.annotation4.TestBean ) ; org.springframework.context.annotation4.TestBean . setCountry ( java.lang.String ) ; return org.springframework.context.annotation4.TestBean ; }  <METHOD_END>
<METHOD_START> @ Bean @ Scope ( STRING ) private org.springframework.context.annotation4.TestBean org.springframework.context.annotation4.TestBean ( ) { return new TestBean ( STRING , int ++ ) ; }  <METHOD_END>
<METHOD_START> @ Bean @ Scope ( value = STRING , proxyMode = ScopedProxyMode . TARGET_CLASS ) public org.springframework.context.annotation4.TestBean org.springframework.context.annotation4.TestBean ( ) { return new TestBean ( STRING , NUMBER ) ; }  <METHOD_END>
<METHOD_START> @ Bean public org.springframework.context.annotation4.DependencyBean org.springframework.context.annotation4.DependencyBean ( ) { return new DependencyBean ( ) ; }  <METHOD_END>