<METHOD_START> public static org.springframework.tests.mock.jndi.SimpleNamingContextBuilder org.springframework.tests.mock.jndi.SimpleNamingContextBuilder ( ) { return org.springframework.tests.mock.jndi.SimpleNamingContextBuilder ; }  <METHOD_END>
<METHOD_START> public static org.springframework.tests.mock.jndi.SimpleNamingContextBuilder org.springframework.tests.mock.jndi.SimpleNamingContextBuilder ( ) javax.naming.NamingException { if ( org.springframework.tests.mock.jndi.SimpleNamingContextBuilder != null ) { org.springframework.tests.mock.jndi.SimpleNamingContextBuilder . void ( ) ; } else { org.springframework.tests.mock.jndi.SimpleNamingContextBuilder org.springframework.tests.mock.jndi.SimpleNamingContextBuilder = new org.springframework.tests.mock.jndi.SimpleNamingContextBuilder ( ) ; org.springframework.tests.mock.jndi.SimpleNamingContextBuilder . void ( ) ; } return org.springframework.tests.mock.jndi.SimpleNamingContextBuilder ; }  <METHOD_END>
<METHOD_START> public void void ( ) java.lang.IllegalStateException , javax.naming.NamingException { org.springframework.tests.mock.jndi.Log . info ( STRING ) ; synchronized ( java.lang.Object ) { if ( ! boolean ) { if ( javax.naming.spi.NamingManager . boolean ( ) ) { throw new java.lang.IllegalStateException ( STRING + STRING + STRING ) ; } javax.naming.spi.NamingManager . void ( this ) ; boolean = true ; } } org.springframework.tests.mock.jndi.SimpleNamingContextBuilder = this ; }  <METHOD_END>
<METHOD_START> public void void ( ) { org.springframework.tests.mock.jndi.Log . info ( STRING ) ; org.springframework.tests.mock.jndi.SimpleNamingContextBuilder = null ; }  <METHOD_END>
<METHOD_START> public void void ( ) { this . java.util.Hashtable<java.lang.String,java.lang.Object> . void ( ) ; }  <METHOD_END>
<METHOD_START> public void void ( java.lang.String java.lang.String , java.lang.Object java.lang.Object ) { if ( org.springframework.tests.mock.jndi.Log . isInfoEnabled ( ) ) { org.springframework.tests.mock.jndi.Log . info ( STRING + java.lang.String + STRING + java.lang.Object + STRING ) ; } this . java.util.Hashtable<java.lang.String,java.lang.Object> . java.lang.Object ( java.lang.String , java.lang.Object ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public javax.naming.spi.InitialContextFactory javax.naming.spi.InitialContextFactory ( java.util.Hashtable<?,?> < ? , ? > java.util.Hashtable<?,?> ) { if ( org.springframework.tests.mock.jndi.SimpleNamingContextBuilder == null && java.util.Hashtable<,> != null ) { java.lang.Object java.lang.Object = java.util.Hashtable<,> . get ( javax.naming.Context . java.lang.String ) ; if ( java.lang.Object != null ) { java.lang.Class<?> < ? > java.lang.Class<?> ; if ( java.lang.Object instanceof java.lang.Class ) { java.lang.Class<?> = ( java.lang.Class<?> < ? > ) java.lang.Object ; } else if ( java.lang.Object instanceof java.lang.String ) { java.lang.Class<?> = ClassUtils . resolveClassName ( ( java.lang.String ) java.lang.Object , java.lang.Class<? extends org.springframework.tests.mock.jndi.SimpleNamingContextBuilder> ( ) . java.lang.ClassLoader ( ) ) ; } else { throw new java.lang.IllegalArgumentException ( STRING + javax.naming.Context . java.lang.String + STRING + java.lang.Object . java.lang.Class<? extends java.lang.Object> ( ) . java.lang.String ( ) ) ; } if ( ! javax.naming.spi.InitialContextFactory .class . boolean ( java.lang.Class<> ) ) { throw new java.lang.IllegalArgumentException ( STRING + javax.naming.spi.InitialContextFactory .class . java.lang.String ( ) + STRING + java.lang.Object ) ; } try { return ( javax.naming.spi.InitialContextFactory ) java.lang.Class<> . newInstance ( ) ; } catch ( java.lang.Throwable java.lang.Throwable ) { throw new java.lang.IllegalStateException ( STRING + java.lang.Object , java.lang.Throwable ) ; } } } return new javax.naming.spi.InitialContextFactory ( ) { @ java.lang.Override @ java.lang.SuppressWarnings ( STRING ) public javax.naming.Context javax.naming.Context ( java.util.Hashtable<?,?> < ? , ? > java.util.Hashtable<?,?> ) { return new SimpleNamingContext ( STRING , java.util.Hashtable<java.lang.String,java.lang.Object> , ( java.util.Hashtable<java.lang.String,java.lang.Object> < java.lang.String , java.lang.Object > ) java.util.Hashtable<,> ) ; } } ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override @ java.lang.SuppressWarnings ( STRING ) public javax.naming.Context javax.naming.Context ( java.util.Hashtable<?,?> < ? , ? > java.util.Hashtable<?,?> ) { return new SimpleNamingContext ( STRING , java.util.Hashtable<java.lang.String,java.lang.Object> , ( java.util.Hashtable<java.lang.String,java.lang.Object> < java.lang.String , java.lang.Object > ) java.util.Hashtable<,> ) ; }  <METHOD_END>