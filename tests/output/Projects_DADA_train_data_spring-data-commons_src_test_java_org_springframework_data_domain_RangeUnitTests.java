<METHOD_START> @ Test ( expected = java.lang.IllegalArgumentException .class ) public void void ( ) { new Range <> ( NUMBER , NUMBER ) . contains ( null ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { Range < java.lang.Long > org.springframework.data.domain.Range<java.lang.Long> = new Range <> ( NUMBER , NUMBER ) ; assertThat ( org.springframework.data.domain.Range<java.lang.Long> . contains ( NUMBER ) ) . isTrue ( ) ; assertThat ( org.springframework.data.domain.Range<java.lang.Long> . contains ( NUMBER ) ) . isTrue ( ) ; assertThat ( org.springframework.data.domain.Range<java.lang.Long> . contains ( NUMBER ) ) . isTrue ( ) ; assertThat ( org.springframework.data.domain.Range<java.lang.Long> . contains ( NUMBER ) ) . isFalse ( ) ; assertThat ( org.springframework.data.domain.Range<java.lang.Long> . contains ( NUMBER ) ) . isFalse ( ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { Range < java.lang.Long > org.springframework.data.domain.Range<java.lang.Long> = new Range <> ( NUMBER , NUMBER , false , true ) ; assertThat ( org.springframework.data.domain.Range<java.lang.Long> . contains ( NUMBER ) ) . isFalse ( ) ; assertThat ( org.springframework.data.domain.Range<java.lang.Long> . contains ( NUMBER ) ) . isTrue ( ) ; assertThat ( org.springframework.data.domain.Range<java.lang.Long> . contains ( NUMBER ) ) . isTrue ( ) ; assertThat ( org.springframework.data.domain.Range<java.lang.Long> . contains ( NUMBER ) ) . isFalse ( ) ; assertThat ( org.springframework.data.domain.Range<java.lang.Long> . contains ( NUMBER ) ) . isFalse ( ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { Range < java.lang.Long > org.springframework.data.domain.Range<java.lang.Long> = new Range <> ( NUMBER , NUMBER , true , false ) ; assertThat ( org.springframework.data.domain.Range<java.lang.Long> . contains ( NUMBER ) ) . isTrue ( ) ; assertThat ( org.springframework.data.domain.Range<java.lang.Long> . contains ( NUMBER ) ) . isFalse ( ) ; assertThat ( org.springframework.data.domain.Range<java.lang.Long> . contains ( NUMBER ) ) . isTrue ( ) ; assertThat ( org.springframework.data.domain.Range<java.lang.Long> . contains ( NUMBER ) ) . isFalse ( ) ; assertThat ( org.springframework.data.domain.Range<java.lang.Long> . contains ( NUMBER ) ) . isFalse ( ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { Range < java.lang.Long > org.springframework.data.domain.Range<java.lang.Long> = new Range <> ( NUMBER , null ) ; assertThat ( org.springframework.data.domain.Range<java.lang.Long> . contains ( NUMBER ) ) . isTrue ( ) ; assertThat ( org.springframework.data.domain.Range<java.lang.Long> . contains ( NUMBER ) ) . isTrue ( ) ; assertThat ( org.springframework.data.domain.Range<java.lang.Long> . contains ( NUMBER ) ) . isTrue ( ) ; assertThat ( org.springframework.data.domain.Range<java.lang.Long> . contains ( NUMBER ) ) . isFalse ( ) ; assertThat ( org.springframework.data.domain.Range<java.lang.Long> . contains ( NUMBER ) ) . isTrue ( ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { Range < java.lang.Long > org.springframework.data.domain.Range<java.lang.Long> = new Range <> ( null , NUMBER ) ; assertThat ( org.springframework.data.domain.Range<java.lang.Long> . contains ( NUMBER ) ) . isTrue ( ) ; assertThat ( org.springframework.data.domain.Range<java.lang.Long> . contains ( NUMBER ) ) . isTrue ( ) ; assertThat ( org.springframework.data.domain.Range<java.lang.Long> . contains ( NUMBER ) ) . isTrue ( ) ; assertThat ( org.springframework.data.domain.Range<java.lang.Long> . contains ( NUMBER ) ) . isTrue ( ) ; assertThat ( org.springframework.data.domain.Range<java.lang.Long> . contains ( NUMBER ) ) . isFalse ( ) ; }  <METHOD_END>