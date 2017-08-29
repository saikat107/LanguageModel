<METHOD_START> public void ( ) {	}  <METHOD_END>
<METHOD_START> public void ( Connection org.springframework.jms.connection.Connection ) { Assert . notNull ( org.springframework.jms.connection.Connection , STRING ) ; this . org.springframework.jms.connection.Connection = org.springframework.jms.connection.Connection ; }  <METHOD_END>
<METHOD_START> public void ( ConnectionFactory org.springframework.jms.connection.ConnectionFactory ) { Assert . notNull ( org.springframework.jms.connection.ConnectionFactory , STRING ) ; this . org.springframework.jms.connection.ConnectionFactory = org.springframework.jms.connection.ConnectionFactory ; }  <METHOD_END>
<METHOD_START> public void void ( ConnectionFactory org.springframework.jms.connection.ConnectionFactory ) { this . org.springframework.jms.connection.ConnectionFactory = org.springframework.jms.connection.ConnectionFactory ; }  <METHOD_END>
<METHOD_START> public org.springframework.jms.connection.ConnectionFactory org.springframework.jms.connection.ConnectionFactory ( ) { return this . org.springframework.jms.connection.ConnectionFactory ; }  <METHOD_END>
<METHOD_START> public void void ( java.lang.String java.lang.String ) { this . java.lang.String = java.lang.String ; }  <METHOD_END>
<METHOD_START> protected java.lang.String java.lang.String ( ) { return this . java.lang.String ; }  <METHOD_END>
<METHOD_START> public void void ( ExceptionListener org.springframework.jms.connection.ExceptionListener ) { this . org.springframework.jms.connection.ExceptionListener = org.springframework.jms.connection.ExceptionListener ; }  <METHOD_END>
<METHOD_START> protected org.springframework.jms.connection.ExceptionListener org.springframework.jms.connection.ExceptionListener ( ) { return this . org.springframework.jms.connection.ExceptionListener ; }  <METHOD_END>
<METHOD_START> public void void ( boolean boolean ) { this . boolean = boolean ; }  <METHOD_END>
<METHOD_START> protected boolean boolean ( ) { return this . boolean ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( ) { if ( this . org.springframework.jms.connection.Connection == null && org.springframework.jms.connection.ConnectionFactory ( ) == null ) { throw new java.lang.IllegalArgumentException ( STRING ) ; } }  <METHOD_END>
<METHOD_START> @ java.lang.Override public org.springframework.jms.connection.Connection org.springframework.jms.connection.Connection ( ) org.springframework.jms.connection.JMSException { return org.springframework.jms.connection.Connection ( org.springframework.jms.connection.Connection ( ) ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public org.springframework.jms.connection.Connection org.springframework.jms.connection.Connection ( java.lang.String java.lang.String , java.lang.String java.lang.String ) throws org.springframework.jms.connection.JMSException { throw new javax . javax.jms . javax.jms ( STRING ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public org.springframework.jms.connection.QueueConnection org.springframework.jms.connection.QueueConnection ( ) org.springframework.jms.connection.JMSException { Connection org.springframework.jms.connection.Connection ; synchronized ( this . java.lang.Object ) { this . java.lang.Boolean = java.lang.Boolean . java.lang.Boolean ; org.springframework.jms.connection.Connection = org.springframework.jms.connection.Connection ( ) ; } if ( ! ( org.springframework.jms.connection.Connection instanceof QueueConnection ) ) { throw new javax . javax.jms . javax.jms ( STRING + org.springframework.jms.connection.Connection ) ; } return ( ( QueueConnection ) org.springframework.jms.connection.Connection ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public org.springframework.jms.connection.QueueConnection org.springframework.jms.connection.QueueConnection ( java.lang.String java.lang.String , java.lang.String java.lang.String ) throws org.springframework.jms.connection.JMSException { throw new javax . javax.jms . javax.jms ( STRING ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public org.springframework.jms.connection.TopicConnection org.springframework.jms.connection.TopicConnection ( ) org.springframework.jms.connection.JMSException { Connection org.springframework.jms.connection.Connection ; synchronized ( this . java.lang.Object ) { this . java.lang.Boolean = java.lang.Boolean . java.lang.Boolean ; org.springframework.jms.connection.Connection = org.springframework.jms.connection.Connection ( ) ; } if ( ! ( org.springframework.jms.connection.Connection instanceof TopicConnection ) ) { throw new javax . javax.jms . javax.jms ( STRING + org.springframework.jms.connection.Connection ) ; } return ( ( TopicConnection ) org.springframework.jms.connection.Connection ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public org.springframework.jms.connection.TopicConnection org.springframework.jms.connection.TopicConnection ( java.lang.String java.lang.String , java.lang.String java.lang.String ) throws org.springframework.jms.connection.JMSException { throw new javax . javax.jms . javax.jms ( STRING ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public org.springframework.jms.connection.JMSContext org.springframework.jms.connection.JMSContext ( ) { return org.springframework.jms.connection.ConnectionFactory ( ) . createContext ( ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public org.springframework.jms.connection.JMSContext org.springframework.jms.connection.JMSContext ( java.lang.String java.lang.String , java.lang.String java.lang.String ) { return org.springframework.jms.connection.ConnectionFactory ( ) . createContext ( java.lang.String , java.lang.String ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public org.springframework.jms.connection.JMSContext org.springframework.jms.connection.JMSContext ( java.lang.String java.lang.String , java.lang.String java.lang.String , int int ) { return org.springframework.jms.connection.ConnectionFactory ( ) . createContext ( java.lang.String , java.lang.String , int ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public org.springframework.jms.connection.JMSContext org.springframework.jms.connection.JMSContext ( int int ) { return org.springframework.jms.connection.ConnectionFactory ( ) . createContext ( int ) ; }  <METHOD_END>
<METHOD_START> private org.springframework.jms.connection.ConnectionFactory org.springframework.jms.connection.ConnectionFactory ( ) { ConnectionFactory org.springframework.jms.connection.ConnectionFactory = org.springframework.jms.connection.ConnectionFactory ( ) ; Assert . state ( org.springframework.jms.connection.ConnectionFactory != null , STRING ) ; return org.springframework.jms.connection.ConnectionFactory ; }  <METHOD_END>
<METHOD_START> protected org.springframework.jms.connection.Connection org.springframework.jms.connection.Connection ( ) org.springframework.jms.connection.JMSException { synchronized ( this . java.lang.Object ) { if ( this . org.springframework.jms.connection.Connection == null ) { void ( ) ; } return this . org.springframework.jms.connection.Connection ; } }  <METHOD_END>
<METHOD_START> public void void ( ) org.springframework.jms.connection.JMSException { if ( org.springframework.jms.connection.ConnectionFactory ( ) == null ) { throw new java.lang.IllegalStateException ( STRING ) ; } synchronized ( this . java.lang.Object ) { if ( this . org.springframework.jms.connection.Connection != null ) { void ( this . org.springframework.jms.connection.Connection ) ; } this . org.springframework.jms.connection.Connection = org.springframework.jms.connection.Connection ( ) ; void ( this . org.springframework.jms.connection.Connection ) ; if ( this . int > NUMBER ) { this . org.springframework.jms.connection.Connection . start ( ) ; } if ( org.springframework.jms.connection.Log . isInfoEnabled ( ) ) { org.springframework.jms.connection.Log . info ( STRING + this . org.springframework.jms.connection.Connection ) ; } } }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( JMSException org.springframework.jms.connection.JMSException ) { org.springframework.jms.connection.Log . warn ( STRING , org.springframework.jms.connection.JMSException ) ; void ( ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( ) { void ( ) ; }  <METHOD_END>
<METHOD_START> public void void ( ) { synchronized ( this . java.lang.Object ) { if ( this . org.springframework.jms.connection.Connection != null ) { void ( this . org.springframework.jms.connection.Connection ) ; } this . org.springframework.jms.connection.Connection = null ; } }  <METHOD_END>
<METHOD_START> protected org.springframework.jms.connection.Connection org.springframework.jms.connection.Connection ( ) org.springframework.jms.connection.JMSException { ConnectionFactory org.springframework.jms.connection.ConnectionFactory = org.springframework.jms.connection.ConnectionFactory ( ) ; if ( java.lang.Boolean . java.lang.Boolean . boolean ( this . java.lang.Boolean ) && org.springframework.jms.connection.ConnectionFactory instanceof QueueConnectionFactory ) { return ( ( QueueConnectionFactory ) org.springframework.jms.connection.ConnectionFactory ) . createQueueConnection ( ) ; } else if ( java.lang.Boolean . java.lang.Boolean . boolean ( this . java.lang.Boolean ) && org.springframework.jms.connection.ConnectionFactory instanceof TopicConnectionFactory ) { return ( ( TopicConnectionFactory ) org.springframework.jms.connection.ConnectionFactory ) . createTopicConnection ( ) ; } else { return org.springframework.jms.connection.ConnectionFactory ( ) . createConnection ( ) ; } }  <METHOD_END>
<METHOD_START> protected void void ( Connection org.springframework.jms.connection.Connection ) throws org.springframework.jms.connection.JMSException { if ( java.lang.String ( ) != null ) { org.springframework.jms.connection.Connection . setClientID ( java.lang.String ( ) ) ; } if ( this . org.springframework.jms.connection.SingleConnectionFactory.AggregatedExceptionListener != null ) { org.springframework.jms.connection.Connection . setExceptionListener ( this . org.springframework.jms.connection.SingleConnectionFactory.AggregatedExceptionListener ) ; } else if ( org.springframework.jms.connection.ExceptionListener ( ) != null || boolean ( ) ) { ExceptionListener org.springframework.jms.connection.ExceptionListener = org.springframework.jms.connection.ExceptionListener ( ) ; if ( boolean ( ) ) { this . org.springframework.jms.connection.SingleConnectionFactory.AggregatedExceptionListener = new org.springframework.jms.connection.SingleConnectionFactory.AggregatedExceptionListener ( ) ; this . org.springframework.jms.connection.SingleConnectionFactory.AggregatedExceptionListener . java.util.Set<org.springframework.jms.connection.ExceptionListener> . add ( this ) ; if ( org.springframework.jms.connection.ExceptionListener != null ) { this . org.springframework.jms.connection.SingleConnectionFactory.AggregatedExceptionListener . java.util.Set<org.springframework.jms.connection.ExceptionListener> . add ( org.springframework.jms.connection.ExceptionListener ) ; } org.springframework.jms.connection.ExceptionListener = this . org.springframework.jms.connection.SingleConnectionFactory.AggregatedExceptionListener ; } org.springframework.jms.connection.Connection . setExceptionListener ( org.springframework.jms.connection.ExceptionListener ) ; } }  <METHOD_END>
<METHOD_START> protected org.springframework.jms.connection.Session org.springframework.jms.connection.Session ( Connection org.springframework.jms.connection.Connection , java.lang.Integer java.lang.Integer ) throws org.springframework.jms.connection.JMSException { return null ; }  <METHOD_END>
<METHOD_START> protected org.springframework.jms.connection.Session org.springframework.jms.connection.Session ( Connection org.springframework.jms.connection.Connection , java.lang.Integer java.lang.Integer ) throws org.springframework.jms.connection.JMSException { boolean boolean = ( java.lang.Integer == Session . SESSION_TRANSACTED ) ; int int = ( boolean ? Session . AUTO_ACKNOWLEDGE : java.lang.Integer ) ; if ( java.lang.Boolean . java.lang.Boolean . boolean ( this . java.lang.Boolean ) && org.springframework.jms.connection.Connection instanceof QueueConnection ) { return ( ( QueueConnection ) org.springframework.jms.connection.Connection ) . createQueueSession ( boolean , int ) ; } else if ( java.lang.Boolean . java.lang.Boolean . boolean ( this . java.lang.Boolean ) && org.springframework.jms.connection.Connection instanceof TopicConnection ) { return ( ( TopicConnection ) org.springframework.jms.connection.Connection ) . createTopicSession ( boolean , int ) ; } else { return org.springframework.jms.connection.Connection . createSession ( boolean , int ) ; } }  <METHOD_END>
<METHOD_START> protected void void ( Connection org.springframework.jms.connection.Connection ) { if ( org.springframework.jms.connection.Log . isDebugEnabled ( ) ) { org.springframework.jms.connection.Log . debug ( STRING + org.springframework.jms.connection.Connection ) ; } try { try { if ( this . int > NUMBER ) { org.springframework.jms.connection.Connection . stop ( ) ; } } finally { org.springframework.jms.connection.Connection . close ( ) ; } } catch ( javax . javax.jms . javax.jms javax.jms.IllegalStateException ) { org.springframework.jms.connection.Log . debug ( STRING + javax.jms.IllegalStateException ) ; } catch ( java.lang.Throwable java.lang.Throwable ) { org.springframework.jms.connection.Log . debug ( STRING , java.lang.Throwable ) ; } }  <METHOD_END>
<METHOD_START> protected org.springframework.jms.connection.Connection org.springframework.jms.connection.Connection ( Connection org.springframework.jms.connection.Connection ) { java.util.List<java.lang.Class<?>> < java.lang.Class<?> < ? > > java.util.List<java.lang.Class<?>> = new java.util.ArrayList<java.lang.Class<?>> <> ( NUMBER ) ; java.util.List<java.lang.Class<?>> . boolean ( Connection .class ) ; if ( org.springframework.jms.connection.Connection instanceof QueueConnection ) { java.util.List<java.lang.Class<?>> . boolean ( QueueConnection .class ) ; } if ( org.springframework.jms.connection.Connection instanceof TopicConnection ) { java.util.List<java.lang.Class<?>> . boolean ( TopicConnection .class ) ; } return ( Connection ) java.lang.reflect.Proxy . java.lang.Object ( Connection .class . java.lang.ClassLoader ( ) , java.util.List<java.lang.Class<?>> . java.lang.Class<?>[] ( new java.lang.Class<?> < ? > [ java.util.List<java.lang.Class<?>> . int ( ) ] ) , new org.springframework.jms.connection.SingleConnectionFactory.SharedConnectionInvocationHandler ( ) ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public java.lang.Object java.lang.Object ( java.lang.Object java.lang.Object , java.lang.reflect.Method java.lang.reflect.Method , java.lang.Object [] java.lang.Object[] ) throws java.lang.Throwable { if ( java.lang.reflect.Method . java.lang.String ( ) . boolean ( STRING ) ) { java.lang.Object java.lang.Object = java.lang.Object[] [ NUMBER ] ; if ( java.lang.Object == java.lang.Object ) { return true ; } if ( java.lang.Object == null || ! java.lang.reflect.Proxy . boolean ( java.lang.Object . java.lang.Class<? extends java.lang.Object> ( ) ) ) { return false ; } java.lang.reflect.InvocationHandler java.lang.reflect.InvocationHandler = java.lang.reflect.Proxy . java.lang.reflect.InvocationHandler ( java.lang.Object ) ; return ( java.lang.reflect.InvocationHandler instanceof org.springframework.jms.connection.SingleConnectionFactory.SharedConnectionInvocationHandler && org.springframework.jms.connection.SingleConnectionFactory ( ) == ( ( org.springframework.jms.connection.SingleConnectionFactory.SharedConnectionInvocationHandler ) java.lang.reflect.InvocationHandler ) . org.springframework.jms.connection.SingleConnectionFactory ( ) ) ; } else if ( java.lang.reflect.Method . java.lang.String ( ) . boolean ( STRING ) ) { return java.lang.System . int ( org.springframework.jms.connection.SingleConnectionFactory ( ) ) ; } else if ( java.lang.reflect.Method . java.lang.String ( ) . boolean ( STRING ) ) { return STRING + org.springframework.jms.connection.Connection ( ) ; } else if ( java.lang.reflect.Method . java.lang.String ( ) . boolean ( STRING ) ) { java.lang.String java.lang.String = org.springframework.jms.connection.Connection ( ) . getClientID ( ) ; if ( java.lang.String != null && java.lang.String . boolean ( java.lang.Object[] [ NUMBER ] ) ) { return null ; } else { throw new javax . javax.jms . javax.jms ( STRING + STRING ) ; } } else if ( java.lang.reflect.Method . java.lang.String ( ) . boolean ( STRING ) ) { synchronized ( java.lang.Object ) { if ( org.springframework.jms.connection.SingleConnectionFactory.AggregatedExceptionListener != null ) { ExceptionListener org.springframework.jms.connection.ExceptionListener = ( ExceptionListener ) java.lang.Object[] [ NUMBER ] ; if ( org.springframework.jms.connection.ExceptionListener != this . org.springframework.jms.connection.ExceptionListener ) { if ( this . org.springframework.jms.connection.ExceptionListener != null ) { org.springframework.jms.connection.SingleConnectionFactory.AggregatedExceptionListener . java.util.Set<org.springframework.jms.connection.ExceptionListener> . remove ( this . org.springframework.jms.connection.ExceptionListener ) ; } if ( org.springframework.jms.connection.ExceptionListener != null ) { org.springframework.jms.connection.SingleConnectionFactory.AggregatedExceptionListener . java.util.Set<org.springframework.jms.connection.ExceptionListener> . add ( org.springframework.jms.connection.ExceptionListener ) ; } this . org.springframework.jms.connection.ExceptionListener = org.springframework.jms.connection.ExceptionListener ; } return null ; } else { throw new javax . javax.jms . javax.jms ( STRING + STRING + STRING + STRING ) ; } } } else if ( java.lang.reflect.Method . java.lang.String ( ) . boolean ( STRING ) ) { synchronized ( java.lang.Object ) { if ( this . org.springframework.jms.connection.ExceptionListener != null ) { return this . org.springframework.jms.connection.ExceptionListener ; } else { return org.springframework.jms.connection.ExceptionListener ( ) ; } } } else if ( java.lang.reflect.Method . java.lang.String ( ) . boolean ( STRING ) ) { void ( ) ; return null ; } else if ( java.lang.reflect.Method . java.lang.String ( ) . boolean ( STRING ) ) { void ( ) ; return null ; } else if ( java.lang.reflect.Method . java.lang.String ( ) . boolean ( STRING ) ) { void ( ) ; synchronized ( java.lang.Object ) { if ( this . org.springframework.jms.connection.ExceptionListener != null ) { if ( org.springframework.jms.connection.SingleConnectionFactory.AggregatedExceptionListener != null ) { org.springframework.jms.connection.SingleConnectionFactory.AggregatedExceptionListener . java.util.Set<org.springframework.jms.connection.ExceptionListener> . remove ( this . org.springframework.jms.connection.ExceptionListener ) ; } this . org.springframework.jms.connection.ExceptionListener = null ; } } return null ; } else if ( java.lang.reflect.Method . java.lang.String ( ) . boolean ( STRING ) || java.lang.reflect.Method . java.lang.String ( ) . boolean ( STRING ) || java.lang.reflect.Method . java.lang.String ( ) . boolean ( STRING ) ) { java.lang.Integer java.lang.Integer = Session . AUTO_ACKNOWLEDGE ; if ( java.lang.Object[] != null ) { if ( java.lang.Object[] . int == NUMBER ) { java.lang.Integer = ( java.lang.Integer ) java.lang.Object[] [ NUMBER ] ; } else if ( java.lang.Object[] . int == NUMBER ) { boolean boolean = ( java.lang.Boolean ) java.lang.Object[] [ NUMBER ] ; java.lang.Integer java.lang.Integer = ( java.lang.Integer ) java.lang.Object[] [ NUMBER ] ; java.lang.Integer = ( boolean ? Session . SESSION_TRANSACTED : java.lang.Integer ) ; } } Session org.springframework.jms.connection.Session = org.springframework.jms.connection.Session ( org.springframework.jms.connection.Connection ( ) , java.lang.Integer ) ; if ( org.springframework.jms.connection.Session != null ) { if ( ! java.lang.reflect.Method . java.lang.Class<?> ( ) . boolean ( org.springframework.jms.connection.Session ) ) { java.lang.String java.lang.String = STRING + org.springframework.jms.connection.Session ; try { org.springframework.jms.connection.Session . close ( ) ; } catch ( java.lang.Throwable java.lang.Throwable ) { org.springframework.jms.connection.Log . trace ( STRING , java.lang.Throwable ) ; } throw new javax . javax.jms . javax.jms ( java.lang.String ) ; } return org.springframework.jms.connection.Session ; } } try { return java.lang.reflect.Method . java.lang.Object ( org.springframework.jms.connection.Connection ( ) , java.lang.Object[] ) ; } catch ( java.lang.reflect.InvocationTargetException java.lang.reflect.InvocationTargetException ) { throw java.lang.reflect.InvocationTargetException . java.lang.Throwable ( ) ; } }  <METHOD_END>
<METHOD_START> private void void ( ) org.springframework.jms.connection.JMSException { synchronized ( java.lang.Object ) { if ( ! this . boolean ) { this . boolean = true ; if ( int == NUMBER && org.springframework.jms.connection.Connection != null ) { org.springframework.jms.connection.Connection . start ( ) ; } int ++ ; } } }  <METHOD_END>
<METHOD_START> private void void ( ) org.springframework.jms.connection.JMSException { synchronized ( java.lang.Object ) { if ( this . boolean ) { this . boolean = false ; if ( int == NUMBER && org.springframework.jms.connection.Connection != null ) { org.springframework.jms.connection.Connection . stop ( ) ; } if ( int > NUMBER ) { int -- ; } } } }  <METHOD_END>
<METHOD_START> private org.springframework.jms.connection.SingleConnectionFactory org.springframework.jms.connection.SingleConnectionFactory ( ) { return org.springframework.jms.connection.SingleConnectionFactory .this ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( JMSException org.springframework.jms.connection.JMSException ) { synchronized ( java.lang.Object ) { for ( ExceptionListener org.springframework.jms.connection.ExceptionListener : new java.util.LinkedHashSet <> ( this . java.util.Set<org.springframework.jms.connection.ExceptionListener> ) ) { org.springframework.jms.connection.ExceptionListener . onException ( org.springframework.jms.connection.JMSException ) ; } } }  <METHOD_END>