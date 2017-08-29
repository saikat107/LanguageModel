<METHOD_START> public void ( Publisher < ? extends T > org.springframework.http.server.reactive.Publisher<? extends T> , java.util.function.Function<org.springframework.http.server.reactive.Publisher<T>,org.springframework.http.server.reactive.Publisher<java.lang.Void>> < Publisher < T > , Publisher < java.lang.Void > > java.util.function.Function<org.springframework.http.server.reactive.Publisher<T>,org.springframework.http.server.reactive.Publisher<java.lang.Void>> ) { super( org.springframework.http.server.reactive.Publisher<> ); this . java.util.function.Function<org.springframework.http.server.reactive.Publisher<T>,org.springframework.http.server.reactive.Publisher<java.lang.Void>> = java.util.function.Function<org.springframework.http.server.reactive.Publisher<T>,org.springframework.http.server.reactive.Publisher<java.lang.Void>> ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( Subscriber < ? super java.lang.Void > org.springframework.http.server.reactive.Subscriber<? super java.lang.Void> ) { this . source . subscribe ( new org.springframework.http.server.reactive.ChannelSendOperator<T>.WriteWithBarrier ( org.springframework.http.server.reactive.Subscriber<> ) ) ; }  <METHOD_END>
<METHOD_START> public void ( Subscriber < ? super java.lang.Void > org.springframework.http.server.reactive.Subscriber<? super java.lang.Void> ) { super( org.springframework.http.server.reactive.Subscriber<> ); }  <METHOD_END>
<METHOD_START> @ java.lang.Override protected void void ( Subscription org.springframework.http.server.reactive.Subscription ) { super. doOnSubscribe ( org.springframework.http.server.reactive.Subscription ) ; super. upstream ( ) . request ( NUMBER ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( T T ) { if ( this . boolean ) { this . org.springframework.http.server.reactive.Subscriber<> . onNext ( T ) ; return; } synchronized ( this ) { if ( this . boolean ) { this . org.springframework.http.server.reactive.Subscriber<> . onNext ( T ) ; } else if ( this . boolean ) { this . T = T ; this . boolean = false ; java.util.function.Function<org.springframework.http.server.reactive.Publisher<T>,org.springframework.http.server.reactive.Publisher<java.lang.Void>> . apply ( this ) . subscribe ( new org.springframework.http.server.reactive.ChannelSendOperator<T>.DownstreamBridge ( downstream ( ) ) ) ; } else { subscription . cancel ( ) ; downstream ( ) . onError ( new java.lang.IllegalStateException ( STRING ) ) ; } } }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( java.lang.Throwable java.lang.Throwable ) { if ( this . boolean ) { this . org.springframework.http.server.reactive.Subscriber<> . onError ( java.lang.Throwable ) ; return; } synchronized ( this ) { if ( this . boolean ) { this . org.springframework.http.server.reactive.Subscriber<> . onError ( java.lang.Throwable ) ; } else if ( this . boolean ) { this . boolean = false ; downstream ( ) . onError ( java.lang.Throwable ) ; } else { this . java.lang.Throwable = java.lang.Throwable ; } } }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( ) { if ( this . boolean ) { this . org.springframework.http.server.reactive.Subscriber<> . onComplete ( ) ; return; } synchronized ( this ) { if ( this . boolean ) { this . org.springframework.http.server.reactive.Subscriber<> . onComplete ( ) ; } else if ( this . boolean ) { this . boolean = true ; this . boolean = false ; java.util.function.Function<org.springframework.http.server.reactive.Publisher<T>,org.springframework.http.server.reactive.Publisher<java.lang.Void>> . apply ( this ) . subscribe ( new org.springframework.http.server.reactive.ChannelSendOperator<T>.DownstreamBridge ( downstream ( ) ) ) ; } else { this . boolean = true ; } } }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( Subscriber < ? super T > org.springframework.http.server.reactive.Subscriber<? super T> ) { synchronized ( this ) { Assert . isNull ( this . org.springframework.http.server.reactive.Subscriber<> , STRING ) ; this . org.springframework.http.server.reactive.Subscriber<? super T> = org.springframework.http.server.reactive.Subscriber<> ; if ( this . java.lang.Throwable != null || this . boolean ) { this . org.springframework.http.server.reactive.Subscriber<> . onSubscribe ( Operators . emptySubscription ( ) ) ; boolean ( ) ; } else { this . org.springframework.http.server.reactive.Subscriber<> . onSubscribe ( this ) ; } } }  <METHOD_END>
<METHOD_START> private boolean boolean ( ) { if ( this . T != null ) { this . org.springframework.http.server.reactive.Subscriber<> . onNext ( this . T ) ; } if ( this . java.lang.Throwable != null ) { this . org.springframework.http.server.reactive.Subscriber<> . onError ( this . java.lang.Throwable ) ; return true ; } if ( this . boolean ) { this . org.springframework.http.server.reactive.Subscriber<> . onComplete ( ) ; return true ; } return false ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override protected void void ( long long ) { if ( boolean ) { super. doRequest ( long ) ; return; } synchronized ( this ) { if ( this . org.springframework.http.server.reactive.Subscriber<> != null ) { boolean = true ; if ( boolean ( ) ) { return; } long -- ; if ( long == NUMBER ) { return; } super. doRequest ( long ) ; } } }  <METHOD_END>
<METHOD_START> public void ( Subscriber < ? super java.lang.Void > org.springframework.http.server.reactive.Subscriber<? super java.lang.Void> ) { this . org.springframework.http.server.reactive.Subscriber<? super java.lang.Void> = org.springframework.http.server.reactive.Subscriber<> ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( Subscription org.springframework.http.server.reactive.Subscription ) { org.springframework.http.server.reactive.Subscription . request ( java.lang.Long . long ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( java.lang.Void java.lang.Void ) {		}  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( java.lang.Throwable java.lang.Throwable ) { this . org.springframework.http.server.reactive.Subscriber<> . onError ( java.lang.Throwable ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( ) { this . org.springframework.http.server.reactive.Subscriber<> . onComplete ( ) ; }  <METHOD_END>