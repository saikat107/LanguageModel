<METHOD_START> @ Test public void void ( ) { repository . save ( LENNISTERS ) ; Person org.springframework.data.map.Person = repository . findOne ( QPerson . person . firstname . eq ( CERSEI . getFirstname ( ) ) ) ; assertThat ( org.springframework.data.map.Person , is ( CERSEI ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { repository . save ( LENNISTERS ) ; java.lang.Iterable<org.springframework.data.map.Person> < Person > java.lang.Iterable<org.springframework.data.map.Person> = repository . findAll ( QPerson . person . age . eq ( CERSEI . getAge ( ) ) ) ; assertThat ( java.lang.Iterable<org.springframework.data.map.Person> , containsInAnyOrder ( CERSEI , JAIME ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { repository . save ( LENNISTERS ) ; Page < Person > org.springframework.data.map.Page<org.springframework.data.map.Person> = repository . findAll ( QPerson . person . age . eq ( CERSEI . getAge ( ) ) , new PageRequest ( NUMBER , NUMBER ) ) ; assertThat ( org.springframework.data.map.Page<org.springframework.data.map.Person> . getTotalElements ( ) , is ( NUMBER ) ) ; assertThat ( org.springframework.data.map.Page<org.springframework.data.map.Person> . getContent ( ) , hasSize ( NUMBER ) ) ; assertThat ( org.springframework.data.map.Page<org.springframework.data.map.Person> . hasNext ( ) , is ( true ) ) ; Page < Person > org.springframework.data.map.Page<org.springframework.data.map.Person> = ( ( org.springframework.data.map.QuerydslKeyValueRepositoryUnitTests.QPersonRepository ) repository ) . findAll ( QPerson . person . age . eq ( CERSEI . getAge ( ) ) , org.springframework.data.map.Page<org.springframework.data.map.Person> . nextPageable ( ) ) ; assertThat ( org.springframework.data.map.Page<org.springframework.data.map.Person> . getTotalElements ( ) , is ( NUMBER ) ) ; assertThat ( org.springframework.data.map.Page<org.springframework.data.map.Person> . getContent ( ) , hasSize ( NUMBER ) ) ; assertThat ( org.springframework.data.map.Page<org.springframework.data.map.Person> . hasNext ( ) , is ( false ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { repository . save ( LENNISTERS ) ; java.lang.Iterable<org.springframework.data.map.Person> < Person > java.lang.Iterable<org.springframework.data.map.Person> = repository . findAll ( QPerson . person . age . eq ( CERSEI . getAge ( ) ) , QPerson . person . firstname . desc ( ) ) ; assertThat ( java.lang.Iterable<org.springframework.data.map.Person> , contains ( JAIME , CERSEI ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { repository . save ( LENNISTERS ) ; java.lang.Iterable<org.springframework.data.map.Person> < Person > java.lang.Iterable<org.springframework.data.map.Person> = repository . findAll ( QPerson . person . age . eq ( CERSEI . getAge ( ) ) , new PageRequest ( NUMBER , NUMBER , Direction . DESC , STRING ) ) ; assertThat ( java.lang.Iterable<org.springframework.data.map.Person> , contains ( JAIME , CERSEI ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { repository . save ( LENNISTERS ) ; java.lang.Iterable<org.springframework.data.map.Person> < Person > java.lang.Iterable<org.springframework.data.map.Person> = repository . findAll ( QPerson . person . age . eq ( CERSEI . getAge ( ) ) , new PageRequest ( NUMBER , NUMBER , new QSort ( QPerson . person . firstname . desc ( ) ) ) ) ; assertThat ( java.lang.Iterable<org.springframework.data.map.Person> , contains ( JAIME , CERSEI ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { repository . save ( LENNISTERS ) ; java.lang.Iterable<org.springframework.data.map.Person> < Person > java.lang.Iterable<org.springframework.data.map.Person> = repository . findAll ( new QSort ( QPerson . person . firstname . desc ( ) ) ) ; assertThat ( java.lang.Iterable<org.springframework.data.map.Person> , contains ( TYRION , JAIME , CERSEI ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { repository . save ( LENNISTERS ) ; java.lang.Iterable<org.springframework.data.map.Person> < Person > java.lang.Iterable<org.springframework.data.map.Person> = repository . findAll ( ( QSort ) null ) ; assertThat ( java.lang.Iterable<org.springframework.data.map.Person> , containsInAnyOrder ( TYRION , JAIME , CERSEI ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { repository . save ( LENNISTERS ) ; assertThat ( repository . exists ( QPerson . person . age . eq ( CERSEI . getAge ( ) ) ) , is ( true ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { repository . save ( LENNISTERS ) ; java.util.List<org.springframework.data.map.Person> < Person > java.util.List<org.springframework.data.map.Person> = Lists . newArrayList ( repository . findAll ( person . age . gt ( NUMBER ) , new Sort ( Direction . ASC , STRING ) ) ) ; assertThat ( java.util.List<org.springframework.data.map.Person> , hasSize ( NUMBER ) ) ; assertThat ( java.util.List<org.springframework.data.map.Person> . get ( NUMBER ) . getFirstname ( ) , is ( CERSEI . getFirstname ( ) ) ) ; assertThat ( java.util.List<org.springframework.data.map.Person> . get ( NUMBER ) . getFirstname ( ) , is ( TYRION . getFirstname ( ) ) ) ; assertThat ( java.util.List<org.springframework.data.map.Person> , hasItems ( CERSEI , JAIME , TYRION ) ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override protected org.springframework.data.map.QuerydslKeyValueRepositoryUnitTests.QPersonRepository org.springframework.data.map.QuerydslKeyValueRepositoryUnitTests.QPersonRepository ( KeyValueRepositoryFactory org.springframework.data.map.KeyValueRepositoryFactory ) { return org.springframework.data.map.KeyValueRepositoryFactory . getRepository ( org.springframework.data.map.QuerydslKeyValueRepositoryUnitTests.QPersonRepository .class ) ; }  <METHOD_END>