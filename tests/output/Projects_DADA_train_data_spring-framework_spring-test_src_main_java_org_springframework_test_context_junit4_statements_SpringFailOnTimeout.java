<METHOD_START> public void ( Statement org.springframework.test.context.junit4.statements.Statement , java.lang.reflect.Method java.lang.reflect.Method ) { this( org.springframework.test.context.junit4.statements.Statement , TestAnnotationUtils . getTimeout ( java.lang.reflect.Method ) ); }  <METHOD_END>
<METHOD_START> public void ( Statement org.springframework.test.context.junit4.statements.Statement , long long ) { Assert . notNull ( org.springframework.test.context.junit4.statements.Statement , STRING ) ; Assert . isTrue ( long >= NUMBER , STRING ) ; this . org.springframework.test.context.junit4.statements.Statement = org.springframework.test.context.junit4.statements.Statement ; this . long = long ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( ) java.lang.Throwable { if ( this . long == NUMBER ) { this . org.springframework.test.context.junit4.statements.Statement . evaluate ( ) ; } else { long long = java.lang.System . long ( ) ; try { this . org.springframework.test.context.junit4.statements.Statement . evaluate ( ) ; } finally { long long = java.lang.System . long ( ) - long ; if ( long > this . long ) { throw new java.util.concurrent.TimeoutException ( java.lang.String . java.lang.String ( STRING , long , this . long ) ) ; } } } }  <METHOD_END>
