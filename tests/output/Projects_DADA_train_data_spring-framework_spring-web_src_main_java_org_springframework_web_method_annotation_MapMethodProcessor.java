<METHOD_START> @ java.lang.Override public boolean boolean ( MethodParameter org.springframework.web.method.annotation.MethodParameter ) { return java.util.Map .class . boolean ( org.springframework.web.method.annotation.MethodParameter . getParameterType ( ) ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public java.lang.Object java.lang.Object ( MethodParameter org.springframework.web.method.annotation.MethodParameter , ModelAndViewContainer org.springframework.web.method.annotation.ModelAndViewContainer , NativeWebRequest org.springframework.web.method.annotation.NativeWebRequest , WebDataBinderFactory org.springframework.web.method.annotation.WebDataBinderFactory ) throws java.lang.Exception { return org.springframework.web.method.annotation.ModelAndViewContainer . getModel ( ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public boolean boolean ( MethodParameter org.springframework.web.method.annotation.MethodParameter ) { return java.util.Map .class . boolean ( org.springframework.web.method.annotation.MethodParameter . getParameterType ( ) ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override @ java.lang.SuppressWarnings ( { STRING , STRING } ) public void void ( java.lang.Object java.lang.Object , MethodParameter org.springframework.web.method.annotation.MethodParameter , ModelAndViewContainer org.springframework.web.method.annotation.ModelAndViewContainer , NativeWebRequest org.springframework.web.method.annotation.NativeWebRequest ) throws java.lang.Exception { if ( java.lang.Object == null ) { return; } else if ( java.lang.Object instanceof java.util.Map ) { org.springframework.web.method.annotation.ModelAndViewContainer . addAllAttributes ( ( java.util.Map ) java.lang.Object ) ; } else { throw new java.lang.UnsupportedOperationException ( STRING + org.springframework.web.method.annotation.MethodParameter . getParameterType ( ) . getName ( ) + STRING + org.springframework.web.method.annotation.MethodParameter . getMethod ( ) ) ; } }  <METHOD_END>
