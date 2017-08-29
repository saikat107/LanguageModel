<METHOD_START> public void void ( DestinationResolver < D > org.springframework.messaging.core.DestinationResolver<D> ) { Assert . notNull ( org.springframework.messaging.core.DestinationResolver<D> , STRING ) ; this . org.springframework.messaging.core.DestinationResolver<D> = org.springframework.messaging.core.DestinationResolver<D> ; }  <METHOD_END>
<METHOD_START> public org.springframework.messaging.core.DestinationResolver<D> < D > org.springframework.messaging.core.DestinationResolver<D> ( ) { return this . org.springframework.messaging.core.DestinationResolver<D> ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( java.lang.String java.lang.String , Message < ? > org.springframework.messaging.core.Message<?> ) { D D = D ( java.lang.String ) ; doSend ( D , org.springframework.messaging.core.Message<> ) ; }  <METHOD_END>
<METHOD_START> protected final D D ( java.lang.String java.lang.String ) { Assert . state ( this . org.springframework.messaging.core.DestinationResolver<D> != null , STRING ) ; return this . org.springframework.messaging.core.DestinationResolver<D> . resolveDestination ( java.lang.String ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public < T > void void ( java.lang.String java.lang.String , T T ) { void ( java.lang.String , T , null , null ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public < T > void void ( java.lang.String java.lang.String , T T , java.util.Map<java.lang.String,java.lang.Object> < java.lang.String , java.lang.Object > java.util.Map<java.lang.String,java.lang.Object> ) { void ( java.lang.String , T , java.util.Map<java.lang.String,java.lang.Object> , null ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public < T > void void ( java.lang.String java.lang.String , T T , MessagePostProcessor org.springframework.messaging.core.MessagePostProcessor ) { void ( java.lang.String , T , null , org.springframework.messaging.core.MessagePostProcessor ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public < T > void void ( java.lang.String java.lang.String , T T , java.util.Map<java.lang.String,java.lang.Object> < java.lang.String , java.lang.Object > java.util.Map<java.lang.String,java.lang.Object> , MessagePostProcessor org.springframework.messaging.core.MessagePostProcessor ) { D D = D ( java.lang.String ) ; super. convertAndSend ( D , T , java.util.Map<java.lang.String,java.lang.Object> , org.springframework.messaging.core.MessagePostProcessor ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public org.springframework.messaging.core.Message<?> < ? > org.springframework.messaging.core.Message<?> ( java.lang.String java.lang.String ) { D D = D ( java.lang.String ) ; return super. receive ( D ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public < T > T T ( java.lang.String java.lang.String , java.lang.Class<T> < T > java.lang.Class<T> ) { D D = D ( java.lang.String ) ; return super. receiveAndConvert ( D , java.lang.Class<T> ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public org.springframework.messaging.core.Message<?> < ? > org.springframework.messaging.core.Message<?> ( java.lang.String java.lang.String , Message < ? > org.springframework.messaging.core.Message<?> ) { D D = D ( java.lang.String ) ; return super. sendAndReceive ( D , org.springframework.messaging.core.Message<> ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public < T > T T ( java.lang.String java.lang.String , java.lang.Object java.lang.Object , java.lang.Class<T> < T > java.lang.Class<T> ) { D D = D ( java.lang.String ) ; return super. convertSendAndReceive ( D , java.lang.Object , java.lang.Class<T> ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public < T > T T ( java.lang.String java.lang.String , java.lang.Object java.lang.Object , java.util.Map<java.lang.String,java.lang.Object> < java.lang.String , java.lang.Object > java.util.Map<java.lang.String,java.lang.Object> , java.lang.Class<T> < T > java.lang.Class<T> ) { D D = D ( java.lang.String ) ; return super. convertSendAndReceive ( D , java.lang.Object , java.util.Map<java.lang.String,java.lang.Object> , java.lang.Class<T> ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public < T > T T ( java.lang.String java.lang.String , java.lang.Object java.lang.Object , java.lang.Class<T> < T > java.lang.Class<T> , MessagePostProcessor org.springframework.messaging.core.MessagePostProcessor ) { D D = D ( java.lang.String ) ; return super. convertSendAndReceive ( D , java.lang.Object , java.lang.Class<T> , org.springframework.messaging.core.MessagePostProcessor ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public < T > T T ( java.lang.String java.lang.String , java.lang.Object java.lang.Object , java.util.Map<java.lang.String,java.lang.Object> < java.lang.String , java.lang.Object > java.util.Map<java.lang.String,java.lang.Object> , java.lang.Class<T> < T > java.lang.Class<T> , MessagePostProcessor org.springframework.messaging.core.MessagePostProcessor ) { D D = D ( java.lang.String ) ; return super. convertSendAndReceive ( D , java.lang.Object , java.util.Map<java.lang.String,java.lang.Object> , java.lang.Class<T> , org.springframework.messaging.core.MessagePostProcessor ) ; }  <METHOD_END>
