<METHOD_START> public void ( Message < ? > org.springframework.integration.store.Message<?> ) { Assert . notNull ( org.springframework.integration.store.Message<> , STRING ) ; this . org.springframework.integration.store.Message<?> = org.springframework.integration.store.Message<> ; this . org.springframework.integration.store.MessageMetadata = new MessageMetadata ( org.springframework.integration.store.Message<> . getHeaders ( ) . getId ( ) ) ; this . org.springframework.integration.store.MessageMetadata . setTimestamp ( java.lang.System . long ( ) ) ; }  <METHOD_END>
<METHOD_START> public void void ( long long ) { this . org.springframework.integration.store.MessageMetadata . setTimestamp ( long ) ; }  <METHOD_END>
<METHOD_START> public org.springframework.integration.store.Message<?> < ? > org.springframework.integration.store.Message<?> ( ) { return this . org.springframework.integration.store.Message<> ; }  <METHOD_END>
<METHOD_START> public org.springframework.integration.store.MessageMetadata org.springframework.integration.store.MessageMetadata ( ) { return this . org.springframework.integration.store.MessageMetadata ; }  <METHOD_END>
