<METHOD_START> @ Test public void void ( ) { MessageChannel org.springframework.integration.config.xml.MessageChannel = org.springframework.integration.config.xml.ApplicationContext . getBean ( STRING , MessageChannel .class ) ; QueueChannel org.springframework.integration.config.xml.QueueChannel = new QueueChannel ( ) ; Message < ? > org.springframework.integration.config.xml.Message<?> = MessageBuilder . withPayload ( STRING ) . setReplyChannel ( org.springframework.integration.config.xml.QueueChannel ) . build ( ) ; org.springframework.integration.config.xml.MessageChannel . send ( org.springframework.integration.config.xml.Message<> ) ; Message < ? > org.springframework.integration.config.xml.Message<?> = org.springframework.integration.config.xml.QueueChannel . receive ( NUMBER ) ; assertNotNull ( org.springframework.integration.config.xml.Message<> ) ; assertEquals ( STRING , org.springframework.integration.config.xml.Message<> . getPayload ( ) ) ; assertEquals ( org.springframework.integration.config.xml.QueueChannel , org.springframework.integration.config.xml.Message<> . getHeaders ( ) . getReplyChannel ( ) ) ; assertEquals ( NUMBER , org.springframework.integration.config.xml.Message<> . getHeaders ( ) . get ( STRING ) ) ; assertEquals ( STRING , org.springframework.integration.config.xml.Message<> . getHeaders ( ) . get ( STRING ) ) ; assertEquals ( STRING , org.springframework.integration.config.xml.Message<> . getHeaders ( ) . get ( STRING ) ) ; }  <METHOD_END>
<METHOD_START> public java.lang.String java.lang.String ( java.lang.String java.lang.String ) { return java.lang.String . java.lang.String ( ) ; }  <METHOD_END>
<METHOD_START> public java.util.Map<java.lang.String,java.lang.Object> < java.lang.String , java.lang.Object > java.util.Map<java.lang.String,java.lang.Object> ( ) { java.util.Map<java.lang.String,java.lang.Object> < java.lang.String , java.lang.Object > java.util.Map<java.lang.String,java.lang.Object> = new java.util.HashMap<java.lang.String,java.lang.Object> < java.lang.String , java.lang.Object > ( ) ; java.util.Map<java.lang.String,java.lang.Object> . java.lang.Object ( STRING , NUMBER ) ; java.util.Map<java.lang.String,java.lang.Object> . java.lang.Object ( STRING , STRING ) ; return java.util.Map<java.lang.String,java.lang.Object> ; }  <METHOD_END>
