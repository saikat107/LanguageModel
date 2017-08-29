<METHOD_START> @ Before public void void ( ) { this . org.springframework.integration.mail.StubJavaMailSender . reset ( ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { this . org.springframework.integration.mail.MailSendingMessageHandler . handleMessage ( MailTestsHelper . createIntegrationMessage ( ) ) ; SimpleMailMessage org.springframework.integration.mail.SimpleMailMessage = MailTestsHelper . createSimpleMailMessage ( ) ; assertEquals ( STRING , NUMBER , this . org.springframework.integration.mail.StubJavaMailSender . getSentMimeMessages ( ) . size ( ) ) ; assertEquals ( STRING , NUMBER , this . org.springframework.integration.mail.StubJavaMailSender . getSentSimpleMailMessages ( ) . size ( ) ) ; assertEquals ( STRING , org.springframework.integration.mail.SimpleMailMessage , this . org.springframework.integration.mail.StubJavaMailSender . getSentSimpleMailMessages ( ) . get ( NUMBER ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { byte [] byte[] = { NUMBER , NUMBER , NUMBER } ; org . springframework . org.springframework.messaging . org.springframework.messaging < ? > message = MessageBuilder . withPayload ( byte[] ) . setHeader ( MailHeaders . ATTACHMENT_FILENAME , STRING ) . setHeader ( MailHeaders . TO , MailTestsHelper . TO ) . build ( ) ; this . org.springframework.integration.mail.MailSendingMessageHandler . handleMessage ( message ) ; assertEquals ( STRING , NUMBER , this . org.springframework.integration.mail.StubJavaMailSender . getSentMimeMessages ( ) . size ( ) ) ; assertEquals ( STRING , NUMBER , this . org.springframework.integration.mail.StubJavaMailSender . getSentSimpleMailMessages ( ) . size ( ) ) ; byte [] byte[] = new byte [ NUMBER ] ; MimeMessage org.springframework.integration.mail.MimeMessage = this . org.springframework.integration.mail.StubJavaMailSender . getSentMimeMessages ( ) . get ( NUMBER ) ; assertTrue ( STRING , org.springframework.integration.mail.MimeMessage . getContent ( ) instanceof Multipart ) ; int int = new java.io.DataInputStream ( ( ( Multipart ) org.springframework.integration.mail.MimeMessage . getContent ( ) ) . getBodyPart ( NUMBER ) . getInputStream ( ) ) . int ( byte[] ) ; assertEquals ( STRING , byte[] . int , int ) ; byte [] byte[] = new byte [ int ] ; java.lang.System . void ( byte[] , NUMBER , byte[] , NUMBER , byte[] . int ) ; assertArrayEquals ( STRING , byte[] , byte[] ) ; assertEquals ( org.springframework.integration.mail.MimeMessage . getRecipients ( Message . RecipientType . TO ) . length , MailTestsHelper . TO . length ) ; }  <METHOD_END>
<METHOD_START> @ Test ( expected = MessageMappingException .class ) public void void ( ) java.lang.Exception { byte [] byte[] = { NUMBER , NUMBER , NUMBER } ; this . org.springframework.integration.mail.MailSendingMessageHandler . handleMessage ( new GenericMessage < byte [] > ( byte[] ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { assertNotNull ( this . org.springframework.integration.mail.BeanFactory . getBean ( STRING ) ) ; this . org.springframework.integration.mail.MessageChannel . send ( MailTestsHelper . createIntegrationMessage ( ) ) ; SimpleMailMessage org.springframework.integration.mail.SimpleMailMessage = MailTestsHelper . createSimpleMailMessage ( ) ; assertEquals ( STRING , NUMBER , this . org.springframework.integration.mail.StubJavaMailSender . getSentMimeMessages ( ) . size ( ) ) ; assertEquals ( STRING , NUMBER , this . org.springframework.integration.mail.StubJavaMailSender . getSentSimpleMailMessages ( ) . size ( ) ) ; assertEquals ( STRING , org.springframework.integration.mail.SimpleMailMessage , this . org.springframework.integration.mail.StubJavaMailSender . getSentSimpleMailMessages ( ) . get ( NUMBER ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { this . org.springframework.integration.mail.MessageChannel . send ( MailTestsHelper . createIntegrationMessage ( ) ) ; assertEquals ( NUMBER , this . org.springframework.integration.mail.StubMailSender . getSentMessages ( ) . size ( ) ) ; assertEquals ( MailTestsHelper . createSimpleMailMessage ( ) , this . org.springframework.integration.mail.StubMailSender . getSentMessages ( ) . get ( NUMBER ) ) ; try { this . org.springframework.integration.mail.MessageChannel . send ( new GenericMessage < byte [] > ( new byte [ NUMBER ] ) ) ; fail ( STRING ) ; } catch ( java.lang.Exception java.lang.Exception ) { assertThat ( java.lang.Exception , instanceOf ( MessageHandlingException .class ) ) ; assertThat ( java.lang.Exception . java.lang.Throwable ( ) , instanceOf ( java.lang.IllegalStateException .class ) ) ; assertThat ( java.lang.Exception . java.lang.String ( ) , containsString ( STRING ) ) ; } try { this . org.springframework.integration.mail.MessageChannel . send ( MessageBuilder . withPayload ( STRING ) . setHeader ( MailHeaders . CONTENT_TYPE , STRING ) . setHeader ( MailHeaders . TO , STRING ) . build ( ) ) ; fail ( STRING ) ; } catch ( java.lang.Exception java.lang.Exception ) { assertThat ( java.lang.Exception , instanceOf ( MessageHandlingException .class ) ) ; assertThat ( java.lang.Exception . java.lang.Throwable ( ) , instanceOf ( java.lang.IllegalStateException .class ) ) ; assertThat ( java.lang.Exception . java.lang.String ( ) , containsString ( STRING ) ) ; } try { this . org.springframework.integration.mail.MessageChannel . send ( new GenericMessage < MimeMessage > ( this . org.springframework.integration.mail.StubJavaMailSender . createMimeMessage ( ) ) ) ; fail ( STRING ) ; } catch ( java.lang.Exception java.lang.Exception ) { assertThat ( java.lang.Exception , instanceOf ( MessageHandlingException .class ) ) ; assertThat ( java.lang.Exception . java.lang.Throwable ( ) , instanceOf ( java.lang.IllegalStateException .class ) ) ; assertThat ( java.lang.Exception . java.lang.String ( ) , containsString ( STRING ) ) ; } }  <METHOD_END>
