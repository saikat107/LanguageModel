<METHOD_START> public static org.springframework.data.web.NativeWebRequest org.springframework.data.web.NativeWebRequest ( ) { return new ServletWebRequest ( new MockHttpServletRequest ( ) ) ; }  <METHOD_END>
<METHOD_START> public static org.springframework.data.web.MethodParameter org.springframework.data.web.MethodParameter ( java.lang.Class<?> < ? > java.lang.Class<?> , java.lang.String java.lang.String , java.lang.Class<?> < ? > ... java.lang.Class<?>[] ) { java.lang.reflect.Method java.lang.reflect.Method = java.lang.reflect.Method ( java.lang.Class<> , java.lang.String , java.lang.Class<?>[] ) ; return new MethodParameter ( java.lang.reflect.Method , NUMBER ) ; }  <METHOD_END>
<METHOD_START> public static java.lang.reflect.Method java.lang.reflect.Method ( java.lang.Class<?> < ? > java.lang.Class<?> , java.lang.String java.lang.String , java.lang.Class<?> < ? > ... java.lang.Class<?>[] ) { try { return java.lang.Class<> . java.lang.reflect.Method ( java.lang.String , java.lang.Class<?>[] ) ; } catch ( java.lang.Exception java.lang.Exception ) { throw new java.lang.RuntimeException ( java.lang.Exception ) ; } }  <METHOD_END>