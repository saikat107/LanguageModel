<METHOD_START> public void ( MessageSource org.springframework.context.support.MessageSource , java.util.Locale java.util.Locale ) { Assert . notNull ( org.springframework.context.support.MessageSource , STRING ) ; this . org.springframework.context.support.MessageSource = org.springframework.context.support.MessageSource ; this . java.util.Locale = java.util.Locale ; }  <METHOD_END>
<METHOD_START> public void ( MessageSource org.springframework.context.support.MessageSource , java.util.Locale java.util.Locale , java.util.ResourceBundle java.util.ResourceBundle ) { this( org.springframework.context.support.MessageSource , java.util.Locale ); void ( java.util.ResourceBundle ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override protected java.lang.Object java.lang.Object ( java.lang.String java.lang.String ) { try { return this . org.springframework.context.support.MessageSource . getMessage ( java.lang.String , null , this . java.util.Locale ) ; } catch ( NoSuchMessageException org.springframework.context.support.NoSuchMessageException ) { return null ; } }  <METHOD_END>
<METHOD_START> @ java.lang.Override public boolean boolean ( java.lang.String java.lang.String ) { try { this . org.springframework.context.support.MessageSource . getMessage ( java.lang.String , null , this . java.util.Locale ) ; return true ; } catch ( NoSuchMessageException org.springframework.context.support.NoSuchMessageException ) { return false ; } }  <METHOD_END>
<METHOD_START> @ java.lang.Override public java.util.Enumeration<java.lang.String> < java.lang.String > java.util.Enumeration<java.lang.String> ( ) { throw new java.lang.UnsupportedOperationException ( STRING ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public java.util.Locale java.util.Locale ( ) { return this . java.util.Locale ; }  <METHOD_END>
