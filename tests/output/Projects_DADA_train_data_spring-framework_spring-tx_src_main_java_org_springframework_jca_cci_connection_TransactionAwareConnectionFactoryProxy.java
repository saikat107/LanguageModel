<METHOD_START> public void ( ) {	}  <METHOD_END>
<METHOD_START> public void ( ConnectionFactory org.springframework.jca.cci.connection.ConnectionFactory ) { setTargetConnectionFactory ( org.springframework.jca.cci.connection.ConnectionFactory ) ; afterPropertiesSet ( ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public org.springframework.jca.cci.connection.Connection org.springframework.jca.cci.connection.Connection ( ) org.springframework.jca.cci.connection.ResourceException { Connection org.springframework.jca.cci.connection.Connection = ConnectionFactoryUtils . doGetConnection ( getTargetConnectionFactory ( ) ) ; return org.springframework.jca.cci.connection.Connection ( org.springframework.jca.cci.connection.Connection , getTargetConnectionFactory ( ) ) ; }  <METHOD_END>
<METHOD_START> protected org.springframework.jca.cci.connection.Connection org.springframework.jca.cci.connection.Connection ( Connection org.springframework.jca.cci.connection.Connection , ConnectionFactory org.springframework.jca.cci.connection.ConnectionFactory ) { return ( Connection ) java.lang.reflect.Proxy . java.lang.Object ( Connection .class . java.lang.ClassLoader ( ) , new java.lang.Class<?> < ? > [] { Connection .class } , new org.springframework.jca.cci.connection.TransactionAwareConnectionFactoryProxy.TransactionAwareInvocationHandler ( org.springframework.jca.cci.connection.Connection , org.springframework.jca.cci.connection.ConnectionFactory ) ) ; }  <METHOD_END>
<METHOD_START> public void ( Connection org.springframework.jca.cci.connection.Connection , ConnectionFactory org.springframework.jca.cci.connection.ConnectionFactory ) { this . org.springframework.jca.cci.connection.Connection = org.springframework.jca.cci.connection.Connection ; this . org.springframework.jca.cci.connection.ConnectionFactory = org.springframework.jca.cci.connection.ConnectionFactory ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public java.lang.Object java.lang.Object ( java.lang.Object java.lang.Object , java.lang.reflect.Method java.lang.reflect.Method , java.lang.Object [] java.lang.Object[] ) throws java.lang.Throwable { if ( java.lang.reflect.Method . java.lang.String ( ) . boolean ( STRING ) ) { return ( java.lang.Object == java.lang.Object[] [ NUMBER ] ) ; } else if ( java.lang.reflect.Method . java.lang.String ( ) . boolean ( STRING ) ) { return java.lang.System . int ( java.lang.Object ) ; } else if ( java.lang.reflect.Method . java.lang.String ( ) . boolean ( STRING ) ) { if ( ConnectionFactoryUtils . isConnectionTransactional ( this . org.springframework.jca.cci.connection.Connection , this . org.springframework.jca.cci.connection.ConnectionFactory ) ) { throw new javax . javax.resource . javax.resource . javax.resource ( STRING ) ; } } else if ( java.lang.reflect.Method . java.lang.String ( ) . boolean ( STRING ) ) { ConnectionFactoryUtils . doReleaseConnection ( this . org.springframework.jca.cci.connection.Connection , this . org.springframework.jca.cci.connection.ConnectionFactory ) ; return null ; } try { return java.lang.reflect.Method . java.lang.Object ( this . org.springframework.jca.cci.connection.Connection , java.lang.Object[] ) ; } catch ( java.lang.reflect.InvocationTargetException java.lang.reflect.InvocationTargetException ) { throw java.lang.reflect.InvocationTargetException . java.lang.Throwable ( ) ; } }  <METHOD_END>
