<METHOD_START> public void void ( long long ) { this . org.springframework.integration.handler.MessagingTemplate . setSendTimeout ( long ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( MessageChannel org.springframework.integration.handler.MessageChannel ) { this . org.springframework.integration.handler.MessageChannel = org.springframework.integration.handler.MessageChannel ; }  <METHOD_END>
<METHOD_START> public void void ( java.lang.String java.lang.String ) { Assert . hasText ( java.lang.String , STRING ) ; this . java.lang.String = java.lang.String ; }  <METHOD_END>
<METHOD_START> public final void void ( boolean boolean ) { this . boolean = boolean ; }  <METHOD_END>
<METHOD_START> protected boolean boolean ( ) { return this . boolean ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override protected void void ( ) java.lang.Exception { super. onInit ( ) ; Assert . state ( ! ( this . java.lang.String != null && this . org.springframework.integration.handler.MessageChannel != null ) , STRING ) ; if ( getBeanFactory ( ) != null ) { this . org.springframework.integration.handler.MessagingTemplate . setBeanFactory ( getBeanFactory ( ) ) ; } this . org.springframework.integration.handler.MessagingTemplate . setDestinationResolver ( getChannelResolver ( ) ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public org.springframework.integration.handler.MessageChannel org.springframework.integration.handler.MessageChannel ( ) { if ( this . java.lang.String != null ) { synchronized ( this ) { if ( this . java.lang.String != null ) { this . org.springframework.integration.handler.MessageChannel = getChannelResolver ( ) . resolveDestination ( this . java.lang.String ) ; this . java.lang.String = null ; } } } return this . org.springframework.integration.handler.MessageChannel ; }  <METHOD_END>
<METHOD_START> protected void void ( java.lang.Object java.lang.Object , Message < ? > org.springframework.integration.handler.Message<?> ) { if ( java.lang.Object instanceof java.lang.Iterable<?> < ? > && boolean ( ( java.lang.Iterable<?> < ? > ) java.lang.Object ) ) { for ( java.lang.Object java.lang.Object : ( java.lang.Iterable<?> < ? > ) java.lang.Object ) { this . void ( java.lang.Object , org.springframework.integration.handler.Message<> ) ; } } else if ( java.lang.Object != null ) { this . void ( java.lang.Object , org.springframework.integration.handler.Message<> ) ; } }  <METHOD_END>
<METHOD_START> protected boolean boolean ( java.lang.Iterable<?> < ? > java.lang.Iterable<?> ) { for ( java.lang.Object java.lang.Object : java.lang.Iterable<> ) { if ( java.lang.Object instanceof Message < ? > || java.lang.Object instanceof AbstractIntegrationMessageBuilder < ? > ) { return true ; } } return false ; }  <METHOD_END>
<METHOD_START> protected void void ( java.lang.Object java.lang.Object , final Message < ? > org.springframework.integration.handler.Message<?> ) { final MessageHeaders org.springframework.integration.handler.MessageHeaders = org.springframework.integration.handler.Message<> . getHeaders ( ) ; java.lang.Object java.lang.Object = null ; if ( org.springframework.integration.handler.MessageChannel ( ) == null ) { java.util.Map<?,?> < ? , ? > java.util.Map<?,?> = org.springframework.integration.handler.MessageHeaders . get ( IntegrationMessageHeaderAccessor . ROUTING_SLIP , java.util.Map .class ) ; if ( java.util.Map<,> != null ) { Assert . isTrue ( java.util.Map<,> . int ( ) == NUMBER , STRING ) ; java.lang.Object java.lang.Object = java.util.Map<,> . java.util.Set<> ( ) . java.util.Iterator<> ( ) . next ( ) ; java.lang.Object java.lang.Object = java.util.Map<,> . java.util.Collection<> ( ) . java.util.Iterator<> ( ) . next ( ) ; Assert . isInstanceOf ( java.util.List .class , java.lang.Object , STRING ) ; Assert . isInstanceOf ( java.lang.Integer .class , java.lang.Object , STRING ) ; java.util.List<?> < ? > java.util.List<?> = ( java.util.List<?> < ? > ) java.lang.Object ; java.util.concurrent.atomic.AtomicInteger java.util.concurrent.atomic.AtomicInteger = new java.util.concurrent.atomic.AtomicInteger ( ( java.lang.Integer ) java.lang.Object ) ; java.lang.Object = java.lang.Object ( java.lang.Object , org.springframework.integration.handler.Message<> , java.util.List<> , java.util.concurrent.atomic.AtomicInteger ) ; if ( java.lang.Object != null ) { AbstractIntegrationMessageBuilder < ? > org.springframework.integration.handler.AbstractIntegrationMessageBuilder<?> = null ; if ( java.lang.Object instanceof Message ) { org.springframework.integration.handler.AbstractIntegrationMessageBuilder<?> = this . getMessageBuilderFactory ( ) . fromMessage ( ( Message < ? > ) java.lang.Object ) ; } else if ( java.lang.Object instanceof AbstractIntegrationMessageBuilder ) { org.springframework.integration.handler.AbstractIntegrationMessageBuilder<?> = ( AbstractIntegrationMessageBuilder < ? > ) java.lang.Object ; } else { org.springframework.integration.handler.AbstractIntegrationMessageBuilder<?> = this . getMessageBuilderFactory ( ) . withPayload ( java.lang.Object ) ; } org.springframework.integration.handler.AbstractIntegrationMessageBuilder<> . setHeader ( IntegrationMessageHeaderAccessor . ROUTING_SLIP , java.util.Collections . java.util.Map<java.util.List<>,java.lang.Integer> ( java.util.List<> , java.util.concurrent.atomic.AtomicInteger . int ( ) ) ) ; java.lang.Object = org.springframework.integration.handler.AbstractIntegrationMessageBuilder<> ; } } if ( java.lang.Object == null ) { java.lang.Object = org.springframework.integration.handler.MessageHeaders . getReplyChannel ( ) ; if ( java.lang.Object == null && java.lang.Object instanceof Message ) { java.lang.Object = ( ( Message < ? > ) java.lang.Object ) . getHeaders ( ) . getReplyChannel ( ) ; } } } if ( this . boolean && ( java.lang.Object instanceof ListenableFuture < ? > || java.lang.Object instanceof Publisher < ? > ) ) { if ( java.lang.Object instanceof ListenableFuture < ? > || ! ( org.springframework.integration.handler.MessageChannel ( ) instanceof ReactiveSubscribableChannel ) ) { ListenableFuture < ? > org.springframework.integration.handler.ListenableFuture<?> ; if ( java.lang.Object instanceof ListenableFuture < ? > ) { org.springframework.integration.handler.ListenableFuture<?> = ( ListenableFuture < ? > ) java.lang.Object ; } else { SettableListenableFuture < java.lang.Object > org.springframework.integration.handler.SettableListenableFuture<java.lang.Object> = new SettableListenableFuture <> ( ) ; Mono . from ( ( Publisher < ? > ) java.lang.Object ) . subscribe ( org.springframework.integration.handler.SettableListenableFuture<java.lang.Object> :: set , org.springframework.integration.handler.SettableListenableFuture<java.lang.Object> :: setException ) ; org.springframework.integration.handler.ListenableFuture<?> = org.springframework.integration.handler.SettableListenableFuture<java.lang.Object> ; } java.lang.Object java.lang.Object = java.lang.Object ; org.springframework.integration.handler.ListenableFuture<> . addCallback ( new ListenableFutureCallback < java.lang.Object > ( ) { @ java.lang.Override public void void ( java.lang.Object java.lang.Object ) { Message < ? > org.springframework.integration.handler.Message<?> = null ; try { org.springframework.integration.handler.Message<?> = org.springframework.integration.handler.Message<?> ( java.lang.Object , org.springframework.integration.handler.MessageHeaders ) ; void ( org.springframework.integration.handler.Message<> , java.lang.Object , false ) ; } catch ( java.lang.Exception java.lang.Exception ) { java.lang.Exception java.lang.Exception = java.lang.Exception ; if ( ! ( java.lang.Exception instanceof MessagingException ) ) { java.lang.Exception = new MessageHandlingException ( org.springframework.integration.handler.Message<> , java.lang.Exception ) ; if ( org.springframework.integration.handler.Message<> != null ) { java.lang.Exception = new MessagingException ( org.springframework.integration.handler.Message<> , java.lang.Exception ) ; } } logger . error ( STRING + java.lang.Object . java.lang.String ( ) , java.lang.Exception ) ; void ( java.lang.Exception ) ; } } @ java.lang.Override public void void ( java.lang.Throwable java.lang.Throwable ) { void ( org.springframework.integration.handler.Message<> , java.lang.Throwable ) ; } } ) ; } else { ( ( ReactiveSubscribableChannel ) org.springframework.integration.handler.MessageChannel ( ) ) . subscribeTo ( Flux . from ( ( Publisher < ? > ) java.lang.Object ) . map ( result -> createOutputMessage ( result , requestHeaders ) ) ) ; } } else { void ( org.springframework.integration.handler.Message<?> ( java.lang.Object , org.springframework.integration.handler.MessageHeaders ) , java.lang.Object , false ) ; } }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( java.lang.Object java.lang.Object ) { Message < ? > org.springframework.integration.handler.Message<?> = null ; try { org.springframework.integration.handler.Message<?> = org.springframework.integration.handler.Message<?> ( java.lang.Object , org.springframework.integration.handler.MessageHeaders ) ; void ( org.springframework.integration.handler.Message<> , java.lang.Object , false ) ; } catch ( java.lang.Exception java.lang.Exception ) { java.lang.Exception java.lang.Exception = java.lang.Exception ; if ( ! ( java.lang.Exception instanceof MessagingException ) ) { java.lang.Exception = new MessageHandlingException ( org.springframework.integration.handler.Message<> , java.lang.Exception ) ; if ( org.springframework.integration.handler.Message<> != null ) { java.lang.Exception = new MessagingException ( org.springframework.integration.handler.Message<> , java.lang.Exception ) ; } } logger . error ( STRING + java.lang.Object . java.lang.String ( ) , java.lang.Exception ) ; void ( java.lang.Exception ) ; } }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( java.lang.Throwable java.lang.Throwable ) { void ( org.springframework.integration.handler.Message<> , java.lang.Throwable ) ; }  <METHOD_END>
<METHOD_START> private java.lang.Object java.lang.Object ( java.lang.Object java.lang.Object , Message < ? > org.springframework.integration.handler.Message<?> , java.util.List<?> < ? > java.util.List<?> , java.util.concurrent.atomic.AtomicInteger java.util.concurrent.atomic.AtomicInteger ) { if ( java.util.concurrent.atomic.AtomicInteger . int ( ) >= java.util.List<> . int ( ) ) { return null ; } java.lang.Object java.lang.Object = java.util.List<> . get ( java.util.concurrent.atomic.AtomicInteger . int ( ) ) ; java.lang.Object java.lang.Object = null ; if ( java.lang.Object instanceof java.lang.String ) { java.lang.Object = getBeanFactory ( ) . getBean ( ( java.lang.String ) java.lang.Object ) ; } else if ( java.lang.Object instanceof RoutingSlipRouteStrategy ) { java.lang.Object = java.lang.Object ; } else { throw new java.lang.IllegalArgumentException ( STRING + STRING + java.lang.Object . java.lang.Class<? extends java.lang.Object> ( ) ) ; } if ( java.lang.Object instanceof MessageChannel ) { java.util.concurrent.atomic.AtomicInteger . int ( ) ; return java.lang.Object ; } else { java.lang.Object java.lang.Object = ( ( RoutingSlipRouteStrategy ) java.lang.Object ) . getNextPath ( org.springframework.integration.handler.Message<> , java.lang.Object ) ; if ( java.lang.Object != null && ( ! ( java.lang.Object instanceof java.lang.String ) || StringUtils . hasText ( ( java.lang.String ) java.lang.Object ) ) ) { return java.lang.Object ; } else { java.util.concurrent.atomic.AtomicInteger . int ( ) ; return java.lang.Object ( java.lang.Object , org.springframework.integration.handler.Message<> , java.util.List<> , java.util.concurrent.atomic.AtomicInteger ) ; } } }  <METHOD_END>
<METHOD_START> protected org.springframework.integration.handler.Message<?> < ? > org.springframework.integration.handler.Message<?> ( java.lang.Object java.lang.Object , MessageHeaders org.springframework.integration.handler.MessageHeaders ) { AbstractIntegrationMessageBuilder < ? > org.springframework.integration.handler.AbstractIntegrationMessageBuilder<?> = null ; if ( java.lang.Object instanceof Message < ? > ) { if ( ! this . boolean ( ) ) { return ( Message < ? > ) java.lang.Object ; } org.springframework.integration.handler.AbstractIntegrationMessageBuilder<?> = this . getMessageBuilderFactory ( ) . fromMessage ( ( Message < ? > ) java.lang.Object ) ; } else if ( java.lang.Object instanceof AbstractIntegrationMessageBuilder ) { org.springframework.integration.handler.AbstractIntegrationMessageBuilder<?> = ( AbstractIntegrationMessageBuilder < ? > ) java.lang.Object ; } else { org.springframework.integration.handler.AbstractIntegrationMessageBuilder<?> = this . getMessageBuilderFactory ( ) . withPayload ( java.lang.Object ) ; } if ( this . boolean ( ) ) { org.springframework.integration.handler.AbstractIntegrationMessageBuilder<> . copyHeadersIfAbsent ( org.springframework.integration.handler.MessageHeaders ) ; } return org.springframework.integration.handler.AbstractIntegrationMessageBuilder<> . build ( ) ; }  <METHOD_END>
<METHOD_START> protected void void ( java.lang.Object java.lang.Object , java.lang.Object java.lang.Object , boolean boolean ) { MessageChannel org.springframework.integration.handler.MessageChannel = org.springframework.integration.handler.MessageChannel ( ) ; if ( ! boolean && org.springframework.integration.handler.MessageChannel != null ) { java.lang.Object = org.springframework.integration.handler.MessageChannel ; } if ( java.lang.Object == null ) { throw new DestinationResolutionException ( STRING ) ; } if ( java.lang.Object instanceof MessageChannel ) { if ( java.lang.Object instanceof Message < ? > ) { this . org.springframework.integration.handler.MessagingTemplate . send ( ( MessageChannel ) java.lang.Object , ( Message < ? > ) java.lang.Object ) ; } else { this . org.springframework.integration.handler.MessagingTemplate . convertAndSend ( ( MessageChannel ) java.lang.Object , java.lang.Object ) ; } } else if ( java.lang.Object instanceof java.lang.String ) { if ( java.lang.Object instanceof Message < ? > ) { this . org.springframework.integration.handler.MessagingTemplate . send ( ( java.lang.String ) java.lang.Object , ( Message < ? > ) java.lang.Object ) ; } else { this . org.springframework.integration.handler.MessagingTemplate . convertAndSend ( ( java.lang.String ) java.lang.Object , java.lang.Object ) ; } } else { throw new MessagingException ( STRING ) ; } }  <METHOD_END>
<METHOD_START> protected boolean boolean ( ) { return true ; }  <METHOD_END>
<METHOD_START> protected void void ( final Message < ? > org.springframework.integration.handler.Message<?> , java.lang.Throwable java.lang.Throwable ) { java.lang.Object java.lang.Object = java.lang.Object ( org.springframework.integration.handler.Message<> . getHeaders ( ) ) ; java.lang.Throwable java.lang.Throwable = java.lang.Throwable ; if ( ! ( java.lang.Throwable instanceof MessagingException ) ) { java.lang.Throwable = new MessageHandlingException ( org.springframework.integration.handler.Message<> , java.lang.Throwable ) ; } if ( java.lang.Object == null ) { logger . error ( STRING + STRING , java.lang.Throwable ) ; } else { try { void ( new ErrorMessage ( java.lang.Throwable ) , java.lang.Object , true ) ; } catch ( java.lang.Exception java.lang.Exception ) { java.lang.Exception java.lang.Exception = java.lang.Exception ; if ( ! ( java.lang.Exception instanceof MessagingException ) ) { java.lang.Exception = new MessageHandlingException ( org.springframework.integration.handler.Message<> , java.lang.Exception ) ; } logger . error ( STRING , java.lang.Exception ) ; } } }  <METHOD_END>
<METHOD_START> protected java.lang.Object java.lang.Object ( final MessageHeaders org.springframework.integration.handler.MessageHeaders ) { java.lang.Object java.lang.Object = org.springframework.integration.handler.MessageHeaders . getErrorChannel ( ) ; if ( java.lang.Object == null ) { try { java.lang.Object = getChannelResolver ( ) . resolveDestination ( STRING ) ; } catch ( DestinationResolutionException org.springframework.integration.handler.DestinationResolutionException ) { } } return java.lang.Object ; }  <METHOD_END>