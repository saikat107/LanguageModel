<METHOD_START> @ java.lang.Override public boolean boolean ( MethodParameter org.springframework.messaging.simp.annotation.support.MethodParameter ) { java.lang.Class<?> < ? > java.lang.Class<?> = org.springframework.messaging.simp.annotation.support.MethodParameter . getParameterType ( ) ; return java.security.Principal .class . boolean ( java.lang.Class<> ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public java.lang.Object java.lang.Object ( MethodParameter org.springframework.messaging.simp.annotation.support.MethodParameter , Message < ? > org.springframework.messaging.simp.annotation.support.Message<?> ) throws java.lang.Exception { java.security.Principal java.security.Principal = SimpMessageHeaderAccessor . getUser ( org.springframework.messaging.simp.annotation.support.Message<> . getHeaders ( ) ) ; if ( java.security.Principal == null ) { throw new MissingSessionUserException ( org.springframework.messaging.simp.annotation.support.Message<> ) ; } return java.security.Principal ; }  <METHOD_END>
