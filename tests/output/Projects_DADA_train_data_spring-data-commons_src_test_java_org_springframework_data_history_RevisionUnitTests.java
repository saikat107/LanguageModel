<METHOD_START> @ Test public void void ( ) { when ( org.springframework.data.history.RevisionMetadata<java.lang.Integer> . getRevisionNumber ( ) ) . thenReturn ( java.util.Optional . java.util.Optional<java.lang.Integer> ( NUMBER ) ) ; when ( org.springframework.data.history.RevisionMetadata . getRevisionNumber ( ) ) . thenReturn ( java.util.Optional . java.util.Optional<java.lang.Integer> ( NUMBER ) ) ; Revision < java.lang.Integer , java.lang.Object > org.springframework.data.history.Revision<java.lang.Integer,java.lang.Object> = Revision . of ( org.springframework.data.history.RevisionMetadata<java.lang.Integer> , new java.lang.Object ( ) ) ; Revision < java.lang.Integer , java.lang.Object > org.springframework.data.history.Revision<java.lang.Integer,java.lang.Object> = Revision . of ( org.springframework.data.history.RevisionMetadata , new java.lang.Object ( ) ) ; java.util.List<org.springframework.data.history.Revision<java.lang.Integer,java.lang.Object>> < Revision < java.lang.Integer , java.lang.Object > > java.util.List<org.springframework.data.history.Revision<java.lang.Integer,java.lang.Object>> = java.util.stream.Stream . java.util.stream.Stream ( org.springframework.data.history.Revision<java.lang.Integer,java.lang.Object> , org.springframework.data.history.Revision<java.lang.Integer,java.lang.Object> ) . sorted ( ) . collect ( java.util.stream.Collectors . java.util.stream.Collector<java.lang.Object,?,java.util.List<java.lang.Object>> ( ) ) ; assertThat ( java.util.List<org.springframework.data.history.Revision<java.lang.Integer,java.lang.Object>> . get ( NUMBER ) ) . isEqualTo ( org.springframework.data.history.Revision<java.lang.Integer,java.lang.Object> ) ; assertThat ( java.util.List<org.springframework.data.history.Revision<java.lang.Integer,java.lang.Object>> . get ( NUMBER ) ) . isEqualTo ( org.springframework.data.history.Revision<java.lang.Integer,java.lang.Object> ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { java.util.Optional<java.lang.Integer> < java.lang.Integer > java.util.Optional<java.lang.Integer> = java.util.Optional . java.util.Optional<java.lang.Integer> ( NUMBER ) ; when ( org.springframework.data.history.RevisionMetadata<java.lang.Integer> . getRevisionNumber ( ) ) . thenReturn ( java.util.Optional<java.lang.Integer> ) ; assertThat ( Revision . of ( org.springframework.data.history.RevisionMetadata<java.lang.Integer> , new java.lang.Object ( ) ) . getRevisionNumber ( ) ) . isEqualTo ( java.util.Optional<java.lang.Integer> ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { java.util.Optional<java.time.LocalDateTime> < java.time.LocalDateTime > java.util.Optional<java.time.LocalDateTime> = java.util.Optional . java.util.Optional<java.time.LocalDateTime> ( java.time.LocalDateTime . java.time.LocalDateTime ( ) ) ; when ( org.springframework.data.history.RevisionMetadata<java.lang.Integer> . getRevisionDate ( ) ) . thenReturn ( java.util.Optional<java.time.LocalDateTime> ) ; assertThat ( Revision . of ( org.springframework.data.history.RevisionMetadata<java.lang.Integer> , new java.lang.Object ( ) ) . getRevisionDate ( ) ) . isEqualTo ( java.util.Optional<java.time.LocalDateTime> ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { assertThat ( Revision . of ( org.springframework.data.history.RevisionMetadata<java.lang.Integer> , new java.lang.Object ( ) ) . getMetadata ( ) ) . isEqualTo ( org.springframework.data.history.RevisionMetadata<java.lang.Integer> ) ; }  <METHOD_END>