<METHOD_START> @ Before public void void ( ) java.lang.Exception { java.io.File = java.io.File . java.io.File ( STRING , STRING ) ; java.io.File . void ( ) ; FileCopyUtils . copy ( java.lang.String . byte[] ( java.lang.String ) , new java.io.FileOutputStream ( java.io.File , false ) ) ; org.springframework.integration.file.Message<java.io.File> = MessageBuilder . withPayload ( java.io.File ) . build ( ) ; }  <METHOD_END>
<METHOD_START> @ After public void void ( ) { java.io.File . boolean ( ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { this . org.springframework.integration.file.MessageChannel . send ( org.springframework.integration.file.Message<java.io.File> ) ; Assert . assertTrue ( new java.io.File ( STRING ) . boolean ( ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { Assert . assertTrue ( java.io.File . boolean ( ) ) ; this . org.springframework.integration.file.MessageChannel . send ( org.springframework.integration.file.Message<java.io.File> ) ; Assert . assertTrue ( new java.io.File ( STRING ) . boolean ( ) ) ; Assert . assertFalse ( java.io.File . boolean ( ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { this . org.springframework.integration.file.MessageChannel . send ( org.springframework.integration.file.Message<java.io.File> ) ; Assert . assertTrue ( new java.io.File ( STRING ) . boolean ( ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { try { this . org.springframework.integration.file.MessageChannel . send ( org.springframework.integration.file.Message<java.io.File> ) ; } catch ( MessageHandlingException org.springframework.integration.file.MessageHandlingException ) { Assert . assertEquals ( TestUtils . applySystemFileSeparator ( STRING ) , org.springframework.integration.file.MessageHandlingException . getCause ( ) . getMessage ( ) ) ; return; } Assert . fail ( STRING ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { try { this . org.springframework.integration.file.MessageChannel . send ( org.springframework.integration.file.Message<java.io.File> ) ; } catch ( MessageHandlingException org.springframework.integration.file.MessageHandlingException ) { Assert . assertEquals ( STRING , org.springframework.integration.file.MessageHandlingException . getCause ( ) . getMessage ( ) ) ; return; } Assert . fail ( STRING ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { final Message < java.io.File > org.springframework.integration.file.Message<java.io.File> = MessageBuilder . fromMessage ( org.springframework.integration.file.Message<java.io.File> ) . setHeader ( STRING , STRING ) . build ( ) ; this . org.springframework.integration.file.MessageChannel . send ( org.springframework.integration.file.Message<java.io.File> ) ; Assert . assertTrue ( new java.io.File ( STRING ) . boolean ( ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { try { this . org.springframework.integration.file.MessageChannel . send ( org.springframework.integration.file.Message<java.io.File> ) ; } catch ( MessageHandlingException org.springframework.integration.file.MessageHandlingException ) { Assert . assertEquals ( TestUtils . applySystemFileSeparator ( STRING ) , org.springframework.integration.file.MessageHandlingException . getCause ( ) . getMessage ( ) ) ; return; } Assert . fail ( STRING ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { final java.io.File java.io.File = new java.io.File ( STRING ) ; final Message < java.io.File > org.springframework.integration.file.Message<java.io.File> = MessageBuilder . fromMessage ( org.springframework.integration.file.Message<java.io.File> ) . setHeader ( STRING , java.io.File ) . build ( ) ; this . org.springframework.integration.file.MessageChannel . send ( org.springframework.integration.file.Message<java.io.File> ) ; Assert . assertTrue ( new java.io.File ( STRING ) . boolean ( ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { final java.io.File java.io.File = null ; final Message < java.io.File > org.springframework.integration.file.Message<java.io.File> = MessageBuilder . fromMessage ( org.springframework.integration.file.Message<java.io.File> ) . setHeader ( STRING , java.io.File ) . build ( ) ; try { this . org.springframework.integration.file.MessageChannel . send ( org.springframework.integration.file.Message<java.io.File> ) ; } catch ( MessageHandlingException org.springframework.integration.file.MessageHandlingException ) { Assert . assertEquals ( STRING + STRING , org.springframework.integration.file.MessageHandlingException . getCause ( ) . getMessage ( ) ) ; return; } Assert . fail ( STRING ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { final java.lang.Integer java.lang.Integer = java.lang.Integer . java.lang.Integer ( NUMBER ) ; final Message < java.io.File > org.springframework.integration.file.Message<java.io.File> = MessageBuilder . fromMessage ( org.springframework.integration.file.Message<java.io.File> ) . setHeader ( STRING , java.lang.Integer ) . build ( ) ; try { this . org.springframework.integration.file.MessageChannel . send ( org.springframework.integration.file.Message<java.io.File> ) ; } catch ( MessageHandlingException org.springframework.integration.file.MessageHandlingException ) { Assert . assertEquals ( STRING + STRING + STRING , org.springframework.integration.file.MessageHandlingException . getCause ( ) . getMessage ( ) ) ; return; } Assert . fail ( STRING ) ; }  <METHOD_END>
