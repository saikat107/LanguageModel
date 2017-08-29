<METHOD_START> public static boolean boolean ( java.util.Optional<?> < ? > ... java.util.Optional<?>[] ) { Assert . notNull ( java.util.Optional<?>[] , STRING ) ; return java.util.Arrays . java.util.stream.Stream<java.util.Optional<?>> ( java.util.Optional<?>[] ) . boolean ( java.util.Optional :: boolean ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.SafeVarargs public static < T > java.util.stream.Stream<T> < T > java.util.stream.Stream<T> ( java.util.Optional<? extends T> < ? extends T > ... java.util.Optional<? extends T>[] ) { Assert . notNull ( java.util.Optional<? extends T>[] , STRING ) ; return java.util.Arrays . java.util.List<java.util.Optional<? extends T>> ( java.util.Optional<? extends T>[] ) . java.util.stream.Stream<java.util.Optional<? extends T>> ( ) . java.util.stream.Stream<T> ( java.util.Optional<? extends T> -> java.util.Optional<> . java.util.Optional<java.util.stream.Stream<>> ( java.util.stream.Stream :: java.util.stream.Stream<> ) . java.util.stream.Stream<> ( java.util.stream.Stream :: java.util.stream.Stream<> ) ) ; }  <METHOD_END>
<METHOD_START> public static < S , T > java.util.Optional<T> < T > java.util.Optional<T> ( java.lang.Iterable<S> < S > java.lang.Iterable<S> , java.util.function.Function<S,java.util.Optional<T>> < S , java.util.Optional<T> < T > > java.util.function.Function<S,java.util.Optional<T>> ) { Assert . notNull ( java.lang.Iterable<S> , STRING ) ; Assert . notNull ( java.util.function.Function<S,java.util.Optional<T>> , STRING ) ; return Streamable . of ( java.lang.Iterable<S> ) . stream ( ) . map ( java.util.function.Function<S,java.util.Optional<T>> :: java.util.Optional<T> ) . filter ( java.util.Optional :: isPresent ) . findFirst ( ) . orElseGet ( java.util.Optional :: empty ) ; }  <METHOD_END>
<METHOD_START> public static < S , T > T T ( java.lang.Iterable<S> < S > java.lang.Iterable<S> , java.util.function.Function<S,T> < S , T > java.util.function.Function<S,T> , T T ) { Assert . notNull ( java.lang.Iterable<S> , STRING ) ; Assert . notNull ( java.util.function.Function<S,T> , STRING ) ; return Streamable . of ( java.lang.Iterable<S> ) . stream ( ) . map ( java.util.function.Function<S,T> :: T ) . filter ( it -> ! it . equals ( defaultValue ) ) . findFirst ( ) . orElse ( T ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.SafeVarargs public static < T > java.util.Optional<T> < T > java.util.Optional<T> ( java.util.function.Supplier<java.util.Optional<T>> < java.util.Optional<T> < T > > ... java.util.function.Supplier<java.util.Optional<T>>[] ) { Assert . notNull ( java.util.function.Supplier<java.util.Optional<T>>[] , STRING ) ; return java.util.Optional ( Streamable . of ( java.util.function.Supplier<java.util.Optional<T>>[] ) ) ; }  <METHOD_END>
<METHOD_START> public static < T > java.util.Optional<T> < T > java.util.Optional<T> ( java.lang.Iterable<java.util.function.Supplier<java.util.Optional<T>>> < java.util.function.Supplier<java.util.Optional<T>> < java.util.Optional<T> < T > > > java.lang.Iterable<java.util.function.Supplier<java.util.Optional<T>>> ) { Assert . notNull ( java.lang.Iterable<java.util.function.Supplier<java.util.Optional<T>>> , STRING ) ; return Streamable . of ( java.lang.Iterable<java.util.function.Supplier<java.util.Optional<T>>> ) . stream ( ) . map ( java.util.function.Supplier :: get ) . filter ( java.util.Optional :: isPresent ) . findFirst ( ) . orElse ( java.util.Optional . java.util.Optional<java.lang.Object> ( ) ) ; }  <METHOD_END>
<METHOD_START> public static < T > java.util.Optional<T> < T > java.util.Optional<T> ( java.util.Iterator<T> < T > java.util.Iterator<T> ) { Assert . notNull ( java.util.Iterator<T> , STRING ) ; return java.util.Iterator<T> . boolean ( ) ? java.util.Optional . java.util.Optional<T> ( java.util.Iterator<T> . T ( ) ) : java.util.Optional . java.util.Optional<T> ( ) ; }  <METHOD_END>
<METHOD_START> public static < T , S > java.util.Optional<org.springframework.data.util.Pair<T,S>> < Pair < T , S > > java.util.Optional<org.springframework.data.util.Pair<T,S>> ( java.util.Optional<T> < T > java.util.Optional<T> , java.util.Optional<S> < S > java.util.Optional<S> ) { return java.util.Optional<T> . java.util.Optional<org.springframework.data.util.Pair<T,S>> ( T -> java.util.Optional<S> . java.util.Optional<org.springframework.data.util.Pair<T,S>> ( S -> Pair . of ( T , S ) ) ) ; }  <METHOD_END>
<METHOD_START> public static < T , S > void void ( java.util.Optional<T> < T > java.util.Optional<T> , java.util.Optional<S> < S > java.util.Optional<S> , java.util.function.BiConsumer<T,S> < T , S > java.util.function.BiConsumer<T,S> ) { Assert . notNull ( java.util.Optional<T> , STRING ) ; Assert . notNull ( java.util.Optional<S> , STRING ) ; Assert . notNull ( java.util.function.BiConsumer<T,S> , STRING ) ; java.util.Optional<java.lang.Object> ( java.util.Optional<T> , java.util.Optional<S> , ( T , S ) -> { java.util.function.BiConsumer<T,S> . void ( T , S ) ; return null ; } ) ; }  <METHOD_END>
<METHOD_START> public static < T , S , R > java.util.Optional<R> < R > java.util.Optional<R> ( java.util.Optional<T> < T > java.util.Optional<T> , java.util.Optional<S> < S > java.util.Optional<S> , java.util.function.BiFunction<T,S,R> < T , S , R > java.util.function.BiFunction<T,S,R> ) { Assert . notNull ( java.util.Optional<T> , STRING ) ; Assert . notNull ( java.util.Optional<S> , STRING ) ; Assert . notNull ( java.util.function.BiFunction<T,S,R> , STRING ) ; return java.util.Optional<T> . java.util.Optional<R> ( T -> java.util.Optional<S> . java.util.Optional<R> ( S -> java.util.function.BiFunction<T,S,R> . R ( T , S ) ) ) ; }  <METHOD_END>
<METHOD_START> public static < T > void void ( java.util.Optional<T> < T > java.util.Optional<T> , java.util.function.Consumer<? super T> < ? super T > java.util.function.Consumer<? super T> , java.lang.Runnable java.lang.Runnable ) { Assert . notNull ( java.util.Optional<T> , STRING ) ; Assert . notNull ( java.util.function.Consumer<> , STRING ) ; Assert . notNull ( java.lang.Runnable , STRING ) ; if ( java.util.Optional<T> . boolean ( ) ) { java.util.Optional<T> . void ( java.util.function.Consumer<> ) ; } else { java.lang.Runnable . void ( ) ; } }  <METHOD_END>