<METHOD_START> public void ( java.lang.Object java.lang.Object , java.lang.Object java.lang.Object , MethodParameter org.springframework.web.reactive.MethodParameter ) { this( java.lang.Object , java.lang.Object , org.springframework.web.reactive.MethodParameter , null ); }  <METHOD_END>
<METHOD_START> public void ( java.lang.Object java.lang.Object , java.lang.Object java.lang.Object , MethodParameter org.springframework.web.reactive.MethodParameter , BindingContext org.springframework.web.reactive.BindingContext ) { Assert . notNull ( java.lang.Object , STRING ) ; Assert . notNull ( org.springframework.web.reactive.MethodParameter , STRING ) ; this . java.lang.Object = java.lang.Object ; this . java.lang.Object = java.lang.Object ; this . org.springframework.web.reactive.ResolvableType = ResolvableType . forMethodParameter ( org.springframework.web.reactive.MethodParameter ) ; this . org.springframework.web.reactive.BindingContext = ( org.springframework.web.reactive.BindingContext != null ? org.springframework.web.reactive.BindingContext : new BindingContext ( ) ) ; }  <METHOD_END>
<METHOD_START> public java.lang.Object java.lang.Object ( ) { return this . java.lang.Object ; }  <METHOD_END>
<METHOD_START> public java.util.Optional<java.lang.Object> < java.lang.Object > java.util.Optional<java.lang.Object> ( ) { return java.util.Optional . java.util.Optional<java.lang.Object> ( this . java.lang.Object ) ; }  <METHOD_END>
<METHOD_START> public org.springframework.web.reactive.ResolvableType org.springframework.web.reactive.ResolvableType ( ) { return this . org.springframework.web.reactive.ResolvableType ; }  <METHOD_END>
<METHOD_START> public org.springframework.web.reactive.MethodParameter org.springframework.web.reactive.MethodParameter ( ) { return ( MethodParameter ) this . org.springframework.web.reactive.ResolvableType . getSource ( ) ; }  <METHOD_END>
<METHOD_START> public org.springframework.web.reactive.BindingContext org.springframework.web.reactive.BindingContext ( ) { return this . org.springframework.web.reactive.BindingContext ; }  <METHOD_END>
<METHOD_START> public org.springframework.web.reactive.Model org.springframework.web.reactive.Model ( ) { return this . org.springframework.web.reactive.BindingContext . getModel ( ) ; }  <METHOD_END>
<METHOD_START> public org.springframework.web.reactive.HandlerResult org.springframework.web.reactive.HandlerResult ( java.util.function.Function<java.lang.Throwable,org.springframework.web.reactive.Mono<org.springframework.web.reactive.HandlerResult>> < java.lang.Throwable , Mono < org.springframework.web.reactive.HandlerResult > > java.util.function.Function<java.lang.Throwable,org.springframework.web.reactive.Mono<org.springframework.web.reactive.HandlerResult>> ) { this . java.util.function.Function<java.lang.Throwable,org.springframework.web.reactive.Mono<org.springframework.web.reactive.HandlerResult>> = java.util.function.Function<java.lang.Throwable,org.springframework.web.reactive.Mono<org.springframework.web.reactive.HandlerResult>> ; return this ; }  <METHOD_END>
<METHOD_START> public boolean boolean ( ) { return ( this . java.util.function.Function<java.lang.Throwable,org.springframework.web.reactive.Mono<org.springframework.web.reactive.HandlerResult>> != null ) ; }  <METHOD_END>
<METHOD_START> public org.springframework.web.reactive.Mono<org.springframework.web.reactive.HandlerResult> < org.springframework.web.reactive.HandlerResult > org.springframework.web.reactive.Mono<org.springframework.web.reactive.HandlerResult> ( java.lang.Throwable java.lang.Throwable ) { return ( boolean ( ) ? this . java.util.function.Function<java.lang.Throwable,org.springframework.web.reactive.Mono<org.springframework.web.reactive.HandlerResult>> . apply ( java.lang.Throwable ) : Mono . error ( java.lang.Throwable ) ) ; }  <METHOD_END>
