<METHOD_START> @ java.lang.Override public org.springframework.messaging.core.Message<?> < ? > org.springframework.messaging.core.Message<?> ( Message < ? > org.springframework.messaging.core.Message<?> ) { return org.springframework.messaging.core.Message<?> ( getRequiredDefaultDestination ( ) , org.springframework.messaging.core.Message<> ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public org.springframework.messaging.core.Message<?> < ? > org.springframework.messaging.core.Message<?> ( D D , Message < ? > org.springframework.messaging.core.Message<?> ) { return org.springframework.messaging.core.Message<?> ( D , org.springframework.messaging.core.Message<> ) ; }  <METHOD_END>
<METHOD_START> protected abstract org.springframework.messaging.core.Message<?> < ? > org.springframework.messaging.core.Message<?> ( D D , Message < ? > org.springframework.messaging.core.Message<?> );  <METHOD_END>
<METHOD_START> @ java.lang.Override public < T > T T ( java.lang.Object java.lang.Object , java.lang.Class<T> < T > java.lang.Class<T> ) { return java.lang.Object ( getRequiredDefaultDestination ( ) , java.lang.Object , java.lang.Class<T> ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public < T > T T ( D D , java.lang.Object java.lang.Object , java.lang.Class<T> < T > java.lang.Class<T> ) { return T ( D , java.lang.Object , null , java.lang.Class<T> ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public < T > T T ( D D , java.lang.Object java.lang.Object , java.util.Map<java.lang.String,java.lang.Object> < java.lang.String , java.lang.Object > java.util.Map<java.lang.String,java.lang.Object> , java.lang.Class<T> < T > java.lang.Class<T> ) { return T ( D , java.lang.Object , java.util.Map<java.lang.String,java.lang.Object> , java.lang.Class<T> , null ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public < T > T T ( java.lang.Object java.lang.Object , java.lang.Class<T> < T > java.lang.Class<T> , MessagePostProcessor org.springframework.messaging.core.MessagePostProcessor ) { return java.lang.Object ( getRequiredDefaultDestination ( ) , java.lang.Object , java.lang.Class<T> , org.springframework.messaging.core.MessagePostProcessor ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public < T > T T ( D D , java.lang.Object java.lang.Object , java.lang.Class<T> < T > java.lang.Class<T> , MessagePostProcessor org.springframework.messaging.core.MessagePostProcessor ) { return java.lang.Object ( D , java.lang.Object , null , java.lang.Class<T> , org.springframework.messaging.core.MessagePostProcessor ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.SuppressWarnings ( STRING ) @ java.lang.Override public < T > T T ( D D , java.lang.Object java.lang.Object , java.util.Map<java.lang.String,java.lang.Object> < java.lang.String , java.lang.Object > java.util.Map<java.lang.String,java.lang.Object> , java.lang.Class<T> < T > java.lang.Class<T> , MessagePostProcessor org.springframework.messaging.core.MessagePostProcessor ) { Message < ? > org.springframework.messaging.core.Message<?> = doConvert ( java.lang.Object , java.util.Map<java.lang.String,java.lang.Object> , org.springframework.messaging.core.MessagePostProcessor ) ; Message < ? > org.springframework.messaging.core.Message<?> = org.springframework.messaging.core.Message<?> ( D , org.springframework.messaging.core.Message<> ) ; return ( org.springframework.messaging.core.Message<> != null ? ( T ) getMessageConverter ( ) . fromMessage ( org.springframework.messaging.core.Message<> , java.lang.Class<T> ) : null ) ; }  <METHOD_END>