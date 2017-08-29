<METHOD_START> @ Before public void void ( ) java.lang.Exception { this . org.springframework.core.convert.support.ReactiveAdapterRegistry = new ReactiveAdapterRegistry ( ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { assertNotNull ( org.springframework.core.convert.support.ReactiveAdapter ( Mono .class ) ) ; assertNotNull ( org.springframework.core.convert.support.ReactiveAdapter ( Flux .class ) ) ; assertNotNull ( org.springframework.core.convert.support.ReactiveAdapter ( Publisher .class ) ) ; assertNotNull ( org.springframework.core.convert.support.ReactiveAdapter ( java.util.concurrent.CompletableFuture .class ) ) ; assertNotNull ( org.springframework.core.convert.support.ReactiveAdapter ( Observable .class ) ) ; assertNotNull ( org.springframework.core.convert.support.ReactiveAdapter ( Single .class ) ) ; assertNotNull ( org.springframework.core.convert.support.ReactiveAdapter ( Completable .class ) ) ; assertNotNull ( org.springframework.core.convert.support.ReactiveAdapter ( Flowable .class ) ) ; assertNotNull ( org.springframework.core.convert.support.ReactiveAdapter ( io . io . io .class ) ) ; assertNotNull ( org.springframework.core.convert.support.ReactiveAdapter ( io . io . io .class ) ) ; assertNotNull ( org.springframework.core.convert.support.ReactiveAdapter ( Maybe .class ) ) ; assertNotNull ( org.springframework.core.convert.support.ReactiveAdapter ( io . io . io .class ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { ReactiveAdapter org.springframework.core.convert.support.ReactiveAdapter = org.springframework.core.convert.support.ReactiveAdapter ( Flux .class ) ; ReactiveAdapter org.springframework.core.convert.support.ReactiveAdapter = org.springframework.core.convert.support.ReactiveAdapter ( FluxProcessor .class ) ; assertSame ( org.springframework.core.convert.support.ReactiveAdapter , org.springframework.core.convert.support.ReactiveAdapter ) ; this . org.springframework.core.convert.support.ReactiveAdapterRegistry . registerReactiveType ( ReactiveTypeDescriptor . multiValue ( FluxProcessor .class , FluxProcessor :: empty ) , o -> ( FluxProcessor < ? , ? > ) o , FluxProcessor :: from ) ; ReactiveAdapter org.springframework.core.convert.support.ReactiveAdapter = org.springframework.core.convert.support.ReactiveAdapter ( FluxProcessor .class ) ; assertNotNull ( org.springframework.core.convert.support.ReactiveAdapter ) ; assertNotSame ( org.springframework.core.convert.support.ReactiveAdapter , org.springframework.core.convert.support.ReactiveAdapter ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { java.util.List<java.lang.Integer> < java.lang.Integer > java.util.List<java.lang.Integer> = java.util.Arrays . java.util.List<java.lang.Integer> ( NUMBER , NUMBER , NUMBER ) ; Publisher < java.lang.Integer > org.springframework.core.convert.support.Publisher<java.lang.Integer> = Flowable . fromIterable ( java.util.List<java.lang.Integer> ) ; java.lang.Object java.lang.Object = org.springframework.core.convert.support.ReactiveAdapter ( Flux .class ) . fromPublisher ( org.springframework.core.convert.support.Publisher<java.lang.Integer> ) ; assertTrue ( java.lang.Object instanceof Flux ) ; assertEquals ( java.util.List<java.lang.Integer> , ( ( Flux < java.lang.Integer > ) java.lang.Object ) . collectList ( ) . block ( java.time.Duration . java.time.Duration ( NUMBER ) ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { Publisher < java.lang.Integer > org.springframework.core.convert.support.Publisher<java.lang.Integer> = Flowable . fromArray ( NUMBER , NUMBER , NUMBER ) ; java.lang.Object java.lang.Object = org.springframework.core.convert.support.ReactiveAdapter ( Mono .class ) . fromPublisher ( org.springframework.core.convert.support.Publisher<java.lang.Integer> ) ; assertTrue ( java.lang.Object instanceof Mono ) ; assertEquals ( new java.lang.Integer ( NUMBER ) , ( ( Mono < java.lang.Integer > ) java.lang.Object ) . block ( java.time.Duration . java.time.Duration ( NUMBER ) ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { Publisher < java.lang.Integer > org.springframework.core.convert.support.Publisher<java.lang.Integer> = Flowable . fromArray ( NUMBER , NUMBER , NUMBER ) ; java.lang.Object java.lang.Object = org.springframework.core.convert.support.ReactiveAdapter ( java.util.concurrent.CompletableFuture .class ) . fromPublisher ( org.springframework.core.convert.support.Publisher<java.lang.Integer> ) ; assertTrue ( java.lang.Object instanceof java.util.concurrent.CompletableFuture ) ; assertEquals ( new java.lang.Integer ( NUMBER ) , ( ( java.util.concurrent.CompletableFuture<java.lang.Integer> < java.lang.Integer > ) java.lang.Object ) . java.lang.Integer ( ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { java.util.List<java.lang.Integer> < java.lang.Integer > java.util.List<java.lang.Integer> = java.util.Arrays . java.util.List<java.lang.Integer> ( NUMBER , NUMBER , NUMBER ) ; Publisher < java.lang.Integer > org.springframework.core.convert.support.Publisher<java.lang.Integer> = Flowable . fromIterable ( java.util.List<java.lang.Integer> ) ; java.lang.Object java.lang.Object = org.springframework.core.convert.support.ReactiveAdapter ( rx . rx .class ) . fromPublisher ( org.springframework.core.convert.support.Publisher<java.lang.Integer> ) ; assertTrue ( java.lang.Object instanceof rx . rx ) ; assertEquals ( java.util.List<java.lang.Integer> , ( ( rx . rx ) java.lang.Object ) . toList ( ) . toBlocking ( ) . first ( ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { Publisher < java.lang.Integer > org.springframework.core.convert.support.Publisher<java.lang.Integer> = Flowable . fromArray ( NUMBER ) ; java.lang.Object java.lang.Object = org.springframework.core.convert.support.ReactiveAdapter ( rx . rx .class ) . fromPublisher ( org.springframework.core.convert.support.Publisher<java.lang.Integer> ) ; assertTrue ( java.lang.Object instanceof rx . rx ) ; assertEquals ( new java.lang.Integer ( NUMBER ) , ( ( rx . rx < java.lang.Integer > ) java.lang.Object ) . toBlocking ( ) . value ( ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { Publisher < java.lang.Integer > org.springframework.core.convert.support.Publisher<java.lang.Integer> = Flowable . fromArray ( NUMBER , NUMBER , NUMBER ) ; java.lang.Object java.lang.Object = org.springframework.core.convert.support.ReactiveAdapter ( rx . rx .class ) . fromPublisher ( org.springframework.core.convert.support.Publisher<java.lang.Integer> ) ; assertTrue ( java.lang.Object instanceof rx . rx ) ; assertNull ( ( ( rx . rx ) java.lang.Object ) . get ( ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { java.util.List<java.lang.Integer> < java.lang.Integer > java.util.List<java.lang.Integer> = java.util.Arrays . java.util.List<java.lang.Integer> ( NUMBER , NUMBER , NUMBER ) ; Publisher < java.lang.Integer > org.springframework.core.convert.support.Publisher<java.lang.Integer> = Flux . fromIterable ( java.util.List<java.lang.Integer> ) ; java.lang.Object java.lang.Object = org.springframework.core.convert.support.ReactiveAdapter ( io . io . io .class ) . fromPublisher ( org.springframework.core.convert.support.Publisher<java.lang.Integer> ) ; assertTrue ( java.lang.Object instanceof io . io . io ) ; assertEquals ( java.util.List<java.lang.Integer> , ( ( io . io . io ) java.lang.Object ) . toList ( ) . blockingGet ( ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { java.util.List<java.lang.Integer> < java.lang.Integer > java.util.List<java.lang.Integer> = java.util.Arrays . java.util.List<java.lang.Integer> ( NUMBER , NUMBER , NUMBER ) ; Publisher < java.lang.Integer > org.springframework.core.convert.support.Publisher<java.lang.Integer> = Flowable . fromIterable ( java.util.List<java.lang.Integer> ) ; java.lang.Object java.lang.Object = org.springframework.core.convert.support.ReactiveAdapter ( io . io . io .class ) . fromPublisher ( org.springframework.core.convert.support.Publisher<java.lang.Integer> ) ; assertTrue ( java.lang.Object instanceof io . io . io ) ; assertEquals ( java.util.List<java.lang.Integer> , ( ( io . io . io ) java.lang.Object ) . toList ( ) . blockingGet ( ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { Publisher < java.lang.Integer > org.springframework.core.convert.support.Publisher<java.lang.Integer> = Flowable . fromArray ( NUMBER ) ; java.lang.Object java.lang.Object = org.springframework.core.convert.support.ReactiveAdapter ( io . io . io .class ) . fromPublisher ( org.springframework.core.convert.support.Publisher<java.lang.Integer> ) ; assertTrue ( java.lang.Object instanceof io . io . io ) ; assertEquals ( new java.lang.Integer ( NUMBER ) , ( ( io . io . io < java.lang.Integer > ) java.lang.Object ) . blockingGet ( ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { Publisher < java.lang.Integer > org.springframework.core.convert.support.Publisher<java.lang.Integer> = Flowable . fromArray ( NUMBER , NUMBER , NUMBER ) ; java.lang.Object java.lang.Object = org.springframework.core.convert.support.ReactiveAdapter ( io . io . io .class ) . fromPublisher ( org.springframework.core.convert.support.Publisher<java.lang.Integer> ) ; assertTrue ( java.lang.Object instanceof io . io . io ) ; assertNull ( ( ( io . io . io ) java.lang.Object ) . blockingGet ( ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { java.util.List<java.lang.Integer> < java.lang.Integer > java.util.List<java.lang.Integer> = java.util.Arrays . java.util.List<java.lang.Integer> ( NUMBER , NUMBER , NUMBER ) ; java.lang.Object java.lang.Object = rx . Observable . from ( java.util.List<java.lang.Integer> ) ; java.lang.Object java.lang.Object = org.springframework.core.convert.support.ReactiveAdapter ( rx . rx .class ) . toPublisher ( java.lang.Object ) ; assertTrue ( STRING + java.lang.Object . java.lang.Class<? extends java.lang.Object> ( ) . java.lang.String ( ) , java.lang.Object instanceof Flux ) ; assertEquals ( java.util.List<java.lang.Integer> , ( ( Flux < java.lang.Integer > ) java.lang.Object ) . collectList ( ) . block ( java.time.Duration . java.time.Duration ( NUMBER ) ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { java.lang.Object java.lang.Object = rx . Single . just ( NUMBER ) ; java.lang.Object java.lang.Object = org.springframework.core.convert.support.ReactiveAdapter ( rx . rx .class ) . toPublisher ( java.lang.Object ) ; assertTrue ( STRING + java.lang.Object . java.lang.Class<? extends java.lang.Object> ( ) . java.lang.String ( ) , java.lang.Object instanceof Mono ) ; assertEquals ( new java.lang.Integer ( NUMBER ) , ( ( Mono < java.lang.Integer > ) java.lang.Object ) . block ( java.time.Duration . java.time.Duration ( NUMBER ) ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { java.lang.Object java.lang.Object = rx . Completable . complete ( ) ; java.lang.Object java.lang.Object = org.springframework.core.convert.support.ReactiveAdapter ( rx . rx .class ) . toPublisher ( java.lang.Object ) ; assertTrue ( STRING + java.lang.Object . java.lang.Class<? extends java.lang.Object> ( ) . java.lang.String ( ) , java.lang.Object instanceof Mono ) ; ( ( Mono < java.lang.Void > ) java.lang.Object ) . block ( java.time.Duration . java.time.Duration ( NUMBER ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { java.util.List<java.lang.Integer> < java.lang.Integer > java.util.List<java.lang.Integer> = java.util.Arrays . java.util.List<java.lang.Integer> ( NUMBER , NUMBER , NUMBER ) ; java.lang.Object java.lang.Object = io . reactivex . Flowable . fromIterable ( java.util.List<java.lang.Integer> ) ; java.lang.Object java.lang.Object = org.springframework.core.convert.support.ReactiveAdapter ( io . io . io .class ) . toPublisher ( java.lang.Object ) ; assertTrue ( STRING + java.lang.Object . java.lang.Class<? extends java.lang.Object> ( ) . java.lang.String ( ) , java.lang.Object instanceof Flux ) ; assertEquals ( java.util.List<java.lang.Integer> , ( ( Flux < java.lang.Integer > ) java.lang.Object ) . collectList ( ) . block ( java.time.Duration . java.time.Duration ( NUMBER ) ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { java.util.List<java.lang.Integer> < java.lang.Integer > java.util.List<java.lang.Integer> = java.util.Arrays . java.util.List<java.lang.Integer> ( NUMBER , NUMBER , NUMBER ) ; java.lang.Object java.lang.Object = io . reactivex . Observable . fromIterable ( java.util.List<java.lang.Integer> ) ; java.lang.Object java.lang.Object = org.springframework.core.convert.support.ReactiveAdapter ( io . io . io .class ) . toPublisher ( java.lang.Object ) ; assertTrue ( STRING + java.lang.Object . java.lang.Class<? extends java.lang.Object> ( ) . java.lang.String ( ) , java.lang.Object instanceof Flux ) ; assertEquals ( java.util.List<java.lang.Integer> , ( ( Flux < java.lang.Integer > ) java.lang.Object ) . collectList ( ) . block ( java.time.Duration . java.time.Duration ( NUMBER ) ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { java.lang.Object java.lang.Object = io . reactivex . Single . just ( NUMBER ) ; java.lang.Object java.lang.Object = org.springframework.core.convert.support.ReactiveAdapter ( io . io . io .class ) . toPublisher ( java.lang.Object ) ; assertTrue ( STRING + java.lang.Object . java.lang.Class<? extends java.lang.Object> ( ) . java.lang.String ( ) , java.lang.Object instanceof Mono ) ; assertEquals ( new java.lang.Integer ( NUMBER ) , ( ( Mono < java.lang.Integer > ) java.lang.Object ) . block ( java.time.Duration . java.time.Duration ( NUMBER ) ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { java.lang.Object java.lang.Object = io . reactivex . Completable . complete ( ) ; java.lang.Object java.lang.Object = org.springframework.core.convert.support.ReactiveAdapter ( io . io . io .class ) . toPublisher ( java.lang.Object ) ; assertTrue ( STRING + java.lang.Object . java.lang.Class<? extends java.lang.Object> ( ) . java.lang.String ( ) , java.lang.Object instanceof Mono ) ; ( ( Mono < java.lang.Void > ) java.lang.Object ) . block ( java.time.Duration . java.time.Duration ( NUMBER ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { java.util.concurrent.CompletableFuture<java.lang.Integer> < java.lang.Integer > java.util.concurrent.CompletableFuture<java.lang.Integer> = new java.util.concurrent.CompletableFuture ( ) ; java.util.concurrent.CompletableFuture<java.lang.Integer> . boolean ( NUMBER ) ; java.lang.Object java.lang.Object = org.springframework.core.convert.support.ReactiveAdapter ( java.util.concurrent.CompletableFuture .class ) . toPublisher ( java.util.concurrent.CompletableFuture<java.lang.Integer> ) ; assertTrue ( STRING + java.lang.Object . java.lang.Class<? extends java.lang.Object> ( ) . java.lang.String ( ) , java.lang.Object instanceof Mono ) ; assertEquals ( new java.lang.Integer ( NUMBER ) , ( ( Mono < java.lang.Integer > ) java.lang.Object ) . block ( java.time.Duration . java.time.Duration ( NUMBER ) ) ) ; }  <METHOD_END>
<METHOD_START> private org.springframework.core.convert.support.ReactiveAdapter org.springframework.core.convert.support.ReactiveAdapter ( java.lang.Class<?> < ? > java.lang.Class<?> ) { return this . org.springframework.core.convert.support.ReactiveAdapterRegistry . getAdapter ( java.lang.Class<> ) ; }  <METHOD_END>
