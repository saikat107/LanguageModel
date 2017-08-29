<METHOD_START> public void ( ) { this( org.springframework.test.context.cache.ContextCache ); }  <METHOD_END>
<METHOD_START> public void ( ContextCache org.springframework.test.context.cache.ContextCache ) { Assert . notNull ( org.springframework.test.context.cache.ContextCache , STRING ) ; this . org.springframework.test.context.cache.ContextCache = org.springframework.test.context.cache.ContextCache ; }  <METHOD_END>
<METHOD_START> protected org.springframework.test.context.cache.ContextCache org.springframework.test.context.cache.ContextCache ( ) { return this . org.springframework.test.context.cache.ContextCache ; }  <METHOD_END>
<METHOD_START> protected org.springframework.test.context.cache.ApplicationContext org.springframework.test.context.cache.ApplicationContext ( MergedContextConfiguration org.springframework.test.context.cache.MergedContextConfiguration )			throws java.lang.Exception { ContextLoader org.springframework.test.context.cache.ContextLoader = org.springframework.test.context.cache.MergedContextConfiguration . getContextLoader ( ) ; Assert . notNull ( org.springframework.test.context.cache.ContextLoader , STRING + STRING ) ; ApplicationContext org.springframework.test.context.cache.ApplicationContext ; if ( org.springframework.test.context.cache.ContextLoader instanceof SmartContextLoader ) { SmartContextLoader org.springframework.test.context.cache.SmartContextLoader = ( SmartContextLoader ) org.springframework.test.context.cache.ContextLoader ; org.springframework.test.context.cache.ApplicationContext = org.springframework.test.context.cache.SmartContextLoader . loadContext ( org.springframework.test.context.cache.MergedContextConfiguration ) ; } else { java.lang.String [] java.lang.String[] = org.springframework.test.context.cache.MergedContextConfiguration . getLocations ( ) ; Assert . notNull ( java.lang.String[] , STRING + STRING ) ; org.springframework.test.context.cache.ApplicationContext = org.springframework.test.context.cache.ContextLoader . loadContext ( java.lang.String[] ) ; } return org.springframework.test.context.cache.ApplicationContext ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public org.springframework.test.context.cache.ApplicationContext org.springframework.test.context.cache.ApplicationContext ( MergedContextConfiguration org.springframework.test.context.cache.MergedContextConfiguration ) { synchronized ( this . org.springframework.test.context.cache.ContextCache ) { ApplicationContext org.springframework.test.context.cache.ApplicationContext = this . org.springframework.test.context.cache.ContextCache . get ( org.springframework.test.context.cache.MergedContextConfiguration ) ; if ( org.springframework.test.context.cache.ApplicationContext == null ) { try { org.springframework.test.context.cache.ApplicationContext = org.springframework.test.context.cache.ApplicationContext ( org.springframework.test.context.cache.MergedContextConfiguration ) ; if ( org.springframework.test.context.cache.Log . isDebugEnabled ( ) ) { org.springframework.test.context.cache.Log . debug ( java.lang.String . java.lang.String ( STRING , org.springframework.test.context.cache.MergedContextConfiguration ) ) ; } this . org.springframework.test.context.cache.ContextCache . put ( org.springframework.test.context.cache.MergedContextConfiguration , org.springframework.test.context.cache.ApplicationContext ) ; } catch ( java.lang.Exception java.lang.Exception ) { throw new java.lang.IllegalStateException ( STRING , java.lang.Exception ) ; } } else { if ( org.springframework.test.context.cache.Log . isDebugEnabled ( ) ) { org.springframework.test.context.cache.Log . debug ( java.lang.String . java.lang.String ( STRING , org.springframework.test.context.cache.MergedContextConfiguration ) ) ; } } this . org.springframework.test.context.cache.ContextCache . logStatistics ( ) ; return org.springframework.test.context.cache.ApplicationContext ; } }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( MergedContextConfiguration org.springframework.test.context.cache.MergedContextConfiguration , HierarchyMode org.springframework.test.context.cache.HierarchyMode ) { synchronized ( this . org.springframework.test.context.cache.ContextCache ) { this . org.springframework.test.context.cache.ContextCache . remove ( org.springframework.test.context.cache.MergedContextConfiguration , org.springframework.test.context.cache.HierarchyMode ) ; } }  <METHOD_END>
