<METHOD_START> @ Test public void void ( ) java.lang.Exception { ResultProcessor org.springframework.data.repository.query.ResultProcessor = new ResultProcessor ( org.springframework.data.repository.query.QueryMethod ( STRING ) , new SpelAwareProxyProjectionFactory ( ) ) ; org.springframework.data.repository.query.ResultProcessorUnitTests.Sample org.springframework.data.repository.query.ResultProcessorUnitTests.Sample = new org.springframework.data.repository.query.ResultProcessorUnitTests.Sample ( STRING , STRING ) ; java.util.List<org.springframework.data.repository.query.ResultProcessorUnitTests.Sample> < org.springframework.data.repository.query.ResultProcessorUnitTests.Sample > java.util.List<org.springframework.data.repository.query.ResultProcessorUnitTests.Sample> = new java.util.ArrayList<org.springframework.data.repository.query.ResultProcessorUnitTests.Sample> <> ( java.util.Collections . java.util.List<org.springframework.data.repository.query.ResultProcessorUnitTests.Sample> ( org.springframework.data.repository.query.ResultProcessorUnitTests.Sample ) ) ; java.util.List<org.springframework.data.repository.query.ResultProcessorUnitTests.Sample> < org.springframework.data.repository.query.ResultProcessorUnitTests.Sample > java.util.List<org.springframework.data.repository.query.ResultProcessorUnitTests.Sample> = org.springframework.data.repository.query.ResultProcessor . processResult ( java.util.List<org.springframework.data.repository.query.ResultProcessorUnitTests.Sample> ) ; assertThat ( java.util.List<org.springframework.data.repository.query.ResultProcessorUnitTests.Sample> ) . contains ( org.springframework.data.repository.query.ResultProcessorUnitTests.Sample ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { ResultProcessor org.springframework.data.repository.query.ResultProcessor = org.springframework.data.repository.query.ResultProcessor ( STRING ) ; org.springframework.data.repository.query.ResultProcessorUnitTests.SampleProjection org.springframework.data.repository.query.ResultProcessorUnitTests.SampleProjection = org.springframework.data.repository.query.ResultProcessor . processResult ( java.util.Collections . java.util.List<java.lang.String> ( STRING ) ) ; assertThat ( org.springframework.data.repository.query.ResultProcessorUnitTests.SampleProjection . java.lang.String ( ) ) . isEqualTo ( STRING ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { ResultProcessor org.springframework.data.repository.query.ResultProcessor = org.springframework.data.repository.query.ResultProcessor ( STRING ) ; java.util.List<java.lang.String> < java.lang.String > java.util.List<java.lang.String> = java.util.Collections . java.util.List<java.lang.String> ( STRING ) ; java.util.List<java.util.List<java.lang.String>> < java.util.List<java.lang.String> < java.lang.String > > java.util.List<java.util.List<java.lang.String>> = new java.util.ArrayList<java.util.List<java.lang.String>> <> ( java.util.Collections . java.util.List<java.util.List<java.lang.String>> ( java.util.List<java.lang.String> ) ) ; java.util.List<org.springframework.data.repository.query.ResultProcessorUnitTests.SampleProjection> < org.springframework.data.repository.query.ResultProcessorUnitTests.SampleProjection > java.util.List<org.springframework.data.repository.query.ResultProcessorUnitTests.SampleProjection> = org.springframework.data.repository.query.ResultProcessor . processResult ( java.util.List<java.util.List<java.lang.String>> ) ; assertThat ( java.util.List<org.springframework.data.repository.query.ResultProcessorUnitTests.SampleProjection> ) . extracting ( org.springframework.data.repository.query.ResultProcessorUnitTests.SampleProjection :: java.lang.String ) . containsExactly ( STRING ) ; }  <METHOD_END>
<METHOD_START> @ Test @ java.lang.SuppressWarnings ( STRING ) public void void ( ) java.lang.Exception { ResultProcessor org.springframework.data.repository.query.ResultProcessor = org.springframework.data.repository.query.ResultProcessor ( STRING ) ; java.util.List<java.util.Map<java.lang.String,java.lang.Object>> < java.util.Map<java.lang.String,java.lang.Object> < java.lang.String , java.lang.Object > > java.util.List<java.util.Map<java.lang.String,java.lang.Object>> = new java.util.ArrayList<java.util.Map<java.lang.String,java.lang.Object>> <> ( java.util.Collections . java.util.List<java.util.Map<java.lang.String,java.lang.Object>> ( java.util.Collections . java.util.Map<java.lang.String,java.lang.Object> ( STRING , STRING ) ) ) ; java.util.List<org.springframework.data.repository.query.ResultProcessorUnitTests.SampleProjection> < org.springframework.data.repository.query.ResultProcessorUnitTests.SampleProjection > java.util.List<org.springframework.data.repository.query.ResultProcessorUnitTests.SampleProjection> = org.springframework.data.repository.query.ResultProcessor . processResult ( java.util.List<java.util.Map<java.lang.String,java.lang.Object>> ) ; assertThat ( java.util.List<org.springframework.data.repository.query.ResultProcessorUnitTests.SampleProjection> ) . hasSize ( NUMBER ) ; assertThat ( java.util.List<org.springframework.data.repository.query.ResultProcessorUnitTests.SampleProjection> . org.springframework.data.repository.query.ResultProcessorUnitTests.SampleProjection ( NUMBER ) . java.lang.String ( ) ) . isEqualTo ( STRING ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { ResultProcessor org.springframework.data.repository.query.ResultProcessor = org.springframework.data.repository.query.ResultProcessor ( STRING ) ; java.util.List<org.springframework.data.repository.query.ResultProcessorUnitTests.Sample> < org.springframework.data.repository.query.ResultProcessorUnitTests.Sample > java.util.List<org.springframework.data.repository.query.ResultProcessorUnitTests.Sample> = new java.util.ArrayList<org.springframework.data.repository.query.ResultProcessorUnitTests.Sample> <> ( java.util.Collections . java.util.List<org.springframework.data.repository.query.ResultProcessorUnitTests.Sample> ( new org.springframework.data.repository.query.ResultProcessorUnitTests.Sample ( STRING , STRING ) ) ) ; java.util.List<org.springframework.data.repository.query.ResultProcessorUnitTests.SampleProjection> < org.springframework.data.repository.query.ResultProcessorUnitTests.SampleProjection > java.util.List<org.springframework.data.repository.query.ResultProcessorUnitTests.SampleProjection> = org.springframework.data.repository.query.ResultProcessor . processResult ( java.util.List<org.springframework.data.repository.query.ResultProcessorUnitTests.Sample> ) ; assertThat ( java.util.List<org.springframework.data.repository.query.ResultProcessorUnitTests.SampleProjection> ) . hasSize ( NUMBER ) ; assertThat ( java.util.List<org.springframework.data.repository.query.ResultProcessorUnitTests.SampleProjection> . org.springframework.data.repository.query.ResultProcessorUnitTests.SampleProjection ( NUMBER ) . java.lang.String ( ) ) . isEqualTo ( STRING ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { ResultProcessor org.springframework.data.repository.query.ResultProcessor = org.springframework.data.repository.query.ResultProcessor ( STRING , Pageable .class ) ; Page < org.springframework.data.repository.query.ResultProcessorUnitTests.Sample > org.springframework.data.repository.query.Page<org.springframework.data.repository.query.ResultProcessorUnitTests.Sample> = new PageImpl <> ( java.util.Collections . java.util.List<org.springframework.data.repository.query.ResultProcessorUnitTests.Sample> ( new org.springframework.data.repository.query.ResultProcessorUnitTests.Sample ( STRING , STRING ) ) ) ; Page < org.springframework.data.repository.query.ResultProcessorUnitTests.SampleProjection > org.springframework.data.repository.query.Page<org.springframework.data.repository.query.ResultProcessorUnitTests.SampleProjection> = org.springframework.data.repository.query.ResultProcessor . processResult ( org.springframework.data.repository.query.Page<org.springframework.data.repository.query.ResultProcessorUnitTests.Sample> ) ; assertThat ( org.springframework.data.repository.query.Page<org.springframework.data.repository.query.ResultProcessorUnitTests.SampleProjection> . getContent ( ) ) . hasSize ( NUMBER ) ; assertThat ( org.springframework.data.repository.query.Page<org.springframework.data.repository.query.ResultProcessorUnitTests.SampleProjection> . getContent ( ) . get ( NUMBER ) . getLastname ( ) ) . isEqualTo ( STRING ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { ResultProcessor org.springframework.data.repository.query.ResultProcessor = org.springframework.data.repository.query.ResultProcessor ( STRING ) ; org.springframework.data.repository.query.ResultProcessorUnitTests.OpenProjection org.springframework.data.repository.query.ResultProcessorUnitTests.OpenProjection = org.springframework.data.repository.query.ResultProcessor . processResult ( new org.springframework.data.repository.query.ResultProcessorUnitTests.Sample ( STRING , STRING ) ) ; assertThat ( org.springframework.data.repository.query.ResultProcessorUnitTests.OpenProjection . java.lang.String ( ) ) . isEqualTo ( STRING ) ; assertThat ( org.springframework.data.repository.query.ResultProcessorUnitTests.OpenProjection . java.lang.String ( ) ) . isEqualTo ( STRING ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { ParameterAccessor org.springframework.data.repository.query.ParameterAccessor = mock ( ParameterAccessor .class ) ; ResultProcessor org.springframework.data.repository.query.ResultProcessor = org.springframework.data.repository.query.ResultProcessor ( STRING , java.lang.Class .class ) ; assertThat ( org.springframework.data.repository.query.ResultProcessor . withDynamicProjection ( org.springframework.data.repository.query.ParameterAccessor ) ) . isEqualTo ( org.springframework.data.repository.query.ResultProcessor ) ; doReturn ( java.util.Optional . java.util.Optional<java.lang.Class<org.springframework.data.repository.query.ResultProcessorUnitTests.SampleProjection>> ( org.springframework.data.repository.query.ResultProcessorUnitTests.SampleProjection .class ) ) . when ( org.springframework.data.repository.query.ParameterAccessor ) . getDynamicProjection ( ) ; ResultProcessor org.springframework.data.repository.query.ResultProcessor = org.springframework.data.repository.query.ResultProcessor . withDynamicProjection ( org.springframework.data.repository.query.ParameterAccessor ) ; assertThat ( org.springframework.data.repository.query.ResultProcessor . getReturnedType ( ) . getReturnedType ( ) ) . isEqualTo ( org.springframework.data.repository.query.ResultProcessorUnitTests.SampleProjection .class ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { java.lang.Object java.lang.Object = org.springframework.data.repository.query.ResultProcessor ( STRING ) . processResult ( new org.springframework.data.repository.query.ResultProcessorUnitTests.Sample ( STRING , STRING ) , source -> new SampleDto ( ) ) ; assertThat ( java.lang.Object ) . isInstanceOf ( org.springframework.data.repository.query.ResultProcessorUnitTests.SampleDto .class ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { java.lang.Object java.lang.Object = org.springframework.data.repository.query.ResultProcessor ( STRING ) . processResult ( null ) ; assertThat ( java.lang.Object ) . isNull ( ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { Slice < org.springframework.data.repository.query.ResultProcessorUnitTests.Sample > org.springframework.data.repository.query.Slice<org.springframework.data.repository.query.ResultProcessorUnitTests.Sample> = new SliceImpl <> ( java.util.Collections . java.util.List<org.springframework.data.repository.query.ResultProcessorUnitTests.Sample> ( new org.springframework.data.repository.query.ResultProcessorUnitTests.Sample ( STRING , STRING ) ) ) ; java.lang.Object java.lang.Object = org.springframework.data.repository.query.ResultProcessor ( STRING , Pageable .class ) . processResult ( org.springframework.data.repository.query.Slice<org.springframework.data.repository.query.ResultProcessorUnitTests.Sample> ) ; assertThat ( java.lang.Object ) . isInstanceOf ( Slice .class ) ; java.util.List<?> < ? > java.util.List<?> = ( ( Slice < ? > ) java.lang.Object ) . getContent ( ) ; assertThat ( java.util.List<> ) . hasSize ( NUMBER ) . hasOnlyElementsOfType ( org.springframework.data.repository.query.ResultProcessorUnitTests.SampleProjection .class ) ; }  <METHOD_END>
<METHOD_START> @ Test @ java.lang.SuppressWarnings ( STRING ) public void void ( ) java.lang.Exception { java.util.stream.Stream<org.springframework.data.repository.query.ResultProcessorUnitTests.Sample> < org.springframework.data.repository.query.ResultProcessorUnitTests.Sample > java.util.stream.Stream<org.springframework.data.repository.query.ResultProcessorUnitTests.Sample> = java.util.Collections . java.util.List<org.springframework.data.repository.query.ResultProcessorUnitTests.Sample> ( new org.springframework.data.repository.query.ResultProcessorUnitTests.Sample ( STRING , STRING ) ) . java.util.stream.Stream<org.springframework.data.repository.query.ResultProcessorUnitTests.Sample> ( ) ; java.lang.Object java.lang.Object = org.springframework.data.repository.query.ResultProcessor ( STRING ) . processResult ( java.util.stream.Stream<org.springframework.data.repository.query.ResultProcessorUnitTests.Sample> ) ; assertThat ( java.lang.Object ) . isInstanceOf ( java.util.stream.Stream .class ) ; java.util.List<java.lang.Object> < java.lang.Object > java.util.List<java.lang.Object> = ( ( java.util.stream.Stream<java.lang.Object> < java.lang.Object > ) java.lang.Object ) . java.util.List<java.lang.Object> ( java.util.stream.Collectors . java.util.stream.Collector<java.lang.Object,?,java.util.List<java.lang.Object>> ( ) ) ; assertThat ( java.util.List<java.lang.Object> ) . hasSize ( NUMBER ) . hasOnlyElementsOfType ( org.springframework.data.repository.query.ResultProcessorUnitTests.SampleProjection .class ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { java.lang.Object java.lang.Object = org.springframework.data.repository.query.ResultProcessor ( STRING ) . processResult ( new org.springframework.data.repository.query.ResultProcessorUnitTests.Sample ( STRING , STRING ) ) ; assertThat ( java.lang.Object ) . isInstanceOf ( org.springframework.data.repository.query.ResultProcessorUnitTests.WrappingDto .class ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { ResultProcessor org.springframework.data.repository.query.ResultProcessor = org.springframework.data.repository.query.ResultProcessor ( STRING ) ; org.springframework.data.repository.query.ResultProcessorUnitTests.SpecialList<org.springframework.data.repository.query.ResultProcessorUnitTests.Sample> < org.springframework.data.repository.query.ResultProcessorUnitTests.Sample > org.springframework.data.repository.query.ResultProcessorUnitTests.SpecialList<org.springframework.data.repository.query.ResultProcessorUnitTests.Sample> = new org.springframework.data.repository.query.ResultProcessorUnitTests.SpecialList<org.springframework.data.repository.query.ResultProcessorUnitTests.Sample> <> ( new java.lang.Object ( ) ) ; org.springframework.data.repository.query.ResultProcessorUnitTests.SpecialList<org.springframework.data.repository.query.ResultProcessorUnitTests.Sample> . boolean ( new org.springframework.data.repository.query.ResultProcessorUnitTests.Sample ( STRING , STRING ) ) ; org.springframework.data.repository.query.ResultProcessor . processResult ( org.springframework.data.repository.query.ResultProcessorUnitTests.SpecialList<org.springframework.data.repository.query.ResultProcessorUnitTests.Sample> ) ; }  <METHOD_END>
<METHOD_START> @ Test @ java.lang.SuppressWarnings ( STRING ) public void void ( ) java.lang.Exception { Mono < org.springframework.data.repository.query.ResultProcessorUnitTests.Sample > org.springframework.data.repository.query.Mono<org.springframework.data.repository.query.ResultProcessorUnitTests.Sample> = Mono . just ( new org.springframework.data.repository.query.ResultProcessorUnitTests.Sample ( STRING , STRING ) ) ; java.lang.Object java.lang.Object = org.springframework.data.repository.query.ResultProcessor ( STRING ) . processResult ( org.springframework.data.repository.query.Mono<org.springframework.data.repository.query.ResultProcessorUnitTests.Sample> ) ; assertThat ( java.lang.Object ) . isInstanceOf ( Mono .class ) ; java.lang.Object java.lang.Object = ( ( Mono < java.lang.Object > ) java.lang.Object ) . block ( ) ; assertThat ( java.lang.Object ) . isInstanceOf ( org.springframework.data.repository.query.ResultProcessorUnitTests.Sample .class ) ; }  <METHOD_END>
<METHOD_START> @ Test @ java.lang.SuppressWarnings ( STRING ) public void void ( ) java.lang.Exception { Single < org.springframework.data.repository.query.ResultProcessorUnitTests.Sample > org.springframework.data.repository.query.Single<org.springframework.data.repository.query.ResultProcessorUnitTests.Sample> = Single . just ( new org.springframework.data.repository.query.ResultProcessorUnitTests.Sample ( STRING , STRING ) ) ; java.lang.Object java.lang.Object = org.springframework.data.repository.query.ResultProcessor ( STRING ) . processResult ( org.springframework.data.repository.query.Single<org.springframework.data.repository.query.ResultProcessorUnitTests.Sample> ) ; assertThat ( java.lang.Object ) . isInstanceOf ( Single .class ) ; java.lang.Object java.lang.Object = ( ( Single < java.lang.Object > ) java.lang.Object ) . toBlocking ( ) . value ( ) ; assertThat ( java.lang.Object ) . isInstanceOf ( org.springframework.data.repository.query.ResultProcessorUnitTests.Sample .class ) ; }  <METHOD_END>
<METHOD_START> @ Test @ java.lang.SuppressWarnings ( STRING ) public void void ( ) java.lang.Exception { ResultProcessor org.springframework.data.repository.query.ResultProcessor = org.springframework.data.repository.query.ResultProcessor ( STRING ) ; java.lang.Object java.lang.Object = org.springframework.data.repository.query.ResultProcessor . processResult ( Mono . just ( new org.springframework.data.repository.query.ResultProcessorUnitTests.Sample ( STRING , STRING ) ) , source -> new SampleDto ( ) ) ; assertThat ( java.lang.Object ) . isInstanceOf ( Mono .class ) ; java.lang.Object java.lang.Object = ( ( Mono < java.lang.Object > ) java.lang.Object ) . block ( ) ; assertThat ( java.lang.Object ) . isInstanceOf ( org.springframework.data.repository.query.ResultProcessorUnitTests.SampleDto .class ) ; }  <METHOD_END>
<METHOD_START> @ Test @ java.lang.SuppressWarnings ( STRING ) public void void ( ) java.lang.Exception { Flux < org.springframework.data.repository.query.ResultProcessorUnitTests.Sample > org.springframework.data.repository.query.Flux<org.springframework.data.repository.query.ResultProcessorUnitTests.Sample> = Flux . just ( new org.springframework.data.repository.query.ResultProcessorUnitTests.Sample ( STRING , STRING ) ) ; java.lang.Object java.lang.Object = org.springframework.data.repository.query.ResultProcessor ( STRING ) . processResult ( org.springframework.data.repository.query.Flux<org.springframework.data.repository.query.ResultProcessorUnitTests.Sample> ) ; assertThat ( java.lang.Object ) . isInstanceOf ( Flux .class ) ; java.util.List<java.lang.Object> < java.lang.Object > java.util.List<java.lang.Object> = ( ( Flux < java.lang.Object > ) java.lang.Object ) . collectList ( ) . block ( ) ; assertThat ( java.util.List<java.lang.Object> ) . isNotEmpty ( ) ; assertThat ( java.util.List<java.lang.Object> . java.lang.Object ( NUMBER ) ) . isInstanceOf ( org.springframework.data.repository.query.ResultProcessorUnitTests.SampleProjection .class ) ; }  <METHOD_END>
<METHOD_START> @ Test @ java.lang.SuppressWarnings ( STRING ) public void void ( ) java.lang.Exception { Observable < org.springframework.data.repository.query.ResultProcessorUnitTests.Sample > org.springframework.data.repository.query.Observable<org.springframework.data.repository.query.ResultProcessorUnitTests.Sample> = Observable . just ( new org.springframework.data.repository.query.ResultProcessorUnitTests.Sample ( STRING , STRING ) ) ; java.lang.Object java.lang.Object = org.springframework.data.repository.query.ResultProcessor ( STRING ) . processResult ( org.springframework.data.repository.query.Observable<org.springframework.data.repository.query.ResultProcessorUnitTests.Sample> ) ; assertThat ( java.lang.Object ) . isInstanceOf ( Observable .class ) ; java.util.List<java.lang.Object> < java.lang.Object > java.util.List<java.lang.Object> = ( ( Observable < java.lang.Object > ) java.lang.Object ) . toList ( ) . toBlocking ( ) . single ( ) ; assertThat ( java.util.List<java.lang.Object> ) . isNotEmpty ( ) ; assertThat ( java.util.List<java.lang.Object> . java.lang.Object ( NUMBER ) ) . isInstanceOf ( org.springframework.data.repository.query.ResultProcessorUnitTests.SampleProjection .class ) ; }  <METHOD_END>
<METHOD_START> @ Test @ java.lang.SuppressWarnings ( STRING ) public void void ( ) java.lang.Exception { Flowable < org.springframework.data.repository.query.ResultProcessorUnitTests.Sample > org.springframework.data.repository.query.Flowable<org.springframework.data.repository.query.ResultProcessorUnitTests.Sample> = Flowable . just ( new org.springframework.data.repository.query.ResultProcessorUnitTests.Sample ( STRING , STRING ) ) ; java.lang.Object java.lang.Object = org.springframework.data.repository.query.ResultProcessor ( STRING ) . processResult ( org.springframework.data.repository.query.Flowable<org.springframework.data.repository.query.ResultProcessorUnitTests.Sample> ) ; assertThat ( java.lang.Object ) . isInstanceOf ( Flowable .class ) ; java.util.List<java.lang.Object> < java.lang.Object > java.util.List<java.lang.Object> = ( ( Flowable < java.lang.Object > ) java.lang.Object ) . toList ( ) . blockingGet ( ) ; assertThat ( java.util.List<java.lang.Object> ) . isNotEmpty ( ) ; assertThat ( java.util.List<java.lang.Object> . java.lang.Object ( NUMBER ) ) . isInstanceOf ( org.springframework.data.repository.query.ResultProcessorUnitTests.SampleProjection .class ) ; }  <METHOD_END>
<METHOD_START> private static org.springframework.data.repository.query.ResultProcessor org.springframework.data.repository.query.ResultProcessor ( java.lang.String java.lang.String , java.lang.Class<?> < ? > ... java.lang.Class<?>[] ) throws java.lang.Exception { return org.springframework.data.repository.query.QueryMethod ( java.lang.String , java.lang.Class<?>[] ) . getResultProcessor ( ) ; }  <METHOD_END>
<METHOD_START> private static org.springframework.data.repository.query.QueryMethod org.springframework.data.repository.query.QueryMethod ( java.lang.String java.lang.String , java.lang.Class<?> < ? > ... java.lang.Class<?>[] ) throws java.lang.Exception { java.lang.reflect.Method java.lang.reflect.Method = org.springframework.data.repository.query.ResultProcessorUnitTests.SampleRepository .class . java.lang.reflect.Method ( java.lang.String , java.lang.Class<?>[] ) ; return new QueryMethod ( java.lang.reflect.Method , new DefaultRepositoryMetadata ( org.springframework.data.repository.query.ResultProcessorUnitTests.SampleRepository .class ) , new SpelAwareProxyProjectionFactory ( ) ) ; }  <METHOD_END>
<METHOD_START> java.util.List<org.springframework.data.repository.query.ResultProcessorUnitTests.Sample> < org.springframework.data.repository.query.ResultProcessorUnitTests.Sample > java.util.List<org.springframework.data.repository.query.ResultProcessorUnitTests.Sample> ( )  <METHOD_END>
<METHOD_START> java.util.List<org.springframework.data.repository.query.ResultProcessorUnitTests.SampleDto> < org.springframework.data.repository.query.ResultProcessorUnitTests.SampleDto > java.util.List<org.springframework.data.repository.query.ResultProcessorUnitTests.SampleDto> ( )  <METHOD_END>
<METHOD_START> java.util.List<org.springframework.data.repository.query.ResultProcessorUnitTests.SampleProjection> < org.springframework.data.repository.query.ResultProcessorUnitTests.SampleProjection > java.util.List<org.springframework.data.repository.query.ResultProcessorUnitTests.SampleProjection> ( )  <METHOD_END>
<METHOD_START> org.springframework.data.repository.query.ResultProcessorUnitTests.Sample org.springframework.data.repository.query.ResultProcessorUnitTests.Sample ( )  <METHOD_END>
<METHOD_START> org.springframework.data.repository.query.ResultProcessorUnitTests.SampleDto org.springframework.data.repository.query.ResultProcessorUnitTests.SampleDto ( )  <METHOD_END>
<METHOD_START> org.springframework.data.repository.query.ResultProcessorUnitTests.WrappingDto org.springframework.data.repository.query.ResultProcessorUnitTests.WrappingDto ( )  <METHOD_END>
<METHOD_START> org.springframework.data.repository.query.ResultProcessorUnitTests.SampleProjection org.springframework.data.repository.query.ResultProcessorUnitTests.SampleProjection ( )  <METHOD_END>
<METHOD_START> org.springframework.data.repository.query.ResultProcessorUnitTests.OpenProjection org.springframework.data.repository.query.ResultProcessorUnitTests.OpenProjection ( )  <METHOD_END>
<METHOD_START> org.springframework.data.repository.query.Page<org.springframework.data.repository.query.ResultProcessorUnitTests.SampleProjection> < org.springframework.data.repository.query.ResultProcessorUnitTests.SampleProjection > org.springframework.data.repository.query.Page<org.springframework.data.repository.query.ResultProcessorUnitTests.SampleProjection> ( Pageable org.springframework.data.repository.query.Pageable );  <METHOD_END>
<METHOD_START> org.springframework.data.repository.query.Slice<org.springframework.data.repository.query.ResultProcessorUnitTests.SampleProjection> < org.springframework.data.repository.query.ResultProcessorUnitTests.SampleProjection > org.springframework.data.repository.query.Slice<org.springframework.data.repository.query.ResultProcessorUnitTests.SampleProjection> ( Pageable org.springframework.data.repository.query.Pageable );  <METHOD_END>
<METHOD_START> < T > T T ( java.lang.Class<T> < T > java.lang.Class<T> );  <METHOD_END>
<METHOD_START> java.util.stream.Stream<org.springframework.data.repository.query.ResultProcessorUnitTests.SampleProjection> < org.springframework.data.repository.query.ResultProcessorUnitTests.SampleProjection > java.util.stream.Stream<org.springframework.data.repository.query.ResultProcessorUnitTests.SampleProjection> ( )  <METHOD_END>
<METHOD_START> org.springframework.data.repository.query.Mono<org.springframework.data.repository.query.ResultProcessorUnitTests.Sample> < org.springframework.data.repository.query.ResultProcessorUnitTests.Sample > org.springframework.data.repository.query.Mono<org.springframework.data.repository.query.ResultProcessorUnitTests.Sample> ( )  <METHOD_END>
<METHOD_START> org.springframework.data.repository.query.Mono<org.springframework.data.repository.query.ResultProcessorUnitTests.SampleDto> < org.springframework.data.repository.query.ResultProcessorUnitTests.SampleDto > org.springframework.data.repository.query.Mono<org.springframework.data.repository.query.ResultProcessorUnitTests.SampleDto> ( )  <METHOD_END>
<METHOD_START> org.springframework.data.repository.query.Single<org.springframework.data.repository.query.ResultProcessorUnitTests.Sample> < org.springframework.data.repository.query.ResultProcessorUnitTests.Sample > org.springframework.data.repository.query.Single<org.springframework.data.repository.query.ResultProcessorUnitTests.Sample> ( )  <METHOD_END>
<METHOD_START> org.springframework.data.repository.query.Flux<org.springframework.data.repository.query.ResultProcessorUnitTests.SampleProjection> < org.springframework.data.repository.query.ResultProcessorUnitTests.SampleProjection > org.springframework.data.repository.query.Flux<org.springframework.data.repository.query.ResultProcessorUnitTests.SampleProjection> ( )  <METHOD_END>
<METHOD_START> org.springframework.data.repository.query.Observable<org.springframework.data.repository.query.ResultProcessorUnitTests.SampleProjection> < org.springframework.data.repository.query.ResultProcessorUnitTests.SampleProjection > org.springframework.data.repository.query.Observable<org.springframework.data.repository.query.ResultProcessorUnitTests.SampleProjection> ( )  <METHOD_END>
<METHOD_START> org.springframework.data.repository.query.Flowable<org.springframework.data.repository.query.ResultProcessorUnitTests.SampleProjection> < org.springframework.data.repository.query.ResultProcessorUnitTests.SampleProjection > org.springframework.data.repository.query.Flowable<org.springframework.data.repository.query.ResultProcessorUnitTests.SampleProjection> ( )  <METHOD_END>
<METHOD_START> public void ( java.lang.String java.lang.String , java.lang.String java.lang.String ) { this . java.lang.String = java.lang.String ; this . java.lang.String = java.lang.String ; }  <METHOD_END>
<METHOD_START> java.lang.String java.lang.String ( )  <METHOD_END>
<METHOD_START> java.lang.String java.lang.String ( )  <METHOD_END>
<METHOD_START> @ Value ( STRING ) java.lang.String java.lang.String ( )  <METHOD_END>
<METHOD_START> public void ( java.lang.Object java.lang.Object ) {}  <METHOD_END>
