<METHOD_START> public void void ( java.util.List<org.springframework.integration.router.MessageChannel> < MessageChannel > java.util.List<org.springframework.integration.router.MessageChannel> ) { Assert . notEmpty ( java.util.List<org.springframework.integration.router.MessageChannel> , STRING ) ; java.util.List<org.springframework.integration.router.RecipientListRouter.Recipient> < org.springframework.integration.router.RecipientListRouter.Recipient > java.util.List<org.springframework.integration.router.RecipientListRouter.Recipient> = java.util.List<org.springframework.integration.router.MessageChannel> . stream ( ) . map ( org.springframework.integration.router.RecipientListRouter.Recipient ::new ) . collect ( java.util.stream.Collectors . java.util.stream.Collector<java.lang.Object,?,java.util.List<java.lang.Object>> ( ) ) ; void ( java.util.List<org.springframework.integration.router.RecipientListRouter.Recipient> ) ; }  <METHOD_END>
<METHOD_START> public void void ( java.util.List<org.springframework.integration.router.RecipientListRouter.Recipient> < org.springframework.integration.router.RecipientListRouter.Recipient > java.util.List<org.springframework.integration.router.RecipientListRouter.Recipient> ) { Assert . notEmpty ( java.util.List<org.springframework.integration.router.RecipientListRouter.Recipient> , STRING ) ; java.util.Queue<org.springframework.integration.router.RecipientListRouter.Recipient> < org.springframework.integration.router.RecipientListRouter.Recipient > java.util.Queue<org.springframework.integration.router.RecipientListRouter.Recipient> = new java.util.concurrent.ConcurrentLinkedQueue<org.springframework.integration.router.RecipientListRouter.Recipient> <> ( java.util.List<org.springframework.integration.router.RecipientListRouter.Recipient> ) ; if ( getBeanFactory ( ) != null ) { java.util.Queue<org.springframework.integration.router.RecipientListRouter.Recipient> . void ( org.springframework.integration.router.RecipientListRouter.Recipient -> org.springframework.integration.router.RecipientListRouter.Recipient . void ( getChannelResolver ( ) ) ) ; } if ( logger . isDebugEnabled ( ) ) { logger . debug ( STRING + this . java.util.Queue<org.springframework.integration.router.RecipientListRouter.Recipient> + STRING + java.util.Queue<org.springframework.integration.router.RecipientListRouter.Recipient> ) ; } this . java.util.Queue<org.springframework.integration.router.RecipientListRouter.Recipient> = java.util.Queue<org.springframework.integration.router.RecipientListRouter.Recipient> ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override @ ManagedAttribute public void void ( java.util.Map<java.lang.String,java.lang.String> < java.lang.String , java.lang.String > java.util.Map<java.lang.String,java.lang.String> ) { Assert . notEmpty ( java.util.Map<java.lang.String,java.lang.String> , STRING ) ; Assert . noNullElements ( java.util.Map<java.lang.String,java.lang.String> . java.util.Set<java.lang.String> ( ) . java.lang.Object[] ( ) , STRING ) ; java.util.Queue<org.springframework.integration.router.RecipientListRouter.Recipient> < org.springframework.integration.router.RecipientListRouter.Recipient > java.util.Queue<org.springframework.integration.router.RecipientListRouter.Recipient> = new java.util.concurrent.ConcurrentLinkedQueue<org.springframework.integration.router.RecipientListRouter.Recipient> <> ( ) ; for ( java.util.Map.Entry<java.lang.String,java.lang.String> < java.lang.String , java.lang.String > java.util.Map.Entry<java.lang.String,java.lang.String> : java.util.Map<java.lang.String,java.lang.String> . java.util.Set<java.util.Map.Entry<java.lang.String,java.lang.String>> ( ) ) { if ( StringUtils . hasText ( java.util.Map.Entry<java.lang.String,java.lang.String> . java.lang.String ( ) ) ) { void ( java.util.Map.Entry<java.lang.String,java.lang.String> . java.lang.String ( ) , java.util.Map.Entry<java.lang.String,java.lang.String> . java.lang.String ( ) , java.util.Queue<org.springframework.integration.router.RecipientListRouter.Recipient> ) ; } else { void ( java.util.Map.Entry<java.lang.String,java.lang.String> . java.lang.String ( ) , ( MessageSelector ) null , java.util.Queue<org.springframework.integration.router.RecipientListRouter.Recipient> ) ; } } if ( logger . isDebugEnabled ( ) ) { logger . debug ( STRING + this . java.util.Queue<org.springframework.integration.router.RecipientListRouter.Recipient> + STRING + java.util.Queue<org.springframework.integration.router.RecipientListRouter.Recipient> ) ; } this . java.util.Queue<org.springframework.integration.router.RecipientListRouter.Recipient> = java.util.Queue<org.springframework.integration.router.RecipientListRouter.Recipient> ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override @ ManagedOperation public void void ( java.lang.String java.lang.String , java.lang.String java.lang.String ) { void ( java.lang.String , java.lang.String , this . java.util.Queue<org.springframework.integration.router.RecipientListRouter.Recipient> ) ; }  <METHOD_END>
<METHOD_START> private void void ( java.lang.String java.lang.String , java.lang.String java.lang.String , java.util.Queue<org.springframework.integration.router.RecipientListRouter.Recipient> < org.springframework.integration.router.RecipientListRouter.Recipient > java.util.Queue<org.springframework.integration.router.RecipientListRouter.Recipient> ) { Assert . hasText ( java.lang.String , STRING ) ; Assert . hasText ( java.lang.String , STRING ) ; ExpressionEvaluatingSelector org.springframework.integration.router.ExpressionEvaluatingSelector = new ExpressionEvaluatingSelector ( java.lang.String ) ; org.springframework.integration.router.ExpressionEvaluatingSelector . setBeanFactory ( getBeanFactory ( ) ) ; org.springframework.integration.router.RecipientListRouter.Recipient org.springframework.integration.router.RecipientListRouter.Recipient = new org.springframework.integration.router.RecipientListRouter.Recipient ( java.lang.String , org.springframework.integration.router.ExpressionEvaluatingSelector ) ; if ( getBeanFactory ( ) != null ) { org.springframework.integration.router.RecipientListRouter.Recipient . void ( getChannelResolver ( ) ) ; } java.util.Queue<org.springframework.integration.router.RecipientListRouter.Recipient> . boolean ( org.springframework.integration.router.RecipientListRouter.Recipient ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override @ ManagedOperation public void void ( java.lang.String java.lang.String ) { void ( java.lang.String , ( MessageSelector ) null ) ; }  <METHOD_END>
<METHOD_START> public void void ( java.lang.String java.lang.String , MessageSelector org.springframework.integration.router.MessageSelector ) { void ( java.lang.String , org.springframework.integration.router.MessageSelector , this . java.util.Queue<org.springframework.integration.router.RecipientListRouter.Recipient> ) ; }  <METHOD_END>
<METHOD_START> private void void ( java.lang.String java.lang.String , MessageSelector org.springframework.integration.router.MessageSelector , java.util.Queue<org.springframework.integration.router.RecipientListRouter.Recipient> < org.springframework.integration.router.RecipientListRouter.Recipient > java.util.Queue<org.springframework.integration.router.RecipientListRouter.Recipient> ) { Assert . hasText ( java.lang.String , STRING ) ; org.springframework.integration.router.RecipientListRouter.Recipient org.springframework.integration.router.RecipientListRouter.Recipient = new org.springframework.integration.router.RecipientListRouter.Recipient ( java.lang.String , org.springframework.integration.router.MessageSelector ) ; if ( getBeanFactory ( ) != null ) { org.springframework.integration.router.RecipientListRouter.Recipient . void ( getChannelResolver ( ) ) ; } java.util.Queue<org.springframework.integration.router.RecipientListRouter.Recipient> . boolean ( org.springframework.integration.router.RecipientListRouter.Recipient ) ; }  <METHOD_END>
<METHOD_START> public void void ( MessageChannel org.springframework.integration.router.MessageChannel ) { void ( org.springframework.integration.router.MessageChannel , null ) ; }  <METHOD_END>
<METHOD_START> public void void ( MessageChannel org.springframework.integration.router.MessageChannel , MessageSelector org.springframework.integration.router.MessageSelector ) { org.springframework.integration.router.RecipientListRouter.Recipient org.springframework.integration.router.RecipientListRouter.Recipient = new org.springframework.integration.router.RecipientListRouter.Recipient ( org.springframework.integration.router.MessageChannel , org.springframework.integration.router.MessageSelector ) ; if ( getBeanFactory ( ) != null ) { org.springframework.integration.router.RecipientListRouter.Recipient . void ( getChannelResolver ( ) ) ; } this . java.util.Queue<org.springframework.integration.router.RecipientListRouter.Recipient> . boolean ( org.springframework.integration.router.RecipientListRouter.Recipient ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override @ ManagedOperation public int int ( java.lang.String java.lang.String ) { int int = NUMBER ; MessageChannel org.springframework.integration.router.MessageChannel = getChannelResolver ( ) . resolveDestination ( java.lang.String ) ; for ( java.util.Iterator<org.springframework.integration.router.RecipientListRouter.Recipient> < org.springframework.integration.router.RecipientListRouter.Recipient > java.util.Iterator<org.springframework.integration.router.RecipientListRouter.Recipient> = this . java.util.Queue<org.springframework.integration.router.RecipientListRouter.Recipient> . java.util.Iterator<org.springframework.integration.router.RecipientListRouter.Recipient> ( ) ; java.util.Iterator<org.springframework.integration.router.RecipientListRouter.Recipient> . boolean ( ) ; ) { if ( java.util.Iterator<org.springframework.integration.router.RecipientListRouter.Recipient> . org.springframework.integration.router.RecipientListRouter.Recipient ( ) . org.springframework.integration.router.MessageChannel ( ) == org.springframework.integration.router.MessageChannel ) { java.util.Iterator<org.springframework.integration.router.RecipientListRouter.Recipient> . void ( ) ; int ++ ; } } return int ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override @ ManagedOperation public int int ( java.lang.String java.lang.String , java.lang.String java.lang.String ) { int int = NUMBER ; MessageChannel org.springframework.integration.router.MessageChannel = getChannelResolver ( ) . resolveDestination ( java.lang.String ) ; for ( java.util.Iterator<org.springframework.integration.router.RecipientListRouter.Recipient> < org.springframework.integration.router.RecipientListRouter.Recipient > java.util.Iterator<org.springframework.integration.router.RecipientListRouter.Recipient> = this . java.util.Queue<org.springframework.integration.router.RecipientListRouter.Recipient> . java.util.Iterator<org.springframework.integration.router.RecipientListRouter.Recipient> ( ) ; java.util.Iterator<org.springframework.integration.router.RecipientListRouter.Recipient> . boolean ( ) ; ) { org.springframework.integration.router.RecipientListRouter.Recipient org.springframework.integration.router.RecipientListRouter.Recipient = java.util.Iterator<org.springframework.integration.router.RecipientListRouter.Recipient> . org.springframework.integration.router.RecipientListRouter.Recipient ( ) ; MessageSelector org.springframework.integration.router.MessageSelector = org.springframework.integration.router.RecipientListRouter.Recipient . org.springframework.integration.router.MessageSelector ( ) ; MessageChannel org.springframework.integration.router.MessageChannel = org.springframework.integration.router.RecipientListRouter.Recipient . org.springframework.integration.router.MessageChannel ( ) ; if ( org.springframework.integration.router.MessageSelector instanceof ExpressionEvaluatingSelector && org.springframework.integration.router.MessageChannel == org.springframework.integration.router.MessageChannel && ( ( ExpressionEvaluatingSelector ) org.springframework.integration.router.MessageSelector ) . getExpressionString ( ) . equals ( java.lang.String ) ) { java.util.Iterator<org.springframework.integration.router.RecipientListRouter.Recipient> . void ( ) ; int ++ ; } } return int ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override @ ManagedOperation public void void ( java.util.Properties java.util.Properties ) { Assert . notEmpty ( java.util.Properties , STRING ) ; java.util.Set<java.lang.String> < java.lang.String > java.util.Set<java.lang.String> = java.util.Properties . java.util.Set<java.lang.String> ( ) ; java.util.Queue<org.springframework.integration.router.RecipientListRouter.Recipient> < org.springframework.integration.router.RecipientListRouter.Recipient > java.util.Queue<org.springframework.integration.router.RecipientListRouter.Recipient> = this . java.util.Queue<org.springframework.integration.router.RecipientListRouter.Recipient> ; this . java.util.Queue<org.springframework.integration.router.RecipientListRouter.Recipient> . void ( ) ; for ( java.lang.String java.lang.String : java.util.Set<java.lang.String> ) { Assert . notNull ( java.lang.String , STRING ) ; if ( StringUtils . hasText ( java.util.Properties . java.lang.String ( java.lang.String ) ) ) { this . void ( java.lang.String , java.util.Properties . java.lang.String ( java.lang.String ) ) ; } else { this . void ( java.lang.String ) ; } } if ( logger . isDebugEnabled ( ) ) { logger . debug ( STRING + java.util.Queue<org.springframework.integration.router.RecipientListRouter.Recipient> + STRING + this . java.util.Queue<org.springframework.integration.router.RecipientListRouter.Recipient> ) ; } }  <METHOD_END>
<METHOD_START> @ java.lang.Override @ ManagedAttribute public java.util.Collection<org.springframework.integration.router.RecipientListRouter.Recipient> < org.springframework.integration.router.RecipientListRouter.Recipient > java.util.Collection<org.springframework.integration.router.RecipientListRouter.Recipient> ( ) { return java.util.Collections . java.util.Collection<org.springframework.integration.router.RecipientListRouter.Recipient> ( this . java.util.Queue<org.springframework.integration.router.RecipientListRouter.Recipient> ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public java.lang.String java.lang.String ( ) { return STRING ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override protected java.util.Collection<org.springframework.integration.router.MessageChannel> < MessageChannel > java.util.Collection<org.springframework.integration.router.MessageChannel> ( Message < ? > org.springframework.integration.router.Message<?> ) { return this . java.util.Queue<org.springframework.integration.router.RecipientListRouter.Recipient> . java.util.stream.Stream<org.springframework.integration.router.RecipientListRouter.Recipient> ( ) . java.util.stream.Stream<org.springframework.integration.router.RecipientListRouter.Recipient> ( org.springframework.integration.router.RecipientListRouter.Recipient -> org.springframework.integration.router.RecipientListRouter.Recipient . boolean ( org.springframework.integration.router.Message<> ) ) . java.util.stream.Stream<org.springframework.integration.router.MessageChannel> ( org.springframework.integration.router.RecipientListRouter.Recipient :: org.springframework.integration.router.MessageChannel ) . collect ( java.util.stream.Collectors . java.util.stream.Collector<java.lang.Object,?,java.util.List<java.lang.Object>> ( ) ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override protected void void ( ) java.lang.Exception { super. onInit ( ) ; this . java.util.Queue<org.springframework.integration.router.RecipientListRouter.Recipient> . void ( org.springframework.integration.router.RecipientListRouter.Recipient -> org.springframework.integration.router.RecipientListRouter.Recipient . void ( getChannelResolver ( ) ) ) ; }  <METHOD_END>
<METHOD_START> public void ( MessageChannel org.springframework.integration.router.MessageChannel ) { this( org.springframework.integration.router.MessageChannel , null ); }  <METHOD_END>
<METHOD_START> public void ( MessageChannel org.springframework.integration.router.MessageChannel , MessageSelector org.springframework.integration.router.MessageSelector ) { this . org.springframework.integration.router.MessageChannel = org.springframework.integration.router.MessageChannel ; this . org.springframework.integration.router.MessageSelector = org.springframework.integration.router.MessageSelector ; }  <METHOD_END>
<METHOD_START> public void ( java.lang.String java.lang.String ) { this( java.lang.String , null ); }  <METHOD_END>
<METHOD_START> public void ( java.lang.String java.lang.String , MessageSelector org.springframework.integration.router.MessageSelector ) { this . java.lang.String = java.lang.String ; this . org.springframework.integration.router.MessageSelector = org.springframework.integration.router.MessageSelector ; }  <METHOD_END>
<METHOD_START> public void void ( DestinationResolver < MessageChannel > org.springframework.integration.router.DestinationResolver<org.springframework.integration.router.MessageChannel> ) { this . org.springframework.integration.router.DestinationResolver<org.springframework.integration.router.MessageChannel> = org.springframework.integration.router.DestinationResolver<org.springframework.integration.router.MessageChannel> ; }  <METHOD_END>
<METHOD_START> private org.springframework.integration.router.MessageSelector org.springframework.integration.router.MessageSelector ( ) { return this . org.springframework.integration.router.MessageSelector ; }  <METHOD_END>
<METHOD_START> public org.springframework.integration.router.MessageChannel org.springframework.integration.router.MessageChannel ( ) { java.lang.String java.lang.String = this . java.lang.String ; if ( java.lang.String != null ) { if ( this . org.springframework.integration.router.DestinationResolver<org.springframework.integration.router.MessageChannel> != null ) { this . org.springframework.integration.router.MessageChannel = this . org.springframework.integration.router.DestinationResolver<org.springframework.integration.router.MessageChannel> . resolveDestination ( java.lang.String ) ; this . java.lang.String = null ; } } return this . org.springframework.integration.router.MessageChannel ; }  <METHOD_END>
<METHOD_START> public boolean boolean ( Message < ? > org.springframework.integration.router.Message<?> ) { return ( this . org.springframework.integration.router.MessageSelector == null || this . org.springframework.integration.router.MessageSelector . accept ( org.springframework.integration.router.Message<> ) ) ; }  <METHOD_END>
