<METHOD_START> @ Test public void void ( ) javax.naming.NamingException { SimpleNamingContextBuilder org.springframework.jndi.SimpleNamingContextBuilder = new SimpleNamingContextBuilder ( ) ; javax.naming.spi.InitialContextFactory javax.naming.spi.InitialContextFactory = org.springframework.jndi.SimpleNamingContextBuilder . createInitialContextFactory ( null ) ; javax.sql.DataSource javax.sql.DataSource = new org.springframework.jndi.SimpleNamingContextTests.StubDataSource ( ) ; org.springframework.jndi.SimpleNamingContextBuilder . bind ( STRING , javax.sql.DataSource ) ; java.lang.Object java.lang.Object = new java.lang.Object ( ) ; org.springframework.jndi.SimpleNamingContextBuilder . bind ( STRING , java.lang.Object ) ; javax.naming.Context javax.naming.Context = javax.naming.spi.InitialContextFactory . javax.naming.Context ( null ) ; assertTrue ( STRING , javax.naming.Context . java.lang.Object ( STRING ) == javax.sql.DataSource ) ; assertTrue ( STRING , javax.naming.Context . java.lang.Object ( STRING ) == java.lang.Object ) ; java.util.Hashtable<java.lang.String,java.lang.String> < java.lang.String , java.lang.String > java.util.Hashtable<java.lang.String,java.lang.String> = new java.util.Hashtable<java.lang.String,java.lang.String> <> ( ) ; java.util.Hashtable<java.lang.String,java.lang.String> . java.lang.String ( STRING , STRING ) ; javax.naming.Context javax.naming.Context = javax.naming.spi.InitialContextFactory . javax.naming.Context ( java.util.Hashtable<java.lang.String,java.lang.String> ) ; assertTrue ( STRING , javax.naming.Context . java.lang.Object ( STRING ) == javax.sql.DataSource ) ; assertTrue ( STRING , javax.naming.Context . java.lang.Object ( STRING ) == java.lang.Object ) ; assertTrue ( STRING , javax.naming.Context . java.util.Hashtable<?,?> ( ) != java.util.Hashtable<java.lang.String,java.lang.String> ) ; assertTrue ( STRING , STRING . boolean ( javax.naming.Context . java.util.Hashtable<?,?> ( ) . get ( STRING ) ) ) ; java.lang.Integer java.lang.Integer = new java.lang.Integer ( NUMBER ) ; javax.naming.Context . void ( STRING , java.lang.Integer ) ; java.lang.String java.lang.String = STRING ; javax.naming.Context . void ( STRING , java.lang.String ) ; javax.naming.Context javax.naming.Context = ( javax.naming.Context ) javax.naming.Context . java.lang.Object ( STRING ) ; javax.naming.Context . void ( STRING , STRING ) ; javax.naming.Context . void ( STRING ) ; assertTrue ( STRING , javax.naming.Context . java.util.Hashtable<?,?> ( ) != javax.naming.Context . java.util.Hashtable<?,?> ( ) ) ; javax.naming.Context . java.lang.Object ( STRING , STRING ) ; assertTrue ( STRING , STRING . boolean ( javax.naming.Context . java.util.Hashtable<?,?> ( ) . get ( STRING ) ) ) ; javax.naming.Context . java.lang.Object ( STRING ) ; assertTrue ( STRING , javax.naming.Context . java.util.Hashtable<?,?> ( ) . get ( STRING ) == null ) ; assertTrue ( STRING , javax.naming.Context . java.lang.Object ( STRING ) == javax.sql.DataSource ) ; try { javax.naming.Context . java.lang.Object ( STRING ) ; fail ( STRING ) ; } catch ( javax.naming.NameNotFoundException javax.naming.NameNotFoundException ) { } assertTrue ( STRING , javax.naming.Context . java.lang.Object ( STRING ) == java.lang.Integer ) ; assertTrue ( STRING , javax.naming.Context . java.lang.Object ( STRING ) == java.lang.String ) ; assertTrue ( STRING , javax.naming.Context . java.lang.Object ( STRING ) == javax.sql.DataSource ) ; try { javax.naming.Context . java.lang.Object ( STRING ) ; fail ( STRING ) ; } catch ( javax.naming.NameNotFoundException javax.naming.NameNotFoundException ) { } assertTrue ( STRING , javax.naming.Context . java.lang.Object ( STRING ) == java.lang.Integer ) ; assertTrue ( STRING , javax.naming.Context . java.lang.Object ( STRING ) == java.lang.String ) ; assertTrue ( STRING , javax.naming.Context . java.lang.Object ( STRING ) == javax.sql.DataSource ) ; try { javax.naming.Context . java.lang.Object ( STRING ) ; fail ( STRING ) ; } catch ( javax.naming.NameNotFoundException javax.naming.NameNotFoundException ) { } assertTrue ( STRING , javax.naming.Context . java.lang.Object ( STRING ) == java.lang.Integer ) ; assertTrue ( STRING , javax.naming.Context . java.lang.Object ( STRING ) == java.lang.String ) ; java.util.Map<java.lang.String,javax.naming.Binding> < java.lang.String , javax.naming.Binding > java.util.Map<java.lang.String,javax.naming.Binding> = new java.util.HashMap<java.lang.String,javax.naming.Binding> <> ( ) ; javax.naming.NamingEnumeration<?> < ? > javax.naming.NamingEnumeration<?> = javax.naming.Context . javax.naming.NamingEnumeration<javax.naming.Binding> ( STRING ) ; while ( javax.naming.NamingEnumeration<> . boolean ( ) ) { javax.naming.Binding javax.naming.Binding = ( javax.naming.Binding ) javax.naming.NamingEnumeration<> . nextElement ( ) ; java.util.Map<java.lang.String,javax.naming.Binding> . javax.naming.Binding ( javax.naming.Binding . java.lang.String ( ) , javax.naming.Binding ) ; } assertTrue ( STRING , java.util.Map<java.lang.String,javax.naming.Binding> . javax.naming.Binding ( STRING ) . java.lang.Object ( ) instanceof javax.naming.Context ) ; assertTrue ( STRING , SimpleNamingContext .class . java.lang.String ( ) . boolean ( java.util.Map<java.lang.String,javax.naming.Binding> . javax.naming.Binding ( STRING ) . java.lang.String ( ) ) ) ; javax.naming.Context javax.naming.Context = ( javax.naming.Context ) javax.naming.Context . java.lang.Object ( STRING ) ; javax.naming.Context . void ( STRING , javax.sql.DataSource ) ; java.util.Map<java.lang.String,javax.naming.Binding> < java.lang.String , javax.naming.Binding > java.util.Map<java.lang.String,javax.naming.Binding> = new java.util.HashMap<java.lang.String,javax.naming.Binding> <> ( ) ; javax.naming.NamingEnumeration<?> < ? > javax.naming.NamingEnumeration<?> = javax.naming.Context . javax.naming.NamingEnumeration<javax.naming.Binding> ( STRING ) ; while ( javax.naming.NamingEnumeration<> . boolean ( ) ) { javax.naming.Binding javax.naming.Binding = ( javax.naming.Binding ) javax.naming.NamingEnumeration<> . nextElement ( ) ; java.util.Map<java.lang.String,javax.naming.Binding> . javax.naming.Binding ( javax.naming.Binding . java.lang.String ( ) , javax.naming.Binding ) ; } assertTrue ( STRING , javax.sql.DataSource . boolean ( java.util.Map<java.lang.String,javax.naming.Binding> . javax.naming.Binding ( STRING ) . java.lang.Object ( ) ) ) ; assertTrue ( STRING , org.springframework.jndi.SimpleNamingContextTests.StubDataSource .class . java.lang.String ( ) . boolean ( java.util.Map<java.lang.String,javax.naming.Binding> . javax.naming.Binding ( STRING ) . java.lang.String ( ) ) ) ; assertTrue ( STRING , javax.sql.DataSource . boolean ( java.util.Map<java.lang.String,javax.naming.Binding> . javax.naming.Binding ( STRING ) . java.lang.Object ( ) ) ) ; assertTrue ( STRING , org.springframework.jndi.SimpleNamingContextTests.StubDataSource .class . java.lang.String ( ) . boolean ( java.util.Map<java.lang.String,javax.naming.Binding> . javax.naming.Binding ( STRING ) . java.lang.String ( ) ) ) ; assertTrue ( STRING , java.lang.Integer . boolean ( java.util.Map<java.lang.String,javax.naming.Binding> . javax.naming.Binding ( STRING ) . java.lang.Object ( ) ) ) ; assertTrue ( STRING , java.lang.Integer .class . java.lang.String ( ) . boolean ( java.util.Map<java.lang.String,javax.naming.Binding> . javax.naming.Binding ( STRING ) . java.lang.String ( ) ) ) ; assertTrue ( STRING , java.lang.String . boolean ( java.util.Map<java.lang.String,javax.naming.Binding> . javax.naming.Binding ( STRING ) . java.lang.Object ( ) ) ) ; assertTrue ( STRING , java.lang.String .class . java.lang.String ( ) . boolean ( java.util.Map<java.lang.String,javax.naming.Binding> . javax.naming.Binding ( STRING ) . java.lang.String ( ) ) ) ; javax.naming.Context . javax.naming.Context ( STRING ) . void ( STRING , javax.sql.DataSource ) ; java.util.Map<java.lang.String,java.lang.String> < java.lang.String , java.lang.String > java.util.Map<java.lang.String,java.lang.String> = new java.util.HashMap<java.lang.String,java.lang.String> <> ( ) ; javax.naming.NamingEnumeration<?> < ? > javax.naming.NamingEnumeration<?> = javax.naming.Context . javax.naming.NamingEnumeration<javax.naming.NameClassPair> ( STRING ) ; while ( javax.naming.NamingEnumeration<> . boolean ( ) ) { javax.naming.NameClassPair javax.naming.NameClassPair = ( javax.naming.NameClassPair ) javax.naming.NamingEnumeration<> . next ( ) ; java.util.Map<java.lang.String,java.lang.String> . java.lang.String ( javax.naming.NameClassPair . java.lang.String ( ) , javax.naming.NameClassPair . java.lang.String ( ) ) ; } assertTrue ( STRING , SimpleNamingContext .class . java.lang.String ( ) . boolean ( java.util.Map<java.lang.String,java.lang.String> . java.lang.String ( STRING ) ) ) ; javax.naming.Context javax.naming.Context = ( javax.naming.Context ) javax.naming.Context . java.lang.Object ( STRING ) ; java.util.Map<java.lang.String,java.lang.String> < java.lang.String , java.lang.String > java.util.Map<java.lang.String,java.lang.String> = new java.util.HashMap<java.lang.String,java.lang.String> <> ( ) ; javax.naming.NamingEnumeration<?> < ? > javax.naming.NamingEnumeration<?> = javax.naming.Context . javax.naming.NamingEnumeration<javax.naming.NameClassPair> ( STRING ) ; while ( javax.naming.NamingEnumeration<> . boolean ( ) ) { javax.naming.NameClassPair javax.naming.NameClassPair = ( javax.naming.NameClassPair ) javax.naming.NamingEnumeration<> . next ( ) ; java.util.Map<java.lang.String,java.lang.String> . java.lang.String ( javax.naming.NameClassPair . java.lang.String ( ) , javax.naming.NameClassPair . java.lang.String ( ) ) ; } assertTrue ( STRING , org.springframework.jndi.SimpleNamingContextTests.StubDataSource .class . java.lang.String ( ) . boolean ( java.util.Map<java.lang.String,java.lang.String> . java.lang.String ( STRING ) ) ) ; assertTrue ( STRING , org.springframework.jndi.SimpleNamingContextTests.StubDataSource .class . java.lang.String ( ) . boolean ( java.util.Map<java.lang.String,java.lang.String> . java.lang.String ( STRING ) ) ) ; assertTrue ( STRING , org.springframework.jndi.SimpleNamingContextTests.StubDataSource .class . java.lang.String ( ) . boolean ( java.util.Map<java.lang.String,java.lang.String> . java.lang.String ( STRING ) ) ) ; java.util.Map<java.lang.String,java.lang.String> . void ( ) ; javax.naming.NamingEnumeration<?> = javax.naming.Context . javax.naming.NamingEnumeration<javax.naming.NameClassPair> ( STRING ) ; while ( javax.naming.NamingEnumeration<> . boolean ( ) ) { javax.naming.NameClassPair javax.naming.NameClassPair = ( javax.naming.NameClassPair ) javax.naming.NamingEnumeration<> . next ( ) ; java.util.Map<java.lang.String,java.lang.String> . java.lang.String ( javax.naming.NameClassPair . java.lang.String ( ) , javax.naming.NameClassPair . java.lang.String ( ) ) ; } assertTrue ( STRING , org.springframework.jndi.SimpleNamingContextTests.StubDataSource .class . java.lang.String ( ) . boolean ( java.util.Map<java.lang.String,java.lang.String> . java.lang.String ( STRING ) ) ) ; assertTrue ( STRING , org.springframework.jndi.SimpleNamingContextTests.StubDataSource .class . java.lang.String ( ) . boolean ( java.util.Map<java.lang.String,java.lang.String> . java.lang.String ( STRING ) ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { SimpleNamingContextBuilder org.springframework.jndi.SimpleNamingContextBuilder = SimpleNamingContextBuilder . emptyActivatedContextBuilder ( ) ; java.lang.String java.lang.String = STRING ; java.lang.Object java.lang.Object = new java.lang.Object ( ) ; org.springframework.jndi.SimpleNamingContextBuilder . bind ( java.lang.String , java.lang.Object ) ; javax.naming.Context javax.naming.Context = new javax.naming.InitialContext ( ) ; assertTrue ( javax.naming.Context . java.lang.Object ( java.lang.String ) == java.lang.Object ) ; javax.naming.Context . void ( java.lang.String ) ; try { javax.naming.Context = new javax.naming.InitialContext ( ) ; javax.naming.Context . java.lang.Object ( java.lang.String ) ; fail ( STRING ) ; } catch ( javax.naming.NamingException javax.naming.NamingException ) { } org.springframework.jndi.SimpleNamingContextBuilder = SimpleNamingContextBuilder . emptyActivatedContextBuilder ( ) ; try { javax.naming.Context = new javax.naming.InitialContext ( ) ; javax.naming.Context . java.lang.Object ( java.lang.String ) ; fail ( STRING ) ; } catch ( javax.naming.NamingException javax.naming.NamingException ) { } java.lang.Object java.lang.Object = new java.lang.Object ( ) ; org.springframework.jndi.SimpleNamingContextBuilder . bind ( java.lang.String , java.lang.Object ) ; assertEquals ( javax.naming.Context . java.lang.Object ( java.lang.String ) , java.lang.Object ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public java.sql.Connection java.sql.Connection ( ) java.sql.SQLException { return null ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public java.sql.Connection java.sql.Connection ( java.lang.String java.lang.String , java.lang.String java.lang.String ) throws java.sql.SQLException { return null ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public java.io.PrintWriter java.io.PrintWriter ( ) java.sql.SQLException { return null ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public int int ( ) java.sql.SQLException { return NUMBER ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( java.io.PrintWriter java.io.PrintWriter ) throws java.sql.SQLException {		}  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( int int ) throws java.sql.SQLException {		}  <METHOD_END>
<METHOD_START> @ java.lang.Override public boolean boolean ( java.lang.Class<?> < ? > java.lang.Class<?> ) throws java.sql.SQLException { return false ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public < T > T T ( java.lang.Class<T> < T > java.lang.Class<T> ) throws java.sql.SQLException { return null ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public java.util.logging.Logger java.util.logging.Logger ( ) { return null ; }  <METHOD_END>