<METHOD_START> public void ( ConfigurableBeanFactory org.springframework.web.method.annotation.ConfigurableBeanFactory ) { super( org.springframework.web.method.annotation.ConfigurableBeanFactory ); }  <METHOD_END>
<METHOD_START> @ java.lang.Override public boolean boolean ( MethodParameter org.springframework.web.method.annotation.MethodParameter ) { return org.springframework.web.method.annotation.MethodParameter . hasParameterAnnotation ( Value .class ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override protected org.springframework.web.method.annotation.NamedValueInfo org.springframework.web.method.annotation.NamedValueInfo ( MethodParameter org.springframework.web.method.annotation.MethodParameter ) { Value org.springframework.web.method.annotation.Value = org.springframework.web.method.annotation.MethodParameter . getParameterAnnotation ( Value .class ) ; return new org.springframework.web.method.annotation.ExpressionValueMethodArgumentResolver.ExpressionValueNamedValueInfo ( org.springframework.web.method.annotation.Value ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override protected java.lang.Object java.lang.Object ( java.lang.String java.lang.String , MethodParameter org.springframework.web.method.annotation.MethodParameter , NativeWebRequest org.springframework.web.method.annotation.NativeWebRequest ) throws java.lang.Exception { return null ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override protected void void ( java.lang.String java.lang.String , MethodParameter org.springframework.web.method.annotation.MethodParameter ) throws org.springframework.web.method.annotation.ServletException { throw new java.lang.UnsupportedOperationException ( STRING + org.springframework.web.method.annotation.MethodParameter . getMethod ( ) ) ; }  <METHOD_END>
<METHOD_START> private void ( Value org.springframework.web.method.annotation.Value ) { super( STRING , false , org.springframework.web.method.annotation.Value . value ( ) ); }  <METHOD_END>
