<METHOD_START> public void ( ) { this( DirectProcessor . create ( ) ); }  <METHOD_END>
<METHOD_START> public void ( Processor < Message < ? > , Message < ? > > org.springframework.integration.channel.Processor<org.springframework.integration.channel.Message<?>,org.springframework.integration.channel.Message<?>> ) { Assert . notNull ( org.springframework.integration.channel.Processor<org.springframework.integration.channel.Message<?>,org.springframework.integration.channel.Message<?>> , STRING ) ; this . org.springframework.integration.channel.Processor<org.springframework.integration.channel.Message<?>,org.springframework.integration.channel.Message<?>> = org.springframework.integration.channel.Processor<org.springframework.integration.channel.Message<?>,org.springframework.integration.channel.Message<?>> ; this . org.springframework.integration.channel.Flux<org.springframework.integration.channel.Message<?>> = Flux . from ( org.springframework.integration.channel.Processor<org.springframework.integration.channel.Message<?>,org.springframework.integration.channel.Message<?>> ) ; this . org.springframework.integration.channel.BlockingSink<org.springframework.integration.channel.Message<?>> = BlockingSink . create ( this . org.springframework.integration.channel.Processor<org.springframework.integration.channel.Message<?>,org.springframework.integration.channel.Message<?>> ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override protected boolean boolean ( Message < ? > org.springframework.integration.channel.Message<?> , long long ) { return this . org.springframework.integration.channel.BlockingSink<org.springframework.integration.channel.Message<?>> . submit ( org.springframework.integration.channel.Message<> , long ) > - NUMBER ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( Subscriber < ? super Message < ? > > org.springframework.integration.channel.Subscriber<? super org.springframework.integration.channel.Message<?>> ) { this . java.util.List<org.springframework.integration.channel.Subscriber<? super org.springframework.integration.channel.Message<?>>> . add ( org.springframework.integration.channel.Subscriber<> ) ; this . org.springframework.integration.channel.Flux<org.springframework.integration.channel.Message<?>> . doOnCancel ( ( ) ReactiveChannel .this . subscribers . remove ( subscriber ) ) . subscribe ( org.springframework.integration.channel.Subscriber<> ) ; if ( ! this . boolean ) { this . java.util.List<org.springframework.integration.channel.Publisher<org.springframework.integration.channel.Message<?>>> . forEach ( this :: void ) ; } }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( Publisher < Message < ? > > org.springframework.integration.channel.Publisher<org.springframework.integration.channel.Message<?>> ) { this . java.util.List<org.springframework.integration.channel.Publisher<org.springframework.integration.channel.Message<?>>> . add ( org.springframework.integration.channel.Publisher<org.springframework.integration.channel.Message<?>> ) ; if ( ! this . java.util.List<org.springframework.integration.channel.Subscriber<? super org.springframework.integration.channel.Message<?>>> . isEmpty ( ) ) { void ( org.springframework.integration.channel.Publisher<org.springframework.integration.channel.Message<?>> ) ; } }  <METHOD_END>
<METHOD_START> private void void ( Publisher < Message < ? > > org.springframework.integration.channel.Publisher<org.springframework.integration.channel.Message<?>> ) { Flux . from ( org.springframework.integration.channel.Publisher<org.springframework.integration.channel.Message<?>> ) . doOnSubscribe ( s -> ReactiveChannel .this . upstreamSubscribed = true ) . doOnComplete ( ( ) { ReactiveChannel .this . publishers . remove ( publisher ) ; if ( ReactiveChannel .this . publishers . isEmpty ( ) ) { ReactiveChannel .this . upstreamSubscribed = false ; } } ) . subscribe ( this . org.springframework.integration.channel.Processor<org.springframework.integration.channel.Message<?>,org.springframework.integration.channel.Message<?>> ) ; }  <METHOD_END>
