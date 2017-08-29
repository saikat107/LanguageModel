<METHOD_START> @ Test public void void ( ) java.lang.Exception { java.lang.Object java.lang.Object = new java.lang.Object ( ) ; java.lang.String java.lang.String = STRING ; final javax.naming.Context javax.naming.Context = mock ( javax.naming.Context .class ) ; given ( javax.naming.Context . java.lang.Object ( java.lang.String ) ) . willReturn ( java.lang.Object ) ; JndiTemplate org.springframework.jndi.JndiTemplate = new JndiTemplate ( ) { @ java.lang.Override protected javax.naming.Context javax.naming.Context ( ) { return javax.naming.Context ; } } ; java.lang.Object java.lang.Object = org.springframework.jndi.JndiTemplate . lookup ( java.lang.String ) ; assertEquals ( java.lang.Object , java.lang.Object ) ; verify ( javax.naming.Context ) . close ( ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override protected javax.naming.Context javax.naming.Context ( ) { return javax.naming.Context ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { javax.naming.NameNotFoundException javax.naming.NameNotFoundException = new javax.naming.NameNotFoundException ( ) ; java.lang.String java.lang.String = STRING ; final javax.naming.Context javax.naming.Context = mock ( javax.naming.Context .class ) ; given ( javax.naming.Context . java.lang.Object ( java.lang.String ) ) . willThrow ( javax.naming.NameNotFoundException ) ; JndiTemplate org.springframework.jndi.JndiTemplate = new JndiTemplate ( ) { @ java.lang.Override protected javax.naming.Context javax.naming.Context ( ) { return javax.naming.Context ; } } ; try { org.springframework.jndi.JndiTemplate . lookup ( java.lang.String ) ; fail ( STRING ) ; } catch ( javax.naming.NameNotFoundException javax.naming.NameNotFoundException ) { } verify ( javax.naming.Context ) . close ( ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override protected javax.naming.Context javax.naming.Context ( ) { return javax.naming.Context ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { java.lang.String java.lang.String = STRING ; final javax.naming.Context javax.naming.Context = mock ( javax.naming.Context .class ) ; given ( javax.naming.Context . java.lang.Object ( java.lang.String ) ) . willReturn ( null ) ; JndiTemplate org.springframework.jndi.JndiTemplate = new JndiTemplate ( ) { @ java.lang.Override protected javax.naming.Context javax.naming.Context ( ) { return javax.naming.Context ; } } ; try { org.springframework.jndi.JndiTemplate . lookup ( java.lang.String ) ; fail ( STRING ) ; } catch ( javax.naming.NameNotFoundException javax.naming.NameNotFoundException ) { } verify ( javax.naming.Context ) . close ( ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override protected javax.naming.Context javax.naming.Context ( ) { return javax.naming.Context ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { java.lang.Object java.lang.Object = new java.lang.Object ( ) ; java.lang.String java.lang.String = STRING ; final javax.naming.Context javax.naming.Context = mock ( javax.naming.Context .class ) ; given ( javax.naming.Context . java.lang.Object ( java.lang.String ) ) . willReturn ( java.lang.Object ) ; JndiTemplate org.springframework.jndi.JndiTemplate = new JndiTemplate ( ) { @ java.lang.Override protected javax.naming.Context javax.naming.Context ( ) { return javax.naming.Context ; } } ; try { org.springframework.jndi.JndiTemplate . lookup ( java.lang.String , java.lang.String .class ) ; fail ( STRING ) ; } catch ( TypeMismatchNamingException org.springframework.jndi.TypeMismatchNamingException ) { } verify ( javax.naming.Context ) . close ( ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override protected javax.naming.Context javax.naming.Context ( ) { return javax.naming.Context ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { java.lang.Object java.lang.Object = new java.lang.Object ( ) ; java.lang.String java.lang.String = STRING ; final javax.naming.Context javax.naming.Context = mock ( javax.naming.Context .class ) ; JndiTemplate org.springframework.jndi.JndiTemplate = new JndiTemplate ( ) { @ java.lang.Override protected javax.naming.Context javax.naming.Context ( ) { return javax.naming.Context ; } } ; org.springframework.jndi.JndiTemplate . bind ( java.lang.String , java.lang.Object ) ; verify ( javax.naming.Context ) . bind ( java.lang.String , java.lang.Object ) ; verify ( javax.naming.Context ) . close ( ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override protected javax.naming.Context javax.naming.Context ( ) { return javax.naming.Context ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { java.lang.Object java.lang.Object = new java.lang.Object ( ) ; java.lang.String java.lang.String = STRING ; final javax.naming.Context javax.naming.Context = mock ( javax.naming.Context .class ) ; JndiTemplate org.springframework.jndi.JndiTemplate = new JndiTemplate ( ) { @ java.lang.Override protected javax.naming.Context javax.naming.Context ( ) { return javax.naming.Context ; } } ; org.springframework.jndi.JndiTemplate . rebind ( java.lang.String , java.lang.Object ) ; verify ( javax.naming.Context ) . rebind ( java.lang.String , java.lang.Object ) ; verify ( javax.naming.Context ) . close ( ) ; ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override protected javax.naming.Context javax.naming.Context ( ) { return javax.naming.Context ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { java.lang.String java.lang.String = STRING ; final javax.naming.Context javax.naming.Context = mock ( javax.naming.Context .class ) ; JndiTemplate org.springframework.jndi.JndiTemplate = new JndiTemplate ( ) { @ java.lang.Override protected javax.naming.Context javax.naming.Context ( ) { return javax.naming.Context ; } } ; org.springframework.jndi.JndiTemplate . unbind ( java.lang.String ) ; verify ( javax.naming.Context ) . unbind ( java.lang.String ) ; verify ( javax.naming.Context ) . close ( ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override protected javax.naming.Context javax.naming.Context ( ) { return javax.naming.Context ; }  <METHOD_END>