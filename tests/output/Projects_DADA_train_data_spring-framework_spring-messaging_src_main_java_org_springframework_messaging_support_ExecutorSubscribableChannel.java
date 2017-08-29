<METHOD_START> public void ( ) { this( null ); }  <METHOD_END>
<METHOD_START> public void ( java.util.concurrent.Executor java.util.concurrent.Executor ) { this . java.util.concurrent.Executor = java.util.concurrent.Executor ; }  <METHOD_END>
<METHOD_START> public java.util.concurrent.Executor java.util.concurrent.Executor ( ) { return this . java.util.concurrent.Executor ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( java.util.List<org.springframework.messaging.support.ChannelInterceptor> < ChannelInterceptor > java.util.List<org.springframework.messaging.support.ChannelInterceptor> ) { super. setInterceptors ( java.util.List<org.springframework.messaging.support.ChannelInterceptor> ) ; this . java.util.List<org.springframework.messaging.support.ExecutorChannelInterceptor> . clear ( ) ; for ( ChannelInterceptor org.springframework.messaging.support.ChannelInterceptor : java.util.List<org.springframework.messaging.support.ChannelInterceptor> ) { if ( org.springframework.messaging.support.ChannelInterceptor instanceof ExecutorChannelInterceptor ) { this . java.util.List<org.springframework.messaging.support.ExecutorChannelInterceptor> . add ( ( ExecutorChannelInterceptor ) org.springframework.messaging.support.ChannelInterceptor ) ; } } }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( ChannelInterceptor org.springframework.messaging.support.ChannelInterceptor ) { super. addInterceptor ( org.springframework.messaging.support.ChannelInterceptor ) ; if ( org.springframework.messaging.support.ChannelInterceptor instanceof ExecutorChannelInterceptor ) { this . java.util.List<org.springframework.messaging.support.ExecutorChannelInterceptor> . add ( ( ExecutorChannelInterceptor ) org.springframework.messaging.support.ChannelInterceptor ) ; } }  <METHOD_END>
<METHOD_START> @ java.lang.Override public boolean boolean ( Message < ? > org.springframework.messaging.support.Message<?> , long long ) { for ( MessageHandler org.springframework.messaging.support.MessageHandler : getSubscribers ( ) ) { org.springframework.messaging.support.ExecutorSubscribableChannel.SendTask org.springframework.messaging.support.ExecutorSubscribableChannel.SendTask = new org.springframework.messaging.support.ExecutorSubscribableChannel.SendTask ( org.springframework.messaging.support.Message<> , org.springframework.messaging.support.MessageHandler ) ; if ( this . java.util.concurrent.Executor == null ) { org.springframework.messaging.support.ExecutorSubscribableChannel.SendTask . void ( ) ; } else { this . java.util.concurrent.Executor . void ( org.springframework.messaging.support.ExecutorSubscribableChannel.SendTask ) ; } } return true ; }  <METHOD_END>
<METHOD_START> public void ( Message < ? > org.springframework.messaging.support.Message<?> , MessageHandler org.springframework.messaging.support.MessageHandler ) { this . org.springframework.messaging.support.Message<?> = org.springframework.messaging.support.Message<> ; this . org.springframework.messaging.support.MessageHandler = org.springframework.messaging.support.MessageHandler ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public org.springframework.messaging.support.Message<?> < ? > org.springframework.messaging.support.Message<?> ( ) { return this . org.springframework.messaging.support.Message<> ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public org.springframework.messaging.support.MessageHandler org.springframework.messaging.support.MessageHandler ( ) { return this . org.springframework.messaging.support.MessageHandler ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( ) { Message < ? > org.springframework.messaging.support.Message<?> = this . org.springframework.messaging.support.Message<> ; try { org.springframework.messaging.support.Message<?> = org.springframework.messaging.support.Message<?> ( org.springframework.messaging.support.Message<> ) ; if ( org.springframework.messaging.support.Message<> == null ) { return; } this . org.springframework.messaging.support.MessageHandler . handleMessage ( org.springframework.messaging.support.Message<> ) ; void ( org.springframework.messaging.support.Message<> , null ) ; } catch ( java.lang.Exception java.lang.Exception ) { void ( org.springframework.messaging.support.Message<> , java.lang.Exception ) ; if ( java.lang.Exception instanceof MessagingException ) { throw ( MessagingException ) java.lang.Exception ; } java.lang.String java.lang.String = STRING + org.springframework.messaging.support.Message<> + STRING + this + STRING + this . org.springframework.messaging.support.MessageHandler ; throw new MessageDeliveryException ( org.springframework.messaging.support.Message<> , java.lang.String , java.lang.Exception ) ; } catch ( java.lang.Throwable java.lang.Throwable ) { java.lang.String java.lang.String = STRING + org.springframework.messaging.support.Message<> + STRING + this + STRING + this . org.springframework.messaging.support.MessageHandler ; MessageDeliveryException org.springframework.messaging.support.MessageDeliveryException = new MessageDeliveryException ( org.springframework.messaging.support.Message<> , java.lang.String , java.lang.Throwable ) ; void ( org.springframework.messaging.support.Message<> , org.springframework.messaging.support.MessageDeliveryException ) ; throw org.springframework.messaging.support.MessageDeliveryException ; } }  <METHOD_END>
<METHOD_START> private org.springframework.messaging.support.Message<?> < ? > org.springframework.messaging.support.Message<?> ( Message < ? > org.springframework.messaging.support.Message<?> ) { for ( ExecutorChannelInterceptor org.springframework.messaging.support.ExecutorChannelInterceptor : java.util.List<org.springframework.messaging.support.ExecutorChannelInterceptor> ) { org.springframework.messaging.support.Message<?> = org.springframework.messaging.support.ExecutorChannelInterceptor . beforeHandle ( org.springframework.messaging.support.Message<> , org.springframework.messaging.support.ExecutorSubscribableChannel .this , this . org.springframework.messaging.support.MessageHandler ) ; if ( org.springframework.messaging.support.Message<> == null ) { java.lang.String java.lang.String = org.springframework.messaging.support.ExecutorChannelInterceptor . getClass ( ) . getSimpleName ( ) ; if ( logger . isDebugEnabled ( ) ) { logger . debug ( java.lang.String + STRING ) ; } void ( org.springframework.messaging.support.Message<> , null ) ; return null ; } this . int ++ ; } return org.springframework.messaging.support.Message<> ; }  <METHOD_END>
<METHOD_START> private void void ( Message < ? > org.springframework.messaging.support.Message<?> , java.lang.Exception java.lang.Exception ) { for ( int int = this . int ; int >= NUMBER ; int -- ) { ExecutorChannelInterceptor org.springframework.messaging.support.ExecutorChannelInterceptor = java.util.List<org.springframework.messaging.support.ExecutorChannelInterceptor> . get ( int ) ; try { org.springframework.messaging.support.ExecutorChannelInterceptor . afterMessageHandled ( org.springframework.messaging.support.Message<> , org.springframework.messaging.support.ExecutorSubscribableChannel .this , this . org.springframework.messaging.support.MessageHandler , java.lang.Exception ) ; } catch ( java.lang.Throwable java.lang.Throwable ) { logger . error ( STRING + org.springframework.messaging.support.ExecutorChannelInterceptor , java.lang.Throwable ) ; } } }  <METHOD_END>
