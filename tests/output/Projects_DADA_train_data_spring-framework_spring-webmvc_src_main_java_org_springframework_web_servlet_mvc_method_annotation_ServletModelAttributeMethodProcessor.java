<METHOD_START> public void ( boolean boolean ) { super( boolean ); }  <METHOD_END>
<METHOD_START> @ java.lang.Override protected final java.lang.Object java.lang.Object ( java.lang.String java.lang.String , MethodParameter org.springframework.web.servlet.mvc.method.annotation.MethodParameter , WebDataBinderFactory org.springframework.web.servlet.mvc.method.annotation.WebDataBinderFactory , NativeWebRequest org.springframework.web.servlet.mvc.method.annotation.NativeWebRequest ) throws java.lang.Exception { java.lang.String java.lang.String = java.lang.String ( java.lang.String , org.springframework.web.servlet.mvc.method.annotation.NativeWebRequest ) ; if ( java.lang.String != null ) { java.lang.Object java.lang.Object = java.lang.Object ( java.lang.String , java.lang.String , org.springframework.web.servlet.mvc.method.annotation.MethodParameter , org.springframework.web.servlet.mvc.method.annotation.WebDataBinderFactory , org.springframework.web.servlet.mvc.method.annotation.NativeWebRequest ) ; if ( java.lang.Object != null ) { return java.lang.Object ; } } return super. createAttribute ( java.lang.String , org.springframework.web.servlet.mvc.method.annotation.MethodParameter , org.springframework.web.servlet.mvc.method.annotation.WebDataBinderFactory , org.springframework.web.servlet.mvc.method.annotation.NativeWebRequest ) ; }  <METHOD_END>
<METHOD_START> protected java.lang.String java.lang.String ( java.lang.String java.lang.String , NativeWebRequest org.springframework.web.servlet.mvc.method.annotation.NativeWebRequest ) { java.util.Map<java.lang.String,java.lang.String> < java.lang.String , java.lang.String > java.util.Map<java.lang.String,java.lang.String> = java.util.Map<java.lang.String,java.lang.String> ( org.springframework.web.servlet.mvc.method.annotation.NativeWebRequest ) ; java.lang.String java.lang.String = java.util.Map<java.lang.String,java.lang.String> . java.lang.String ( java.lang.String ) ; if ( StringUtils . hasText ( java.lang.String ) ) { return java.lang.String ; } java.lang.String java.lang.String = org.springframework.web.servlet.mvc.method.annotation.NativeWebRequest . getParameter ( java.lang.String ) ; if ( StringUtils . hasText ( java.lang.String ) ) { return java.lang.String ; } return null ; }  <METHOD_END>
<METHOD_START> @ java.lang.SuppressWarnings ( STRING ) protected final java.util.Map<java.lang.String,java.lang.String> < java.lang.String , java.lang.String > java.util.Map<java.lang.String,java.lang.String> ( NativeWebRequest org.springframework.web.servlet.mvc.method.annotation.NativeWebRequest ) { java.util.Map<java.lang.String,java.lang.String> < java.lang.String , java.lang.String > java.util.Map<java.lang.String,java.lang.String> = ( java.util.Map<java.lang.String,java.lang.String> < java.lang.String , java.lang.String > ) org.springframework.web.servlet.mvc.method.annotation.NativeWebRequest . getAttribute ( HandlerMapping . URI_TEMPLATE_VARIABLES_ATTRIBUTE , RequestAttributes . SCOPE_REQUEST ) ; return ( java.util.Map<java.lang.String,java.lang.String> != null ? java.util.Map<java.lang.String,java.lang.String> : java.util.Collections . java.util.Map<java.lang.String,java.lang.String> ( ) ) ; }  <METHOD_END>
<METHOD_START> protected java.lang.Object java.lang.Object ( java.lang.String java.lang.String , java.lang.String java.lang.String , MethodParameter org.springframework.web.servlet.mvc.method.annotation.MethodParameter , WebDataBinderFactory org.springframework.web.servlet.mvc.method.annotation.WebDataBinderFactory , NativeWebRequest org.springframework.web.servlet.mvc.method.annotation.NativeWebRequest )			throws java.lang.Exception { DataBinder org.springframework.web.servlet.mvc.method.annotation.DataBinder = org.springframework.web.servlet.mvc.method.annotation.WebDataBinderFactory . createBinder ( org.springframework.web.servlet.mvc.method.annotation.NativeWebRequest , null , java.lang.String ) ; ConversionService org.springframework.web.servlet.mvc.method.annotation.ConversionService = org.springframework.web.servlet.mvc.method.annotation.DataBinder . getConversionService ( ) ; if ( org.springframework.web.servlet.mvc.method.annotation.ConversionService != null ) { TypeDescriptor org.springframework.web.servlet.mvc.method.annotation.TypeDescriptor = TypeDescriptor . valueOf ( java.lang.String .class ) ; TypeDescriptor org.springframework.web.servlet.mvc.method.annotation.TypeDescriptor = new TypeDescriptor ( org.springframework.web.servlet.mvc.method.annotation.MethodParameter ) ; if ( org.springframework.web.servlet.mvc.method.annotation.ConversionService . canConvert ( org.springframework.web.servlet.mvc.method.annotation.TypeDescriptor , org.springframework.web.servlet.mvc.method.annotation.TypeDescriptor ) ) { return org.springframework.web.servlet.mvc.method.annotation.DataBinder . convertIfNecessary ( java.lang.String , org.springframework.web.servlet.mvc.method.annotation.MethodParameter . getParameterType ( ) , org.springframework.web.servlet.mvc.method.annotation.MethodParameter ) ; } } return null ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override protected void void ( WebDataBinder org.springframework.web.servlet.mvc.method.annotation.WebDataBinder , NativeWebRequest org.springframework.web.servlet.mvc.method.annotation.NativeWebRequest ) { ServletRequest org.springframework.web.servlet.mvc.method.annotation.ServletRequest = org.springframework.web.servlet.mvc.method.annotation.NativeWebRequest . getNativeRequest ( ServletRequest .class ) ; ServletRequestDataBinder org.springframework.web.servlet.mvc.method.annotation.ServletRequestDataBinder = ( ServletRequestDataBinder ) org.springframework.web.servlet.mvc.method.annotation.WebDataBinder ; org.springframework.web.servlet.mvc.method.annotation.ServletRequestDataBinder . bind ( org.springframework.web.servlet.mvc.method.annotation.ServletRequest ) ; }  <METHOD_END>