<METHOD_START> public void ( java.lang.String java.lang.String , Location org.springframework.beans.factory.parsing.Location ) { this( java.lang.String , org.springframework.beans.factory.parsing.Location , null , null ); }  <METHOD_END>
<METHOD_START> public void ( java.lang.String java.lang.String , Location org.springframework.beans.factory.parsing.Location , ParseState org.springframework.beans.factory.parsing.ParseState ) { this( java.lang.String , org.springframework.beans.factory.parsing.Location , org.springframework.beans.factory.parsing.ParseState , null ); }  <METHOD_END>
<METHOD_START> public void ( java.lang.String java.lang.String , Location org.springframework.beans.factory.parsing.Location , ParseState org.springframework.beans.factory.parsing.ParseState , java.lang.Throwable java.lang.Throwable ) { Assert . notNull ( java.lang.String , STRING ) ; Assert . notNull ( org.springframework.beans.factory.parsing.Location , STRING ) ; this . java.lang.String = java.lang.String ; this . org.springframework.beans.factory.parsing.Location = org.springframework.beans.factory.parsing.Location ; this . org.springframework.beans.factory.parsing.ParseState = org.springframework.beans.factory.parsing.ParseState ; this . java.lang.Throwable = java.lang.Throwable ; }  <METHOD_END>
<METHOD_START> public java.lang.String java.lang.String ( ) { return this . java.lang.String ; }  <METHOD_END>
<METHOD_START> public org.springframework.beans.factory.parsing.Location org.springframework.beans.factory.parsing.Location ( ) { return this . org.springframework.beans.factory.parsing.Location ; }  <METHOD_END>
<METHOD_START> public java.lang.String java.lang.String ( ) { return org.springframework.beans.factory.parsing.Location ( ) . getResource ( ) . getDescription ( ) ; }  <METHOD_END>
<METHOD_START> public org.springframework.beans.factory.parsing.ParseState org.springframework.beans.factory.parsing.ParseState ( ) { return this . org.springframework.beans.factory.parsing.ParseState ; }  <METHOD_END>
<METHOD_START> public java.lang.Throwable java.lang.Throwable ( ) { return this . java.lang.Throwable ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public java.lang.String java.lang.String ( ) { java.lang.StringBuilder java.lang.StringBuilder = new java.lang.StringBuilder ( ) ; java.lang.StringBuilder . java.lang.StringBuilder ( STRING ) ; java.lang.StringBuilder . java.lang.StringBuilder ( java.lang.String ( ) ) ; java.lang.StringBuilder . java.lang.StringBuilder ( STRING ) . java.lang.StringBuilder ( java.lang.String ( ) ) ; if ( org.springframework.beans.factory.parsing.ParseState ( ) != null ) { java.lang.StringBuilder . java.lang.StringBuilder ( '\n' ) . java.lang.StringBuilder ( org.springframework.beans.factory.parsing.ParseState ( ) ) ; } return java.lang.StringBuilder . java.lang.String ( ) ; }  <METHOD_END>
