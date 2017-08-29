<METHOD_START> @ Before public void void ( ) { this . org.springframework.integration.sftp.outbound.SftpServerOutboundTests.Config . java.lang.String = getTargetLocalDirectoryName ( ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { Session < ? > org.springframework.integration.sftp.outbound.Session<?> = this . org.springframework.integration.sftp.outbound.SessionFactory<org.springframework.integration.sftp.outbound.LsEntry> . getSession ( ) ; java.lang.String java.lang.String = STRING ; long long = long ( ) ; this . org.springframework.integration.sftp.outbound.DirectChannel . send ( new GenericMessage < java.lang.Object > ( java.lang.String + STRING ) ) ; Message < ? > org.springframework.integration.sftp.outbound.Message<?> = this . org.springframework.integration.sftp.outbound.PollableChannel . receive ( NUMBER ) ; assertNotNull ( org.springframework.integration.sftp.outbound.Message<> ) ; java.io.File java.io.File = ( java.io.File ) org.springframework.integration.sftp.outbound.Message<> . getPayload ( ) ; assertThat ( java.io.File . java.lang.String ( ) . java.lang.String ( java.util.regex.Matcher . java.lang.String ( java.io.File . java.lang.String ) , STRING ) , containsString ( java.lang.String . java.lang.String ( ) ) ) ; boolean ( long , java.io.File ) ; java.lang.String = STRING ; this . org.springframework.integration.sftp.outbound.DirectChannel . send ( new GenericMessage < java.lang.Object > ( java.lang.String + STRING ) ) ; org.springframework.integration.sftp.outbound.Message<?> = this . org.springframework.integration.sftp.outbound.PollableChannel . receive ( NUMBER ) ; assertNotNull ( org.springframework.integration.sftp.outbound.Message<> ) ; java.io.File = ( java.io.File ) org.springframework.integration.sftp.outbound.Message<> . getPayload ( ) ; assertThat ( java.io.File . java.lang.String ( ) . java.lang.String ( java.util.regex.Matcher . java.lang.String ( java.io.File . java.lang.String ) , STRING ) , containsString ( java.lang.String . java.lang.String ( ) ) ) ; Session < ? > org.springframework.integration.sftp.outbound.Session<?> = this . org.springframework.integration.sftp.outbound.SessionFactory<org.springframework.integration.sftp.outbound.LsEntry> . getSession ( ) ; assertSame ( TestUtils . getPropertyValue ( org.springframework.integration.sftp.outbound.Session<> , STRING ) , TestUtils . getPropertyValue ( org.springframework.integration.sftp.outbound.Session<> , STRING ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { try { this . org.springframework.integration.sftp.outbound.DirectChannel . send ( new GenericMessage < java.lang.Object > ( STRING ) ) ; fail ( STRING ) ; } catch ( java.lang.Exception java.lang.Exception ) { java.lang.Throwable java.lang.Throwable = java.lang.Exception . java.lang.Throwable ( ) ; assertNotNull ( java.lang.Throwable ) ; java.lang.Throwable = java.lang.Throwable . java.lang.Throwable ( ) ; assertThat ( java.lang.Throwable , Matchers . instanceOf ( java.lang.IllegalArgumentException .class ) ) ; assertThat ( java.lang.Throwable . java.lang.String ( ) , Matchers . startsWith ( STRING ) ) ; } }  <METHOD_END>
<METHOD_START> @ Test @ java.lang.SuppressWarnings ( STRING ) public void void ( ) { java.lang.String java.lang.String = STRING ; long long = long ( ) ; this . org.springframework.integration.sftp.outbound.DirectChannel . send ( new GenericMessage < java.lang.Object > ( java.lang.String + STRING ) ) ; Message < ? > org.springframework.integration.sftp.outbound.Message<?> = this . org.springframework.integration.sftp.outbound.PollableChannel . receive ( NUMBER ) ; assertNotNull ( org.springframework.integration.sftp.outbound.Message<> ) ; java.util.List<java.io.File> < java.io.File > java.util.List<java.io.File> = ( java.util.List<java.io.File> < java.io.File > ) org.springframework.integration.sftp.outbound.Message<> . getPayload ( ) ; assertThat ( java.util.List<java.io.File> . int ( ) , Matchers . greaterThan ( NUMBER ) ) ; boolean boolean = false ; for ( java.io.File java.io.File : java.util.List<java.io.File> ) { assertThat ( java.io.File . java.lang.String ( ) . java.lang.String ( java.util.regex.Matcher . java.lang.String ( java.io.File . java.lang.String ) , STRING ) , containsString ( java.lang.String ) ) ; if ( java.io.File . java.lang.String ( ) . boolean ( STRING ) ) { boolean = boolean ( long , java.io.File ) ; } } assertTrue ( boolean ) ; java.lang.String = STRING ; this . org.springframework.integration.sftp.outbound.DirectChannel . send ( new GenericMessage < java.lang.Object > ( java.lang.String + STRING ) ) ; org.springframework.integration.sftp.outbound.Message<?> = this . org.springframework.integration.sftp.outbound.PollableChannel . receive ( NUMBER ) ; assertNotNull ( org.springframework.integration.sftp.outbound.Message<> ) ; java.util.List<java.io.File> = ( java.util.List<java.io.File> < java.io.File > ) org.springframework.integration.sftp.outbound.Message<> . getPayload ( ) ; assertThat ( java.util.List<java.io.File> . int ( ) , Matchers . greaterThan ( NUMBER ) ) ; for ( java.io.File java.io.File : java.util.List<java.io.File> ) { assertThat ( java.io.File . java.lang.String ( ) . java.lang.String ( java.util.regex.Matcher . java.lang.String ( java.io.File . java.lang.String ) , STRING ) , containsString ( java.lang.String ) ) ; } }  <METHOD_END>
<METHOD_START> @ Test @ java.lang.SuppressWarnings ( STRING ) public void void ( ) java.io.IOException { java.lang.String java.lang.String = STRING ; long long = long ( ) ; java.io.File java.io.File = new java.io.File ( getSourceRemoteDirectory ( ) , STRING ) ; java.io.File . boolean ( java.lang.System . long ( ) - NUMBER ) ; this . org.springframework.integration.sftp.outbound.DirectChannel . send ( new GenericMessage < java.lang.Object > ( java.lang.String + STRING ) ) ; Message < ? > org.springframework.integration.sftp.outbound.Message<?> = this . org.springframework.integration.sftp.outbound.PollableChannel . receive ( NUMBER ) ; assertNotNull ( org.springframework.integration.sftp.outbound.Message<> ) ; java.util.List<java.io.File> < java.io.File > java.util.List<java.io.File> = ( java.util.List<java.io.File> < java.io.File > ) org.springframework.integration.sftp.outbound.Message<> . getPayload ( ) ; assertEquals ( NUMBER , java.util.List<java.io.File> . int ( ) ) ; boolean boolean = false ; for ( java.io.File java.io.File : java.util.List<java.io.File> ) { assertThat ( java.io.File . java.lang.String ( ) . java.lang.String ( java.util.regex.Matcher . java.lang.String ( java.io.File . java.lang.String ) , STRING ) , containsString ( java.lang.String ) ) ; if ( java.io.File . java.lang.String ( ) . boolean ( STRING ) ) { boolean = boolean ( long , java.io.File ) ; } } assertTrue ( boolean ) ; assertThat ( java.util.List<java.io.File> . java.io.File ( NUMBER ) . java.lang.String ( ) . java.lang.String ( java.util.regex.Matcher . java.lang.String ( java.io.File . java.lang.String ) , STRING ) , containsString ( java.lang.String + STRING ) ) ; java.io.File java.io.File = new java.io.File ( getTargetLocalDirectory ( ) + java.io.File . java.lang.String + STRING , STRING ) ; java.io.ByteArrayOutputStream java.io.ByteArrayOutputStream = new java.io.ByteArrayOutputStream ( ) ; java.io.ByteArrayOutputStream java.io.ByteArrayOutputStream = new java.io.ByteArrayOutputStream ( ) ; FileUtils . copyFile ( java.io.File , java.io.ByteArrayOutputStream ) ; FileUtils . copyFile ( java.io.File , java.io.ByteArrayOutputStream ) ; java.lang.String java.lang.String = new java.lang.String ( java.io.ByteArrayOutputStream . byte[] ( ) ) ; assertEquals ( new java.lang.String ( java.io.ByteArrayOutputStream . byte[] ( ) ) , java.lang.String ) ; long long = java.io.File . long ( ) ; FileUtils . copyInputStreamToFile ( new java.io.ByteArrayInputStream ( STRING . byte[] ( ) ) , java.io.File ) ; long long = java.io.File . long ( ) ; java.io.File . boolean ( long ) ; this . org.springframework.integration.sftp.outbound.DirectChannel . send ( new GenericMessage < java.lang.Object > ( java.lang.String + STRING ) ) ; this . org.springframework.integration.sftp.outbound.PollableChannel . receive ( NUMBER ) ; java.io.ByteArrayOutputStream = new java.io.ByteArrayOutputStream ( ) ; FileUtils . copyFile ( java.io.File , java.io.ByteArrayOutputStream ) ; assertEquals ( java.lang.String , new java.lang.String ( java.io.ByteArrayOutputStream . byte[] ( ) ) ) ; java.io.File . boolean ( long ) ; this . org.springframework.integration.sftp.outbound.DirectChannel . send ( new GenericMessage < java.lang.Object > ( java.lang.String + STRING ) ) ; this . org.springframework.integration.sftp.outbound.PollableChannel . receive ( NUMBER ) ; java.io.ByteArrayOutputStream = new java.io.ByteArrayOutputStream ( ) ; FileUtils . copyFile ( java.io.File , java.io.ByteArrayOutputStream ) ; assertEquals ( STRING , new java.lang.String ( java.io.ByteArrayOutputStream . byte[] ( ) ) ) ; FileUtils . copyInputStreamToFile ( new java.io.ByteArrayInputStream ( java.lang.String . byte[] ( ) ) , java.io.File ) ; }  <METHOD_END>
<METHOD_START> private long long ( ) { java.io.File java.io.File = new java.io.File ( getSourceRemoteDirectory ( ) , STRING ) ; java.io.File . boolean ( java.lang.System . long ( ) - NUMBER ) ; long long = java.io.File . long ( ) ; assertTrue ( long > NUMBER ) ; return long ; }  <METHOD_END>
<METHOD_START> private boolean boolean ( long long , java.io.File java.io.File ) { assertTrue ( STRING + ( long - java.io.File . long ( ) ) , java.lang.Math . long ( java.io.File . long ( ) - long ) < NUMBER ) ; return true ; }  <METHOD_END>
<METHOD_START> @ Test @ java.lang.SuppressWarnings ( STRING ) public void void ( ) { java.lang.String java.lang.String = STRING ; this . org.springframework.integration.sftp.outbound.DirectChannel . send ( new GenericMessage < java.lang.Object > ( java.lang.String + STRING ) ) ; Message < ? > org.springframework.integration.sftp.outbound.Message<?> = this . org.springframework.integration.sftp.outbound.PollableChannel . receive ( NUMBER ) ; assertNotNull ( org.springframework.integration.sftp.outbound.Message<> ) ; java.util.List<java.io.File> < java.io.File > java.util.List<java.io.File> = ( java.util.List<java.io.File> < java.io.File > ) org.springframework.integration.sftp.outbound.Message<> . getPayload ( ) ; assertEquals ( NUMBER , java.util.List<java.io.File> . int ( ) ) ; for ( java.io.File java.io.File : java.util.List<java.io.File> ) { assertThat ( java.io.File . java.lang.String ( ) . java.lang.String ( java.util.regex.Matcher . java.lang.String ( java.io.File . java.lang.String ) , STRING ) , containsString ( java.lang.String ) ) ; } assertThat ( java.util.List<java.io.File> . java.io.File ( NUMBER ) . java.lang.String ( ) . java.lang.String ( java.util.regex.Matcher . java.lang.String ( java.io.File . java.lang.String ) , STRING ) , containsString ( java.lang.String + STRING ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { Session < ? > org.springframework.integration.sftp.outbound.Session<?> = this . org.springframework.integration.sftp.outbound.SessionFactory<org.springframework.integration.sftp.outbound.LsEntry> . getSession ( ) ; java.io.ByteArrayOutputStream java.io.ByteArrayOutputStream = new java.io.ByteArrayOutputStream ( ) ; FileCopyUtils . copy ( org.springframework.integration.sftp.outbound.Session<> . readRaw ( STRING ) , java.io.ByteArrayOutputStream ) ; assertTrue ( org.springframework.integration.sftp.outbound.Session<> . finalizeRaw ( ) ) ; assertEquals ( STRING , new java.lang.String ( java.io.ByteArrayOutputStream . byte[] ( ) ) ) ; java.io.ByteArrayOutputStream = new java.io.ByteArrayOutputStream ( ) ; FileCopyUtils . copy ( org.springframework.integration.sftp.outbound.Session<> . readRaw ( STRING ) , java.io.ByteArrayOutputStream ) ; assertTrue ( org.springframework.integration.sftp.outbound.Session<> . finalizeRaw ( ) ) ; assertEquals ( STRING , new java.lang.String ( java.io.ByteArrayOutputStream . byte[] ( ) ) ) ; org.springframework.integration.sftp.outbound.Session<> . close ( ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { final Session < ? > org.springframework.integration.sftp.outbound.Session<?> = this . org.springframework.integration.sftp.outbound.SessionFactory<org.springframework.integration.sftp.outbound.LsEntry> . getSession ( ) ; final Session < ? > org.springframework.integration.sftp.outbound.Session<?> = this . org.springframework.integration.sftp.outbound.SessionFactory<org.springframework.integration.sftp.outbound.LsEntry> . getSession ( ) ; final java.io.PipedInputStream java.io.PipedInputStream = new java.io.PipedInputStream ( ) ; java.io.PipedOutputStream java.io.PipedOutputStream = new java.io.PipedOutputStream ( java.io.PipedInputStream ) ; final java.io.PipedInputStream java.io.PipedInputStream = new java.io.PipedInputStream ( ) ; java.io.PipedOutputStream java.io.PipedOutputStream = new java.io.PipedOutputStream ( java.io.PipedInputStream ) ; final java.util.concurrent.CountDownLatch java.util.concurrent.CountDownLatch = new java.util.concurrent.CountDownLatch ( NUMBER ) ; final java.util.concurrent.CountDownLatch java.util.concurrent.CountDownLatch = new java.util.concurrent.CountDownLatch ( NUMBER ) ; java.util.concurrent.Executors . java.util.concurrent.ExecutorService ( ) . void ( ( ) { try { org.springframework.integration.sftp.outbound.Session<> . write ( java.io.PipedInputStream , STRING ) ; } catch ( java.io.IOException java.io.IOException ) { java.io.IOException . void ( ) ; } java.util.concurrent.CountDownLatch . void ( ) ; } ) ; java.util.concurrent.Executors . java.util.concurrent.ExecutorService ( ) . void ( ( ) { try { org.springframework.integration.sftp.outbound.Session<> . write ( java.io.PipedInputStream , STRING ) ; } catch ( java.io.IOException java.io.IOException ) { java.io.IOException . void ( ) ; } java.util.concurrent.CountDownLatch . void ( ) ; } ) ; java.io.PipedOutputStream . void ( 'a' ) ; java.io.PipedOutputStream . void ( 'b' ) ; java.io.PipedOutputStream . void ( 'c' ) ; java.io.PipedOutputStream . void ( 'd' ) ; java.io.PipedOutputStream . void ( 'e' ) ; java.io.PipedOutputStream . void ( 'f' ) ; java.io.PipedOutputStream . void ( ) ; java.io.PipedOutputStream . void ( ) ; assertTrue ( java.util.concurrent.CountDownLatch . boolean ( NUMBER , java.util.concurrent.TimeUnit . java.util.concurrent.TimeUnit ) ) ; assertTrue ( java.util.concurrent.CountDownLatch . boolean ( NUMBER , java.util.concurrent.TimeUnit . java.util.concurrent.TimeUnit ) ) ; java.io.ByteArrayOutputStream java.io.ByteArrayOutputStream = new java.io.ByteArrayOutputStream ( ) ; java.io.ByteArrayOutputStream java.io.ByteArrayOutputStream = new java.io.ByteArrayOutputStream ( ) ; org.springframework.integration.sftp.outbound.Session<> . read ( STRING , java.io.ByteArrayOutputStream ) ; org.springframework.integration.sftp.outbound.Session<> . read ( STRING , java.io.ByteArrayOutputStream ) ; assertEquals ( STRING , new java.lang.String ( java.io.ByteArrayOutputStream . byte[] ( ) ) ) ; assertEquals ( STRING , new java.lang.String ( java.io.ByteArrayOutputStream . byte[] ( ) ) ) ; org.springframework.integration.sftp.outbound.Session<> . remove ( STRING ) ; org.springframework.integration.sftp.outbound.Session<> . remove ( STRING ) ; org.springframework.integration.sftp.outbound.Session<> . close ( ) ; org.springframework.integration.sftp.outbound.Session<> . close ( ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { Session < ? > org.springframework.integration.sftp.outbound.Session<?> = org.springframework.integration.sftp.outbound.SessionFactory<org.springframework.integration.sftp.outbound.LsEntry> . getSession ( ) ; org.springframework.integration.sftp.outbound.Session<> . close ( ) ; org.springframework.integration.sftp.outbound.Session<?> = TestUtils . getPropertyValue ( org.springframework.integration.sftp.outbound.Session<> , STRING , Session .class ) ; ChannelSftp org.springframework.integration.sftp.outbound.ChannelSftp = spy ( TestUtils . getPropertyValue ( org.springframework.integration.sftp.outbound.Session<> , STRING , ChannelSftp .class ) ) ; new DirectFieldAccessor ( org.springframework.integration.sftp.outbound.Session<> ) . setPropertyValue ( STRING , org.springframework.integration.sftp.outbound.ChannelSftp ) ; java.lang.String java.lang.String = STRING ; this . org.springframework.integration.sftp.outbound.DirectChannel . send ( new GenericMessage < java.lang.Object > ( java.lang.String + STRING ) ) ; while ( org.springframework.integration.sftp.outbound.PollableChannel . receive ( NUMBER ) != null ) { } this . org.springframework.integration.sftp.outbound.DirectChannel . send ( new GenericMessage < java.io.File > ( getSourceLocalDirectory ( ) ) ) ; @ java.lang.SuppressWarnings ( STRING ) Message < java.util.List<java.lang.String> < java.lang.String > > org.springframework.integration.sftp.outbound.Message<java.util.List<java.lang.String>> = ( Message < java.util.List<java.lang.String> < java.lang.String > > ) this . org.springframework.integration.sftp.outbound.PollableChannel . receive ( NUMBER ) ; assertNotNull ( org.springframework.integration.sftp.outbound.Message<java.util.List<java.lang.String>> ) ; assertEquals ( NUMBER , org.springframework.integration.sftp.outbound.Message<java.util.List<java.lang.String>> . getPayload ( ) . size ( ) ) ; assertThat ( org.springframework.integration.sftp.outbound.Message<java.util.List<java.lang.String>> . getPayload ( ) . get ( NUMBER ) , not ( equalTo ( org.springframework.integration.sftp.outbound.Message<java.util.List<java.lang.String>> . getPayload ( ) . get ( NUMBER ) ) ) ) ; assertThat ( org.springframework.integration.sftp.outbound.Message<java.util.List<java.lang.String>> . getPayload ( ) . get ( NUMBER ) , anyOf ( equalTo ( STRING ) , equalTo ( STRING ) ) ) ; assertThat ( org.springframework.integration.sftp.outbound.Message<java.util.List<java.lang.String>> . getPayload ( ) . get ( NUMBER ) , anyOf ( equalTo ( STRING ) , equalTo ( STRING ) ) ) ; verify ( org.springframework.integration.sftp.outbound.ChannelSftp ) . chmod ( NUMBER , STRING ) ; verify ( org.springframework.integration.sftp.outbound.ChannelSftp ) . chmod ( NUMBER , STRING ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { java.lang.String java.lang.String = STRING ; this . org.springframework.integration.sftp.outbound.DirectChannel . send ( new GenericMessage < java.lang.Object > ( java.lang.String + STRING ) ) ; while ( org.springframework.integration.sftp.outbound.PollableChannel . receive ( NUMBER ) != null ) { } this . org.springframework.integration.sftp.outbound.DirectChannel . send ( new GenericMessage < java.io.File > ( getSourceLocalDirectory ( ) ) ) ; @ java.lang.SuppressWarnings ( STRING ) Message < java.util.List<java.lang.String> < java.lang.String > > org.springframework.integration.sftp.outbound.Message<java.util.List<java.lang.String>> = ( Message < java.util.List<java.lang.String> < java.lang.String > > ) this . org.springframework.integration.sftp.outbound.PollableChannel . receive ( NUMBER ) ; assertNotNull ( org.springframework.integration.sftp.outbound.Message<java.util.List<java.lang.String>> ) ; assertEquals ( NUMBER , org.springframework.integration.sftp.outbound.Message<java.util.List<java.lang.String>> . getPayload ( ) . size ( ) ) ; assertThat ( org.springframework.integration.sftp.outbound.Message<java.util.List<java.lang.String>> . getPayload ( ) . get ( NUMBER ) , not ( equalTo ( org.springframework.integration.sftp.outbound.Message<java.util.List<java.lang.String>> . getPayload ( ) . get ( NUMBER ) ) ) ) ; assertThat ( org.springframework.integration.sftp.outbound.Message<java.util.List<java.lang.String>> . getPayload ( ) . get ( NUMBER ) , anyOf ( equalTo ( STRING ) , equalTo ( STRING ) , equalTo ( STRING ) ) ) ; assertThat ( org.springframework.integration.sftp.outbound.Message<java.util.List<java.lang.String>> . getPayload ( ) . get ( NUMBER ) , anyOf ( equalTo ( STRING ) , equalTo ( STRING ) , equalTo ( STRING ) ) ) ; assertThat ( org.springframework.integration.sftp.outbound.Message<java.util.List<java.lang.String>> . getPayload ( ) . get ( NUMBER ) , anyOf ( equalTo ( STRING ) , equalTo ( STRING ) , equalTo ( STRING ) ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { java.lang.String java.lang.String = STRING ; this . org.springframework.integration.sftp.outbound.DirectChannel . send ( new GenericMessage < java.lang.Object > ( java.lang.String + STRING ) ) ; while ( org.springframework.integration.sftp.outbound.PollableChannel . receive ( NUMBER ) != null ) { } this . org.springframework.integration.sftp.outbound.DirectChannel . send ( new GenericMessage < java.io.File > ( getSourceLocalDirectory ( ) ) ) ; @ java.lang.SuppressWarnings ( STRING ) Message < java.util.List<java.lang.String> < java.lang.String > > org.springframework.integration.sftp.outbound.Message<java.util.List<java.lang.String>> = ( Message < java.util.List<java.lang.String> < java.lang.String > > ) this . org.springframework.integration.sftp.outbound.PollableChannel . receive ( NUMBER ) ; assertNotNull ( org.springframework.integration.sftp.outbound.Message<java.util.List<java.lang.String>> ) ; assertEquals ( NUMBER , org.springframework.integration.sftp.outbound.Message<java.util.List<java.lang.String>> . getPayload ( ) . size ( ) ) ; assertThat ( org.springframework.integration.sftp.outbound.Message<java.util.List<java.lang.String>> . getPayload ( ) . get ( NUMBER ) , not ( equalTo ( org.springframework.integration.sftp.outbound.Message<java.util.List<java.lang.String>> . getPayload ( ) . get ( NUMBER ) ) ) ) ; assertThat ( org.springframework.integration.sftp.outbound.Message<java.util.List<java.lang.String>> . getPayload ( ) . get ( NUMBER ) , anyOf ( equalTo ( STRING ) , equalTo ( STRING ) , equalTo ( STRING ) ) ) ; assertThat ( org.springframework.integration.sftp.outbound.Message<java.util.List<java.lang.String>> . getPayload ( ) . get ( NUMBER ) , anyOf ( equalTo ( STRING ) , equalTo ( STRING ) , equalTo ( STRING ) ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { Message < java.lang.String > org.springframework.integration.sftp.outbound.Message<java.lang.String> = MessageBuilder . withPayload ( STRING ) . setHeader ( FileHeaders . FILENAME , STRING ) . build ( ) ; org.springframework.integration.sftp.outbound.DirectChannel . send ( org.springframework.integration.sftp.outbound.Message<java.lang.String> ) ; org.springframework.integration.sftp.outbound.DirectChannel . send ( org.springframework.integration.sftp.outbound.Message<java.lang.String> ) ; SftpRemoteFileTemplate org.springframework.integration.sftp.outbound.SftpRemoteFileTemplate = new SftpRemoteFileTemplate ( org.springframework.integration.sftp.outbound.SessionFactory<org.springframework.integration.sftp.outbound.LsEntry> ) ; void ( org.springframework.integration.sftp.outbound.SftpRemoteFileTemplate ) ; org.springframework.integration.sftp.outbound.DirectChannel . send ( org.springframework.integration.sftp.outbound.Message<java.lang.String> ) ; void ( org.springframework.integration.sftp.outbound.SftpRemoteFileTemplate ) ; try { org.springframework.integration.sftp.outbound.DirectChannel . send ( org.springframework.integration.sftp.outbound.Message<java.lang.String> ) ; fail ( STRING ) ; } catch ( MessagingException org.springframework.integration.sftp.outbound.MessagingException ) { assertThat ( org.springframework.integration.sftp.outbound.MessagingException . getCause ( ) . getCause ( ) . getMessage ( ) , containsString ( STRING ) ) ; } }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { Session < ? > org.springframework.integration.sftp.outbound.Session<?> = spy ( this . org.springframework.integration.sftp.outbound.SessionFactory<org.springframework.integration.sftp.outbound.LsEntry> . getSession ( ) ) ; org.springframework.integration.sftp.outbound.Session<> . close ( ) ; java.lang.String java.lang.String = STRING ; this . org.springframework.integration.sftp.outbound.DirectChannel . send ( new GenericMessage < java.lang.Object > ( java.lang.String + STRING ) ) ; Message < ? > org.springframework.integration.sftp.outbound.Message<?> = this . org.springframework.integration.sftp.outbound.PollableChannel . receive ( NUMBER ) ; assertNotNull ( org.springframework.integration.sftp.outbound.Message<> ) ; assertEquals ( STRING , org.springframework.integration.sftp.outbound.Message<> . getPayload ( ) ) ; assertEquals ( STRING , org.springframework.integration.sftp.outbound.Message<> . getHeaders ( ) . get ( FileHeaders . REMOTE_DIRECTORY ) ) ; assertEquals ( STRING , org.springframework.integration.sftp.outbound.Message<> . getHeaders ( ) . get ( FileHeaders . REMOTE_FILE ) ) ; verify ( org.springframework.integration.sftp.outbound.Session<> ) . close ( ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { this . org.springframework.integration.sftp.outbound.DirectChannel . send ( new GenericMessage < java.lang.String > ( STRING ) ) ; Message < ? > org.springframework.integration.sftp.outbound.Message<?> = this . org.springframework.integration.sftp.outbound.PollableChannel . receive ( NUMBER ) ; assertNotNull ( org.springframework.integration.sftp.outbound.Message<> ) ; assertEquals ( STRING , org.springframework.integration.sftp.outbound.Message<> . getPayload ( ) ) ; }  <METHOD_END>
<METHOD_START> private void void ( SftpRemoteFileTemplate org.springframework.integration.sftp.outbound.SftpRemoteFileTemplate ) { LsEntry [] org.springframework.integration.sftp.outbound.LsEntry[] = org.springframework.integration.sftp.outbound.SftpRemoteFileTemplate . execute ( session -> session . list ( STRING ) ) ; assertEquals ( NUMBER , files . length ) ; assertEquals ( NUMBER , org.springframework.integration.sftp.outbound.LsEntry[] [ NUMBER ] . getAttrs ( ) . getSize ( ) ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public java.lang.Object java.lang.Object ( Session < ChannelSftp . ChannelSftp > org.springframework.integration.sftp.outbound.Session<ChannelSftp.LsEntry> , Message < ? > org.springframework.integration.sftp.outbound.Message<?> ) throws java.io.IOException { return ( ( java.lang.String ) org.springframework.integration.sftp.outbound.Message<> . getPayload ( ) ) . java.lang.String ( ) ; }  <METHOD_END>
<METHOD_START> @ Bean public org.springframework.integration.sftp.outbound.SessionFactory<org.springframework.integration.sftp.outbound.LsEntry> < LsEntry > org.springframework.integration.sftp.outbound.SessionFactory<org.springframework.integration.sftp.outbound.LsEntry> ( ) { return org.springframework.integration.sftp.outbound.SftpServerOutboundTests . sessionFactory ( ) ; }  <METHOD_END>
<METHOD_START> public java.lang.String java.lang.String ( ) { return this . java.lang.String ; }  <METHOD_END>
