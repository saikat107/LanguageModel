<METHOD_START> void ( MailProperties org.springframework.boot.autoconfigure.mail.MailProperties ) { this . org.springframework.boot.autoconfigure.mail.MailProperties = org.springframework.boot.autoconfigure.mail.MailProperties ; }  <METHOD_END>
<METHOD_START> @ Bean @ ConditionalOnMissingBean public org.springframework.boot.autoconfigure.mail.Session org.springframework.boot.autoconfigure.mail.Session ( ) { java.lang.String java.lang.String = this . org.springframework.boot.autoconfigure.mail.MailProperties . getJndiName ( ) ; try { return new JndiLocatorDelegate ( ) . lookup ( java.lang.String , Session .class ) ; } catch ( javax.naming.NamingException javax.naming.NamingException ) { throw new java.lang.IllegalStateException ( java.lang.String . java.lang.String ( STRING , java.lang.String ) , javax.naming.NamingException ) ; } }  <METHOD_END>
