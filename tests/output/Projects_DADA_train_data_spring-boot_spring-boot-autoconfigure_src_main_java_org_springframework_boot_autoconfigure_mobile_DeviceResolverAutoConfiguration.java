<METHOD_START> @ Bean @ ConditionalOnMissingBean ( DeviceResolverHandlerInterceptor .class ) public org.springframework.boot.autoconfigure.mobile.DeviceResolverHandlerInterceptor org.springframework.boot.autoconfigure.mobile.DeviceResolverHandlerInterceptor ( ) { return new DeviceResolverHandlerInterceptor ( ) ; }  <METHOD_END>
<METHOD_START> @ Bean public org.springframework.boot.autoconfigure.mobile.DeviceHandlerMethodArgumentResolver org.springframework.boot.autoconfigure.mobile.DeviceHandlerMethodArgumentResolver ( ) { return new DeviceHandlerMethodArgumentResolver ( ) ; }  <METHOD_END>
<METHOD_START> protected void ( DeviceResolverHandlerInterceptor org.springframework.boot.autoconfigure.mobile.DeviceResolverHandlerInterceptor , DeviceHandlerMethodArgumentResolver org.springframework.boot.autoconfigure.mobile.DeviceHandlerMethodArgumentResolver ) { this . org.springframework.boot.autoconfigure.mobile.DeviceResolverHandlerInterceptor = org.springframework.boot.autoconfigure.mobile.DeviceResolverHandlerInterceptor ; this . org.springframework.boot.autoconfigure.mobile.DeviceHandlerMethodArgumentResolver = org.springframework.boot.autoconfigure.mobile.DeviceHandlerMethodArgumentResolver ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( InterceptorRegistry org.springframework.boot.autoconfigure.mobile.InterceptorRegistry ) { org.springframework.boot.autoconfigure.mobile.InterceptorRegistry . addInterceptor ( this . org.springframework.boot.autoconfigure.mobile.DeviceResolverHandlerInterceptor ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( java.util.List<org.springframework.boot.autoconfigure.mobile.HandlerMethodArgumentResolver> < HandlerMethodArgumentResolver > java.util.List<org.springframework.boot.autoconfigure.mobile.HandlerMethodArgumentResolver> ) { java.util.List<org.springframework.boot.autoconfigure.mobile.HandlerMethodArgumentResolver> . add ( this . org.springframework.boot.autoconfigure.mobile.DeviceHandlerMethodArgumentResolver ) ; }  <METHOD_END>