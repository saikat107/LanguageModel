<METHOD_START> public void ( ) { this( true , false ); }  <METHOD_END>
<METHOD_START> public void ( boolean boolean ) { this( boolean , false ); }  <METHOD_END>
<METHOD_START> public void ( boolean boolean , boolean boolean ) { this( boolean , boolean , false ); }  <METHOD_END>
<METHOD_START> public void ( boolean boolean , boolean boolean , boolean boolean ) { this . boolean = boolean ; this . boolean = boolean ; if ( boolean ) { setApplySequence ( false ) ; if ( boolean ) { Assert . notNull ( org.springframework.integration.file.splitter.JsonObjectMapper<,> , STRING ) ; } } this . boolean = boolean ; }  <METHOD_END>
<METHOD_START> public void void ( java.nio.charset.Charset java.nio.charset.Charset ) { this . java.nio.charset.Charset = java.nio.charset.Charset ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override protected java.lang.Object java.lang.Object ( final Message < ? > org.springframework.integration.file.splitter.Message<?> ) { java.lang.Object java.lang.Object = org.springframework.integration.file.splitter.Message<> . getPayload ( ) ; java.io.Reader java.io.Reader = null ; final java.lang.String java.lang.String ; if ( java.lang.Object instanceof java.lang.String ) { try { java.io.Reader = new java.io.FileReader ( ( java.lang.String ) java.lang.Object ) ; java.lang.String = ( java.lang.String ) java.lang.Object ; } catch ( java.io.FileNotFoundException java.io.FileNotFoundException ) { throw new MessageHandlingException ( org.springframework.integration.file.splitter.Message<> , STRING + java.lang.Object + STRING , java.io.FileNotFoundException ) ; } } else if ( java.lang.Object instanceof java.io.File ) { try { if ( this . java.nio.charset.Charset == null ) { java.io.Reader = new java.io.FileReader ( ( java.io.File ) java.lang.Object ) ; } else { java.io.Reader = new java.io.InputStreamReader ( new java.io.FileInputStream ( ( java.io.File ) java.lang.Object ) , this . java.nio.charset.Charset ) ; } java.lang.String = ( ( java.io.File ) java.lang.Object ) . java.lang.String ( ) ; } catch ( java.io.FileNotFoundException java.io.FileNotFoundException ) { throw new MessageHandlingException ( org.springframework.integration.file.splitter.Message<> , STRING + java.lang.Object + STRING , java.io.FileNotFoundException ) ; } } else if ( java.lang.Object instanceof java.io.InputStream ) { if ( this . java.nio.charset.Charset == null ) { java.io.Reader = new java.io.InputStreamReader ( ( java.io.InputStream ) java.lang.Object ) ; } else { java.io.Reader = new java.io.InputStreamReader ( ( java.io.InputStream ) java.lang.Object , this . java.nio.charset.Charset ) ; } java.lang.String = java.lang.String ( org.springframework.integration.file.splitter.Message<> , STRING ) ; } else if ( java.lang.Object instanceof java.io.Reader ) { java.io.Reader = ( java.io.Reader ) java.lang.Object ; java.lang.String = java.lang.String ( org.springframework.integration.file.splitter.Message<> , STRING ) ; } else { return org.springframework.integration.file.splitter.Message<> ; } final java.io.BufferedReader java.io.BufferedReader = new java.io.BufferedReader ( java.io.Reader ) { @ java.lang.Override public void void ( ) java.io.IOException { try { super. void ( ) ; } finally { java.io.Closeable java.io.Closeable = new IntegrationMessageHeaderAccessor ( org.springframework.integration.file.splitter.Message<> ) . getCloseableResource ( ) ; if ( java.io.Closeable != null ) { java.io.Closeable . void ( ) ; } } } } ; java.util.Iterator<java.lang.Object> < java.lang.Object > java.util.Iterator<java.lang.Object> = new java.util.Iterator<java.lang.Object> < java.lang.Object > ( ) { boolean boolean = org.springframework.integration.file.splitter.FileSplitter .this . boolean ; boolean boolean = boolean ; boolean boolean ; boolean boolean ; java.lang.String java.lang.String ; long long ; boolean boolean ; @ java.lang.Override public boolean boolean ( ) { this . boolean = true ; try { if ( this . java.lang.String == null && ! this . boolean ) { this . java.lang.String = java.io.BufferedReader . java.lang.String ( ) ; } boolean boolean = ! this . boolean && this . java.lang.String != null ; if ( ! boolean ) { if ( this . boolean ) { this . boolean = true ; if ( this . boolean ) { this . boolean = true ; } } java.io.BufferedReader . void ( ) ; } return this . boolean || boolean || this . boolean ; } catch ( java.io.IOException java.io.IOException ) { try { java.io.BufferedReader . void ( ) ; this . boolean = true ; } catch ( java.io.IOException java.io.IOException ) { } throw new MessageHandlingException ( org.springframework.integration.file.splitter.Message<> , STRING , java.io.IOException ) ; } } @ java.lang.Override public java.lang.Object java.lang.Object ( ) { if ( ! this . boolean ) { boolean ( ) ; } this . boolean = false ; if ( this . boolean ) { this . boolean = false ; return org.springframework.integration.file.splitter.AbstractIntegrationMessageBuilder<java.lang.Object> ( new org.springframework.integration.file.splitter.FileSplitter.FileMarker ( java.lang.String , org.springframework.integration.file.splitter.FileSplitter.FileMarker.Mark . org.springframework.integration.file.splitter.FileSplitter.FileMarker.Mark , NUMBER ) ) ; } if ( this . boolean ) { this . boolean = false ; this . boolean = false ; this . boolean = true ; return org.springframework.integration.file.splitter.AbstractIntegrationMessageBuilder<java.lang.Object> ( new org.springframework.integration.file.splitter.FileSplitter.FileMarker ( java.lang.String , org.springframework.integration.file.splitter.FileSplitter.FileMarker.Mark . org.springframework.integration.file.splitter.FileSplitter.FileMarker.Mark , this . long ) ) ; } if ( this . java.lang.String != null ) { java.lang.String java.lang.String = this . java.lang.String ; this . java.lang.String = null ; this . long ++ ; return java.lang.String ; } else { this . boolean = true ; throw new java.util.NoSuchElementException ( java.lang.String + STRING ) ; } } private org.springframework.integration.file.splitter.AbstractIntegrationMessageBuilder<java.lang.Object> < java.lang.Object > org.springframework.integration.file.splitter.AbstractIntegrationMessageBuilder<java.lang.Object> ( org.springframework.integration.file.splitter.FileSplitter.FileMarker org.springframework.integration.file.splitter.FileSplitter.FileMarker ) { java.lang.Object java.lang.Object ; if ( org.springframework.integration.file.splitter.FileSplitter .this . boolean ) { try { java.lang.Object = org.springframework.integration.file.splitter.JsonObjectMapper<,> . toJson ( org.springframework.integration.file.splitter.FileSplitter.FileMarker ) ; } catch ( java.lang.Exception java.lang.Exception ) { throw new MessageHandlingException ( org.springframework.integration.file.splitter.Message<> , STRING , java.lang.Exception ) ; } } else { java.lang.Object = org.springframework.integration.file.splitter.FileSplitter.FileMarker ; } return getMessageBuilderFactory ( ) . withPayload ( java.lang.Object ) . setHeader ( FileHeaders . MARKER , org.springframework.integration.file.splitter.FileSplitter.FileMarker . org.springframework.integration.file.splitter.FileSplitter.FileMarker.Mark . java.lang.String ( ) ) ; } } ; if ( this . boolean ) { return java.util.Iterator<java.lang.Object> ; } else { java.util.List<java.lang.Object> < java.lang.Object > java.util.List<java.lang.Object> = new java.util.ArrayList<java.lang.Object> < java.lang.Object > ( ) ; while ( java.util.Iterator<java.lang.Object> . boolean ( ) ) { java.util.List<java.lang.Object> . boolean ( java.util.Iterator<java.lang.Object> . java.lang.Object ( ) ) ; } return java.util.List<java.lang.Object> ; } }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( ) java.io.IOException { try { super. void ( ) ; } finally { java.io.Closeable java.io.Closeable = new IntegrationMessageHeaderAccessor ( org.springframework.integration.file.splitter.Message<> ) . getCloseableResource ( ) ; if ( java.io.Closeable != null ) { java.io.Closeable . void ( ) ; } } }  <METHOD_END>
<METHOD_START> @ java.lang.Override public boolean boolean ( ) { this . boolean = true ; try { if ( this . java.lang.String == null && ! this . boolean ) { this . java.lang.String = java.io.BufferedReader . java.lang.String ( ) ; } boolean boolean = ! this . boolean && this . java.lang.String != null ; if ( ! boolean ) { if ( this . boolean ) { this . boolean = true ; if ( this . boolean ) { this . boolean = true ; } } java.io.BufferedReader . void ( ) ; } return this . boolean || boolean || this . boolean ; } catch ( java.io.IOException java.io.IOException ) { try { java.io.BufferedReader . void ( ) ; this . boolean = true ; } catch ( java.io.IOException java.io.IOException ) { } throw new MessageHandlingException ( org.springframework.integration.file.splitter.Message<> , STRING , java.io.IOException ) ; } }  <METHOD_END>
<METHOD_START> @ java.lang.Override public java.lang.Object java.lang.Object ( ) { if ( ! this . boolean ) { boolean ( ) ; } this . boolean = false ; if ( this . boolean ) { this . boolean = false ; return org.springframework.integration.file.splitter.AbstractIntegrationMessageBuilder<java.lang.Object> ( new org.springframework.integration.file.splitter.FileSplitter.FileMarker ( java.lang.String , org.springframework.integration.file.splitter.FileSplitter.FileMarker.Mark . org.springframework.integration.file.splitter.FileSplitter.FileMarker.Mark , NUMBER ) ) ; } if ( this . boolean ) { this . boolean = false ; this . boolean = false ; this . boolean = true ; return org.springframework.integration.file.splitter.AbstractIntegrationMessageBuilder<java.lang.Object> ( new org.springframework.integration.file.splitter.FileSplitter.FileMarker ( java.lang.String , org.springframework.integration.file.splitter.FileSplitter.FileMarker.Mark . org.springframework.integration.file.splitter.FileSplitter.FileMarker.Mark , this . long ) ) ; } if ( this . java.lang.String != null ) { java.lang.String java.lang.String = this . java.lang.String ; this . java.lang.String = null ; this . long ++ ; return java.lang.String ; } else { this . boolean = true ; throw new java.util.NoSuchElementException ( java.lang.String + STRING ) ; } }  <METHOD_END>
<METHOD_START> private org.springframework.integration.file.splitter.AbstractIntegrationMessageBuilder<java.lang.Object> < java.lang.Object > org.springframework.integration.file.splitter.AbstractIntegrationMessageBuilder<java.lang.Object> ( org.springframework.integration.file.splitter.FileSplitter.FileMarker org.springframework.integration.file.splitter.FileSplitter.FileMarker ) { java.lang.Object java.lang.Object ; if ( org.springframework.integration.file.splitter.FileSplitter .this . boolean ) { try { java.lang.Object = org.springframework.integration.file.splitter.JsonObjectMapper<,> . toJson ( org.springframework.integration.file.splitter.FileSplitter.FileMarker ) ; } catch ( java.lang.Exception java.lang.Exception ) { throw new MessageHandlingException ( org.springframework.integration.file.splitter.Message<> , STRING , java.lang.Exception ) ; } } else { java.lang.Object = org.springframework.integration.file.splitter.FileSplitter.FileMarker ; } return getMessageBuilderFactory ( ) . withPayload ( java.lang.Object ) . setHeader ( FileHeaders . MARKER , org.springframework.integration.file.splitter.FileSplitter.FileMarker . org.springframework.integration.file.splitter.FileSplitter.FileMarker.Mark . java.lang.String ( ) ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override protected boolean boolean ( Message < ? > org.springframework.integration.file.splitter.Message<?> ) { java.lang.Object java.lang.Object = org.springframework.integration.file.splitter.Message<> . getPayload ( ) ; return java.lang.Object instanceof java.io.File || java.lang.Object instanceof java.lang.String ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override protected void void ( Message < ? > org.springframework.integration.file.splitter.Message<?> , java.util.Map<java.lang.String,java.lang.Object> < java.lang.String , java.lang.Object > java.util.Map<java.lang.String,java.lang.Object> ) { java.io.File java.io.File = null ; if ( org.springframework.integration.file.splitter.Message<> . getPayload ( ) instanceof java.io.File ) { java.io.File = ( java.io.File ) org.springframework.integration.file.splitter.Message<> . getPayload ( ) ; } else if ( org.springframework.integration.file.splitter.Message<> . getPayload ( ) instanceof java.lang.String ) { java.io.File = new java.io.File ( ( java.lang.String ) org.springframework.integration.file.splitter.Message<> . getPayload ( ) ) ; } if ( java.io.File != null ) { if ( ! java.util.Map<java.lang.String,java.lang.Object> . boolean ( FileHeaders . ORIGINAL_FILE ) ) { java.util.Map<java.lang.String,java.lang.Object> . java.lang.Object ( FileHeaders . ORIGINAL_FILE , java.io.File ) ; } if ( ! java.util.Map<java.lang.String,java.lang.Object> . boolean ( FileHeaders . FILENAME ) ) { java.util.Map<java.lang.String,java.lang.Object> . java.lang.Object ( FileHeaders . FILENAME , java.io.File . java.lang.String ( ) ) ; } } }  <METHOD_END>
<METHOD_START> private java.lang.String java.lang.String ( Message < ? > org.springframework.integration.file.splitter.Message<?> , java.lang.String java.lang.String ) { java.lang.String java.lang.String = ( java.lang.String ) org.springframework.integration.file.splitter.Message<> . getHeaders ( ) . get ( FileHeaders . REMOTE_DIRECTORY ) ; java.lang.String java.lang.String = ( java.lang.String ) org.springframework.integration.file.splitter.Message<> . getHeaders ( ) . get ( FileHeaders . REMOTE_FILE ) ; if ( StringUtils . hasText ( java.lang.String ) && StringUtils . hasText ( java.lang.String ) ) { return java.lang.String + java.lang.String ; } else { return java.lang.String ; } }  <METHOD_END>
<METHOD_START> public void ( ) { this . java.lang.String = null ; this . org.springframework.integration.file.splitter.FileSplitter.FileMarker.Mark = null ; this . long = NUMBER ; }  <METHOD_END>
<METHOD_START> public void ( java.lang.String java.lang.String , org.springframework.integration.file.splitter.FileSplitter.FileMarker.Mark org.springframework.integration.file.splitter.FileSplitter.FileMarker.Mark , long long ) { this . java.lang.String = java.lang.String ; this . org.springframework.integration.file.splitter.FileSplitter.FileMarker.Mark = org.springframework.integration.file.splitter.FileSplitter.FileMarker.Mark ; this . long = long ; }  <METHOD_END>
<METHOD_START> public java.lang.String java.lang.String ( ) { return this . java.lang.String ; }  <METHOD_END>
<METHOD_START> public org.springframework.integration.file.splitter.FileSplitter.FileMarker.Mark org.springframework.integration.file.splitter.FileSplitter.FileMarker.Mark ( ) { return this . org.springframework.integration.file.splitter.FileSplitter.FileMarker.Mark ; }  <METHOD_END>
<METHOD_START> public long long ( ) { return this . long ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public java.lang.String java.lang.String ( ) { if ( this . org.springframework.integration.file.splitter.FileSplitter.FileMarker.Mark . boolean ( org.springframework.integration.file.splitter.FileSplitter.FileMarker.Mark . org.springframework.integration.file.splitter.FileSplitter.FileMarker.Mark ) ) { return STRING + this . java.lang.String + STRING + this . org.springframework.integration.file.splitter.FileSplitter.FileMarker.Mark + STRING ; } else { return STRING + this . java.lang.String + STRING + this . org.springframework.integration.file.splitter.FileSplitter.FileMarker.Mark + STRING + this . long + STRING ; } }  <METHOD_END>