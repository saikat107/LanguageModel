<METHOD_START> public org.springframework.web.servlet.config.annotation.InterceptorRegistration org.springframework.web.servlet.config.annotation.InterceptorRegistration ( HandlerInterceptor org.springframework.web.servlet.config.annotation.HandlerInterceptor ) { InterceptorRegistration org.springframework.web.servlet.config.annotation.InterceptorRegistration = new InterceptorRegistration ( org.springframework.web.servlet.config.annotation.HandlerInterceptor ) ; java.util.List<org.springframework.web.servlet.config.annotation.InterceptorRegistration> . add ( org.springframework.web.servlet.config.annotation.InterceptorRegistration ) ; return org.springframework.web.servlet.config.annotation.InterceptorRegistration ; }  <METHOD_END>
<METHOD_START> public org.springframework.web.servlet.config.annotation.InterceptorRegistration org.springframework.web.servlet.config.annotation.InterceptorRegistration ( WebRequestInterceptor org.springframework.web.servlet.config.annotation.WebRequestInterceptor ) { WebRequestHandlerInterceptorAdapter org.springframework.web.servlet.config.annotation.WebRequestHandlerInterceptorAdapter = new WebRequestHandlerInterceptorAdapter ( org.springframework.web.servlet.config.annotation.WebRequestInterceptor ) ; InterceptorRegistration org.springframework.web.servlet.config.annotation.InterceptorRegistration = new InterceptorRegistration ( org.springframework.web.servlet.config.annotation.WebRequestHandlerInterceptorAdapter ) ; java.util.List<org.springframework.web.servlet.config.annotation.InterceptorRegistration> . add ( org.springframework.web.servlet.config.annotation.InterceptorRegistration ) ; return org.springframework.web.servlet.config.annotation.InterceptorRegistration ; }  <METHOD_END>
<METHOD_START> protected java.util.List<java.lang.Object> < java.lang.Object > java.util.List<java.lang.Object> ( ) { java.util.List<java.lang.Object> < java.lang.Object > java.util.List<java.lang.Object> = new java.util.ArrayList<java.lang.Object> <> ( ) ; for ( InterceptorRegistration org.springframework.web.servlet.config.annotation.InterceptorRegistration : java.util.List<org.springframework.web.servlet.config.annotation.InterceptorRegistration> ) { java.util.List<java.lang.Object> . boolean ( org.springframework.web.servlet.config.annotation.InterceptorRegistration . getInterceptor ( ) ) ; } return java.util.List<java.lang.Object> ; }  <METHOD_END>
