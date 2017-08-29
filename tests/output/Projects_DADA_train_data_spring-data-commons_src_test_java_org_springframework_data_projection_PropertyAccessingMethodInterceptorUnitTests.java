<METHOD_START> @ Test public void void ( ) java.lang.Throwable { org.springframework.data.projection.PropertyAccessingMethodInterceptorUnitTests.Source org.springframework.data.projection.PropertyAccessingMethodInterceptorUnitTests.Source = new org.springframework.data.projection.PropertyAccessingMethodInterceptorUnitTests.Source ( ) ; org.springframework.data.projection.PropertyAccessingMethodInterceptorUnitTests.Source . java.lang.String = STRING ; when ( org.springframework.data.projection.MethodInvocation . getMethod ( ) ) . thenReturn ( org.springframework.data.projection.PropertyAccessingMethodInterceptorUnitTests.Projection .class . java.lang.reflect.Method ( STRING ) ) ; MethodInterceptor org.springframework.data.projection.MethodInterceptor = new PropertyAccessingMethodInterceptor ( org.springframework.data.projection.PropertyAccessingMethodInterceptorUnitTests.Source ) ; assertThat ( org.springframework.data.projection.MethodInterceptor . invoke ( org.springframework.data.projection.MethodInvocation ) ) . isEqualTo ( STRING ) ; }  <METHOD_END>
<METHOD_START> @ Test ( expected = NotReadablePropertyException .class ) public void void ( ) java.lang.Throwable { when ( org.springframework.data.projection.MethodInvocation . getMethod ( ) ) . thenReturn ( org.springframework.data.projection.PropertyAccessingMethodInterceptorUnitTests.Projection .class . java.lang.reflect.Method ( STRING ) ) ; new PropertyAccessingMethodInterceptor ( new org.springframework.data.projection.PropertyAccessingMethodInterceptorUnitTests.Source ( ) ) . invoke ( org.springframework.data.projection.MethodInvocation ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Throwable { when ( org.springframework.data.projection.MethodInvocation . getMethod ( ) ) . thenReturn ( java.lang.Object .class . java.lang.reflect.Method ( STRING ) ) ; new PropertyAccessingMethodInterceptor ( new org.springframework.data.projection.PropertyAccessingMethodInterceptorUnitTests.Source ( ) ) . invoke ( org.springframework.data.projection.MethodInvocation ) ; }  <METHOD_END>
<METHOD_START> @ Test ( expected = java.lang.IllegalStateException .class ) public void void ( ) java.lang.Throwable { when ( org.springframework.data.projection.MethodInvocation . getMethod ( ) ) . thenReturn ( org.springframework.data.projection.PropertyAccessingMethodInterceptorUnitTests.Projection .class . java.lang.reflect.Method ( STRING ) ) ; new PropertyAccessingMethodInterceptor ( new org.springframework.data.projection.PropertyAccessingMethodInterceptorUnitTests.Source ( ) ) . invoke ( org.springframework.data.projection.MethodInvocation ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Throwable { org.springframework.data.projection.PropertyAccessingMethodInterceptorUnitTests.Source org.springframework.data.projection.PropertyAccessingMethodInterceptorUnitTests.Source = new org.springframework.data.projection.PropertyAccessingMethodInterceptorUnitTests.Source ( ) ; org.springframework.data.projection.PropertyAccessingMethodInterceptorUnitTests.Source . java.lang.String = STRING ; when ( org.springframework.data.projection.MethodInvocation . getMethod ( ) ) . thenReturn ( org.springframework.data.projection.PropertyAccessingMethodInterceptorUnitTests.Projection .class . java.lang.reflect.Method ( STRING , java.lang.String .class ) ) ; when ( org.springframework.data.projection.MethodInvocation . getArguments ( ) ) . thenReturn ( new java.lang.Object [] { STRING } ) ; new PropertyAccessingMethodInterceptor ( org.springframework.data.projection.PropertyAccessingMethodInterceptorUnitTests.Source ) . invoke ( org.springframework.data.projection.MethodInvocation ) ; assertThat ( org.springframework.data.projection.PropertyAccessingMethodInterceptorUnitTests.Source . java.lang.String ) . isEqualTo ( STRING ) ; }  <METHOD_END>
<METHOD_START> @ Test ( expected = java.lang.IllegalStateException .class ) public void void ( ) java.lang.Throwable { org.springframework.data.projection.PropertyAccessingMethodInterceptorUnitTests.Source org.springframework.data.projection.PropertyAccessingMethodInterceptorUnitTests.Source = new org.springframework.data.projection.PropertyAccessingMethodInterceptorUnitTests.Source ( ) ; when ( org.springframework.data.projection.MethodInvocation . getMethod ( ) ) . thenReturn ( org.springframework.data.projection.PropertyAccessingMethodInterceptorUnitTests.Projection .class . java.lang.reflect.Method ( STRING , java.lang.String .class ) ) ; when ( org.springframework.data.projection.MethodInvocation . getArguments ( ) ) . thenReturn ( new java.lang.Object [ NUMBER ] ) ; new PropertyAccessingMethodInterceptor ( org.springframework.data.projection.PropertyAccessingMethodInterceptorUnitTests.Source ) . invoke ( org.springframework.data.projection.MethodInvocation ) ; }  <METHOD_END>
<METHOD_START> @ Test ( expected = NotWritablePropertyException .class ) public void void ( ) java.lang.Throwable { when ( org.springframework.data.projection.MethodInvocation . getMethod ( ) ) . thenReturn ( org.springframework.data.projection.PropertyAccessingMethodInterceptorUnitTests.Projection .class . java.lang.reflect.Method ( STRING , java.lang.String .class ) ) ; when ( org.springframework.data.projection.MethodInvocation . getArguments ( ) ) . thenReturn ( new java.lang.Object [] { STRING } ) ; new PropertyAccessingMethodInterceptor ( new org.springframework.data.projection.PropertyAccessingMethodInterceptorUnitTests.Source ( ) ) . invoke ( org.springframework.data.projection.MethodInvocation ) ; }  <METHOD_END>
<METHOD_START> java.lang.String java.lang.String ( )  <METHOD_END>
<METHOD_START> void void ( java.lang.String java.lang.String );  <METHOD_END>
<METHOD_START> void void ( java.lang.String java.lang.String );  <METHOD_END>
<METHOD_START> java.lang.String java.lang.String ( )  <METHOD_END>
<METHOD_START> java.lang.String java.lang.String ( )  <METHOD_END>