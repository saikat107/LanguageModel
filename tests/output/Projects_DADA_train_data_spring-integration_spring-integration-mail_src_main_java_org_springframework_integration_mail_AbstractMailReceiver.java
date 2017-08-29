<METHOD_START> public void ( ) { this . org.springframework.integration.mail.URLName = null ; }  <METHOD_END>
<METHOD_START> public void ( URLName org.springframework.integration.mail.URLName ) { Assert . notNull ( org.springframework.integration.mail.URLName , STRING ) ; this . org.springframework.integration.mail.URLName = org.springframework.integration.mail.URLName ; }  <METHOD_END>
<METHOD_START> public void ( java.lang.String java.lang.String ) { if ( java.lang.String != null ) { this . org.springframework.integration.mail.URLName = new URLName ( java.lang.String ) ; } else { this . org.springframework.integration.mail.URLName = null ; } }  <METHOD_END>
<METHOD_START> public void void ( Expression org.springframework.integration.mail.Expression ) { this . org.springframework.integration.mail.Expression = org.springframework.integration.mail.Expression ; }  <METHOD_END>
<METHOD_START> public void void ( java.lang.String java.lang.String ) { if ( this . org.springframework.integration.mail.URLName != null ) { Assert . isTrue ( this . org.springframework.integration.mail.URLName . getProtocol ( ) . equals ( java.lang.String ) , STRING ) ; } this . java.lang.String = java.lang.String ; }  <METHOD_END>
<METHOD_START> public void void ( Session org.springframework.integration.mail.Session ) { Assert . notNull ( org.springframework.integration.mail.Session , STRING ) ; this . org.springframework.integration.mail.Session = org.springframework.integration.mail.Session ; }  <METHOD_END>
<METHOD_START> public void void ( java.util.Properties java.util.Properties ) { this . java.util.Properties = java.util.Properties ; }  <METHOD_END>
<METHOD_START> protected java.util.Properties java.util.Properties ( ) { return this . java.util.Properties ; }  <METHOD_END>
<METHOD_START> public void void ( Authenticator org.springframework.integration.mail.Authenticator ) { this . org.springframework.integration.mail.Authenticator = org.springframework.integration.mail.Authenticator ; }  <METHOD_END>
<METHOD_START> public void void ( int int ) { this . int = int ; }  <METHOD_END>
<METHOD_START> public void void ( boolean boolean ) { this . boolean = boolean ; }  <METHOD_END>
<METHOD_START> protected boolean boolean ( ) { return this . boolean ; }  <METHOD_END>
<METHOD_START> protected java.lang.String java.lang.String ( ) { return this . java.lang.String ; }  <METHOD_END>
<METHOD_START> public void void ( java.lang.String java.lang.String ) { this . java.lang.String = java.lang.String ; }  <METHOD_END>
<METHOD_START> public void void ( HeaderMapper < MimeMessage > org.springframework.integration.mail.HeaderMapper<org.springframework.integration.mail.MimeMessage> ) { this . org.springframework.integration.mail.HeaderMapper<org.springframework.integration.mail.MimeMessage> = org.springframework.integration.mail.HeaderMapper<org.springframework.integration.mail.MimeMessage> ; }  <METHOD_END>
<METHOD_START> public void void ( boolean boolean ) { this . boolean = boolean ; }  <METHOD_END>
<METHOD_START> public void void ( boolean boolean ) { this . boolean = boolean ; }  <METHOD_END>
<METHOD_START> protected org.springframework.integration.mail.Folder org.springframework.integration.mail.Folder ( ) { return this . org.springframework.integration.mail.Folder ; }  <METHOD_END>
<METHOD_START> protected abstract org.springframework.integration.mail.Message [] org.springframework.integration.mail.Message[] ( ) org.springframework.integration.mail.MessagingException ;  <METHOD_END>
<METHOD_START> private void void ( ) org.springframework.integration.mail.MessagingException { if ( this . org.springframework.integration.mail.Session == null ) { if ( this . org.springframework.integration.mail.Authenticator != null ) { this . org.springframework.integration.mail.Session = Session . getInstance ( this . java.util.Properties , this . org.springframework.integration.mail.Authenticator ) ; } else { this . org.springframework.integration.mail.Session = Session . getInstance ( this . java.util.Properties ) ; } } }  <METHOD_END>
<METHOD_START> private void void ( ) org.springframework.integration.mail.MessagingException { if ( this . org.springframework.integration.mail.Store == null ) { if ( this . org.springframework.integration.mail.URLName != null ) { this . org.springframework.integration.mail.Store = this . org.springframework.integration.mail.Session . getStore ( this . org.springframework.integration.mail.URLName ) ; } else if ( this . java.lang.String != null ) { this . org.springframework.integration.mail.Store = this . org.springframework.integration.mail.Session . getStore ( this . java.lang.String ) ; } else { this . org.springframework.integration.mail.Store = this . org.springframework.integration.mail.Session . getStore ( ) ; } } if ( ! this . org.springframework.integration.mail.Store . isConnected ( ) ) { if ( this . org.springframework.integration.mail.Log . isDebugEnabled ( ) ) { this . org.springframework.integration.mail.Log . debug ( STRING + MailTransportUtils . toPasswordProtectedString ( this . org.springframework.integration.mail.URLName ) + STRING ) ; } this . org.springframework.integration.mail.Store . connect ( ) ; } }  <METHOD_END>
<METHOD_START> protected void void ( ) org.springframework.integration.mail.MessagingException { if ( this . org.springframework.integration.mail.Folder == null ) { void ( ) ; void ( ) ; this . org.springframework.integration.mail.Folder = org.springframework.integration.mail.Folder ( ) ; } else { void ( ) ; } if ( this . org.springframework.integration.mail.Folder == null || ! this . org.springframework.integration.mail.Folder . exists ( ) ) { throw new java.lang.IllegalStateException ( STRING + this . org.springframework.integration.mail.URLName . getFile ( ) + STRING ) ; } if ( this . org.springframework.integration.mail.Folder . isOpen ( ) ) { return; } if ( this . org.springframework.integration.mail.Log . isDebugEnabled ( ) ) { this . org.springframework.integration.mail.Log . debug ( STRING + MailTransportUtils . toPasswordProtectedString ( this . org.springframework.integration.mail.URLName ) + STRING ) ; } this . org.springframework.integration.mail.Folder . open ( this . int ) ; }  <METHOD_END>
<METHOD_START> private org.springframework.integration.mail.Folder org.springframework.integration.mail.Folder ( ) org.springframework.integration.mail.MessagingException { return this . org.springframework.integration.mail.Store . getFolder ( this . org.springframework.integration.mail.URLName ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public java.lang.Object [] java.lang.Object[] ( ) javax . javax.mail . javax.mail.MessagingException { synchronized ( this . java.lang.Object ) { try { this . void ( ) ; if ( this . org.springframework.integration.mail.Log . isInfoEnabled ( ) ) { this . org.springframework.integration.mail.Log . info ( STRING + this . org.springframework.integration.mail.Folder ( ) . getFullName ( ) + STRING ) ; } Message [] org.springframework.integration.mail.Message[] = org.springframework.integration.mail.Message[] ( ) ; if ( this . int > NUMBER && messages . length > this . int ) { Message [] org.springframework.integration.mail.Message[] = new Message [ this . int ] ; java.lang.System . void ( org.springframework.integration.mail.Message[] , NUMBER , org.springframework.integration.mail.Message[] , NUMBER , this . int ) ; org.springframework.integration.mail.Message[] = org.springframework.integration.mail.Message[] ; } if ( this . org.springframework.integration.mail.Log . isDebugEnabled ( ) ) { this . org.springframework.integration.mail.Log . debug ( STRING + messages . length + STRING ) ; } if ( messages . length > NUMBER ) { void ( org.springframework.integration.mail.Message[] ) ; } if ( this . org.springframework.integration.mail.Log . isDebugEnabled ( ) ) { this . org.springframework.integration.mail.Log . debug ( STRING + messages . length + STRING ) ; } MimeMessage [] org.springframework.integration.mail.MimeMessage[] = org.springframework.integration.mail.MimeMessage[] ( org.springframework.integration.mail.Message[] ) ; void ( org.springframework.integration.mail.MimeMessage[] ) ; if ( this . org.springframework.integration.mail.HeaderMapper<org.springframework.integration.mail.MimeMessage> != null ) { org . springframework . org.springframework.messaging . org.springframework.messaging < ? > [] converted = new org . springframework . org.springframework.messaging . org.springframework.messaging < ? > [ filteredMessages . length ] ; int int = NUMBER ; for ( MimeMessage org.springframework.integration.mail.MimeMessage : org.springframework.integration.mail.MimeMessage[] ) { java.util.Map<java.lang.String,java.lang.Object> < java.lang.String , java.lang.Object > java.util.Map<java.lang.String,java.lang.Object> = this . org.springframework.integration.mail.HeaderMapper<org.springframework.integration.mail.MimeMessage> . toHeaders ( org.springframework.integration.mail.MimeMessage ) ; converted [ int ++ ] = getMessageBuilderFactory ( ) . withPayload ( java.lang.Object ( org.springframework.integration.mail.MimeMessage , java.util.Map<java.lang.String,java.lang.Object> ) ) . copyHeaders ( java.util.Map<java.lang.String,java.lang.Object> ) . build ( ) ; } return converted ; } else { return org.springframework.integration.mail.MimeMessage[] ; } } finally { MailTransportUtils . closeFolder ( this . org.springframework.integration.mail.Folder , this . boolean ) ; } } }  <METHOD_END>
<METHOD_START> private java.lang.Object java.lang.Object ( MimeMessage org.springframework.integration.mail.MimeMessage , java.util.Map<java.lang.String,java.lang.Object> < java.lang.String , java.lang.Object > java.util.Map<java.lang.String,java.lang.Object> ) { java.lang.Object java.lang.Object ; try { MimeMessage org.springframework.integration.mail.MimeMessage ; if ( this . boolean ) { org.springframework.integration.mail.MimeMessage = new org.springframework.integration.mail.AbstractMailReceiver.IntegrationMimeMessage ( org.springframework.integration.mail.MimeMessage ) ; } else { org.springframework.integration.mail.MimeMessage = org.springframework.integration.mail.MimeMessage ; } java.lang.Object = org.springframework.integration.mail.MimeMessage . getContent ( ) ; if ( java.lang.Object instanceof java.lang.String ) { java.lang.String java.lang.String = ( java.lang.String ) java.util.Map<java.lang.String,java.lang.Object> . java.lang.Object ( MailHeaders . CONTENT_TYPE ) ; if ( java.lang.String != null && java.lang.String . java.lang.String ( ) . boolean ( STRING ) ) { java.util.Map<java.lang.String,java.lang.Object> . java.lang.Object ( MessageHeaders . CONTENT_TYPE , java.lang.String ) ; } else { java.util.Map<java.lang.String,java.lang.Object> . java.lang.Object ( MessageHeaders . CONTENT_TYPE , STRING ) ; } } else if ( java.lang.Object instanceof java.io.InputStream ) { java.io.ByteArrayOutputStream java.io.ByteArrayOutputStream = new java.io.ByteArrayOutputStream ( ) ; FileCopyUtils . copy ( ( java.io.InputStream ) java.lang.Object , java.io.ByteArrayOutputStream ) ; java.lang.Object = java.lang.Object ( java.util.Map<java.lang.String,java.lang.Object> , java.io.ByteArrayOutputStream ) ; } else if ( java.lang.Object instanceof Multipart && this . boolean ) { java.io.ByteArrayOutputStream java.io.ByteArrayOutputStream = new java.io.ByteArrayOutputStream ( ) ; ( ( Multipart ) java.lang.Object ) . writeTo ( java.io.ByteArrayOutputStream ) ; java.lang.Object = java.lang.Object ( java.util.Map<java.lang.String,java.lang.Object> , java.io.ByteArrayOutputStream ) ; } else if ( java.lang.Object instanceof Part && this . boolean ) { java.io.ByteArrayOutputStream java.io.ByteArrayOutputStream = new java.io.ByteArrayOutputStream ( ) ; ( ( Part ) java.lang.Object ) . writeTo ( java.io.ByteArrayOutputStream ) ; java.lang.Object = java.lang.Object ( java.util.Map<java.lang.String,java.lang.Object> , java.io.ByteArrayOutputStream ) ; } return java.lang.Object ; } catch ( java.lang.Exception java.lang.Exception ) { throw new org . springframework . org.springframework.messaging . org.springframework.messaging ( STRING + org.springframework.integration.mail.MimeMessage , java.lang.Exception ) ; } }  <METHOD_END>
<METHOD_START> private java.lang.Object java.lang.Object ( java.util.Map<java.lang.String,java.lang.Object> < java.lang.String , java.lang.Object > java.util.Map<java.lang.String,java.lang.Object> , java.io.ByteArrayOutputStream java.io.ByteArrayOutputStream ) { java.util.Map<java.lang.String,java.lang.Object> . java.lang.Object ( MessageHeaders . CONTENT_TYPE , STRING ) ; return java.io.ByteArrayOutputStream . byte[] ( ) ; }  <METHOD_END>
<METHOD_START> private void void ( Message [] org.springframework.integration.mail.Message[] ) throws org.springframework.integration.mail.MessagingException { void ( org.springframework.integration.mail.Message[] ) ; if ( boolean ( ) ) { void ( org.springframework.integration.mail.Message[] ) ; } if ( this . org.springframework.integration.mail.HeaderMapper<org.springframework.integration.mail.MimeMessage> == null ) { for ( int int = NUMBER ; int < filteredMessages . length ; int ++ ) { MimeMessage org.springframework.integration.mail.MimeMessage = new org.springframework.integration.mail.AbstractMailReceiver.IntegrationMimeMessage ( ( MimeMessage ) org.springframework.integration.mail.Message[] [ int ] ) ; org.springframework.integration.mail.Message[] [ int ] = org.springframework.integration.mail.MimeMessage ; } } }  <METHOD_END>
<METHOD_START> private void void ( Message [] org.springframework.integration.mail.Message[] ) throws org.springframework.integration.mail.MessagingException { boolean boolean = false ; Flags org.springframework.integration.mail.Flags = org.springframework.integration.mail.Folder ( ) . getPermanentFlags ( ) ; if ( org.springframework.integration.mail.Flags != null ) { boolean = org.springframework.integration.mail.Flags . contains ( Flags . Flag . RECENT ) ; } for ( Message org.springframework.integration.mail.Message : org.springframework.integration.mail.Message[] ) { if ( ! boolean ) { if ( org.springframework.integration.mail.Flags != null && org.springframework.integration.mail.Flags . contains ( Flags . Flag . USER ) ) { if ( this . org.springframework.integration.mail.Log . isDebugEnabled ( ) ) { this . org.springframework.integration.mail.Log . debug ( STRING + this . java.lang.String + STRING ) ; } Flags org.springframework.integration.mail.Flags = new Flags ( ) ; org.springframework.integration.mail.Flags . add ( this . java.lang.String ) ; org.springframework.integration.mail.Message . setFlags ( org.springframework.integration.mail.Flags , true ) ; } else { if ( this . org.springframework.integration.mail.Log . isDebugEnabled ( ) ) { this . org.springframework.integration.mail.Log . debug ( STRING + STRING ) ; } org.springframework.integration.mail.Message . setFlag ( Flags . Flag . FLAGGED , true ) ; } } void ( org.springframework.integration.mail.Message ) ; } }  <METHOD_END>
<METHOD_START> private org.springframework.integration.mail.MimeMessage [] org.springframework.integration.mail.MimeMessage[] ( Message [] org.springframework.integration.mail.Message[] ) throws org.springframework.integration.mail.MessagingException { java.util.List<org.springframework.integration.mail.MimeMessage> < MimeMessage > java.util.List<org.springframework.integration.mail.MimeMessage> = new java.util.LinkedList<org.springframework.integration.mail.MimeMessage> < MimeMessage > ( ) ; for ( int int = NUMBER ; int < messages . length ; int ++ ) { MimeMessage org.springframework.integration.mail.MimeMessage = ( MimeMessage ) org.springframework.integration.mail.Message[] [ int ] ; if ( this . org.springframework.integration.mail.Expression != null ) { if ( this . org.springframework.integration.mail.Expression . getValue ( this . org.springframework.integration.mail.StandardEvaluationContext , org.springframework.integration.mail.MimeMessage , java.lang.Boolean .class ) ) { java.util.List<org.springframework.integration.mail.MimeMessage> . add ( org.springframework.integration.mail.MimeMessage ) ; } else { if ( this . org.springframework.integration.mail.Log . isDebugEnabled ( ) ) { this . org.springframework.integration.mail.Log . debug ( STRING + org.springframework.integration.mail.MimeMessage . getSubject ( ) + STRING + STRING ) ; } } } else { java.util.List<org.springframework.integration.mail.MimeMessage> . add ( org.springframework.integration.mail.MimeMessage ) ; } } return java.util.List<org.springframework.integration.mail.MimeMessage> . toArray ( new MimeMessage [ java.util.List<org.springframework.integration.mail.MimeMessage> . size ( ) ] ) ; }  <METHOD_END>
<METHOD_START> protected void void ( Message [] org.springframework.integration.mail.Message[] ) throws org.springframework.integration.mail.MessagingException { FetchProfile org.springframework.integration.mail.FetchProfile = new FetchProfile ( ) ; org.springframework.integration.mail.FetchProfile . add ( FetchProfile . Item . ENVELOPE ) ; org.springframework.integration.mail.FetchProfile . add ( FetchProfile . Item . CONTENT_INFO ) ; org.springframework.integration.mail.FetchProfile . add ( FetchProfile . Item . FLAGS ) ; this . org.springframework.integration.mail.Folder . fetch ( org.springframework.integration.mail.Message[] , org.springframework.integration.mail.FetchProfile ) ; }  <METHOD_END>
<METHOD_START> protected void void ( Message [] org.springframework.integration.mail.Message[] ) throws org.springframework.integration.mail.MessagingException { for ( int int = NUMBER ; int < messages . length ; int ++ ) { org.springframework.integration.mail.Message[] [ int ] . setFlag ( Flags . Flag . DELETED , true ) ; } }  <METHOD_END>
<METHOD_START> protected void void ( Message org.springframework.integration.mail.Message ) throws org.springframework.integration.mail.MessagingException {	}  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( ) java.lang.Exception { synchronized ( this . java.lang.Object ) { MailTransportUtils . closeFolder ( this . org.springframework.integration.mail.Folder , this . boolean ) ; MailTransportUtils . closeService ( this . org.springframework.integration.mail.Store ) ; this . org.springframework.integration.mail.Folder = null ; this . org.springframework.integration.mail.Store = null ; this . boolean = false ; } }  <METHOD_END>
<METHOD_START> @ java.lang.Override protected void void ( ) java.lang.Exception { super. onInit ( ) ; this . int = Folder . READ_WRITE ; this . org.springframework.integration.mail.StandardEvaluationContext = ExpressionUtils . createStandardEvaluationContext ( getBeanFactory ( ) ) ; this . boolean = true ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public java.lang.String java.lang.String ( ) { return this . org.springframework.integration.mail.URLName . toString ( ) ; }  <METHOD_END>
<METHOD_START> org.springframework.integration.mail.Store org.springframework.integration.mail.Store ( ) { return this . org.springframework.integration.mail.Store ; }  <METHOD_END>
<METHOD_START> void ( MimeMessage org.springframework.integration.mail.MimeMessage ) throws org.springframework.integration.mail.MessagingException { super( org.springframework.integration.mail.MimeMessage ); this . org.springframework.integration.mail.MimeMessage = org.springframework.integration.mail.MimeMessage ; if ( org.springframework.integration.mail.AbstractMailReceiver .this . boolean ) { this . java.lang.Object = null ; } else { java.lang.Object java.lang.Object ; try { java.lang.Object = org.springframework.integration.mail.MimeMessage . getContent ( ) ; } catch ( java.io.IOException java.io.IOException ) { java.lang.Object = STRING + java.io.IOException . java.lang.String ( ) ; org.springframework.integration.mail.AbstractMailReceiver .this . org.springframework.integration.mail.Log . error ( STRING + org.springframework.integration.mail.MimeMessage , java.io.IOException ) ; } this . java.lang.Object = java.lang.Object ; } }  <METHOD_END>
<METHOD_START> @ java.lang.Override public org.springframework.integration.mail.Folder org.springframework.integration.mail.Folder ( ) { try { return org.springframework.integration.mail.AbstractMailReceiver .this . org.springframework.integration.mail.Folder ( ) ; } catch ( MessagingException org.springframework.integration.mail.MessagingException ) { throw new org . springframework . org.springframework.messaging . org.springframework.messaging ( STRING , org.springframework.integration.mail.MessagingException ) ; } }  <METHOD_END>
<METHOD_START> @ java.lang.Override public java.util.Date java.util.Date ( ) org.springframework.integration.mail.MessagingException { return this . org.springframework.integration.mail.MimeMessage . getReceivedDate ( ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public int int ( ) org.springframework.integration.mail.MessagingException { return this . org.springframework.integration.mail.MimeMessage . getLineCount ( ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public java.lang.Object java.lang.Object ( ) java.io.IOException , org.springframework.integration.mail.MessagingException { if ( org.springframework.integration.mail.AbstractMailReceiver .this . boolean ) { return super. getContent ( ) ; } else { return this . java.lang.Object ; } }  <METHOD_END>
