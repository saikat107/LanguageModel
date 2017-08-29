<METHOD_START> public static void void ( Connection org.springframework.jms.support.Connection ) { void ( org.springframework.jms.support.Connection , false ) ; }  <METHOD_END>
<METHOD_START> public static void void ( Connection org.springframework.jms.support.Connection , boolean boolean ) { if ( org.springframework.jms.support.Connection != null ) { try { if ( boolean ) { try { org.springframework.jms.support.Connection . stop ( ) ; } finally { org.springframework.jms.support.Connection . close ( ) ; } } else { org.springframework.jms.support.Connection . close ( ) ; } } catch ( javax . javax.jms . javax.jms javax.jms.IllegalStateException ) { org.springframework.jms.support.Log . debug ( STRING + javax.jms.IllegalStateException ) ; } catch ( JMSException org.springframework.jms.support.JMSException ) { org.springframework.jms.support.Log . debug ( STRING , org.springframework.jms.support.JMSException ) ; } catch ( java.lang.Throwable java.lang.Throwable ) { org.springframework.jms.support.Log . debug ( STRING , java.lang.Throwable ) ; } } }  <METHOD_END>
<METHOD_START> public static void void ( Session org.springframework.jms.support.Session ) { if ( org.springframework.jms.support.Session != null ) { try { org.springframework.jms.support.Session . close ( ) ; } catch ( JMSException org.springframework.jms.support.JMSException ) { org.springframework.jms.support.Log . trace ( STRING , org.springframework.jms.support.JMSException ) ; } catch ( java.lang.Throwable java.lang.Throwable ) { org.springframework.jms.support.Log . trace ( STRING , java.lang.Throwable ) ; } } }  <METHOD_END>
<METHOD_START> public static void void ( MessageProducer org.springframework.jms.support.MessageProducer ) { if ( org.springframework.jms.support.MessageProducer != null ) { try { org.springframework.jms.support.MessageProducer . close ( ) ; } catch ( JMSException org.springframework.jms.support.JMSException ) { org.springframework.jms.support.Log . trace ( STRING , org.springframework.jms.support.JMSException ) ; } catch ( java.lang.Throwable java.lang.Throwable ) { org.springframework.jms.support.Log . trace ( STRING , java.lang.Throwable ) ; } } }  <METHOD_END>
<METHOD_START> public static void void ( MessageConsumer org.springframework.jms.support.MessageConsumer ) { if ( org.springframework.jms.support.MessageConsumer != null ) { boolean boolean = java.lang.Thread . boolean ( ) ; try { org.springframework.jms.support.MessageConsumer . close ( ) ; } catch ( JMSException org.springframework.jms.support.JMSException ) { org.springframework.jms.support.Log . trace ( STRING , org.springframework.jms.support.JMSException ) ; } catch ( java.lang.Throwable java.lang.Throwable ) { org.springframework.jms.support.Log . trace ( STRING , java.lang.Throwable ) ; } finally { if ( boolean ) { java.lang.Thread . java.lang.Thread ( ) . void ( ) ; } } } }  <METHOD_END>
<METHOD_START> public static void void ( QueueBrowser org.springframework.jms.support.QueueBrowser ) { if ( org.springframework.jms.support.QueueBrowser != null ) { try { org.springframework.jms.support.QueueBrowser . close ( ) ; } catch ( JMSException org.springframework.jms.support.JMSException ) { org.springframework.jms.support.Log . trace ( STRING , org.springframework.jms.support.JMSException ) ; } catch ( java.lang.Throwable java.lang.Throwable ) { org.springframework.jms.support.Log . trace ( STRING , java.lang.Throwable ) ; } } }  <METHOD_END>
<METHOD_START> public static void void ( QueueRequestor org.springframework.jms.support.QueueRequestor ) { if ( org.springframework.jms.support.QueueRequestor != null ) { try { org.springframework.jms.support.QueueRequestor . close ( ) ; } catch ( JMSException org.springframework.jms.support.JMSException ) { org.springframework.jms.support.Log . trace ( STRING , org.springframework.jms.support.JMSException ) ; } catch ( java.lang.Throwable java.lang.Throwable ) { org.springframework.jms.support.Log . trace ( STRING , java.lang.Throwable ) ; } } }  <METHOD_END>
<METHOD_START> public static void void ( Session org.springframework.jms.support.Session ) throws org.springframework.jms.support.JMSException { Assert . notNull ( org.springframework.jms.support.Session , STRING ) ; try { org.springframework.jms.support.Session . commit ( ) ; } catch ( javax . javax.jms . javax.jms javax.jms.TransactionInProgressException ) { } catch ( javax . javax.jms . javax.jms javax.jms.IllegalStateException ) { } }  <METHOD_END>
<METHOD_START> public static void void ( Session org.springframework.jms.support.Session ) throws org.springframework.jms.support.JMSException { Assert . notNull ( org.springframework.jms.support.Session , STRING ) ; try { org.springframework.jms.support.Session . rollback ( ) ; } catch ( javax . javax.jms . javax.jms javax.jms.TransactionInProgressException ) { } catch ( javax . javax.jms . javax.jms javax.jms.IllegalStateException ) { } }  <METHOD_END>
<METHOD_START> public static java.lang.String java.lang.String ( JMSException org.springframework.jms.support.JMSException ) { java.lang.String java.lang.String = org.springframework.jms.support.JMSException . getMessage ( ) ; java.lang.Exception java.lang.Exception = org.springframework.jms.support.JMSException . getLinkedException ( ) ; if ( java.lang.Exception != null ) { if ( java.lang.String == null ) { java.lang.String = java.lang.Exception . java.lang.String ( ) ; } else { java.lang.String java.lang.String = java.lang.Exception . java.lang.String ( ) ; if ( java.lang.String != null && ! java.lang.String . boolean ( java.lang.String ) ) { java.lang.String = java.lang.String + STRING + java.lang.Exception ; } } } return java.lang.String ; }  <METHOD_END>
<METHOD_START> public static org.springframework.jms.support.JmsException org.springframework.jms.support.JmsException ( JMSException org.springframework.jms.support.JMSException ) { Assert . notNull ( org.springframework.jms.support.JMSException , STRING ) ; if ( org.springframework.jms.support.JMSException instanceof javax . javax.jms . javax.jms ) { return new org . springframework . jms . org.springframework.jms.IllegalStateException ( ( javax . javax.jms . javax.jms ) org.springframework.jms.support.JMSException ) ; } if ( org.springframework.jms.support.JMSException instanceof javax . javax.jms . javax.jms ) { return new InvalidClientIDException ( ( javax . javax.jms . javax.jms ) org.springframework.jms.support.JMSException ) ; } if ( org.springframework.jms.support.JMSException instanceof javax . javax.jms . javax.jms ) { return new InvalidDestinationException ( ( javax . javax.jms . javax.jms ) org.springframework.jms.support.JMSException ) ; } if ( org.springframework.jms.support.JMSException instanceof javax . javax.jms . javax.jms ) { return new InvalidSelectorException ( ( javax . javax.jms . javax.jms ) org.springframework.jms.support.JMSException ) ; } if ( org.springframework.jms.support.JMSException instanceof javax . javax.jms . javax.jms ) { return new JmsSecurityException ( ( javax . javax.jms . javax.jms ) org.springframework.jms.support.JMSException ) ; } if ( org.springframework.jms.support.JMSException instanceof javax . javax.jms . javax.jms ) { return new MessageEOFException ( ( javax . javax.jms . javax.jms ) org.springframework.jms.support.JMSException ) ; } if ( org.springframework.jms.support.JMSException instanceof javax . javax.jms . javax.jms ) { return new MessageFormatException ( ( javax . javax.jms . javax.jms ) org.springframework.jms.support.JMSException ) ; } if ( org.springframework.jms.support.JMSException instanceof javax . javax.jms . javax.jms ) { return new MessageNotReadableException ( ( javax . javax.jms . javax.jms ) org.springframework.jms.support.JMSException ) ; } if ( org.springframework.jms.support.JMSException instanceof javax . javax.jms . javax.jms ) { return new MessageNotWriteableException ( ( javax . javax.jms . javax.jms ) org.springframework.jms.support.JMSException ) ; } if ( org.springframework.jms.support.JMSException instanceof javax . javax.jms . javax.jms ) { return new ResourceAllocationException ( ( javax . javax.jms . javax.jms ) org.springframework.jms.support.JMSException ) ; } if ( org.springframework.jms.support.JMSException instanceof javax . javax.jms . javax.jms ) { return new TransactionInProgressException ( ( javax . javax.jms . javax.jms ) org.springframework.jms.support.JMSException ) ; } if ( org.springframework.jms.support.JMSException instanceof javax . javax.jms . javax.jms ) { return new TransactionRolledBackException ( ( javax . javax.jms . javax.jms ) org.springframework.jms.support.JMSException ) ; } return new UncategorizedJmsException ( org.springframework.jms.support.JMSException ) ; }  <METHOD_END>